package DAO;

import model.Employee;
import connect.DBConnection;
import java.sql.*;
import java.util.ArrayList;

public class EmployeeDAO {
    private Connection conn;
    public EmployeeDAO() {
        conn = DBConnection.getConnection();
    }
    public ArrayList<Employee> getAll() {
        ArrayList<Employee> list = new ArrayList<>();
        String sql = "SELECT * FROM Employee";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Employee e = new Employee(
                        rs.getInt("employee_id"),
                        rs.getString("full_name"),
                        rs.getString("address"),
                        rs.getString("phone")
                );
                list.add(e);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    public boolean insert(Employee e) {
        String sql = "INSERT INTO Employee(full_name, address, phone) VALUES (?, ?, ?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, e.getName());
            ps.setString(2, e.getAddress());
            ps.setString(3, e.getPhone());
            return ps.executeUpdate() > 0;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }
    public boolean update(Employee e) {
        String sql = "UPDATE Employee SET full_name = ?, address = ?, phone = ? WHERE employee_id = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, e.getName());
            ps.setString(2, e.getAddress());
            ps.setString(3, e.getPhone());
            ps.setInt(4, e.getEmployeeId());
            return ps.executeUpdate() > 0;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }
    public boolean delete(int id) {
        String sql = "DELETE FROM Employee WHERE employee_id = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            return ps.executeUpdate() > 0;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }
}
