import java.sql.*;

class Main{
    static void main(String[] args) throws Exception {
//        Class.forName("com.mysql.cj.jdbc.Driver");
        //create connection
        String url ="jdbc:mysql://localhost:3306/jdbclearn";
        String username ="root";
        String password ="root";
        Connection con = DriverManager.getConnection(url,username,password );

        //create statement
//        int rno = 2;
//        String name ="Hemanth";
//        String address = "Chennai";
        int rno  =1;
        String sql = "select * from student where rno = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1,rno);
//        ps.setInt(1,rno);
//        ps.setString(2,name);
//        ps.setString(3,address);
        ResultSet rs = ps.executeQuery();
        rs.next();
        System.out.println(rs.getInt("rno")+" "+rs.getString("name")+" "+rs.getString("address"));
//        System.out.println(r + " row(s) affected!");


        con.close();
    }
}