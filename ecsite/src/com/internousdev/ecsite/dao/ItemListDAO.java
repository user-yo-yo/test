package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.ecsite.dto.ItemListDTO;
import com.internousdev.ecsite.util.DBConnector;

public class ItemListDAO {
	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();

	public ArrayList<ItemListDTO> getItemCreateList(String item_transaction_id, String user_master_id)
			throws SQLException{
		ArrayList<ItemListDTO> itemListDTO = new ArrayList<ItemListDTO>();
		String sql = "SELECT iit.item_name,ubit.item_price,ubit.item_stock FROM item_info_transaction";

		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1,item_transaction_id);
			preparedStatement.setString(2,user_master_id);

			ResultSet resultSet = preparedStatement.executeQuery();

			while(resultSet.next()){
				ItemListDTO dto = new ItemListDTO();
				dto.setItemName(resultSet.getString("item_name"));
				dto.setItemStocks(resultSet.getString("item_stock"));
				dto.setItemPrice(resultSet.getString("item_price"));
				itemListDTO.add(dto);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			connection.close();
		}
		return itemListDTO;
	}
	public int itemHistoryDelete(String item_transaction_id, String user_master_id)
			throws SQLException{
		String sql = "DELETE FROM item_info_transaction WHERE item_transaction_id = ? AND user_master_id = ?";

		PreparedStatement preparedStatement;
		int result = 0;
		try{
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1,item_transaction_id);
			preparedStatement.setString(2,"user_master_id");
			result = preparedStatement.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			connection.close();
		}
		return result;
	}
}
