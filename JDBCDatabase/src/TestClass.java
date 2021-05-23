import java.beans.Statement;
import java.sql.DriverManager;

import com.sun.jdi.connect.spi.*;

public class TestClass {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		
		
		Class.forName("Sun.jdbc.odbc.JdbcOdbcDriver");
		
		Connection conn=(Connection) DriverManager.getConnection("jdbc:odbc:aiml2021");
		
		Statement stat=conn.createStatement();
		int result=stat.execute("create table tableeName(id int,name varchar)");
		System.out.println(result);

	}

}
