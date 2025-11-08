import java.awt.*;
import javax.swing.*;

public class CalculatorUI extends JFrame {

    public CalculatorUI() {
        super("Calculator");

        // ====== PANEL CHÍNH ======
        setLayout(new BorderLayout(10, 10));
        setBackground(Color.WHITE);

        // ====== MÀN HÌNH HIỂN THỊ ======
        JTextField display = new JTextField("0");
        display.setFont(new Font("Segoe UI", Font.BOLD, 36));
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        display.setEditable(false);
        display.setBackground(Color.WHITE);
        display.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        add(display, BorderLayout.NORTH);

        // ====== PANEL NÚT ======
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(6, 4, 8, 8)); // 6 hàng, 4 cột
        buttonPanel.setBackground(new Color(245, 245, 245));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // ====== DANH SÁCH NÚT ======
        String[] buttons = {
                "%", "CE", "C", "⌫",
                "1/x", "x²", "²√x", "÷",
                "7", "8", "9", "×",
                "4", "5", "6", "−",
                "1", "2", "3", "+",
                "±", "0", ".", "="
        };

        for (String text : buttons) {
            JButton btn = new JButton(text);
            btn.setFont(new Font("Segoe UI", Font.PLAIN, 20));
            btn.setFocusPainted(false);
            btn.setBackground(Color.WHITE);
            btn.setBorder(BorderFactory.createLineBorder(new Color(220, 220, 220)));

            // Làm nút "=" màu xanh như Windows
            if (text.equals("=")) {
                btn.setBackground(new Color(0, 120, 215));
                btn.setForeground(Color.WHITE);
                btn.setFont(new Font("Segoe UI", Font.BOLD, 22));
            }

            buttonPanel.add(btn);
        }

        add(buttonPanel, BorderLayout.CENTER);

        // ====== CẤU HÌNH FRAME ======
        setSize(350, 500);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(CalculatorUI::new);
    }
}
