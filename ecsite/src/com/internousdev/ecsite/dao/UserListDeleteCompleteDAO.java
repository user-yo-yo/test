package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.ecsite.dto.UserListDTO;
import com.internousdev.ecsite.util.DBConnector;

public class UserListDeleteCompleteDAO {
	private DBConnector db = new DBConnector();
	Connection con = db.getConnection();

	public ArrayList<UserListDTO> getUserListInfo(String user_id, String user_name, String user_pass)
			throws SQLException {
		ArrayList<UserListDTO> ulDTO = new ArrayList<UserListDTO>();
		String sql = "SELECT lut.user_id,lut.user_name,lut.user_pass FROM login_user_transaction lut WHERE lut.user_id = ? lut.user_name = ? lut.user_pass = ? ";

		try{
			PreparedStatement preparedStatement = con.prepareStatement(sql);
			preparedStatement.setString(1,user_id);
			preparedStatement.setString(2,user_name);
			preparedStatement.setString(3,user_pass);

			ResultSet rs = preparedStatement.executeQuery();

			while(rs.next()){
				UserListDTO dto = new UserListDTO();
				dto.setUserId(rs.getString("user_id"));
				dto.setUserName(rs.getString("user_name"));
				ulDTO.add(dto);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			con.close();
		}
		return ulDTO;
}
	public int createUserHistoryDelete() throws SQLException{
		String sql = "DELETE FROM login_user_transaction WHERE id !=1";

		PreparedStatement preparedStatement;
		int result=0;
		try{
			preparedStatement = con.prepareStatement(sql);
			result = preparedStatement.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			con.close();
		}
		return result;
	}
}