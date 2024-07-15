package in.st.delete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteDemo {

	public static void main(String[] args) throws Exception{
		
		 String email ="ujwalap801@gmail.com";
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection con=  DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","Ujwala@2728");
		 PreparedStatement ps =con.prepareStatement("delete from register  where email=?");
			ps.setString(1, email);
			
			int count =ps.executeUpdate();
			if(count > 0) {
				System.out.println("Updated Successfully");
			}
			else {
				System.out.println("Updation failed");
			}
	}
}
