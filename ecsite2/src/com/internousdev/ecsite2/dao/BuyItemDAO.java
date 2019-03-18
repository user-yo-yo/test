package com.internousdev.ecsite2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.ecsite2.dto.BuyItemDTO;
import com.internousdev.ecsite2.util.DBConnector;

public class BuyItemDAO {
	private DBConnector db = new DBConnector();
	private Connection con = db.getConnection();
	private BuyItemDTO biDTO = new BuyItemDTO();

	public BuyItemDTO getBuyItemInfo(){
		String sql = "SELECT id,item_name,item_price FROM item_info_transaction";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			if(rs.next()){
				biDTO.setId(rs.getInt("id"));
				biDTO.setItemName(rs.getString("item_name"));
				biDTO.setItemPrice(rs.getString("item_price"));
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return biDTO;
	}
	public BuyItemDTO getBuyItemDTO(){
		return biDTO;
	}
}
