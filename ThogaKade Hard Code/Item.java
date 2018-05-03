package thogaKade.model;

public class Item{
	private String id;
	private String description;
	private double unitPrice;
	private int qOnHand;
	public Item(){}
	public Item(String id,String description,double unitPrice,int qOnHand){
		this.id=id;
		this.description=description;
		this.unitPrice=unitPrice;
		this.qOnHand=qOnHand;
	}
	public void setId(String id){
		this.id=id;
	}
	public void setDescription(String description){
		this.description=description;
	}
	public void setUnitPrice(double unitPrice){
		this.unitPrice=unitPrice;
	}
	public void setQOH(int qOnHand){
		this.qOnHand=qOnHand;
	}
	public String getId(){
		return id;
	}
	public String getDescriptin(){
		return description;
	}
	public double getUnitPrice(){
		return unitPrice;
	}
	public int getQOH(){
		return qOnHand;
	}
}
	



