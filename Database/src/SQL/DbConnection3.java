package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.sun.org.apache.regexp.internal.recompile;

import sun.management.resources.agent;

public class DbConnection3 {
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
		//String sql = "select money,age from stu";
		//String sql = "delete from stu where tin2=9 ";
		String sql = "update stu set money=666 where age is null ";
		
		// 执行插入的数据操作
		int i = st.executeUpdate(sql);
		System.out.println("i =" +i);
		
		//关闭流
		conn.close();
		st.close();
	}

}
