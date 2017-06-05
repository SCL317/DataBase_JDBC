package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DbConnection {
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
		String sql = "insert into stu (money,age) values (55,25)";
		

		// 执行插入的数据操作
		st.executeUpdate(sql);


	}

}
