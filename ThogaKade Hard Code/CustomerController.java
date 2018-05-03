package thogaKade.controller;
import thogaKade.db.*;
import java.sql.*;
import thogaKade.model.*;
import java.util.*;
public class CustomerController{
	public static int addCustomer(Customer c1)throws SQLException,ClassNotFoundException{
		String sql="insert into customer values('"+c1.getId()+"','"+c1.getName()+"','"+c1.getAddress()+"',"+c1.getSalary()+")";
		Connection conn=DBConnection.getDBConnection().getConnection();
		Statement stm=conn.createStatement();
		int res=stm.executeUpdate(sql);
		return res;
	}
	public static int deleteCustomer(String id)throws SQLException,ClassNotFoundException{
		String sql="delete from customer where id='"+id+"'";
		Connection conn=DBConnection.getDBConnection().getConnection();
		Statement stm=conn.createStatement();
		int res=stm.executeUpdate(sql);
		return res;
	}
	public static int updateCustomer(Customer c1)throws SQLException,ClassNotFoundException{
		String sql="update customer set name='"+c1.getName()+"',address='"+c1.getAddress()+"',salary="+c1.getSalary()+" where id='"+c1.getId()+"' ";
		Connection conn=DBConnection.getDBConnection().getConnection();
		Statement stm=conn.createStatement();
		int res=stm.executeUpdate(sql);
		return res;
	} 
	public static Customer searchCustomer(String id)throws SQLException,ClassNotFoundException{
		String sql="select * from customer where id='"+id+" '";
		Connection conn=DBConnection.getDBConnection().getConnection();
		Statement stm=conn.createStatement();
		ResultSet res=stm.executeQuery(sql);
		if(res.next()){
			Customer c1=new Customer(res.getString("id"),res.getString("name"),res.getString("address"),res.getDouble("salary"));
			return c1;
		}else{
			return null;
		}
	}
	public static ArrayList<Customer>getAllCustomer()throws SQLException,ClassNotFoundException{
		String sql="select * from customer";
		Connection conn=DBConnection.getDBConnection().getConnection();
		Statement stm=conn.createStatement();
		ResultSet res=stm.executeQuery(sql);
		ArrayList<Customer>custList=new ArrayList<>();
		while(res.next()){
			Customer c1=new Customer(res.getString("id"),res.getString("name"),res.getString("address"),res.getDouble("salary"));
			custList.add(c1);
		}
		return custList;
	}
}
