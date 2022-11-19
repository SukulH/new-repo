package Phase3;

import javax.swing.*;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;

import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class login {


    public static void showgroup(JFrame frame,orderList order) {

        frame = new JFrame("Login");
        frame.setBounds(70,70,300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel label1 = new JLabel("ASUID: ");
        label1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        label1.setBounds(30, 5, 50, 200);
        frame.getContentPane().add(label1);

        JTextField id = new JTextField ();
        id.setBounds(80, 93, 200, 30);
        frame.getContentPane().add(id);

        JLabel choice = new JLabel("User: ");
        choice.setFont(new Font("Tahoma", Font.PLAIN, 14));
        choice.setBounds(40, 78, 50, 200);
        frame.getContentPane().add(choice);

        JComboBox <userOptions> box= new JComboBox (userOptions.values());
        box.setBounds(80,130,130,100);
        frame.getContentPane().add(box);

        JButton login = new JButton("Login");
        login.setBounds(60,200,150,50);
        frame.getContentPane().add(login);

        JLabel loginstatus = new JLabel("");
        loginstatus.setFont(new Font("Tahoma", Font.PLAIN, 12));
        loginstatus.setBounds(100, -20, 200, 200);
        loginstatus.setForeground(Color.RED);
        frame.getContentPane().add(loginstatus);

        JFrame finalFrame = frame;
        JFrame finalFrame1 = frame;
        login.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {


                try {
                    switch(box.getSelectedItem().toString()){


                        case"chef":
                            if(chefValidate(id.getText().toString())){

                                Platform.runLater(new Runnable() {
                                    @Override
                                    public void run() {
                                        finalFrame1.setVisible(false);
                                        Stage news = new Stage();

                                        order.start(news,order);
                                    }
                                });

                            }
                            break;
                        case"student":
                            if(studentValidate(id.getText().toString())){
                                Platform.runLater(new Runnable() {
                                    @Override
                                    public void run() {
                                     orderProg prog = new orderProg();
                                        prog.start(new Stage());
                                    }
                                });


                            }
                            break;
                    }

                } catch (Exception e) {
                    throw new RuntimeException(e);
                }


            }

            public boolean studentValidate(String id) throws IOException {
                String line;
                String delimeter = ",";

                BufferedReader br = new BufferedReader(new FileReader("/Users/ash/p/src/main/java/Phase3/student.txt"));
                while ((line = br.readLine()) != null){
                    String[] read = line.split(delimeter);
                    if(read[0].equals(id)){
                        return true;
                    }
                }
                return false;
            }
            public boolean chefValidate(String id) throws IOException {
                String line;
                BufferedReader br = new BufferedReader(new FileReader("/Users/ash/p/src/main/java/Phase3/chef.txt"));
                while ((line = br.readLine()) != null){
                    if(line.equals(id)){
                        return true;
                    }
                }

                    return false;
            }
        });
        frame.setVisible(true);
    }




}
