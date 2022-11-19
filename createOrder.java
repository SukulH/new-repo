package Phase3;
import javax.swing.*;

import javafx.application.Platform;
import javafx.stage.Stage;

import java.awt.*;
import java.awt.event.*;

public class createOrder extends JFrame  {
 
		
		JRadioButton pepperoni; 
		JRadioButton vegetable; 
		JRadioButton cheese; 
		JRadioButton now; 
		JRadioButton later;
		Boolean[] toppingsBool = {false,false,false,false};
		String baseString;
		Checkbox mushroom;
		Checkbox onion;
		Checkbox olives;
		Checkbox extraCheese; 
		Order newOrderItem = new Order(); 
		orderList ol = new orderList();
		Stage nstage = new Stage();
		String toppingString="";
		
		JButton order; 
		
		 
		
		
		 ButtonGroup group = new ButtonGroup();
		 ButtonGroup groupTime =new ButtonGroup();    
		 
		 
		 JComboBox comboBox = new JComboBox();
		 private String[] time = {" Later ","After 30 mins", "After 1 hour", "After 2 hours", "After 3 hours"};
		 
		 
		 public void createOrder(orderList oll)
		 {
			 		this.ol = oll;
                     setTitle("SunDevil Pizza");
                     theHandler handler = new theHandler();

				 	
                     pepperoni=new JRadioButton("Pepperoni");
                     pepperoni.setBounds(30,60,100,30);
                     pepperoni.addActionListener(handler);
					 group.add(pepperoni);
					 add(pepperoni);

					vegetable =new JRadioButton("Vegetable");
					vegetable.setBounds(30,100,100,30);
					vegetable.addActionListener(handler);
					group.add(vegetable);
					add(vegetable);

					cheese=new JRadioButton("Cheese");
					cheese.setBounds(30,140,100,30);
					cheese.addActionListener(handler);
					group.add(cheese);
					add(cheese);
					
					//order the pizza
					order = new JButton("order");
				    order.setBounds(50,225,400,30);
				    order.addActionListener(handler);
					add(order); 
					 
					 
					//toppings options details
					mushroom = new Checkbox("Mushroom");
					mushroom.setBounds(180,60,100,30);
					mushroom.addItemListener(handler);
					add(mushroom);
					
		            
					onion = new Checkbox("Onion");
					onion.setBounds(180,100,100,30);
					onion.addItemListener(handler);
					add(onion); 

					olives = new Checkbox("Olives");
					olives.setBounds(180,140,100,30);
					olives.addItemListener(handler);
					add(olives);
				
				    extraCheese = new Checkbox("Extra Cheese");
					extraCheese.setBounds(180,180,120,30);
					extraCheese.addItemListener(handler);
				     add(extraCheese);
						
					 //pizza type label details
					  Label pizzaType = new Label();
					  pizzaType.setSize(450,100);
				      pizzaType.setText("Pizza Type");
					  pizzaType.setBounds(30,22,100,30);
					  add(pizzaType);
					 
					// toppings label details
					 Label toppings = new Label();
					 toppings.setSize(400,100);
					 toppings.setText("Pizza Toppings");
					 toppings.setBounds(180,20,150,30);
					 add(toppings);
					
					 
					 
					Label pickupTime = new Label();
					 pickupTime.setSize(450,100);
					 pickupTime.setText("pickup Time");
					 pickupTime.setBounds(360,20,200,30);
					 add(pickupTime);
					 
					 
					 now =new JRadioButton("Now");
					 now.setBounds(360,60,100,30);
					 groupTime.add(now);
					 add(now);
					 now.addActionListener(handler);
					 
					 later =new JRadioButton("1 hour");
					 later.setBounds(360,100,100,30);
					 groupTime.add(later);
					 add(later);
					 later.addActionListener(handler);
					 
					 
					
					 final JComboBox time1 = new JComboBox(time);
					 time1.setBounds(360,140,140,30);
					 add(time1);
					
					 
					  	setSize(500,310);
	                    setLayout(null);
	                     setVisible(true);
					 
					 
				     		
				 }
			
		 class theHandler implements ActionListener,ItemListener {
			 boolean bol1 = false;
			 boolean bol2 = false;
			 @Override
			 public void actionPerformed(java.awt.event.ActionEvent e) {
				 // TODO Auto-generated method stub

				 int baseType = 0;
				 int toppingCounter = 0;


				 if (e.getSource() == pepperoni) {
					 bol1 = true;
					 baseString = "Pepperoni";
					 newOrderItem.setType(baseString);
				 }
				 if (e.getSource() == vegetable) {
					 bol1 = true;
					 baseString = "Veggies";
					 newOrderItem.setType(baseString);
				 }
				 if (e.getSource() == cheese) {
					 bol1 = true;
					 baseString = "Cheese";
					 newOrderItem.setType(baseString);
				 }
				 if (e.getSource() == now) {
					 bol2 = true;
					 newOrderItem.setPickup(0);
				 }
				 if (e.getSource() == later) {
					 bol2 = true;
					 newOrderItem.setPickup(60);
				 }

				 if (e.getSource() == order) {
					 if (bol1 && bol2) {


						 for (int i = 0; i < 4; i++) {
							 if (toppingsBool[i]) {
								 switch (i) {
									 case 0:
										 toppingString = toppingString + "Mushroom,";
										 break;
									 case 1:
										 toppingString = toppingString + "Onion,";
										 break;
									 case 2:
										 toppingString = toppingString + "Olives,";
										 break;
									 case 3:
										 toppingString = toppingString + "Extra Cheese,";
										 break;
								 }
							 }

						 }
						 newOrderItem.setToppings(toppingString);


						 Platform.runLater(new Runnable() {
							 @Override
							 public void run() {

								 JFrame frame = new JFrame();
								 login login = new login();
								 try {
									 ol.addOrder(newOrderItem);
									 login.showgroup(frame, ol);
								 } catch (Exception ex) {
									 throw new RuntimeException(ex);
								 }
							 }
						 });

					 }
					 }

				 }

				 @Override
				 public void itemStateChanged (ItemEvent e){
					 // TODO Auto-generated method stub
					 if (e.getSource() == mushroom) {
						 toppingsBool[0] = !(toppingsBool[0]);
					 }
					 if (e.getSource() == onion) {
						 toppingsBool[1] = !(toppingsBool[1]);
					 }
					 if (e.getSource() == olives) {
						 toppingsBool[2] = !(toppingsBool[2]);
					 }
					 if (e.getSource() == extraCheese) {
						 toppingsBool[3] = !(toppingsBool[3]);
					 }
				 }

			 }


		 }


