package thogaKade.placeOrder;
//import thogaKade.addCust.*;
import thogaKade.model.*;
import thogaKade.controller.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Date;
import java.text.*;



public class PlaceOrder extends JFrame{
	private double total;
	private double amount;
	private JPanel lblPanel;
	private JPanel mainPanel;
	private JPanel tablePanel;
	private JPanel detailPanel;
	private JPanel detailMainPanel;
	private JPanel detailSubPanel;
	private JPanel custIdMainPanel;
	private JPanel itemPanel;
	private JPanel custIdSubPanel;
	private JPanel custNameSubPanel;
	private JPanel btnPanel;
	
	private JButton removeBtn;
	private JButton saveBtn;
	
	private JTextField  orderTxt;
	private JTextField  nameTxt;
	private JTextField  dateTxt;
	private JTextField descTxt;
	private JTextField  qtyTxt;
	private JTextField  unitPriceTxt;
	private JTextField  qOHTxt;
	private JTextField  totalTxt;
	
	private JComboBox custIdBox;
	private JComboBox itemIdBox;
	
	private JLabel mainLbl;
	private JLabel custIdLbl;
	private JLabel orderIdLbl;
	private JLabel custNameLbl;
	private JLabel orderDateLbl;
	private JLabel itemCodeLbl;
	private JLabel descLbl;
	private JLabel qtyLbl;
	private JLabel unitPriceLbl;
	private JLabel qOHLbl;
	private JLabel totalLbl;
	
	public PlaceOrder(){
		
		setSize(400,400);
		
		lblPanel=new JPanel(new FlowLayout(FlowLayout.CENTER));
		mainLbl=new JLabel("place order");
		lblPanel.add(mainLbl);
		add("North",lblPanel);
		
		mainPanel=new JPanel(new GridLayout(2,1));
		detailPanel=new JPanel(new GridLayout(2,1));
		custIdMainPanel=new JPanel(new GridLayout(2,1));
		custIdSubPanel=new JPanel(new GridLayout(1,4));
		custIdLbl=new JLabel("cust id");
		custIdSubPanel.add(custIdLbl);
		
		custIdBox=new JComboBox();
		     
		custIdSubPanel.add(custIdBox);
		
		orderIdLbl=new JLabel("order ID");
		custIdSubPanel.add(orderIdLbl);
		
		orderTxt=new JTextField(15);
		custIdSubPanel.add(orderTxt);
		
		custIdMainPanel.add(custIdSubPanel); //
		
		custNameSubPanel=new JPanel(new GridLayout(1,4));
		custNameLbl=new JLabel("Cust Name");
		nameTxt=new JTextField(15);
		custNameSubPanel.add(custNameLbl);
		custNameSubPanel.add(nameTxt);
		
		orderDateLbl=new JLabel("order Date");
		custNameSubPanel.add(orderDateLbl);
		dateTxt=new JTextField(15);
		custNameSubPanel.add(dateTxt);
		setDate();
		
		custIdMainPanel.add(custNameSubPanel);//
		
		detailPanel.add(custIdMainPanel); //
		
		itemPanel=new JPanel(new GridLayout(2,5));
		
		itemCodeLbl=new JLabel("item code");
		itemPanel.add(itemCodeLbl);
		descLbl=new JLabel("Description");
		itemPanel.add(descLbl);
		qtyLbl=new JLabel("Qty");
		itemPanel.add(qtyLbl);
		unitPriceLbl=new JLabel("unit price");
		itemPanel.add(unitPriceLbl);
		qOHLbl=new JLabel("Q On Hand");
		itemPanel.add(qOHLbl);
		
		itemIdBox=new JComboBox();
		
		itemPanel.add(itemIdBox);
		descTxt=new JTextField(15);
		itemPanel.add(descTxt);
		qtyTxt=new JTextField(15);
		
		itemPanel.add(qtyTxt);
		unitPriceTxt=new JTextField(15);
		
		itemPanel.add(unitPriceTxt);
		qOHTxt=new JTextField(15);
		itemPanel.add(qOHTxt);
		
		detailPanel.add(itemPanel);
		
		mainPanel.add(detailPanel);
		
		tablePanel=new JPanel(new GridLayout());
		String []x ={"ItemCode","Description","QTy","unitPrice","Amount"};
		DefaultTableModel dtm=new DefaultTableModel(x,0);
		JTable table=new JTable(dtm);
		JScrollPane scrl=new JScrollPane(table);
		mainPanel.add(scrl);
		add("Center",mainPanel);
		
		btnPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
		totalLbl=new JLabel("total");
		btnPanel.add(totalLbl);
		totalTxt=new JTextField(15);
		btnPanel.add(totalTxt);
		
		removeBtn=new JButton("Remove");
		
		saveBtn=new JButton("Save");
	
		btnPanel.add(removeBtn);
		btnPanel.add(saveBtn);
		add("South",btnPanel);
		
		loadItem();
		loadCustomer();
		setDate();
	}
	private  void loadCustomer(){
		try{
			ArrayList<Customer>custList=CustomerController.getAllCustomer();
			
				for (int i = 0; i < custList.size(); i++){
				Customer customer=(Customer)custList.get(i);
				custIdBox.addItem(customer.getId());
			}
		}catch(SQLException e){
			System.out.println(e);
		}catch(ClassNotFoundException e){
			System.out.println(e);
		}
	}
	
	private void loadItem(){
			try{
				ArrayList<Item>itemList=ItemController.getAllItem();
				for(Item d:itemList){
					orderTxt.setText(d.getId());
				}
			}catch(SQLException e){
			System.out.println(e);
		}catch(ClassNotFoundException e){
			System.out.println(e);
		}
	}
	private void setDate(){
		Date date=new Date(); //java.util.Date ->get Current date and time
		SimpleDateFormat x=new SimpleDateFormat("yyyy-MM-dd");
		String formatDate=x.format(date);
		dateTxt.setText(formatDate);
	}
}











