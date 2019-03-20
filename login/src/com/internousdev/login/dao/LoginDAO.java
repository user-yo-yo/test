package com.internousdev.login.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.login.dto.LoginDTO;
import com.internousdev.login.util.DBConnector;

public class LoginDAO {
	public LoginDTO select(String name,String password)throws SQLException{
//		↑LoginDTO型を最後に呼び出し元に戻すので、LoginDTO型を戻り値にしたメソッドを作る。
//		　Actionクラスの値を引数として受け取る。

		LoginDTO dto = new LoginDTO();
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql="select * from user where user_name=? and password=?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,name);
			ps.setString(2,password);
//			↑上の「?」にnameとpasswordのが入る。

			ResultSet resultSet = ps.executeQuery();
//			↑select文のSQL文を実行するメソッド。
//			　戻り値はResultSetになる。

			if(resultSet.next()){
				dto.setName(resultSet.getString("user_name"));
				dto.setPassword(resultSet.getString("password"));
//			↑select文でDBから取得した情報をString型に変換してDTOクラスに格納。
//			　LoginDTOクラスのsetName,setPassword(setter)を利用する。
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			con.close();
//			↑DB接続を終了する際に書くメソッド。
		}
		return dto;
//		↑dtoに入った値を呼び出し元のActionクラスに渡す。
	}
}
