package thogaKade.model;
public class OrderDetails{
	private String orderId;
	private String itemCode;
	private int qty;
	private  double unitPrice;
	OrderDetails(){}
	public OrderDetails(String orderId,String itemCode,int qty,double unitPrice){
		this.orderId=orderId;
		this.itemCode=itemCode;
		this.qty=qty;
		this.unitPrice=unitPrice;
	}
	public void setOrderId(String orderId){
		this.orderId=orderId;
	}
		public void setItemCode(String itemCode){
		this.itemCode=itemCode;
	}
		public void setQty(int qty){
		this.qty=qty;
	}
		public void setUnitPrice(double unitPrice){
		this.unitPrice=unitPrice;
	}
	public int getQty(){
		return qty;
	}
	public String getOrderId(){
		return orderId;
	}
	public String getItemCode(){
		return itemCode;
	}
		public double getUnitPrice(){
			return unitPrice;
		}
	}
