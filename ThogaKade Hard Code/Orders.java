package thogaKade.model;
import java.util.*;

public class Orders{
	private String orderId;
	private String date;
	private String custId;
	private ArrayList<OrderDetails>orderDetailList;
	
	public Orders(){}
	public Orders(String orderId,String custId,String date,ArrayList<OrderDetails>orderDetailList){
		this.orderId=orderId;
		this.date=date;
		this.custId=custId;
		this.orderDetailList=orderDetailList;
	}
	public Orders(String orderId,String date,String custId){
		this.orderId=orderId;
		this.date=date;
		this.custId=custId;
		//this.orderDetailList=orderDetailList;
	}
	public void setOrderId(String orderId){
		this.orderId=orderId;
	}
	public void setDate(String date){
		this.date=date;
	}
	public void setCustId(String custId){
		this.custId=custId;
	}
	public void setOrderDetailLis(ArrayList<OrderDetails> orderDetailList){
		this.orderDetailList=orderDetailList;
	}
	public String getOrderId(){
		return orderId;
	}
	public String getDate(){
		return date;
	}
	public String getCustId(){
		return custId;
	}
	public ArrayList<OrderDetails> getOrderDetails(){
		return orderDetailList;
	}
}
	
	
	
