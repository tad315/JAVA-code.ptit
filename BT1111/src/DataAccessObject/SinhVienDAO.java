package DataAccessObject;

import connect.DBConnection;
import model.SinhVien;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SinhVienDAO {
    public List<SinhVien> getAll() {
        List<SinhVien> list = new ArrayList<>();
        String sql = "SELECT * FROM SinhVien";
        try (Connection conn = DBConnection.getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                list.add(new SinhVien(
                        rs.getString("MSV"),
                        rs.getString("HoTen"),
                        rs.getString("Lop"),
                        rs.getDouble("GPA")
                ));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public boolean insert(SinhVien sv) {
        String sql = "INSERT INTO SinhVien (MSV, HoTen, Lop, GPA) VALUES (?,?,?,?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, sv.getMaSV());
            ps.setString(2, sv.getHoTen());
            ps.setString(3, sv.getLop());
            ps.setDouble(4, sv.getGpa());
            return ps.executeUpdate() > 0;

        } catch (SQLIntegrityConstraintViolationException e) {
            System.out.println("❌ Mã SV đã tồn tại!");
            return false;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean update(SinhVien sv) {
        String sql = "UPDATE SinhVien SET HoTen=?, Lop=?, GPA=? WHERE MSV=?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, sv.getHoTen());
            ps.setString(2, sv.getLop());
            ps.setDouble(3, sv.getGpa());
            ps.setString(4, sv.getMaSV());

            int rows = ps.executeUpdate();
            return rows > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean delete(String maSV) {
        String sql = "DELETE FROM SinhVien WHERE MSV=?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, maSV);

            int rows = ps.executeUpdate();
            return rows > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
