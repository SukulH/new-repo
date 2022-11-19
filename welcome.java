package Phase3;
import javax.swing.*;

import javafx.application.Platform;
import javafx.scene.Parent;

import java.awt.*;
import java.awt.event.*;



public class welcome extends JFrame {
	    JButton createNewOrder1;
	    JButton signin;
	    theHandler handler = new theHandler();
	    orderList oll = new orderList();

		JFrame frame;
	    
	 public  void welcome(orderList ol)
	 {
		 this.oll = ol;
	     setTitle("SunDevil Pizza");
		 
	     
	     // nameOfTheRestuarent label details
		  Label welcome = new Label();
		 
	      welcome.setText("Welcome to Sundevil Pizza");
	      welcome.setFont(new Font("Tahoma", Font.PLAIN, 30));
		  welcome.setBounds(100,100,1000,50);
		  add(welcome);
	     
	     
		 
		 createNewOrder1 = new JButton("new order");
		 createNewOrder1.setBounds(15,200,140,60);
		 createNewOrder1.addActionListener(handler);
		 add(createNewOrder1); 
		 
		 signin = new JButton("Login");
		 signin.setBounds(400,200,180,60);
		 signin.addActionListener(handler);
		 add(signin);
		 
		 
		//setting of the program
			setSize(590,310); 
			setLayout(null);
			setVisible(true);
		 }
	 
	 class theHandler implements ActionListener{
		@Override
		public void actionPerformed(java.awt.event.ActionEvent e) {
			// TODO Auto-generated method stub
			if (e.getSource() == createNewOrder1) {
				 Platform.runLater(new Runnable() {
					    @Override
					    public void run() {
				    		createOrder cOrd = new createOrder();
				    		cOrd.createOrder(oll);
							setVisible(false);
				    		
					    }
					});
	
			    }
			else if(e.getSource()==signin ){
					login login = new login();
				try {
					login.showgroup(frame,oll);
				} catch (Exception ex) {
					throw new RuntimeException(ex);
				}
				setVisible(false);
					}


			}
			
		}

	 }




