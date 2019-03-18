package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.ecsite.dto.ItemListDTO;
import com.internousdev.ecsite.util.DBConnector;

public class ItemListDeleteCompleteDAO {
	private DBConnector db = new DBConnector();
	private Connection con = db.getConnection();

	public ArrayList<ItemListDTO> getItemListInfo(String item_name, String item_price, String item_stock)
			throws SQLException {
		ArrayList<ItemListDTO> iLDTO = new ArrayList<ItemListDTO>();
		String sql ="SELECT iit.item_name,iit.item_price,iit.item_stock FROM item_info_transaction iit WHERE iit.item_name = ? AND iit.item_price  = ? AND iit.item_stock = ?";

		try{
			PreparedStatement preparedStatement = con.prepareStatement(sql);
			preparedStatement.setString(1,item_name);
			preparedStatement.setString(2, item_price);
			preparedStatement.setString(3, item_stock);

			ResultSet resultSet = preparedStatement.executeQuery();

			while(resultSet.next()){
				ItemListDTO dto = new ItemListDTO();
				dto.setItemName(resultSet.getString("item_name"));
				dto.setItemPrice(resultSet.getInt("item_price"));
				dto.setItemStock(resultSet.getInt("item_stock"));
				iLDTO.add(dto);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			con.close();
		}
		return iLDTO;
	}

	public int createItemHistoryDelete() throws SQLException {
		String sql = "DELETE FROM item_info_transaction WHERE id=1";

		PreparedStatement preparedStatement;
		int result = 0;
		try {
			preparedStatement = con.prepareStatement(sql);
//			preparedStatement.setString(1, item_name);
//			preparedStatement.setString(2, item_price);
//			preparedStatement.setString(3, item_stock);
			result = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			con.close();
		}
		return result;
	}
}
