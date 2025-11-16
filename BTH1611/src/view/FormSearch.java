package view;

import DAO.SaleDAO;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class FormSearch extends JFrame {

    private JTextField txtKeyword;
    private JRadioButton rbEmployee, rbService;
    private JTable table;
    private DefaultTableModel model;

    private SaleDAO dao = new SaleDAO();

    public FormSearch() {

        setTitle("Tìm kiếm bán hàng");
        setSize(750, 450);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel lb = new JLabel("Từ khóa:");
        lb.setBounds(30, 30, 80, 25);
        add(lb);

        txtKeyword = new JTextField();
        txtKeyword.setBounds(100, 30, 200, 25);
        add(txtKeyword);

        rbEmployee = new JRadioButton("Theo tên nhân viên", true);
        rbEmployee.setBounds(320, 30, 150, 25);

        rbService = new JRadioButton("Theo tên dịch vụ");
        rbService.setBounds(480, 30, 150, 25);

        ButtonGroup group = new ButtonGroup();
        group.add(rbEmployee);
        group.add(rbService);

        add(rbEmployee);
        add(rbService);

        JButton btnSearch = new JButton("Tìm kiếm");
        btnSearch.setBounds(30, 70, 120, 30);
        add(btnSearch);

        model = new DefaultTableModel(new String[]{
                "Mã NV", "Tên NV", "Mã DV", "Tên DV", "Số lượng"
        }, 0);
        table = new JTable(model);
        JScrollPane sp = new JScrollPane(table);
        sp.setBounds(30, 130, 670, 250);
        add(sp);
        btnSearch.addActionListener(e -> search());
    }
    private void search() {
        String keyword = txtKeyword.getText().trim();
        if (keyword.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nhập từ khóa!");
            return;
        }
        boolean byEmp = rbEmployee.isSelected();
        model.setRowCount(0);
        List<Object[]> list = dao.search(keyword, byEmp);
        for (Object[] row : list)
            model.addRow(row);
        if (list.isEmpty())
            JOptionPane.showMessageDialog(this, "Không có kết quả!");
    }
    public static void main(String[] args) {
        new FormSearch().setVisible(true);
    }
}
