import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ChangeColorPanel extends JFrame implements ActionListener {
    private JPanel colorPanel;       // bảng hiển thị màu
    private JComboBox<String> colorBox; // danh sách tên màu
    private JButton okButton;        // nút OK

    public ChangeColorPanel() {
        // ======== PANEL CHÍNH ========
        super("My Frame");
        setLayout(new BorderLayout(10, 10));

        // Panel hiển thị màu
        colorPanel = new JPanel();
        colorPanel.setBackground(Color.WHITE);
        colorPanel.setPreferredSize(new Dimension(400, 250));
//        colorPanel.setBorder(BorderFactory.createTitledBorder("Bảng màu"));
        add(colorPanel, BorderLayout.CENTER);

        // ======== PANEL CHỌN MÀU ========
        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new FlowLayout());

        JLabel label = new JLabel("Chọn màu:");
        bottomPanel.add(label);

        // Danh sách các màu thông dụng
        String[] colors = {"Đỏ", "Xanh lá", "Xanh dương", "Vàng", "Cam", "Hồng", "Xám", "Đen", "Trắng"};
        colorBox = new JComboBox<>(colors);
        bottomPanel.add(colorBox);

        okButton = new JButton("OK");
        okButton.addActionListener(this);
        bottomPanel.add(okButton);

        add(bottomPanel, BorderLayout.SOUTH);

        // ======== THIẾT LẬP FRAME ========
        setSize(450, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    // ======== SỰ KIỆN NHẤN NÚT OK ========
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == okButton) {
            String selected = (String) colorBox.getSelectedItem();
            Color chosenColor = getColorFromName(selected);
            colorPanel.setBackground(chosenColor);
        }
    }

    // ======== HÀM CHUYỂN TÊN THÀNH MÀU ========
    private Color getColorFromName(String name) {
        switch (name) {
            case "Đỏ": return Color.RED;
            case "Xanh lá": return Color.GREEN;
            case "Xanh dương": return Color.BLUE;
            case "Vàng": return Color.YELLOW;
            case "Cam": return Color.ORANGE;
            case "Hồng": return Color.PINK;
            case "Xám": return Color.GRAY;
            case "Đen": return Color.BLACK;
            case "Trắng": return Color.WHITE;
            default: return Color.LIGHT_GRAY;
        }
    }

    // ======== CHẠY CHƯƠNG TRÌNH ========
    public static void main(String[] args) {
        SwingUtilities.invokeLater(ChangeColorPanel::new);
    }
}
