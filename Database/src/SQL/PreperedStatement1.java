package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class PreperedStatement1 {
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
		String sql = "insert into demo2 (id,name,idcard) values (?,?,?) ";
		PreparedStatement ps = conn.prepareStatement(sql);
		
		ps.setInt(1, 3);
		ps.setString(2, "lisei");
		ps.setLong(3, 34242311231234266L);


		// 执行插入的数据操作
		int i = ps.executeUpdate();
		System.out.println("i =" +i);
		
		
		//关闭流
		conn.close();
		ps.close();
	}

}
