import javax.swing.*;

public class TestStillClock {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Đồng hồ chạy - StillClock");
        frame.add(new StillClock());
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
