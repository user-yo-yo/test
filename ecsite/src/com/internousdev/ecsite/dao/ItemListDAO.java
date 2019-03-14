package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.ecsite.dto.ItemListDTO;
import com.internousdev.ecsite.util.DBConnector;

public class ItemListDAO {
	List<ItemListDTO> itemListDtoList = new ArrayList<ItemListDTO>();

	public List<ItemListDTO> select(){
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "select*from item_info_transaction";
	try{
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();

		while(rs.next()){
			ItemListDTO dto = new ItemListDTO();
			dto.setItemName(rs.getString("item_name"));
			dto.setItemStock(rs.getInt("item_stock"));
			dto.setItemPrice(rs.getInt("item_price"));
			itemListDtoList.add(dto);
		}
	}catch(SQLException e){
		e.printStackTrace();
	}
	try{
		con.close();
	}catch(SQLException e){
		e.printStackTrace();
	}
	return itemListDtoList;
	}
}
