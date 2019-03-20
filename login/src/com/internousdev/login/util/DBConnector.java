package com.internousdev.login.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
	private static String driverName="com.mysql.jdbc.Driver";
	private static String url="jdbc:mysql://localhost/logindb_john";
	private static String user="root";
	private static String password="mysql";
//	↑MySql接続に必要な情報たち↑

	public Connection getConnection(){
		Connection con = null;

		try{
			Class.forName(driverName);
			con=(Connection) DriverManager.getConnection(url,user,password);
//			↑自分のPCにインストールされてるMySQLサーバへ接続するための文↑
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return con;
//		↑MySQLサーバに接続した結果をメソッドの呼び出し元に戻す
	}
}
