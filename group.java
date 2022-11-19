package Phase3;
import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;


public class group {	
	public static void showgroup(orderProg progg) {
		JFrame frame = new JFrame("SunDevil Pizza");
			frame.setBounds(100,100,400,400);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().setLayout(null);
			

			JLabel label1 = new JLabel("The Order");
			label1.setFont(new Font("Tahoma", Font.PLAIN, 20));
			label1.setBounds(40, 40, 100, 100);
			frame.getContentPane().add(label1);
			
			
			JButton cookingbutton = new JButton("Cooking");
			cookingbutton.setBounds(270,300,100,50);
			frame.getContentPane().add(cookingbutton);
			cookingbutton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				progg.setProgress(0.75F);
				frame.setVisible(false);
				group1 g1 = new group1();
				g1.showgroup(progg);
			} 
			});
			
			
			
			frame.setVisible(true);
	}

}
