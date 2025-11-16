package view;

import DAO.EmployeeDAO;
import model.Employee;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;
import java.util.List;

public class FormEmployee extends JFrame {

    private JTextField txtId, txtName, txtAddress, txtPhone;
    private JTable table;
    private EmployeeDAO dao = new EmployeeDAO();
    private DefaultTableModel model;

    public FormEmployee() {
        setTitle("Quản lý Nhân viên");
        setSize(700, 500);
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel lb1 = new JLabel("Mã NV:");
        lb1.setBounds(30, 30, 80, 25);
        add(lb1);

        txtId = new JTextField();
        txtId.setBounds(120, 30, 300, 25);
        txtId.setEnabled(false);
        add(txtId);

        JLabel lb2 = new JLabel("Họ tên:");
        lb2.setBounds(30, 70, 80, 25);
        add(lb2);

        txtName = new JTextField();
        txtName.setBounds(120, 70, 300, 25);
        add(txtName);

        JLabel lb3 = new JLabel("Địa chỉ:");
        lb3.setBounds(30, 110, 80, 25);
        add(lb3);

        txtAddress = new JTextField();
        txtAddress.setBounds(120, 110, 300, 25);
        add(txtAddress);

        JLabel lb4 = new JLabel("SĐT:");
        lb4.setBounds(30, 150, 80, 25);
        add(lb4);

        txtPhone = new JTextField();
        txtPhone.setBounds(120, 150, 300, 25);
        add(txtPhone);

        JButton btnAdd = new JButton("Thêm");
        btnAdd.setBounds(500, 30, 120, 30);
        add(btnAdd);

        JButton btnEdit = new JButton("Sửa");
        btnEdit.setBounds(500, 70, 120, 30);
        add(btnEdit);

        JButton btnDelete = new JButton("Xóa");
        btnDelete.setBounds(500, 110, 120, 30);
        add(btnDelete);

        JButton btnReset = new JButton("Reset");
        btnReset.setBounds(500, 150, 120, 30);
        add(btnReset);

        model = new DefaultTableModel(new String[]{
                "Mã NV", "Họ tên", "Địa chỉ", "SĐT"
        }, 0);

        table = new JTable(model);
        JScrollPane sp = new JScrollPane(table);
        sp.setBounds(30, 220, 620, 180);
        add(sp);

        loadData();

        table.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int r = table.getSelectedRow();
                txtId.setText(model.getValueAt(r, 0).toString());
                txtName.setText(model.getValueAt(r, 1).toString());
                txtAddress.setText(model.getValueAt(r, 2).toString());
                txtPhone.setText(model.getValueAt(r, 3).toString());
            }
        });

        btnAdd.addActionListener(e -> addEmployee());
        btnEdit.addActionListener(e -> editEmployee());
        btnDelete.addActionListener(e -> deleteEmployee());
        btnReset.addActionListener(e -> resetForm());
    }
    private void loadData() {
        model.setRowCount(0);
        List<Employee> list = dao.getAll();
        for (Employee e : list) {
            model.addRow(new Object[]{
                    String.format("%04d", e.getEmployeeId()),
                    e.getName(),
                    e.getAddress(),
                    e.getPhone()
            });
        }
    }
    private boolean validateForm() {
        if (txtName.getText().isEmpty() || txtAddress.getText().isEmpty() || txtPhone.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Không được để trống!");
            return false;
        }
        return true;
    }
    private void addEmployee() {
        if (!validateForm()) return;
        Employee e = new Employee();
        e.setName(txtName.getText());
        e.setAddress(txtAddress.getText());
        e.setPhone(txtPhone.getText());
        if (dao.insert(e)) {
            JOptionPane.showMessageDialog(this, "Thêm thành công!");
            loadData();
            resetForm();
        }
    }
    private void editEmployee() {
        if (txtId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Chọn nhân viên!");
            return;
        }
        if (!validateForm()) return;
        Employee e = new Employee();
        e.setEmployeeId(Integer.parseInt(txtId.getText()));
        e.setName(txtName.getText());
        e.setAddress(txtAddress.getText());
        e.setPhone(txtPhone.getText());
        if (dao.update(e)) {
            JOptionPane.showMessageDialog(this, "Cập nhật thành công!");
            loadData();
        }
    }
    private void deleteEmployee() {
        if (txtId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Chọn nhân viên!");
            return;
        }
        int id = Integer.parseInt(txtId.getText());
        if (dao.delete(id)) {
            JOptionPane.showMessageDialog(this, "Xóa thành công!");
            loadData();
            resetForm();
        }
    }
    private void resetForm() {
        txtId.setText("");
        txtName.setText("");
        txtAddress.setText("");
        txtPhone.setText("");
    }
    public static void main(String[] args) {
        new FormEmployee().setVisible(true);
    }
}
