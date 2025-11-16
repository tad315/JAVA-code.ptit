package DAO;

import model.Sale;
import connect.DBConnection;
import java.sql.*;
import java.sql.Array.*;
import java.util.*;

public class SaleDAO {
    private Connection conn;
    public SaleDAO() {
        conn = DBConnection.getConnection();
    }
    public ArrayList<Sale> getAll() {
        ArrayList<Sale> list = new ArrayList<>();
        String sql = "SELECT * FROM Sale";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Sale s = new Sale(
                        rs.getInt("employee_id"),
                        rs.getInt("service_id"),
                        rs.getInt("quantity")
                );
                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    public boolean insert(Sale s) {
        String check = "SELECT * FROM Sale WHERE employee_id = ? AND service_id = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(check);
            ps.setInt(1, s.getEmployeeId());
            ps.setInt(2, s.getServiceId());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) return false;
        } catch (Exception ignored) {}
        String sql = "INSERT INTO Sale(employee_id, service_id, quantity) VALUES (?, ?, ?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, s.getEmployeeId());
            ps.setInt(2, s.getServiceId());
            ps.setInt(3, s.getQuantity());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public boolean update(Sale s) {
        String sql = "UPDATE Sale SET quantity = ? WHERE employee_id = ? AND service_id = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, s.getQuantity());
            ps.setInt(2, s.getEmployeeId());
            ps.setInt(3, s.getServiceId());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public boolean delete(int employee_id, int service_id) {
        String sql = "DELETE FROM Sale WHERE employee_id = ? AND service_id = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, employee_id);
            ps.setInt(2, service_id);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public ArrayList<Object[]> search(String keyword, boolean searchByEmployee) {
        ArrayList<Object[]> list = new ArrayList<>();
        String sql = "SELECT e.employee_id, e.full_name, s.service_id, sv.name, s.quantity " +
                "FROM Sale s " +
                "JOIN Employee e ON s.employee_id = e.employee_id " +
                "JOIN Service sv ON s.service_id = sv.service_id ";
        if (searchByEmployee) {
            sql += "WHERE e.full_name LIKE ?";
        }
        else {
            sql += "WHERE sv.name LIKE ?";
        }
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, "%" + keyword + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Object[]{
                        String.format("%04d", rs.getInt(1)),
                        rs.getString(2),
                        String.format("%04d", rs.getInt(3)),
                        rs.getString(4),
                        rs.getInt(5)
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    public ArrayList<Object[]> calculateSalary() {
        ArrayList<Object[]> list = new ArrayList<>();
        String sql = "SELECT e.employee_id, e.full_name, " +
                "SUM((sv.fee - sv.cost) * s.quantity) AS profit, " +
                "SUM((sv.fee - sv.cost) * s.quantity) * 0.02 AS salary " +
                "FROM Sale s " +
                "JOIN Employee e ON s.employee_id = e.employee_id " +
                "JOIN Service sv ON s.service_id = sv.service_id " +
                "GROUP BY e.employee_id";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Object[]{
                        String.format("%04d", rs.getInt(1)),
                        rs.getString(2),
                        rs.getDouble(3),
                        rs.getDouble(4)
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
