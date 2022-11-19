package Phase3;

import javafx.application.Platform;
import javafx.stage.Stage;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class group1 {

	public static void showgroup(orderProg progg) {
		JFrame frame = new JFrame("SunDevil Pizza");
		frame.setBounds(100,100,400,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label1 = new JLabel("The order");
		label1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		label1.setBounds(130, 50, 200, 200);
		frame.getContentPane().add(label1);
		
		
		JButton cookingbutton = new JButton("Ready for Pick up");
		cookingbutton.setBounds(230,300,150,50);
		frame.getContentPane().add(cookingbutton);
		cookingbutton.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			Platform.runLater(new Runnable() {
				@Override
				public void run() {
					progg.setProgress(1.0F);

					frame.setVisible(false);
					Stage news = new Stage();
					orderList g1 = new orderList();
					g1.start(news,g1);
				}
			});


		} 
		});
		
		
		
		
		frame.setVisible(true);
		
	}

}
