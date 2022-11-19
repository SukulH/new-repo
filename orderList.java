package Phase3;

import java.text.NumberFormat;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.VBox;
import javafx.scene.control.ListView;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class orderList  {
	Order or= new Order();
	private Label label1;
	private group chef;//This class must be renamed to appropriate chef class name so the button press attempts to utilize the chef classes functionality for adding orders 
	ObservableList<Order> orders = FXCollections.observableArrayList();
	ListView<Order> list = new ListView<Order>(orders); 
	public void addOrder(Order order) {
		orders.add(order);
		or = order;
	}
	public void setChef(group list) {
		chef=list;
	}
	public void sendToChef(Order order) {
		//chef.addOrder(order);//may need to be changed
	}
	public void start(Stage primaryStage,orderList oll) {
			orderProg progg= new orderProg();

			NumberFormat fmt = NumberFormat.getInstance();
			BorderPane root = new BorderPane();
			BorderPane side = new BorderPane();
			Scene scene = new Scene(root,800,500);
			Button Button1 = new Button("Send To Chef");
			Button1.setPrefWidth(200);
			Button1.setPrefHeight(50);
			Label label2 = new Label("List of Orders");
			VBox vbox = new VBox(label2,list);
			label1 = new Label();
			list.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
			list.getSelectionModel().selectedItemProperty().addListener((obs,old,newr)->{
				if (newr!=null) {label1.setText(newr.toString());}
				else {label1.setText("");}
			});
			side.setCenter(Button1);
			root.setRight(side);
			root.setLeft(vbox);
			root.setCenter(label1);
			Button1.setOnAction(new EventHandler<ActionEvent>() {
			
				public void handle(ActionEvent event) {
					progg.setProgress(0.25F);
					sendToChef(list.getSelectionModel().getSelectedItem());
					list.getItems().remove(list.getSelectionModel().getSelectedItem());
					ChefOrderDescription c1 = new ChefOrderDescription();

					c1.start(primaryStage,or,progg);
				}
			});
			
			primaryStage.setScene(scene);
			primaryStage.show();
		}
	}
