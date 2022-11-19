package Phase3;


import javafx.application.Application;
import javafx.stage.Stage;


public class main extends Application{
	@Override
	public void start(Stage primaryStage) {
		
		login login = new login();
		group orderWindow = new group();
		Order newOrderItem = new Order();
		newOrderItem.setID(1);
		newOrderItem.setOrderNum(2);
		newOrderItem.setPickup(12.11);
		newOrderItem.setToppings("Onion, Bellpeppers and cheese");
		newOrderItem.setType("pizza type one");
		orderList ol = new orderList();
		orderProg op  = new orderProg();
		welcome welc = new welcome();
		createOrder newOrd = new createOrder();
		ChefOrderDescription cod = new ChefOrderDescription();
		welc.welcome(ol);

	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
