package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.ecsite.dto.UserListDTO;
import com.internousdev.ecsite.util.DBConnector;

public class UserListDAO {
	List<UserListDTO> userListDTOList = new ArrayList<UserListDTO>();

	public List<UserListDTO> select(){
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "select*from login_user_transaction";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				UserListDTO dto = new UserListDTO();
				dto.setUserId(rs.getString("login_id"));
				dto.setUserName(rs.getString("user_name"));
				userListDTOList.add(dto);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		try{
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return userListDTOList;
	}
}
