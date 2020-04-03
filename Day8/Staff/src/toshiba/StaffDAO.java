package toshiba;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StaffDAO {
	
    private String jdbcURL;
    private String jdbcUsername;
    private String jdbcPassword;
    private Connection jdbcConnection;
    
	public StaffDAO(String jdbcURL, String jdbcUsername, String jdbcPassword) {
		super();
		this.jdbcURL = jdbcURL;
		this.jdbcUsername = jdbcUsername;
		this.jdbcPassword = jdbcPassword;
	}
    
    protected void connect() throws SQLException {
        if (jdbcConnection == null || jdbcConnection.isClosed()) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                throw new SQLException(e);
            }
            System.out.print("test abc:"+jdbcURL+jdbcUsername+jdbcPassword);
            jdbcConnection = DriverManager.getConnection(
                                        jdbcURL, jdbcUsername, jdbcPassword);
            if (jdbcConnection.isClosed())
            	System.out.print("abc.true");
            else
            	System.out.print("abc.false");
            
        }
    }

    protected void disconnect() throws SQLException {
        if (jdbcConnection != null && !jdbcConnection.isClosed()) {
            jdbcConnection.close();
        }
    }
    
    public boolean insertStaff(Staff staff) throws SQLException {
        String sql = "INSERT INTO stafff (id, name, age, sex, email) VALUES (?, ?, ?, ?, ?)";
        connect();
         
        PreparedStatement statement = jdbcConnection.prepareStatement(sql);
        statement.setInt(1, staff.getID());
        statement.setString(2, staff.getName());
        statement.setInt(3, staff.getAge());
        statement.setString(4, staff.getSex());
        statement.setString(5, staff.getEmail());
        
         
        boolean rowInserted = statement.executeUpdate() > 0;
        statement.close();
        disconnect();
        return rowInserted;
    }
    
    public List<Staff> listAllStaff() throws SQLException {
        List<Staff> listStaff = new ArrayList<>();
         
        String sql = "SELECT * FROM stafff";
         
        connect();
         
        Statement statement = jdbcConnection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
         
        while (resultSet.next()) {
           int id = resultSet.getInt("id");
           String name = resultSet.getString("name");
           int age = resultSet.getInt("age");
           String sex = resultSet.getString("sex");
           String email = resultSet.getString("email");
             
            Staff staff = new Staff(id, name, age, sex, email);
            listStaff.add(staff);
        }
         
        resultSet.close();
        statement.close();
         
        disconnect();
         
        return listStaff;
    }
    
    public boolean deleteStaff(Staff staff) throws SQLException {
        String sql = "DELETE FROM stafff where id = ?";
         
        connect();
         
        PreparedStatement statement = jdbcConnection.prepareStatement(sql);
        statement.setInt(1, staff.getID());
         
        boolean rowDeleted = statement.executeUpdate() > 0;
        statement.close();
        disconnect();
        return rowDeleted;     
    }
    
    public boolean updateStaff(Staff staff) throws SQLException {
        String sql = "UPDATE stafff SET name = ?, age = ?, sex = ?, email = ?";
        sql += " WHERE id = " + staff.getID();
        connect();
         
        PreparedStatement statement = jdbcConnection.prepareStatement(sql);
        statement.setString(1, staff.getName());
        statement.setInt(2, staff.getAge());
        statement.setString(3, staff.getSex());
        statement.setString(4, staff.getEmail());
         
        boolean rowUpdated = statement.executeUpdate() > 0;
        statement.close();
        disconnect();
        return rowUpdated;     
    }
    
    public Staff getStaff(int id) throws SQLException {
        Staff staff = null;
        String sql = "SELECT * FROM stafff WHERE id = ?";
         
        connect();
         
        PreparedStatement statement = jdbcConnection.prepareStatement(sql);
        statement.setInt(1, id);
         
        ResultSet resultSet = statement.executeQuery();
         
        if (resultSet.next()) {
             String name = resultSet.getString("name");
             int age = resultSet.getInt("age");
             String sex = resultSet.getString("sex");
             String email = resultSet.getString("email");
             
            staff = new Staff(id, name, age, sex, email);
        }
         
        resultSet.close();
        statement.close();
         
        return staff;
    }
}
