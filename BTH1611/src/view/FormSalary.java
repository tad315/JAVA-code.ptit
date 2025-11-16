package view;

import DAO.SaleDAO;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.List;

public class FormSalary extends JFrame {
    private JTable table;
    private DefaultTableModel model;
    private SaleDAO dao = new SaleDAO();
    public FormSalary() {
        setTitle("Bảng tính tiền công nhân viên");
        setSize(700, 450);
        setLocationRelativeTo(null);
        setLayout(null);
        model = new DefaultTableModel(new String[]{
                "Mã NV", "Tên NV", "Tổng lợi nhuận", "Tiền công (2%)"
        }, 0);
        table = new JTable(model);
        JScrollPane sp = new JScrollPane(table);
        sp.setBounds(30, 30, 620, 350);
        add(sp);
        loadSalary();
    }
    private void loadSalary() {
        model.setRowCount(0);
        List<Object[]> list = dao.calculateSalary();
        for (Object[] row : list)
            model.addRow(row);
    }
    public static void main(String[] args) {
        new FormSalary().setVisible(true);
    }
}
