package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.sun.org.apache.regexp.internal.recompile;

import sun.management.resources.agent;

public class DbConnection2 {
	public static final String DBDRIVER = "com.mysql.jdbc.Driver";
	public static final String DBURL = "jdbc:mysql://localhost:3306/demo";
	public static final String DBUSER = "root";
	public static final String DBPWD = "root";

	public static void main(String[] args) throws Exception {
		// 注册驱动
		Class.forName(DBDRIVER);

		// 建立连接
		Connection conn = null;
		conn = DriverManager.getConnection(DBURL, DBUSER, DBPWD);

		// 创建执行SQL的语句
		Statement st = conn.createStatement();
		String sql = "select money,age from stu";
		

		// 执行插入的数据操作
		ResultSet rs = st.executeQuery(sql);
		while (rs.next()) {
			System.out.print("money " + rs.getInt("money")+"\t\t");
			System.out.println("age " + rs.getInt("age")+"\t\t");
		}
		
		//关闭流
		conn.close();
		st.close();
		rs.close();

	}

}
