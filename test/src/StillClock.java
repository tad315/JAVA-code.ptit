import java.awt.*;
import javax.swing.*;
import java.util.*;

public class StillClock extends JPanel {
    private int hour;
    private int minute;
    private int second;

    public StillClock() {
        setCurrentTime();

        // 🕒 Cập nhật mỗi giây
        javax.swing.Timer timer = new javax.swing.Timer(1000, e -> {
            setCurrentTime();
            repaint();
        });
        timer.start();
    }

    public StillClock(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() { return hour; }
    public void setHour(int hour) { this.hour = hour; repaint(); }

    public int getMinute() { return minute; }
    public void setMinute(int minute) { this.minute = minute; repaint(); }

    public int getSecond() { return second; }
    public void setSecond(int second) { this.second = second; repaint(); }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int clockRadius = (int)(Math.min(getWidth(), getHeight()) * 0.4);
        int xCenter = getWidth() / 2;
        int yCenter = getHeight() / 2;

        // Viền đồng hồ
        g.setColor(Color.black);
        g.drawOval(xCenter - clockRadius, yCenter - clockRadius,
                2 * clockRadius, 2 * clockRadius);

        // Số chỉ giờ
        g.drawString("12", xCenter - 5, yCenter - clockRadius + 15);
        g.drawString("9", xCenter - clockRadius + 5, yCenter + 5);
        g.drawString("3", xCenter + clockRadius - 15, yCenter + 5);
        g.drawString("6", xCenter - 5, yCenter + clockRadius - 5);

        // Kim giây (đỏ)
        int sLength = (int)(clockRadius * 0.8);
        int xSecond = (int)(xCenter + sLength * Math.sin(second * (2 * Math.PI / 60)));
        int ySecond = (int)(yCenter - sLength * Math.cos(second * (2 * Math.PI / 60)));
        g.setColor(Color.red);
        g.drawLine(xCenter, yCenter, xSecond, ySecond);

        // Kim phút (xanh)
        int mLength = (int)(clockRadius * 0.65);
        int xMinute = (int)(xCenter + mLength * Math.sin(minute * (2 * Math.PI / 60)));
        int yMinute = (int)(yCenter - mLength * Math.cos(minute * (2 * Math.PI / 60)));
        g.setColor(Color.blue);
        g.drawLine(xCenter, yCenter, xMinute, yMinute);

        // Kim giờ (đen)
        int hLength = (int)(clockRadius * 0.5);
        int xHour = (int)(xCenter + hLength *
                Math.sin((hour % 12 + minute / 60.0) * (2 * Math.PI / 12)));
        int yHour = (int)(yCenter - hLength *
                Math.cos((hour % 12 + minute / 60.0) * (2 * Math.PI / 12)));
        g.setColor(Color.BLACK);
        g.drawLine(xCenter, yCenter, xHour, yHour);
    }

    public void setCurrentTime() {
        Calendar calendar = new GregorianCalendar();
        this.hour = calendar.get(Calendar.HOUR_OF_DAY);
        this.minute = calendar.get(Calendar.MINUTE);
        this.second = calendar.get(Calendar.SECOND);
    }

    public Dimension getPreferredSize() {
        return new Dimension(200, 200);
    }
}
