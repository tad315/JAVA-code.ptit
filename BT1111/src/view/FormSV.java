package view;

import DataAccessObject.SinhVienDAO;
import model.SinhVien;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;
import java.util.List;

public class FormSV extends JFrame {
    private JTextField txtMaSV, txtHoTen, txtLop, txtGPA;
    private JTable table;
    private JButton btnHienThi, btnThem, btnCapNhat, btnXoa, btnReset;

    private SinhVienDAO dao = new SinhVienDAO();

    public FormSV() {
        setTitle("Quản lý Sinh viên - JDBC Demo");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel lbMa = new JLabel("Mã SV:");
        lbMa.setBounds(30, 30, 80, 25);
        add(lbMa);
        txtMaSV = new JTextField();
        txtMaSV.setBounds(100, 30, 150, 25);
        add(txtMaSV);

        JLabel lbTen = new JLabel("Họ tên:");
        lbTen.setBounds(30, 70, 80, 25);
        add(lbTen);
        txtHoTen = new JTextField();
        txtHoTen.setBounds(100, 70, 150, 25);
        add(txtHoTen);

        JLabel lbLop = new JLabel("Lớp:");
        lbLop.setBounds(300, 30, 80, 25);
        add(lbLop);
        txtLop = new JTextField();
        txtLop.setBounds(350, 30, 150, 25);
        add(txtLop);

        JLabel lbGpa = new JLabel("GPA:");
        lbGpa.setBounds(300, 70, 80, 25);
        add(lbGpa);
        txtGPA = new JTextField();
        txtGPA.setBounds(350, 70, 150, 25);
        add(txtGPA);

        btnHienThi = new JButton("Hiển thị");
        btnThem = new JButton("Thêm");
        btnCapNhat = new JButton("Cập nhật");
        btnXoa = new JButton("Xóa");
        btnReset = new JButton("Reset");

        btnHienThi.setBounds(30, 120, 90, 30);
        btnThem.setBounds(130, 120, 90, 30);
        btnCapNhat.setBounds(230, 120, 100, 30);
        btnXoa.setBounds(340, 120, 80, 30);
        btnReset.setBounds(430, 120, 90, 30);

        add(btnHienThi);
        add(btnThem);
        add(btnCapNhat);
        add(btnXoa);
        add(btnReset);

        table = new JTable(new DefaultTableModel(new Object[]{"Mã SV", "Họ tên", "Lớp", "GPA"}, 0));
        JScrollPane scroll = new JScrollPane(table);
        scroll.setBounds(30, 170, 530, 170);
        add(scroll);

        btnHienThi.addActionListener(e -> loadData());
        btnThem.addActionListener(e -> themSV());
        btnCapNhat.addActionListener(e -> capNhatSV());
        btnXoa.addActionListener(e -> xoaSV());
        btnReset.addActionListener(e -> resetForm());

        table.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int row = table.getSelectedRow();
                txtMaSV.setText(table.getValueAt(row, 0).toString());
                txtHoTen.setText(table.getValueAt(row, 1).toString());
                txtLop.setText(table.getValueAt(row, 2).toString());
                txtGPA.setText(table.getValueAt(row, 3).toString());
            }
        });
    }

    private void loadData() {
        List<SinhVien> list = dao.getAll();
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        for (SinhVien sv : list) {
            model.addRow(new Object[]{sv.getMaSV(), sv.getHoTen(), sv.getLop(), sv.getGpa()});
        }
    }

    private void themSV() {
        try {
            SinhVien sv = new SinhVien(
                    txtMaSV.getText(),
                    txtHoTen.getText(),
                    txtLop.getText(),
                    Double.parseDouble(txtGPA.getText())
            );
            if (dao.insert(sv)) {
                JOptionPane.showMessageDialog(this, "✅ Thêm thành công!");
                loadData();
            } else {
                JOptionPane.showMessageDialog(this, "❌ Thêm thất bại (Mã trùng?)");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "⚠️ Dữ liệu không hợp lệ!");
        }
    }

    private void capNhatSV() {
        SinhVien sv = new SinhVien(
                txtMaSV.getText(),
                txtHoTen.getText(),
                txtLop.getText(),
                Double.parseDouble(txtGPA.getText())
        );
        if (dao.update(sv)) {
            JOptionPane.showMessageDialog(this, "✅ Cập nhật thành công!");
            loadData();
        }
    }

    private void xoaSV() {
        if (dao.delete(txtMaSV.getText())) {
            JOptionPane.showMessageDialog(this, "🗑️ Xóa thành công!");
            loadData();
        }
    }

    private void resetForm() {
        txtMaSV.setText("");
        txtHoTen.setText("");
        txtLop.setText("");
        txtGPA.setText("");
    }
}
