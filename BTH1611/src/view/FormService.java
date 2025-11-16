package view;

import DAO.ServiceDAO;
import model.Service;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;
import java.util.List;

public class FormService extends JFrame {

    private JTextField txtId, txtName, txtCost, txtFee;
    private JComboBox<String> cbGroup;
    private JTable table;

    private ServiceDAO dao = new ServiceDAO();
    private DefaultTableModel model;

    public FormService() {
        setTitle("Quản lý Dịch vụ");
        setSize(700, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lb1 = new JLabel("Mã DV:");
        lb1.setBounds(30, 30, 80, 25);
        add(lb1);

        txtId = new JTextField();
        txtId.setBounds(120, 30, 300, 25);
        txtId.setEnabled(false);
        add(txtId);

        JLabel lb2 = new JLabel("Tên DV:");
        lb2.setBounds(30, 70, 80, 25);
        add(lb2);

        txtName = new JTextField();
        txtName.setBounds(120, 70, 300, 25);
        add(txtName);

        JLabel lb3 = new JLabel("Nhóm:");
        lb3.setBounds(30, 110, 80, 25);
        add(lb3);

        cbGroup = new JComboBox<>(new String[]{
                "Trả trước",
                "Thuê bao trả sau",
                "Giá trị gia tăng"
        });
        cbGroup.setBounds(120, 110, 300, 25);
        add(cbGroup);

        JLabel lb4 = new JLabel("Chi phí:");
        lb4.setBounds(30, 150, 80, 25);
        add(lb4);

        txtCost = new JTextField();
        txtCost.setBounds(120, 150, 300, 25);
        add(txtCost);

        JLabel lb5 = new JLabel("Giá cước:");
        lb5.setBounds(30, 190, 80, 25);
        add(lb5);

        txtFee = new JTextField();
        txtFee.setBounds(120, 190, 300, 25);
        add(txtFee);

        JButton btnAdd = new JButton("Thêm");
        btnAdd.setBounds(500, 55, 120, 30);
        add(btnAdd);

        JButton btnUpdate = new JButton("Sửa");
        btnUpdate.setBounds(500, 95, 120, 30);
        add(btnUpdate);

        JButton btnDelete = new JButton("Xóa");
        btnDelete.setBounds(500, 135, 120, 30);
        add(btnDelete);

        JButton btnReset = new JButton("Reset");
        btnReset.setBounds(500, 175, 120, 30);
        add(btnReset);

        model = new DefaultTableModel(new String[]{
                "Mã", "Tên dịch vụ", "Nhóm", "Chi phí", "Giá cước"
        }, 0);

        table = new JTable(model);
        JScrollPane sp = new JScrollPane(table);
        sp.setBounds(30, 250, 620, 150);
        add(sp);

        loadData();

        table.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int row = table.getSelectedRow();
                txtId.setText(model.getValueAt(row, 0) + "");
                txtName.setText(model.getValueAt(row, 1) + "");
                cbGroup.setSelectedItem(model.getValueAt(row, 2) + "");
                txtCost.setText(model.getValueAt(row, 3) + "");
                txtFee.setText(model.getValueAt(row, 4) + "");
            }
        });
        btnAdd.addActionListener(e -> addService());
        btnUpdate.addActionListener(e -> updateService());
        btnDelete.addActionListener(e -> deleteService());
        btnReset.addActionListener(e -> resetForm());
    }
    private boolean validateForm() {
        if (txtName.getText().trim().isEmpty() ||
                txtCost.getText().trim().isEmpty() ||
                txtFee.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Không được để trống!");
            return false;
        }
        try {
            Double.parseDouble(txtCost.getText());
            Double.parseDouble(txtFee.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Chi phí và giá cước phải là số!");
            return false;
        }
        return true;
    }
    private void loadData() {
        model.setRowCount(0);
        List<Service> list = dao.getAll();
        for (Service s : list) {
            model.addRow(new Object[]{
                    String.format("%04d", s.getServiceId()),
                    s.getName(),
                    s.getGrName(),
                    s.getCost(),
                    s.getFee()
            });
        }
    }
    private void addService() {
        if (!validateForm()) return;
        Service s = new Service();
        s.setName(txtName.getText());
        s.setGrName(cbGroup.getSelectedItem().toString());
        s.setCost(Double.parseDouble(txtCost.getText()));
        s.setFee(Double.parseDouble(txtFee.getText()));
        if (dao.insert(s)) {
            JOptionPane.showMessageDialog(this, "Thêm thành công!");
            loadData();
            resetForm();
        }
    }
    private void updateService() {
        if (txtId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Chọn dịch vụ để sửa!");
            return;
        }
        if (!validateForm()) return;
        Service s = new Service();
        s.setServiceId(Integer.parseInt(txtId.getText()));
        s.setName(txtName.getText());
        s.setGrName(cbGroup.getSelectedItem().toString());
        s.setCost(Double.parseDouble(txtCost.getText()));
        s.setFee(Double.parseDouble(txtFee.getText()));
        if (dao.update(s)) {
            JOptionPane.showMessageDialog(this, "Cập nhật thành công!");
            loadData();
        }
    }
    private void deleteService() {
        if (txtId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Chọn dịch vụ để xóa!");
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
        txtCost.setText("");
        txtFee.setText("");
        cbGroup.setSelectedIndex(0);
    }
    public static void main(String[] args) {
        new FormService().setVisible(true);
    }
}
