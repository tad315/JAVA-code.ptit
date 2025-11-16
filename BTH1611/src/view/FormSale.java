package view;

import DAO.EmployeeDAO;
import DAO.ServiceDAO;
import DAO.SaleDAO;
import model.Employee;
import model.Service;
import model.Sale;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;
import java.util.List;

public class FormSale extends JFrame {

    private JComboBox<String> cbEmployee, cbService;
    private JTextField txtQuantity;
    private JTable table;

    private EmployeeDAO employeeDAO = new EmployeeDAO();
    private ServiceDAO serviceDAO = new ServiceDAO();
    private SaleDAO saleDAO = new SaleDAO();

    private DefaultTableModel model;

    public FormSale() {
        setTitle("Danh sách bán hàng");
        setSize(800, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lbEmp = new JLabel("Nhân viên:");
        lbEmp.setBounds(30, 30, 100, 25);
        add(lbEmp);

        cbEmployee = new JComboBox<>();
        cbEmployee.setBounds(130, 30, 250, 25);
        add(cbEmployee);

        JLabel lbSer = new JLabel("Dịch vụ:");
        lbSer.setBounds(30, 70, 100, 25);
        add(lbSer);

        cbService = new JComboBox<>();
        cbService.setBounds(130, 70, 250, 25);
        add(cbService);

        JLabel lbQty = new JLabel("Số lượng:");
        lbQty.setBounds(30, 110, 100, 25);
        add(lbQty);

        txtQuantity = new JTextField();
        txtQuantity.setBounds(130, 110, 250, 25);
        add(txtQuantity);

        JButton btnAdd = new JButton("Thêm");
        btnAdd.setBounds(450, 40, 100, 30);
        add(btnAdd);

        JButton btnUpdate = new JButton("Sửa");
        btnUpdate.setBounds(450, 90, 100, 30);
        add(btnUpdate);

        JButton btnDelete = new JButton("Xóa");
        btnDelete.setBounds(600, 40, 100, 30);
        add(btnDelete);

        JButton btnReset = new JButton("Reset");
        btnReset.setBounds(600, 90, 100, 30);
        add(btnReset);

        model = new DefaultTableModel(new String[]{
                "Mã NV", "Tên NV", "Mã DV", "Tên DV", "Số lượng"
        }, 0);

        table = new JTable(model);
        JScrollPane sp = new JScrollPane(table);
        sp.setBounds(30, 180, 720, 220);
        add(sp);

        loadComboBoxes();
        loadData();

        table.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int r = table.getSelectedRow();

                String empId = model.getValueAt(r, 0).toString();
                String serId = model.getValueAt(r, 2).toString();

                for (int i = 0; i < cbEmployee.getItemCount(); i++)
                    if (cbEmployee.getItemAt(i).startsWith(empId))
                        cbEmployee.setSelectedIndex(i);

                for (int i = 0; i < cbService.getItemCount(); i++)
                    if (cbService.getItemAt(i).startsWith(serId))
                        cbService.setSelectedIndex(i);

                txtQuantity.setText(model.getValueAt(r, 4).toString());
            }
        });

        btnAdd.addActionListener(e -> addSale());
        btnUpdate.addActionListener(e -> updateSale());
        btnDelete.addActionListener(e -> deleteSale());
        btnReset.addActionListener(e -> resetForm());
    }
    private void loadComboBoxes() {
        cbEmployee.removeAllItems();
        cbService.removeAllItems();
        List<Employee> empList = employeeDAO.getAll();
        for (Employee e : empList) {
            cbEmployee.addItem(String.format("%04d - %s", e.getEmployeeId(), e.getName()));
        }
        List<Service> serList = serviceDAO.getAll();
        for (Service s : serList) {
            cbService.addItem(String.format("%04d - %s", s.getServiceId(), s.getName()));
        }
    }
    private int getSelectedEmpId() {
        return Integer.parseInt(cbEmployee.getSelectedItem().toString().substring(0, 4));
    }
    private int getSelectedServiceId() {
        return Integer.parseInt(cbService.getSelectedItem().toString().substring(0, 4));
    }
    private boolean validateForm() {
        if (txtQuantity.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nhập số lượng!");
            return false;
        }
        try {
            Integer.parseInt(txtQuantity.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Số lượng phải là số!");
            return false;
        }
        return true;
    }
    private void loadData() {
        model.setRowCount(0);
        List<Sale> list = saleDAO.getAll();
        List<Employee> empList = employeeDAO.getAll();
        List<Service> serList = serviceDAO.getAll();
        for (Sale s : list) {
            String empName = "";
            String serName = "";
            for (Employee e : empList)
                if (e.getEmployeeId() == s.getEmployeeId())
                    empName = e.getName();
            for (Service sv : serList)
                if (sv.getServiceId() == s.getServiceId())
                    serName = sv.getName();
            model.addRow(new Object[]{
                    String.format("%04d", s.getEmployeeId()),
                    empName,
                    String.format("%04d", s.getServiceId()),
                    serName,
                    s.getQuantity()
            });
        }
    }
    private void addSale() {
        if (!validateForm()) return;
        Sale s = new Sale();
        s.setEmployeeId(getSelectedEmpId());
        s.setServiceId(getSelectedServiceId());
        s.setQuantity(Integer.parseInt(txtQuantity.getText()));
        if (!saleDAO.insert(s)) {
            JOptionPane.showMessageDialog(this, "Nhân viên này đã bán dịch vụ này rồi!");
            return;
        }
        JOptionPane.showMessageDialog(this, "Thêm thành công!");
        loadData();
        resetForm();
    }
    private void updateSale() {
        if (!validateForm()) return;
        Sale s = new Sale();
        s.setEmployeeId(getSelectedEmpId());
        s.setServiceId(getSelectedServiceId());
        s.setQuantity(Integer.parseInt(txtQuantity.getText()));
        if (saleDAO.update(s)) {
            JOptionPane.showMessageDialog(this, "Sửa thành công!");
            loadData();
        }
    }
    private void deleteSale() {
        int empId = getSelectedEmpId();
        int serId = getSelectedServiceId();
        if (saleDAO.delete(empId, serId)) {
            JOptionPane.showMessageDialog(this, "Xóa thành công!");
            loadData();
            resetForm();
        }
    }
    private void resetForm() {
        txtQuantity.setText("");
        cbEmployee.setSelectedIndex(0);
        cbService.setSelectedIndex(0);
    }
    public static void main(String[] args) {
        new FormSale().setVisible(true);
    }
}
