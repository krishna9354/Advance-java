public class PrepaidStat {
    public static void main(String[] args) {
        String username = "root";
        String password = "";
        String query = "SELECT * from student where course = 1";
        String insert = "insert into student (name,course,marks) values (?, ?, ?)";

        try {
            Class.forName(jdbc_driver);
            Connection con = DriverManager.getConnection(host.username, password);
            PreparedStatement inpst = con.prepareStatement(insert);
            inpst.setString(1, "Student7");
            inpst.setString(2, "MCA");
            inpst.setLong(3, 67);
            inpst.executeUpdate();
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, "MCA");
            ResultSet rs = pst.executeQuery();
            System.out.println("ID\tName\tCourse\tMarks");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getInt(4));
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}