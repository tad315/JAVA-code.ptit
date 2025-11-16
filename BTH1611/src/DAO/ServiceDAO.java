package DAO;
import model.Service;
import connect.DBConnection;
import java.sql.*;
import java.util.ArrayList;

public class ServiceDAO {
    private Connection conn;
    public ServiceDAO() {
        try {
            conn = DBConnection.getConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public ArrayList<Service> getAll() {
        ArrayList<Service> list = new ArrayList<>();
        String sql = "SELECT * FROM Service";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Service s = new Service (
                rs.getInt("service_id"),
                rs.getString("name"),
                rs.getString("gr_name"),
                rs.getDouble("cost"),
                rs.getDouble("fee")
                );
                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    public boolean update (Service s) {
        String sql = "UPDATE Service SET name = ?, gr_name = ?, cost = ?, fee = ? WHERE service_id = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, s.getName());
            ps.setString(2, s.getGrName());
            ps.setDouble(3, s.getCost());
            ps.setDouble(4, s.getFee());
            ps.setInt(5, s.getServiceId());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public boolean delete(int id) {
        String sql = "DELETE FROM Service WHERE service_id = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public boolean insert(Service s) {
        String sql = "INSERT INTO Service(name, gr_name, cost, fee) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, s.getName());
            ps.setString(2, s.getGrName());
            ps.setDouble(3, s.getCost());
            ps.setDouble(4, s.getFee());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
