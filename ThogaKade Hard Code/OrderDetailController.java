package thogaKade.controller;
import thogaKade.db.*;
import thogaKade.model.*;
import java.sql.*;
import java.util.*;
public class OrderDetailController{
	public static boolean addOrderDetail(ArrayList<OrderDetails>orderDetailList)throws SQLException,ClassNotFoundException{
		for(OrderDetails od:orderDetailList){
			boolean isadd=OrderDetailController.addOrderDetail(od);
			if(isadd){
				return true;
			}
		}
		return false;
	}

	public static boolean addOrderDetail(OrderDetails orderDetailList)throws SQLException,ClassNotFoundException{
		String sql="insert into OrderDetail values('"+orderDetailList.getOrderId()+"','"+orderDetailList.getItemCode()+"',"+orderDetailList.getQty()+","+orderDetailList.getUnitPrice()+")";
		Connection conn=DBConnection.getDBConnection().getConnection();
		Statement stm=conn.createStatement();
		return stm.executeUpdate(sql)>0;
	}
	
}
