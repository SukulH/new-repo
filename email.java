package Phase3;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import javafx.application.Application;
import javafx.stage.Stage;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class email extends Application{
    @Override
    public void start(Stage arg0) throws Exception {
        showgroup();
    }

    public static void showgroup() {
        Stage main;
        JFrame frame = new JFrame("Email");
        frame.setBounds(400,400,700,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel recipent = new JLabel("Recipent:");
        recipent.setFont(new Font("Tahoma", Font.PLAIN, 14));
        recipent.setBounds(10, 10, 200, 100);
        frame.getContentPane().add(recipent);

        JTextArea erecipent = new JTextArea("vnjdfnvkdjfn@gmail.com");
        erecipent.setBounds(85, 50, 600, 20);
        frame.getContentPane().add(erecipent);
        erecipent.setEditable(false);

        JLabel sender = new JLabel("Sender:");
        sender.setFont(new Font("Tahoma", Font.PLAIN, 14));
        sender.setBounds(10, 20, 200, 200);
        frame.getContentPane().add(sender);

        JTextArea esender = new JTextArea("sundevilpizza@asu.edu");
        esender.setBounds(85, 110, 600, 20);
        frame.getContentPane().add(esender);
        esender.setEditable(false);

        JLabel content = new JLabel("Email:");
        content.setFont(new Font("Tahoma", Font.PLAIN, 14));
        content.setBounds(10, 90, 200, 200);
        frame.getContentPane().add(content);

        JLabel msg = new JLabel("<html>Hello,<br> <br>Thank you for ordering from sun devil pizza, your order is ready for pickup.<br><br> Sun Devil Pizza support team.</html>");
        msg.setBounds(95, 125, 600, 200);
        msg.grabFocus();
        frame.getContentPane().add(msg);

        JTextArea message = new JTextArea();
        message.setBounds(85, 185, 600, 200);
        frame.getContentPane().add(message);
        message.setEditable(false);



        JButton close = new JButton("Close");
        close.setBounds(570,420,100,30);
        frame.getContentPane().add(close);
        frame.setVisible(true);
        close.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {

                frame.setVisible(false);
            }
        });

    }


}
