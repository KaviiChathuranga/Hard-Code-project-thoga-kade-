package thogaKade.main_form;
import thogaKade.placeOrder.*;
import thogaKade.controller.*;
import thogaKade.model.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import java.sql.*;
import java.util.*;
import java.util.Date;
import java.text.*;
import java.awt.event.MouseAdapter;
public class mainForm extends JFrame{
	
	private JPanel openBtnPanel;
	
	private JPanel mainBtnPanel;
	
	private JPanel addBtnPanel;
	private JPanel deleteBtnPanel;
	private JPanel searchBtnPanel;
	private JPanel updateBtnPanel;
	private JPanel viewBtnPanel;
	
	private JPanel placeOrderPanel;
	private JPanel placeOrderfirstPanel;
	private JPanel placeOrderSecondPanel;
	
	private JPanel firstPlaceLblPanel;
	private JPanel firstPlaceCustIdPanel;
	private JPanel firstPlaceCustNamePanel;
	private JPanel firstPlaceItemCodePanel;
	private JPanel firstPlacetxtPanel;
	private JPanel secondPlaceBtnPanel;
	private JPanel order1Panelflow;
	private JPanel orderPanel;
	
	private JPanel panelNamePanel;
	private JPanel panelItemNamePanel;
	private JPanel idTxtPanel;
	private JPanel nameTxtPanel;
	private JPanel addressTxtPanel;
	private JPanel salaryTxtPanel;
	private JPanel panelBtnPanel;
	
	private JPanel codeTxtPanel;
	private JPanel descriptionTxtPanel;
	private JPanel unitPriceTxtPanel;
	private JPanel qOHTxtPanel;
	private JPanel panelItemBtnPanel;
	
	private JPanel addCustomerPanel;
	private JPanel addItemPanel;
	private JPanel searchCustomerPanel;
	private JPanel searchItemPanel;
	private JPanel updateCustomerPanel;
	private JPanel updateItemPanel;
	private JPanel viewCustomerPanel;
	private JPanel viewItemPanel;
	private JPanel deleteCustomerPanel;
	private JPanel deleteItemPanel;
	private JPanel orderBtnPanel;
	
	private JButton customerBtn;
	private JButton itemBtn;
	private JButton placeOrderBtn;
	private JButton orderBtn;
	
	private JButton addCustomerBtn;
	private JButton deleteCustomerBtn;
	private JButton viewCustomerBtn;
	private JButton searchCustomerBtn;
	private JButton updateCustomerBtn;
	
	private JButton addItemBtn;
	private JButton deleteItemBtn;
	private JButton viewItemBtn;
	private JButton searchItemBtn;
	private JButton updateItemBtn;
	
	private JButton addBtn;
	private JButton deleteBtn;
	private JButton searchBtn;
	private JButton viewBtn;
	private JButton updateBtn;
	
	private JTextField addCustomerIdTxt;
	private JTextField addCustomerNameTxt;
	private JTextField addCustomerAddressTxt;
	private JTextField addCustomerSalaryTxt;
	
	private JTextField deleteCustomerIdTxt;
	private JTextField deleteCustomerNameTxt;
	private JTextField deleteCustomerAddressTxt;
	private JTextField deleteCustomerSalaryTxt;
	
	private JTextField updateCustomerIdTxt;
	private JTextField updateCustomerNameTxt;
	private JTextField updateCustomerAddressTxt;
	private JTextField updateCustomerSalaryTxt;
	
	private JTextField searchCustomerIdTxt;
	private JTextField searchCustomerNameTxt;
	private JTextField searchCustomerAddressTxt;
	private JTextField searchCustomerSalaryTxt;
	
	private JTextField addItemCodeTxt;
	private JTextField addItemDescriptionTxt;
	private JTextField addItemUnitPriceTxt;
	private JTextField addItemQOHTxt;
	
	private JTextField deleteItemCodeTxt;
	private JTextField deleteItemDescriptionTxt;
	private JTextField deleteItemUnitPriceTxt;
	private JTextField deleteItemQOHTxt;
	
	private JTextField searchItemCodeTxt;
	private JTextField searchItemDescriptionTxt;
	private JTextField searchItemUnitPriceTxt;
	private JTextField searchItemQOHTxt;
	
	private JTextField updateItemCodeTxt;
	private JTextField updateItemDescriptionTxt;
	private JTextField updateItemUnitPriceTxt;
	private JTextField updateItemQOHTxt;
	
	
	private JTextField itemCodeTxt;
	private JTextField itemDescriptionTxt;
	private JTextField itemUnitPriceTxt;
	private JTextField itemQOHTxt;
	
	private double total;
	private double amount;
	private int count;
	private int grandTotal;
	
	private JTextField  placeOrderOrderTxt;
	private JTextField placeOrderNameTxt;
	private JTextField  placeOrderDateTxt;
	private JTextField placeOrderDescTxt;
	private JTextField  placeOrderQtyTxt;
	private JTextField  placeOrderUnitPriceTxt;
	private JTextField  placeOrderQOHTxt;
	private JTextField  placeOrderTotalTxt;
	private JTextField orderCustTxt;
	
	private JButton removeBtn;
	private JButton saveBtn;
	
	private JComboBox custIdBox;
	private JComboBox itemIdBox;
	
	private JLabel placeOrderMainLbl;
	private JLabel placeOrderCustIdLbl;
	private JLabel placeOrderOrderIdLbl;
	private JLabel placeOrderCustNameLbl;
	private JLabel placeOrderOrderDateLbl;
	private JLabel placeOrderItemCodeLbl;
	private JLabel placeOrderDescLbl;
	private JLabel placeOrderQtyLbl;
	private JLabel placeOrderUnitPriceLbl;
	private JLabel placeOrderQOHLbl;
	private JLabel placeOrderTotalLbl;
	private JLabel optionLbl;
	
	private JPanel order1Panel;
	private JPanel order2Panel;
	
	//private JLabel mainLbl;
	//private JLabel custIdLbl;
	private JLabel panelNameLbl;
	private JLabel idLbl;
	private JLabel nameLbl;
	private JLabel addressLbl;
	private JLabel salaryLbl;
	
