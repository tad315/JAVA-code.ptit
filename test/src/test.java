import java.awt.*;
import javax.swing.*;

public class test extends JFrame {
    public test() {
        super("Demo Swing Layout Example");

        // Panel chính (p1) với BorderLayout
        JPanel p1 = new JPanel();
        p1.setLayout(new BorderLayout());

        // Thêm TextField hiển thị thời gian ở phía Bắc
        p1.add(new JTextField("Time to be displayed here"), BorderLayout.NORTH);

        // Panel bàn phím (p2)
        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(4, 3, 5, 5)); // 4 hàng 3 cột, có khoảng cách giữa nút

        for (int i = 1; i <= 9; i++) {
            p2.add(new JButton("" + i));
        }

        p2.add(new JButton("0"));
        p2.add(new JButton("Start"));
        p2.add(new JButton("Stop"));

        p1.add(p2, BorderLayout.CENTER);

        // 👉 Panel "Food" bên trái (p3)
        JPanel p3 = new JPanel();
        p3.setBackground(Color.WHITE); // nền trắng
        p3.setPreferredSize(new Dimension(150, 0)); // độ rộng 150px
        p3.setLayout(new BorderLayout());

        JLabel lblFood = new JLabel("Food", SwingConstants.CENTER);
        lblFood.setFont(new Font("Arial", Font.BOLD, 18));
        p3.add(lblFood, BorderLayout.CENTER);

        // Thêm p3 (bên trái) và p1 (ở giữa) vào JFrame
        add(p3, BorderLayout.WEST);
        add(p1, BorderLayout.CENTER);

        // Cấu hình frame
        setSize(550, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(test::new);
    }
}
