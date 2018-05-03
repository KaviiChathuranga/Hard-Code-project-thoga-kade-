package thogaKade.controller;
import thogaKade.db.*;
import thogaKade.model.*;
import java.sql.*;
import java.util.*;
import thogaKade.main_form.*;

public class ItemController{
	public static ArrayList<Item>getAllItem()throws SQLException ,ClassNotFoundException{
		Connection conn=DBConnection.getDBConnection().getConnection();
		Statement stm=conn.createStatement();
		ResultSet res=stm.executeQuery("select * from item ");
		ArrayList<Item>itemCodes=new ArrayList<>();
		while(res.next()){
		Item item=new Item(res.getString("code"),res.getString("description"),res.getDouble("unitPrice"),res.getInt("qtyOnHand"));
			itemCodes.add(item);
		}
		return itemCodes;
	}
	public static Item searchItem(String code)throws SQLException,ClassNotFoundException{
		Connection conn=DBConnection.getDBConnection().getConnection();
		Statement stm=conn.createStatement();
		ResultSet res=stm.executeQuery("select * from item where code='"+code+" ' ");
			
			if(res.next()){
				Item item=new Item(code,res.getString("description"),res.getDouble("unitPrice"),res.getInt("qtyOnHand"));
				return item;
			}else{
				return null;
			}
		}
	public static int addItem(Item i)throws SQLException,ClassNotFoundException{
			String sql="insert into item values('"+i.getId()+"','"+i.getDescriptin()+" ',"+i.getUnitPrice()+","+i.getQOH()+")";
			Connection conn=DBConnection.getDBConnection().getConnection();
			Statement stm=conn.createStatement();
			int res=stm.executeUpdate(sql);
			return res;
	}
	public static int updateItem(Item i)throws SQLException,ClassNotFoundException{
		String sql="update Item set description='"+i.getDescriptin()+"',unitPrice='"+i.getUnitPrice()+"',qtyOnHand='"+i.getQOH()+"' where code='"+i.getId()+"' ";
		Connection conn=DBConnection.getDBConnection().getConnection();
		Statement stm=conn.createStatement();
		int res=stm.executeUpdate(sql);
		return res;
	}
	
	public static boolean updateStock(ArrayList<OrderDetails>ob)throws SQLException ,ClassNotFoundException{
		for(OrderDetails orderDetailList:ob){
			boolean b=ItemController.updateStock(orderDetailList);
			if(b){
				return true;
			}
			
		}
		return false;
	}
	public static boolean updateStock(OrderDetails i)throws SQLException,ClassNotFoundException{
		//Item item=new Item();
		//mainForm form=new mainForm();
		//double x=form.newQty;
		//int qoh=Integer.parseInt(placeOrderQOHTxt.getText());
		//int newqty=item.getQOH()-i.getQty();
		//System.out.println(newqty);
		String sql="update Item set qtyOnHand="+i.getQty()+" where code='"+i.getItemCode()+"' ";
		Connection conn=DBConnection.getDBConnection().getConnection();
		Statement stm=conn.createStatement();
		return stm.executeUpdate(sql)>0;
		
	}
	
	public static int deleteItem(String id)throws SQLException,ClassNotFoundException{
		String sql="delete from Item where code='"+id+"' ";
		Connection conn=DBConnection.getDBConnection().getConnection();
		Statement stm=conn.createStatement();
		int res=stm.executeUpdate(sql);
		return res;
	}
	public static Item searchItems(String id)throws SQLException,ClassNotFoundException{
		String sql="select * from Item where code='"+id+" '";
		Connection conn=DBConnection.getDBConnection().getConnection();
		Statement stm=conn.createStatement();
		ResultSet res=stm.executeQuery(sql);
		if(res.next()){
			Item c1=new Item(res.getString("Code"),res.getString("description"),res.getDouble("unitPrice"),res.getInt("qtyOnHand"));
			return c1;
		}else{
			return null;
		}
	}
				
}