	private JLabel panelItemNameLbl;
	private JLabel itemCodeLbl;
	private JLabel itemDescriptionLbl;
	private JLabel itemUnitPriceLbl;
	private JLabel itemQOnHandLbl;
	private JLabel orderCustIDLbl;
	
	
	public mainForm(){
		setSize(500,350);
		setLocationRelativeTo(null);
		openBtnPanel=new JPanel(new FlowLayout(FlowLayout.CENTER));
		setTitle("ThogaKade");
		
		JLabel imageLabel=new JLabel("");
		imageLabel.setIcon(new ImageIcon("eyes-office-women-red-icon.png"));
		//add("Center",imageLabel);
		JPanel kk=new JPanel(new GridLayout());
		kk.add(imageLabel);
		add("Center",kk);
		
		customerBtn=new JButton("Customer");
		customerBtn.setForeground(Color.BLACK);
		openBtnPanel.add(customerBtn);
		
		itemBtn=new JButton("Item");
		itemBtn.setForeground(Color.BLACK);
		openBtnPanel.add(itemBtn);
		
		placeOrderBtn=new JButton("place Order");
		placeOrderBtn.setForeground(Color.BLACK);
		openBtnPanel.add(placeOrderBtn);
		
		orderBtn=new JButton("Order");
		placeOrderBtn.setForeground(Color.BLACK);
		openBtnPanel.add(orderBtn);
		
		add("North",openBtnPanel);
		
		mainBtnPanel=new JPanel(new GridLayout(5,1));
		addBtnPanel=new JPanel(new FlowLayout(FlowLayout.CENTER));
		addBtn=new JButton("Add");
		addBtnPanel.add(addBtn);
		mainBtnPanel.add(addBtnPanel);
		
		searchBtnPanel=new JPanel(new FlowLayout(FlowLayout.CENTER));
		searchBtn=new JButton("Search");
		searchBtnPanel.add(searchBtn);
		mainBtnPanel.add(searchBtnPanel);
		
		updateBtnPanel=new JPanel(new FlowLayout(FlowLayout.CENTER));
		updateBtn=new JButton("Update");
		updateBtnPanel.add(updateBtn);
		mainBtnPanel.add(updateBtnPanel);
		
		deleteBtnPanel=new JPanel(new FlowLayout(FlowLayout.CENTER));
		deleteBtn=new JButton("Delete");
		deleteBtnPanel.add(deleteBtn);
		mainBtnPanel.add(deleteBtnPanel);
		
		viewBtnPanel=new JPanel(new FlowLayout(FlowLayout.CENTER));
		viewBtn=new JButton("View");
		viewBtnPanel.add(viewBtn);
		mainBtnPanel.add(viewBtnPanel);
		
		add("West",mainBtnPanel);
		mainBtnPanel.setVisible(false);
		/////////////////////
		addCustomerPanel=new JPanel(new GridLayout(7,1));
		panelNamePanel=new JPanel(new FlowLayout(FlowLayout.CENTER));
		panelNameLbl=new JLabel("Add Customer");
		panelNamePanel.add(panelNameLbl);
		addCustomerPanel.add(panelNamePanel);
		
		idTxtPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
		idLbl=new JLabel("  id             ");
		addCustomerIdTxt=new JTextField(10);
		idTxtPanel.add(idLbl);
		idTxtPanel.add(addCustomerIdTxt);
		addCustomerPanel.add(idTxtPanel);
		
		nameTxtPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
		nameLbl=new JLabel("  Name      ");
		addCustomerNameTxt=new JTextField(15);
		nameTxtPanel.add(nameLbl);
		nameTxtPanel.add(addCustomerNameTxt);
		addCustomerPanel.add(nameTxtPanel);
		
		addressTxtPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
		addressLbl=new JLabel("  Address ");
		addCustomerAddressTxt=new JTextField(20);
		addressTxtPanel.add(addressLbl);
		addressTxtPanel.add(addCustomerAddressTxt);
		addCustomerPanel.add(addressTxtPanel);
		
		salaryTxtPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
		salaryLbl=new JLabel("  salary     ");
		addCustomerSalaryTxt=new JTextField(10);
		salaryTxtPanel.add(salaryLbl);
		salaryTxtPanel.add(addCustomerSalaryTxt);
		addCustomerPanel.add(salaryTxtPanel);
		
		panelBtnPanel=new JPanel(new FlowLayout(FlowLayout.RIGHT));
		addCustomerBtn=new JButton("Add Customer");
		panelBtnPanel.add(addCustomerBtn);
		addCustomerPanel.add(panelBtnPanel);
		add("Center",addCustomerPanel);
		addCustomerPanel.setVisible(false);
		
		
		
		
		updateCustomerPanel=new JPanel(new GridLayout(7,1));
		panelNamePanel=new JPanel(new FlowLayout(FlowLayout.CENTER));
		panelNameLbl=new JLabel("Update Customer");
		panelNamePanel.add(panelNameLbl);
		updateCustomerPanel.add(panelNamePanel);
		
		idTxtPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
		idLbl=new JLabel("  id             ");
		updateCustomerIdTxt=new JTextField(10);
		idTxtPanel.add(idLbl);
		idTxtPanel.add(updateCustomerIdTxt);
		updateCustomerPanel.add(idTxtPanel);
		
		nameTxtPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
		nameLbl=new JLabel("  Name      ");
		updateCustomerNameTxt=new JTextField(15);
		nameTxtPanel.add(nameLbl);
		nameTxtPanel.add(updateCustomerNameTxt);
		updateCustomerPanel.add(nameTxtPanel);
		
		addressTxtPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
		addressLbl=new JLabel("  Address ");
		updateCustomerAddressTxt=new JTextField(20);
		addressTxtPanel.add(addressLbl);
		addressTxtPanel.add(updateCustomerAddressTxt);
		updateCustomerPanel.add(addressTxtPanel);
		
		salaryTxtPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
		salaryLbl=new JLabel("  salary     ");
		updateCustomerSalaryTxt=new JTextField(10);
		salaryTxtPanel.add(salaryLbl);
		salaryTxtPanel.add(updateCustomerSalaryTxt);
		updateCustomerPanel.add(salaryTxtPanel);
		
		panelBtnPanel=new JPanel(new FlowLayout(FlowLayout.RIGHT));
		updateCustomerBtn=new JButton("update Customer");
		panelBtnPanel.add(updateCustomerBtn);
		updateCustomerPanel.add(panelBtnPanel);
		add("Center",updateCustomerPanel);
		updateCustomerPanel.setVisible(false);
		
		///////////////////////////////////
		deleteCustomerPanel=new JPanel(new GridLayout(7,1));
		panelNamePanel=new JPanel(new FlowLayout(FlowLayout.CENTER));
		panelNameLbl=new JLabel("Delete Customer");
		panelNamePanel.add(panelNameLbl);
		deleteCustomerPanel.add(panelNamePanel);
		
		idTxtPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
		idLbl=new JLabel("  id             ");
		deleteCustomerIdTxt=new JTextField(10);
		idTxtPanel.add(idLbl);
		idTxtPanel.add(deleteCustomerIdTxt);
		deleteCustomerPanel.add(idTxtPanel);
		
		nameTxtPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
		nameLbl=new JLabel("  Name      ");
		deleteCustomerNameTxt=new JTextField(15);
		nameTxtPanel.add(nameLbl);
		nameTxtPanel.add(deleteCustomerNameTxt);
		deleteCustomerPanel.add(nameTxtPanel);
		
		addressTxtPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
		addressLbl=new JLabel("  Address ");
		deleteCustomerAddressTxt=new JTextField(20);
		addressTxtPanel.add(addressLbl);
		addressTxtPanel.add(deleteCustomerAddressTxt);
		deleteCustomerPanel.add(addressTxtPanel);
		
		salaryTxtPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
		salaryLbl=new JLabel("  salary     ");
		deleteCustomerSalaryTxt=new JTextField(10);
		salaryTxtPanel.add(salaryLbl);
		salaryTxtPanel.add(deleteCustomerSalaryTxt);
		deleteCustomerPanel.add(salaryTxtPanel);
		
		panelBtnPanel=new JPanel(new FlowLayout(FlowLayout.RIGHT));
		deleteCustomerBtn=new JButton("Delete Customer");
		panelBtnPanel.add(deleteCustomerBtn);
		deleteCustomerPanel.add(panelBtnPanel);
		add("Center",deleteCustomerPanel);
		deleteCustomerPanel.setVisible(false);
		
		////////////////////////////////////////////////////
		
		searchCustomerPanel=new JPanel(new GridLayout(7,1));
		panelNamePanel=new JPanel(new FlowLayout(FlowLayout.CENTER));
		panelNameLbl=new JLabel("Search Customer");
		panelNamePanel.add(panelNameLbl);
		searchCustomerPanel.add(panelNamePanel);
		
		idTxtPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
		idLbl=new JLabel("  id             ");
		searchCustomerIdTxt=new JTextField(10);
		idTxtPanel.add(idLbl);
		idTxtPanel.add(searchCustomerIdTxt);
		searchCustomerPanel.add(idTxtPanel);
		
		nameTxtPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
		nameLbl=new JLabel("  Name      ");
		searchCustomerNameTxt=new JTextField(15);
		nameTxtPanel.add(nameLbl);
		nameTxtPanel.add(searchCustomerNameTxt);
		searchCustomerPanel.add(nameTxtPanel);
		
		addressTxtPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
		addressLbl=new JLabel("  Address ");
		searchCustomerAddressTxt=new JTextField(20);
		addressTxtPanel.add(addressLbl);
		addressTxtPanel.add(searchCustomerAddressTxt);
		searchCustomerPanel.add(addressTxtPanel);
		
		salaryTxtPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
		salaryLbl=new JLabel("  salary     ");
		searchCustomerSalaryTxt=new JTextField(10);
		salaryTxtPanel.add(salaryLbl);
		salaryTxtPanel.add(searchCustomerSalaryTxt);
		searchCustomerPanel.add(salaryTxtPanel);
		
		panelBtnPanel=new JPanel(new FlowLayout(FlowLayout.RIGHT));
		searchCustomerBtn=new JButton("Search Customer");
		panelBtnPanel.add(searchCustomerBtn);
		searchCustomerPanel.add(panelBtnPanel);
		add("Center",searchCustomerPanel);
		searchCustomerPanel.setVisible(false);
		
		////////////////////////////////////////////////////
		
		viewCustomerPanel=new JPanel(new GridLayout());
		String []row={"id","Name","Address","Salary"};
		DefaultTableModel dtm=new DefaultTableModel(row,0);
		JTable table=new JTable(dtm);
		JScrollPane scrol= new JScrollPane(table);
		viewCustomerPanel.add(scrol);
		add("Center",viewCustomerPanel);
		viewCustomerPanel.setVisible(false);
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		addItemPanel=new JPanel(new GridLayout(6,1));
		
		panelItemNamePanel=new JPanel(new FlowLayout(FlowLayout.CENTER));
		panelItemNameLbl=new JLabel("Add Item");
		panelItemNamePanel.add(panelItemNameLbl);
		addItemPanel.add(panelItemNamePanel);
		
		codeTxtPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
		itemCodeLbl=new JLabel("Code           ");
		addItemCodeTxt=new JTextField(10);
		codeTxtPanel.add(itemCodeLbl);
		codeTxtPanel.add(addItemCodeTxt);
		addItemPanel.add(codeTxtPanel);
		
		descriptionTxtPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
		itemDescriptionLbl=new JLabel("Description");
		addItemDescriptionTxt=new JTextField(10);
		descriptionTxtPanel.add(itemDescriptionLbl);
		descriptionTxtPanel.add(addItemDescriptionTxt);
		addItemPanel.add(descriptionTxtPanel);
		
		unitPriceTxtPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
		itemUnitPriceLbl=new JLabel("Unit Price   ");
		addItemUnitPriceTxt=new JTextField(10);
		unitPriceTxtPanel.add(itemUnitPriceLbl);
		unitPriceTxtPanel.add(addItemUnitPriceTxt);
		addItemPanel.add(unitPriceTxtPanel);
		
		qOHTxtPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
		itemQOnHandLbl=new JLabel("Q On Hand ");
		addItemQOHTxt=new JTextField(10);
		qOHTxtPanel.add(itemQOnHandLbl);
		qOHTxtPanel.add(addItemQOHTxt);
		addItemPanel.add(qOHTxtPanel);
		
		panelItemBtnPanel=new JPanel(new FlowLayout(FlowLayout.RIGHT));
		addItemBtn=new JButton("Add Item");
		panelItemBtnPanel.add(addItemBtn);
		addItemPanel.add(panelItemBtnPanel);
		
		add("Center",addItemPanel);
		addItemPanel.setVisible(false);
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		searchItemPanel=new JPanel(new GridLayout(6,1));
		
		panelItemNamePanel=new JPanel(new FlowLayout(FlowLayout.CENTER));
		panelItemNameLbl=new JLabel("Search Item");
		panelItemNamePanel.add(panelItemNameLbl);
		searchItemPanel.add(panelItemNamePanel);
		
		codeTxtPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
		itemCodeLbl=new JLabel("Code           ");
		searchItemCodeTxt=new JTextField(10);
		codeTxtPanel.add(itemCodeLbl);
		codeTxtPanel.add(searchItemCodeTxt);
		searchItemPanel.add(codeTxtPanel);
		
		descriptionTxtPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
		itemDescriptionLbl=new JLabel("Description");
		searchItemDescriptionTxt=new JTextField(10);
		descriptionTxtPanel.add(itemDescriptionLbl);
		descriptionTxtPanel.add(searchItemDescriptionTxt);
		searchItemPanel.add(descriptionTxtPanel);
		
		unitPriceTxtPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
		itemUnitPriceLbl=new JLabel("Unit Price   ");
		searchItemUnitPriceTxt=new JTextField(10);
		unitPriceTxtPanel.add(itemUnitPriceLbl);
		unitPriceTxtPanel.add(searchItemUnitPriceTxt);
		searchItemPanel.add(unitPriceTxtPanel);
		
		qOHTxtPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
		itemQOnHandLbl=new JLabel("Q On Hand ");
		searchItemQOHTxt=new JTextField(10);
		qOHTxtPanel.add(itemQOnHandLbl);
		qOHTxtPanel.add(searchItemQOHTxt);
		searchItemPanel.add(qOHTxtPanel);
		
		panelItemBtnPanel=new JPanel(new FlowLayout(FlowLayout.RIGHT));
		searchItemBtn=new JButton("Search Item");
		panelItemBtnPanel.add(searchItemBtn);
		searchItemPanel.add(panelItemBtnPanel);
		
		add("Center",searchItemPanel);
		searchItemPanel.setVisible(false);
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		updateItemPanel=new JPanel(new GridLayout(6,1));
			
		panelItemNamePanel=new JPanel(new FlowLayout(FlowLayout.CENTER));
		panelItemNameLbl=new JLabel("Update Item");
		panelItemNamePanel.add(panelItemNameLbl);
		updateItemPanel.add(panelItemNamePanel);
		
		codeTxtPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
		itemCodeLbl=new JLabel("Code           ");
		updateItemCodeTxt=new JTextField(10);
		codeTxtPanel.add(itemCodeLbl);
		codeTxtPanel.add(updateItemCodeTxt);
		updateItemPanel.add(codeTxtPanel);
		
		descriptionTxtPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
		itemDescriptionLbl=new JLabel("Description");
		updateItemDescriptionTxt=new JTextField(10);
		descriptionTxtPanel.add(itemDescriptionLbl);
		descriptionTxtPanel.add(updateItemDescriptionTxt);
		updateItemPanel.add(descriptionTxtPanel);
		
		unitPriceTxtPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
		itemUnitPriceLbl=new JLabel("Unit Price   ");
		updateItemUnitPriceTxt=new JTextField(10);
		unitPriceTxtPanel.add(itemUnitPriceLbl);
		unitPriceTxtPanel.add(updateItemUnitPriceTxt);
		updateItemPanel.add(unitPriceTxtPanel);
		
		qOHTxtPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
		itemQOnHandLbl=new JLabel("Q On Hand ");
		updateItemQOHTxt=new JTextField(10);
		qOHTxtPanel.add(itemQOnHandLbl);
		qOHTxtPanel.add(updateItemQOHTxt);
		updateItemPanel.add(qOHTxtPanel);
		
		panelItemBtnPanel=new JPanel(new FlowLayout(FlowLayout.RIGHT));
		updateItemBtn=new JButton("Update Item");
		panelItemBtnPanel.add(updateItemBtn);
		updateItemPanel.add(panelItemBtnPanel);
		
		add("Center",updateItemPanel);
		updateItemPanel.setVisible(false);
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		deleteItemPanel=new JPanel(new GridLayout(6,1));
			
		panelItemNamePanel=new JPanel(new FlowLayout(FlowLayout.CENTER));
		panelItemNameLbl=new JLabel("Delete Item");
		panelItemNamePanel.add(panelItemNameLbl);
		deleteItemPanel.add(panelItemNamePanel);
		
		codeTxtPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
		itemCodeLbl=new JLabel("Code           ");
		deleteItemCodeTxt=new JTextField(10);
		codeTxtPanel.add(itemCodeLbl);
		codeTxtPanel.add(deleteItemCodeTxt);
		deleteItemPanel.add(codeTxtPanel);
		
		descriptionTxtPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
		itemDescriptionLbl=new JLabel("Description");
		deleteItemDescriptionTxt=new JTextField(10);
		descriptionTxtPanel.add(itemDescriptionLbl);
		descriptionTxtPanel.add(deleteItemDescriptionTxt);
		deleteItemPanel.add(descriptionTxtPanel);
		
		unitPriceTxtPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
		itemUnitPriceLbl=new JLabel("Unit Price   ");
		deleteItemUnitPriceTxt=new JTextField(10);
		unitPriceTxtPanel.add(itemUnitPriceLbl);
		unitPriceTxtPanel.add(deleteItemUnitPriceTxt);
		deleteItemPanel.add(unitPriceTxtPanel);
		
		qOHTxtPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
		itemQOnHandLbl=new JLabel("Q On Hand  ");
		deleteItemQOHTxt=new JTextField(10);
		qOHTxtPanel.add(itemQOnHandLbl);
		qOHTxtPanel.add(deleteItemQOHTxt);
		deleteItemPanel.add(qOHTxtPanel);
		
		panelItemBtnPanel=new JPanel(new FlowLayout(FlowLayout.RIGHT));
		deleteItemBtn=new JButton("Delete Item");
		panelItemBtnPanel.add(deleteItemBtn);
		deleteItemPanel.add(panelItemBtnPanel);
		
		add("Center",deleteItemPanel);
		deleteItemPanel.setVisible(false);
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////viewCustomerPanel=new JPanel(new GridLayout());
		viewItemPanel=new JPanel(new GridLayout());
		String []roow={"Code","Description","Unit Price","Q On Hand"};
		DefaultTableModel dttm=new DefaultTableModel(roow,0);
		JTable tablet=new JTable(dttm);
		JScrollPane scrool= new JScrollPane(tablet);
		viewItemPanel.add(scrool);
		add("Center",viewItemPanel);
		viewItemPanel.setVisible(false);
		
		
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		placeOrderPanel=new JPanel(new GridLayout(2,1));
		placeOrderfirstPanel=new JPanel(new GridLayout(5,1));
		
		placeOrderMainLbl=new JLabel("Place Order");
		firstPlaceLblPanel=new JPanel(new FlowLayout(FlowLayout.CENTER));
		firstPlaceLblPanel.add(placeOrderMainLbl);
		placeOrderfirstPanel.add(firstPlaceLblPanel);
		
		firstPlaceCustIdPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
		placeOrderCustIdLbl=new JLabel("CustId            ");
		custIdBox=new JComboBox();
		
		placeOrderOrderIdLbl=new JLabel("                          Order id       ");
		placeOrderOrderTxt=new JTextField(10);
		firstPlaceCustIdPanel.add(placeOrderCustIdLbl);
		firstPlaceCustIdPanel.add(custIdBox);
		firstPlaceCustIdPanel.add(placeOrderOrderIdLbl);
		firstPlaceCustIdPanel.add(placeOrderOrderTxt);
		placeOrderfirstPanel.add(firstPlaceCustIdPanel);
		
		firstPlaceCustNamePanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
		placeOrderCustNameLbl=new JLabel("Cust Name   ");
		placeOrderNameTxt=new JTextField(10);
		placeOrderOrderDateLbl=new JLabel("         Order Date  ");
		placeOrderDateTxt=new JTextField(10);
		firstPlaceCustNamePanel.add(placeOrderCustNameLbl);
		firstPlaceCustNamePanel.add(placeOrderNameTxt);
		firstPlaceCustNamePanel.add(placeOrderOrderDateLbl);
		firstPlaceCustNamePanel.add(placeOrderDateTxt);
		placeOrderfirstPanel.add(firstPlaceCustNamePanel);
		
		firstPlaceItemCodePanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
		placeOrderItemCodeLbl=new JLabel("Item Code");
		placeOrderDescLbl=new JLabel("    Description");
		placeOrderQtyLbl=new JLabel("       qty           ");
		placeOrderUnitPriceLbl=new JLabel("           unit Price  ");
		placeOrderQOHLbl=new JLabel("            Q_On_Hand");
		firstPlaceItemCodePanel.add(placeOrderItemCodeLbl);
		firstPlaceItemCodePanel.add(placeOrderDescLbl);
		firstPlaceItemCodePanel.add(placeOrderQtyLbl);
		firstPlaceItemCodePanel.add(placeOrderUnitPriceLbl);
		firstPlaceItemCodePanel.add(placeOrderQOHLbl);
		placeOrderfirstPanel.add(firstPlaceItemCodePanel);
		
		firstPlacetxtPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
		itemIdBox=new JComboBox();
		placeOrderDescTxt=new JTextField(8);
		placeOrderQtyTxt=new JTextField(8);
		placeOrderUnitPriceTxt=new JTextField(8);
		placeOrderQOHTxt=new JTextField(8);
		firstPlacetxtPanel.add(itemIdBox);
		firstPlacetxtPanel.add(placeOrderDescTxt);
		firstPlacetxtPanel.add(placeOrderQtyTxt);
		firstPlacetxtPanel.add(placeOrderUnitPriceTxt);
		firstPlacetxtPanel.add(placeOrderQOHTxt);
		placeOrderfirstPanel.add(firstPlacetxtPanel);
		
		placeOrderPanel.add(placeOrderfirstPanel);
		
		placeOrderSecondPanel=new JPanel(new GridLayout(2,1));
		String []roww={"ItemCode","Description","Qty","unitPrice","Amount"};
		DefaultTableModel dtmm=new DefaultTableModel(roww,0);
		JTable t1=new JTable(dtmm);
		JScrollPane scroll=new JScrollPane(t1);
		placeOrderSecondPanel.add(scroll);
		
		secondPlaceBtnPanel=new JPanel(new FlowLayout(FlowLayout.CENTER));
		placeOrderTotalLbl=new JLabel("Total");
		placeOrderTotalTxt=new JTextField(10);
		saveBtn=new JButton("Save");
		removeBtn=new JButton("Remove");
		secondPlaceBtnPanel.add(placeOrderTotalLbl);
		secondPlaceBtnPanel.add(placeOrderTotalTxt);
		secondPlaceBtnPanel.add(saveBtn);
		secondPlaceBtnPanel.add(removeBtn);
		placeOrderSecondPanel.add(secondPlaceBtnPanel);
		
		placeOrderPanel.add(placeOrderSecondPanel);
		placeOrderPanel.setVisible(false);
		
		orderPanel=new JPanel(new GridLayout(2,1));
		order1Panel=new JPanel(new GridLayout(2,1));
		order1Panelflow=new JPanel(new FlowLayout(FlowLayout.CENTER));
		
		orderCustIDLbl=new JLabel("Customer ID");
		order1Panelflow.add(orderCustIDLbl);
		orderCustTxt=new JTextField(10);
		order1Panelflow.add(orderCustTxt);
		order1Panel.add(order1Panelflow);
		JButton orderAllBtn=new JButton("view All");
		JPanel orderBtnPanel=new JPanel(new FlowLayout(FlowLayout.CENTER));
		optionLbl=new JLabel("        ");
		orderBtnPanel.add(optionLbl);
		orderBtnPanel.add(orderAllBtn);
		order1Panel.add(orderBtnPanel);
		orderPanel.add(order1Panel);
		
	
		 
		Object []d={"Order ID","date","Cust ID"};
		
		DefaultTableModel dm=new  DefaultTableModel(d,0);
		dm.setRowCount(0);
		JTable table3=new JTable(dm);
			
		table3.addMouseListener(new MouseAdapter(){
			public void  mouseClicked(MouseEvent ep){
				int u=table3.getSelectedRow();
					String id=(String)dm.getValueAt(u,2);
					try{
					Customer c1=CustomerController.searchCustomer(id);
					optionLbl.setText(c1.getName()+"           ");
					
				}catch(SQLException e){
					System.out.println(e);
				}catch(ClassNotFoundException e){
					System.out.println(e);
				}
							
			}
		});
				
				addBtn.setBackground(Color.WHITE);
				searchBtn.setBackground(Color.WHITE);
				viewBtn.setBackground(Color.WHITE);
				deleteBtn.setBackground(Color.WHITE);
				updateBtn.setBackground(Color.WHITE);
					
		JScrollPane sscroll=new JScrollPane(table3);
		orderPanel.add(sscroll);
		add("Center",orderPanel);
		orderPanel.setVisible(false);
		
		
		
		orderCustTxt.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent evt){
			String id=orderCustTxt.getText();
			Customer c1=new Customer(id);
			try{
				Customer c=CustomerController.searchCustomer(id);
				if(c==null){
					JOptionPane.showMessageDialog(null,"Customer not Found");
				}else{
					optionLbl.setText(c.getName()+"                    ");
				}
			}catch(SQLException e){
					System.out.println(e);
				}catch(ClassNotFoundException e){
					System.out.println(e);
				}

			try{
					ArrayList<Orders>LList=OrderController.getAllOrders(id);
					DefaultTableModel dew=(DefaultTableModel)table3.getModel();
					dew.setRowCount(0);
					for(Orders od:LList){
						
						Object []ww={od.getOrderId(),od.getDate(),od.getCustId()};
						dew.addRow(ww);
					
					//	if(ww0){}
				
			}
				}catch(SQLException e){
					System.out.println(e);
				}catch(ClassNotFoundException e){
					System.out.println(e);
				}
		}
	});
	
	/*addCustomerBtn.setEnabled(false);
	//searchCustomerBtn.setEnabled(false);
	deleteCustomerBtn.setEnabled(false);
	updateCustomerBtn.setEnabled(false);
	
	addItemBtn.setEnabled(false);
	//searchItemBtn.setEnabled(false);
	deleteItemBtn.setEnabled(false);
	updateItemBtn.setEnabled(false);*/
		///////////////////////////
		/*try{
			ArrayList<Orders> c2=CustomerController.getAllOrders();
			DefaultTableModel m=(DefaultTableModel)table.getModel();
			m.setRowCount(0);
			for(Orders c:c2){
				Object []rw={c2.getOrderID(),c2.getOrderDate(),c2.getAllCustomer()};
				m.addRow(rw);
			}
		}catch(SQLException e){
			System.out.println(e);
		}catch(ClassNotFoundException e){
			System.out.println(e);
		}*/
		
		try{
			ArrayList<Customer> c1=CustomerController.getAllCustomer();
			DefaultTableModel m=(DefaultTableModel)table.getModel();
			m.setRowCount(0);
			for(Customer c:c1){
				Object []r={c.getId(),c.getName(),c.getAddress(),c.getSalary()};
				m.addRow(r);
			}
		}catch(SQLException e){
			System.out.println(e);
		}catch(ClassNotFoundException e){
			System.out.println(e);
		}
		
		try{
			ArrayList<Item>c2=ItemController.getAllItem();
			DefaultTableModel mn=(DefaultTableModel)tablet.getModel();
			mn.setRowCount(0);
			for(Item c1:c2){
				Object []rr={c1.getId(),c1.getDescriptin(),c1.getUnitPrice(),c1.getQOH()};
				mn.addRow(rr);
			}
		}catch(SQLException e){
			System.out.println(e);
		}catch(ClassNotFoundException e){
			System.out.println(e);
		}
		
	
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		updateCustomerIdTxt.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
								searchActionEvent2(evt);

			}
		});
		
		deleteCustomerIdTxt.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
								searchActionItem(evt);

			}
		});
		updateItemCodeTxt.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
								searchItemEvent(evt);

			}
		});
		searchItemCodeTxt.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
								searchItemEvent(evt);

			}
		});
		deleteItemCodeTxt.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
								searchItemEventtt(evt);

			}
		});
	
		
		customerBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				count=1;
				System.out.println(count);
				customerBtn.setForeground(Color.RED);
				itemBtn.setForeground(Color.BLACK);
				placeOrderBtn.setForeground(Color.BLACK);
				orderBtn.setForeground(Color.BLACK);
				placeOrderPanel.setVisible(false);
				mainBtnPanel.setVisible(true);
				orderPanel.setVisible(false);
				imageLabel.setVisible(false);
				
				addItemPanel.setVisible(false);
				searchItemPanel.setVisible(false);
				updateItemPanel.setVisible(false);
				deleteItemPanel.setVisible(false);
				viewItemPanel.setVisible(false);
				placeOrderPanel.setVisible(false);
			}
		});
		
		itemBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				count=2;
					System.out.println(count);
				itemBtn.setForeground(Color.RED);
				customerBtn.setForeground(Color.BLACK);
				placeOrderBtn.setForeground(Color.BLACK);
				orderBtn.setForeground(Color.BLACK);
				placeOrderPanel.setVisible(false);
				mainBtnPanel.setVisible(true);
				orderPanel.setVisible(false);
				addCustomerPanel.setVisible(false);
				searchCustomerPanel.setVisible(false);
				updateCustomerPanel.setVisible(false);
				deleteCustomerPanel.setVisible(false);
				viewCustomerPanel.setVisible(false);
				placeOrderPanel.setVisible(false);
				imageLabel.setVisible(false);
			}
		});
		placeOrderBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				placeOrderBtn.setForeground(Color.RED);
				itemBtn.setForeground(Color.BLACK);
				customerBtn.setForeground(Color.BLACK);
				orderBtn.setForeground(Color.BLACK);
				mainBtnPanel.setVisible(false);
				
				addCustomerPanel.setVisible(false);
				searchCustomerPanel.setVisible(false);
				updateCustomerPanel.setVisible(false);
				deleteCustomerPanel.setVisible(false);
				viewCustomerPanel.setVisible(false);
				addItemPanel.setVisible(false);
				searchItemPanel.setVisible(false);
				updateItemPanel.setVisible(false);
				deleteItemPanel.setVisible(false);
				viewItemPanel.setVisible(false);
				imageLabel.setVisible(false);
				

			}
		});
		orderBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				orderBtn.setForeground(Color.RED);
				customerBtn.setForeground(Color.BLACK);
				placeOrderBtn.setForeground(Color.BLACK);
				itemBtn.setForeground(Color.BLACK);
				mainBtnPanel.setVisible(false);
				updateCustomerPanel.setVisible(false);
				updateItemPanel.setVisible(false);
				deleteCustomerPanel.setVisible(false);
				deleteItemPanel.setVisible(false);
				searchCustomerPanel.setVisible(false);
				searchItemPanel.setVisible(false);
				viewCustomerPanel.setVisible(false);
				viewItemPanel.setVisible(false);
				placeOrderPanel.setVisible(false);
				addCustomerPanel.setVisible(false);
				addItemPanel.setVisible(false);
				orderPanel.setVisible(true);
				add("Center",orderPanel);
				
				imageLabel.setVisible(false);
			}
		});
		
		
		
		addBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				orderPanel.setVisible(false);
				addBtn.setForeground(Color.BLUE);
				searchBtn.setForeground(Color.BLACK);
				deleteBtn.setForeground(Color.BLACK);
				updateBtn.setForeground(Color.BLACK);
				viewBtn.setForeground(Color.BLACK);
				
				updateCustomerPanel.setVisible(false);
				updateItemPanel.setVisible(false);
				deleteCustomerPanel.setVisible(false);
				deleteItemPanel.setVisible(false);
				searchCustomerPanel.setVisible(false);
				searchItemPanel.setVisible(false);
				viewCustomerPanel.setVisible(false);
				viewItemPanel.setVisible(false);
				placeOrderPanel.setVisible(false);
				imageLabel.setVisible(false);
				if(count==1){
					addItemPanel.setVisible(false);
				add("Center",addCustomerPanel);
				addCustomerPanel.setVisible(true);
				}else{
					addCustomerPanel.setVisible(false);
				add("Center",addItemPanel);
				addItemPanel.setVisible(true);
				}
			}
		});
		
		updateBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				orderPanel.setVisible(false);
				imageLabel.setVisible(false);
				updateBtn.setForeground(Color.BLUE);
				searchBtn.setForeground(Color.BLACK);
				deleteBtn.setForeground(Color.BLACK);
				addBtn.setForeground(Color.BLACK);
				viewBtn.setForeground(Color.BLACK);
				
				addCustomerPanel.setVisible(false);
				addItemPanel.setVisible(false);
				deleteCustomerPanel.setVisible(false);
				deleteItemPanel.setVisible(false);
				searchCustomerPanel.setVisible(false);
				searchItemPanel.setVisible(false);
				viewCustomerPanel.setVisible(false);
				viewItemPanel.setVisible(false);
				placeOrderPanel.setVisible(false);
				if(count==1){
					updateItemPanel.setVisible(false);
				add("Center",updateCustomerPanel);
				updateCustomerPanel.setVisible(true);
			}
			if(count==2){
				updateCustomerPanel.setVisible(false);
				add("Center",updateItemPanel);
				updateItemPanel.setVisible(true);
			}
			}
		});
		
		deleteBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				orderPanel.setVisible(false);
				deleteBtn.setForeground(Color.BLUE);
				searchBtn.setForeground(Color.BLACK);
				addBtn.setForeground(Color.BLACK);
				updateBtn.setForeground(Color.BLACK);
				viewBtn.setForeground(Color.BLACK);
				imageLabel.setVisible(false);
				updateCustomerPanel.setVisible(false);
				addCustomerPanel.setVisible(false);
				searchCustomerPanel.setVisible(false);
				viewCustomerPanel.setVisible(false);
				updateItemPanel.setVisible(false);
				addItemPanel.setVisible(false);
				searchItemPanel.setVisible(false);
				viewItemPanel.setVisible(false);
				placeOrderPanel.setVisible(false);
				if(count==1){
					deleteItemPanel.setVisible(false);
				add("Center",deleteCustomerPanel);
				deleteCustomerPanel.setVisible(true);
			}
			if(count==2){
				deleteCustomerPanel.setVisible(false);
				add("Center",deleteItemPanel);
				deleteItemPanel.setVisible(true);
			}
			}
		});
		
		
		
		searchBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				orderPanel.setVisible(false);
				searchBtn.setForeground(Color.BLUE);
				addBtn.setForeground(Color.BLACK);
				deleteBtn.setForeground(Color.BLACK);
				updateBtn.setForeground(Color.BLACK);
				viewBtn.setForeground(Color.BLACK);
				imageLabel.setVisible(false);
				updateCustomerPanel.setVisible(false);
				updateItemPanel.setVisible(false);
				deleteCustomerPanel.setVisible(false);
				deleteItemPanel.setVisible(false);
				addCustomerPanel.setVisible(false);
				addItemPanel.setVisible(false);
				viewCustomerPanel.setVisible(false);
				viewItemPanel.setVisible(false);
				placeOrderPanel.setVisible(false);
				if(count==1){
					searchItemPanel.setVisible(false);
				add("Center",searchCustomerPanel);
				searchCustomerPanel.setVisible(true);
			}
			if(count==2){
				searchCustomerPanel.setVisible(false);
				add("Center",searchItemPanel);
				searchItemPanel.setVisible(true);
			}
			}
		});
				
		viewBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				orderPanel.setVisible(false);
				viewBtn.setForeground(Color.BLUE);
				searchBtn.setForeground(Color.BLACK);
				deleteBtn.setForeground(Color.BLACK);
				updateBtn.setForeground(Color.BLACK);
				addBtn.setForeground(Color.BLACK);
				imageLabel.setVisible(false);
				updateCustomerPanel.setVisible(false);
				updateItemPanel.setVisible(false);
				deleteCustomerPanel.setVisible(false);
				deleteItemPanel.setVisible(false);
				addCustomerPanel.setVisible(false);
				addItemPanel.setVisible(false);
				searchCustomerPanel.setVisible(false);
				searchItemPanel.setVisible(false);
				placeOrderPanel.setVisible(false);
				if(count==1){
					viewItemPanel.setVisible(false);
				add("Center",viewCustomerPanel);
				viewCustomerPanel.setVisible(true);
			}
			if(count==2){
				viewCustomerPanel.setVisible(false);
				add("Center",viewItemPanel);
				viewItemPanel.setVisible(true);
			}
			}
		});
		
		placeOrderBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				orderPanel.setVisible(false);
				searchCustomerPanel.setVisible(false);
				searchItemPanel.setVisible(false);
				updateCustomerPanel.setVisible(false);
				updateItemPanel.setVisible(false);
				deleteCustomerPanel.setVisible(false);
				deleteItemPanel.setVisible(false);
				addCustomerPanel.setVisible(false);
				addItemPanel.setVisible(false);
				viewCustomerPanel.setVisible(false);
				viewItemPanel.setVisible(false);
				add("Center",placeOrderPanel);
				placeOrderPanel.setVisible(true);
				imageLabel.setVisible(false);
			}
		});
		
		addCustomerBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				String id=addCustomerIdTxt.getText();
				String name=addCustomerNameTxt.getText();
				String address=addCustomerAddressTxt.getText();
				System.out.println(addCustomerSalaryTxt.getText());
				double salary=Double.parseDouble(addCustomerSalaryTxt.getText());
				Customer c1=new Customer(id,name,address,salary);
				try{
					int res=CustomerController.addCustomer(c1);
					if(res>0){
						JOptionPane.showMessageDialog(null,"Add Success");
					}else{
						JOptionPane.showMessageDialog(null,"Add fail");
					}
				}catch(SQLException e){
					System.out.println(e);
				}catch(ClassNotFoundException e){
					System.out.println(e);
				}
			}
		});
		
		updateCustomerBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				String id=updateCustomerIdTxt.getText();
				String name=updateCustomerNameTxt.getText();
				String address=updateCustomerAddressTxt.getText();
				System.out.println(addCustomerSalaryTxt.getText());
				double salary=Double.parseDouble(updateCustomerSalaryTxt.getText());
				Customer c1=new Customer(id,name,address,salary);
				try{
					int res=CustomerController.updateCustomer(c1);
					if(res>0){
						JOptionPane.showMessageDialog(null,"Update Success");
					}else{
						JOptionPane.showMessageDialog(null,"Update fail");
					}
				}catch(SQLException e){
					System.out.println(e);
				}catch(ClassNotFoundException e){
					System.out.println(e);
				}
			}
		});
		
		deleteCustomerBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				String id=deleteCustomerIdTxt.getText();
				try{
					int res=CustomerController.deleteCustomer(id);
					if(res>0){
						JOptionPane.showMessageDialog(null,"Deleted");
					}else{
						JOptionPane.showMessageDialog(null,"delete fail");
					}
				}catch(SQLException e){
					System.out.println(e);
				}catch(ClassNotFoundException e){
					System.out.println(e);
				}
			}
		});
		////////////////////////////////////////////////////
		
		addItemBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				String code=addItemCodeTxt.getText();
				String description=addItemDescriptionTxt.getText();
				double unitPrice=Double.parseDouble(addItemUnitPriceTxt.getText());
				System.out.println(addCustomerSalaryTxt.getText());
				int qOH=Integer.parseInt(addItemQOHTxt.getText());
				Item c1=new Item(code,description,unitPrice,qOH);
				try{
					int res=ItemController.addItem(c1);
					if(res>0){
						JOptionPane.showMessageDialog(null,"Add Success");
					}else{
						JOptionPane.showMessageDialog(null,"Add fail");
					}
				}catch(SQLException e){
					System.out.println(e);
				}catch(ClassNotFoundException e){
					System.out.println(e);
				}
			}
		});
		
	/*	if(addCustomerIdTxt.getText().equals("")||addCustomerNameTxt.getText().equals("")||addCustomerAddressTxt.getText().equals("")||addCustomerSalaryTxt.getText().equals("")){
			addCustomerBtn.setEnabled(false);
		}else{
			addCustomerBtn.setEnabled(true);
		}
		
				if(deleteCustomerIdTxt.getText().equals("")||deleteCustomerNameTxt.getText().equals("")||deleteCustomerAddressTxt.getText().equals("")||deleteCustomerSalaryTxt.getText().equals("")){
			deleteCustomerBtn.setEnabled(false);
		}else{
			deleteCustomerBtn.setEnabled(true);
		}
		
				if(updateCustomerIdTxt.getText().equals("")||updateCustomerAddressTxt.getText().equals("")||updateCustomerNameTxt.getText().equals("")||updateCustomerSalaryTxt.getText().equals("")){
			updateCustomerBtn.setEnabled(false);
		}else{
			updateCustomerBtn.setEnabled(true);
		}
		
				if(searchCustomerIdTxt.getText().equals("")||searchCustomerNameTxt.getText().equals("")||searchCustomerAddressTxt.getText().equals("")||searchCustomerSalaryTxt.getText().equals("")){
			//searchCustomerBtn.setEnabled(false);
		}else{
			//searchCustomerBtn.setEnabled(true);
		}
		
		/////////////////
		
		
				if(addItemCodeTxt.getText().equals("")||addItemDescriptionTxt.getText().equals("")||addItemQOHTxt.getText().equals("")||addItemUnitPriceTxt.getText().equals("")){
			addItemBtn.setEnabled(false);
		}else{
			addItemBtn.setEnabled(true);
		}
		
				if(deleteItemCodeTxt.getText().equals("")||deleteItemDescriptionTxt.getText().equals("")||deleteItemQOHTxt.getText().equals("")||deleteItemUnitPriceTxt.getText().equals("")){
			deleteItemBtn.setEnabled(false);
		}else{
			deleteItemBtn.setEnabled(true);
		}
		
				if(searchItemCodeTxt.getText().equals("")||searchItemDescriptionTxt.getText().equals("")||searchItemUnitPriceTxt.getText().equals("")||searchItemQOHTxt.getText().equals("")){
			//searchItemBtn.setEnabled(false);
		}else{
			//searchItemBtn.setEnabled(true);
		}
		
				if(updateItemCodeTxt.getText().equals("")||updateItemDescriptionTxt.getText().equals("")||updateItemQOHTxt.getText().equals("")||updateItemUnitPriceTxt.getText().equals("")){
			updateItemBtn.setEnabled(false);
		}else{
			updateItemBtn.setEnabled(true);
		}
		*/
		
		
		

		
		updateItemBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				String code=updateItemCodeTxt.getText();
				String description=updateItemDescriptionTxt.getText();
				double unitPrice=Double.parseDouble(updateItemUnitPriceTxt.getText());
				System.out.println(addCustomerSalaryTxt.getText());
				int qOH=Integer.parseInt(updateItemQOHTxt.getText());
				Item c1=new Item(code,description,unitPrice,qOH);
				try{
					int res=ItemController.updateItem(c1);
					if(res>0){
						JOptionPane.showMessageDialog(null,"Update Success");
					}else{
						JOptionPane.showMessageDialog(null,"Update fail");
					}
				}catch(SQLException e){
					System.out.println(e);
				}catch(ClassNotFoundException e){
					System.out.println(e);
				}
			}
		});
		
		deleteItemBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				String code=deleteItemCodeTxt.getText();
				try{
					int res=ItemController.deleteItem(code);
					if(res>0){
						JOptionPane.showMessageDialog(null,"Deleted");
					}else{
						JOptionPane.showMessageDialog(null,"delete fail");
					}
				}catch(SQLException e){
					System.out.println(e);
				}catch(ClassNotFoundException e){
					System.out.println(e);
				}
			}
		});
		
		////
		custIdBox.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent evt){
				String custName=(String)custIdBox.getSelectedItem();
				try{
					Customer c1=CustomerController.searchCustomer(custName);
					placeOrderNameTxt.setText(c1.getName());
					
			}catch(SQLException e){
			}catch(ClassNotFoundException e){
			}
		}
		});
		itemIdBox.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent ebt){
				String id=(String)itemIdBox.getSelectedItem();
				placeOrderQtyTxt.requestFocus();
				try{
					Item c1=ItemController.searchItem(id);
					placeOrderUnitPriceTxt.setText(Double.toString(c1.getUnitPrice()));
					placeOrderQOHTxt.setText(Integer.toString(c1.getQOH()));
					placeOrderDescTxt.setText(c1.getDescriptin());
					
				}catch(SQLException e){
					System.out.println(e);
				}catch(ClassNotFoundException e){
					System.out.println(e);
				}
			}
		});
		
		placeOrderQtyTxt.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				
				
				placeOrderUnitPriceTxt.requestFocus();
				
				
			}
		});
		placeOrderUnitPriceTxt.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				DefaultTableModel tm=(DefaultTableModel)t1.getModel();
				
				int qty=Integer.parseInt(placeOrderQtyTxt.getText());
				double unitPrice=Double.parseDouble(placeOrderUnitPriceTxt.getText());
				double total=qty*unitPrice;//
				placeOrderTotalTxt.setText(""+total);
				String itemCode=(String)itemIdBox.getSelectedItem();//
				String description=placeOrderDescTxt.getText();//
				for(int i=0;i<tm.getRowCount();i++){
				String code=(String)tm.getValueAt(i,0);
				
				if(code.equals(itemCode)){
				int orderQty=(int)tm.getValueAt(i,2);
				double temp=(double)tm.getValueAt(i,4);
					qty+=orderQty;
					grandTotal-=temp;
					placeOrderTotalTxt.setText(""+grandTotal);
					tm.removeRow(i);
					
				}
				
			}
				double amount=qty*unitPrice;
					
					grandTotal+=amount;
					placeOrderTotalTxt.setText(""+grandTotal);
				
				Object []x={itemCode,description,qty,unitPrice,amount};
				tm.addRow(x);
				
			}
		});
		
		removeBtn.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent evr){
			DefaultTableModel f=(DefaultTableModel)t1.getModel();
			if(t1.getSelectedRow()!=-1){
				
				double x=(double)t1.getValueAt(t1.getSelectedRow(),4);
				grandTotal-=x;
				f.removeRow(t1.getSelectedRow());
				placeOrderTotalTxt.setText(""+grandTotal);
			}else{
				JOptionPane.showMessageDialog(null,"Please select a Row");
			}
			
		}
	});
	
	saveBtn.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent evt){
			String orderId=placeOrderOrderTxt.getText();
			String date=placeOrderDateTxt.getText();
			int qoh=Integer.parseInt(placeOrderQOHTxt.getText());
			int qtyy=Integer.parseInt(placeOrderQtyTxt.getText());
			int newQty=0;
			
			
			String custId=(String)custIdBox.getSelectedItem();
			ArrayList<OrderDetails>orderDetailList=new ArrayList<>();
			DefaultTableModel www=(DefaultTableModel)t1.getModel();
			for(int i=0;i<www.getRowCount();i++){
				String itemCode=(String)www.getValueAt(i,0);
				int qty=(int)www.getValueAt(i,2);
				//String itemCode=(String)www.getValueAt(i,0);
				//newQty=qoh-qty;
				double unitPrice=(double)www.getValueAt(i,3);
				OrderDetails od=new OrderDetails(orderId,itemCode,qty,unitPrice);
				orderDetailList.add(od);
			}
			Orders orders=new Orders(orderId,custId,date,orderDetailList);
			try{
			boolean last=OrderController.addNewOrder(orders);
			if(last){
				JOptionPane.showMessageDialog(null,"Saved");
			}else{
				JOptionPane.showMessageDialog(null,"Save Fail");
			}
		}catch(SQLException e){
			System.out.println(e);
		}catch(ClassNotFoundException e){
			System.out.println(e);
			}
		}
	});
	
		orderAllBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				try{
					ArrayList<Orders>newList=OrderController.list();
					DefaultTableModel dw=(DefaultTableModel)table3.getModel();
					dw.setRowCount(0);
					for(Orders od:newList){
						Object []w={od.getOrderId(),od.getDate(),od.getCustId()};
						dw.addRow(w);
				
			}
		}catch(SQLException e){
					System.out.println(e);
				}catch(ClassNotFoundException e){
					System.out.println(e);
				}
			}
		});
		////////////////////////////////////////////////////
		searchCustomerBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
			searchAction(evt);
		}		
	});
	searchItemBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
			searchItemEventt(evt);
		}		
	});
		itemBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
			
		}
	});
	viewBtn.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent evt){
			
			
		}
	});
		
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
					itemIdBox.addItem(d.getId());
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
		placeOrderDateTxt.setText(formatDate);
	}
	
	private void searchAction(ActionEvent evt){
			String id=searchCustomerIdTxt.getText();
			String code=deleteCustomerIdTxt.getText();
			
			
				try{
					Customer res=CustomerController.searchCustomer(id);
					if(res==null){
						JOptionPane.showMessageDialog(null,"Customer not found");
					}else{
						searchCustomerNameTxt.setText(res.getName());
						searchCustomerAddressTxt.setText(res.getAddress());
						searchCustomerSalaryTxt.setText(Double.toString(res.getSalary()));
						
						
					}
				}catch(SQLException e){
					System.out.println(e);
				}catch(ClassNotFoundException e){
					System.out.println(e);
				}						
			
			}
			
		private void searchItemEvent(ActionEvent evt){
			String code=updateItemCodeTxt.getText();
				try{
					Item res=ItemController.searchItems(code);
					if(res==null){
						JOptionPane.showMessageDialog(null,"Item not found");
					}else{
						updateItemDescriptionTxt.setText(res.getDescriptin());
						updateItemUnitPriceTxt.setText(Double.toString(res.getUnitPrice()));
						updateItemQOHTxt.setText(Integer.toString(res.getQOH()));
					}
				}catch(SQLException e){
					System.out.println(e);
				}catch(ClassNotFoundException e){
					System.out.println(e);
				}						
			}
	private void searchItemEventt(ActionEvent evt){
			String code=updateItemCodeTxt.getText();
				try{
					Item res=ItemController.searchItems(code);
					if(res==null){
						JOptionPane.showMessageDialog(null,"Item not found");
					}else{
						searchItemDescriptionTxt.setText(res.getDescriptin());
						searchItemUnitPriceTxt.setText(Double.toString(res.getUnitPrice()));
						searchItemQOHTxt.setText(Integer.toString(res.getQOH()));
					}
				}catch(SQLException e){
					System.out.println(e);
				}catch(ClassNotFoundException e){
					System.out.println(e);
				}						
			}
			
	private void searchItemEventtt(ActionEvent evt){
			String code=updateItemCodeTxt.getText();
				try{
					Item res=ItemController.searchItems(code);
					if(res==null){
						JOptionPane.showMessageDialog(null,"Item not found");
					}else{
						deleteItemDescriptionTxt.setText(res.getDescriptin());
						deleteItemUnitPriceTxt.setText(Double.toString(res.getUnitPrice()));
						deleteItemQOHTxt.setText(Integer.toString(res.getQOH()));
					}
				}catch(SQLException e){
					System.out.println(e);
				}catch(ClassNotFoundException e){
					System.out.println(e);
				}						
			}
	private void searchActionItem(ActionEvent evt){
		//	String id=searchCustomerIdTxt.getText();
			String code=deleteCustomerIdTxt.getText();
			
				try{
					Customer res=CustomerController.searchCustomer(code);
					if(res==null){
						JOptionPane.showMessageDialog(null,"Customer not found");
					}else{
						searchCustomerNameTxt.setText(res.getName());
						searchCustomerAddressTxt.setText(res.getAddress());
						searchCustomerSalaryTxt.setText(Double.toString(res.getSalary()));
						
						deleteCustomerNameTxt.setText(res.getName());
						deleteCustomerAddressTxt.setText(res.getAddress());
						deleteCustomerSalaryTxt.setText(Double.toString(res.getSalary()));
						
					}
				}catch(SQLException e){
					System.out.println(e);
				}catch(ClassNotFoundException e){
					System.out.println(e);
				}						
			
			}
		private void searchActionEvent2(ActionEvent evt){
			String id=updateCustomerIdTxt.getText();
			//String code=deleteCustomerIdTxt.getText();
			
			
				try{
					Customer res=CustomerController.searchCustomer(id);
					if(res==null){
						JOptionPane.showMessageDialog(null,"Customer not found");
					}else{
						updateCustomerNameTxt.setText(res.getName());
						updateCustomerAddressTxt.setText(res.getAddress());
						updateCustomerSalaryTxt.setText(Double.toString(res.getSalary()));
						
						
					}
				}catch(SQLException e){
					System.out.println(e);
				}catch(ClassNotFoundException e){
					System.out.println(e);
				}						
			
			}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
