package thogaKade.controller;
import thogaKade.db.*;
import thogaKade.model.*;
import java.sql.*;
import java.util.*;

public class OrderController{
	public static ArrayList<Orders>list()throws SQLException ,ClassNotFoundException{
		String sql="select * from Orders";
		Connection conn=DBConnection.getDBConnection().getConnection();
		Statement stm=conn.createStatement();
		ResultSet res=stm.executeQuery(sql);
		ArrayList<Orders>lola=new ArrayList<>();
		while(res.next()){
			Orders order=new Orders(res.getString("id"),res.getString("date"),res.getString("CustomerId"));
			lola.add(order);
		}
		return lola;
	}
	public static ArrayList<Orders>getAllOrders(String id)throws SQLException ,ClassNotFoundException{
		String sql="select * from Orders where CustomerId='"+id+"' ";
		Connection conn=DBConnection.getDBConnection().getConnection();
		Statement stm=conn.createStatement();
		ResultSet res=stm.executeQuery(sql);
		ArrayList<Orders>lol=new ArrayList<>();
		while(res.next()){
			Orders orders=new Orders(res.getString("id"),res.getString("date"),res.getString("CustomerId"));
			lol.add(orders);
		}
		return lol;
	}
	public static boolean addNewOrder(Orders ob)throws SQLException,ClassNotFoundException{
		String sql="insert into orders values('"+ob.getOrderId()+"','"+ob.getDate()+"','"+ob.getCustId()+"')";
		Connection conn=DBConnection.getDBConnection().getConnection();
		Statement stm=conn.createStatement();
		int res= stm.executeUpdate(sql);
		if(res>0){
			boolean isadd=OrderDetailController.addOrderDetail(ob.getOrderDetails());
			if(isadd){
				boolean isUpdate=ItemController.updateStock(ob.getOrderDetails());
				if(isUpdate){
					return true;
				}
			}
		}
		return false;
	}
	
	
}
