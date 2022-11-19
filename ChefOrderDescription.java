package Phase3;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.control.TextArea;

import java.awt.event.ActionEvent;


public class ChefOrderDescription{
	public String PizzaType;

	public void start(Stage primaryStage,Order oll,orderProg progg) {
			
			String PizzaToppings = "Onion, Extra Cheese";
	        Button button = new Button("Ready to cook");
	        button.setMaxHeight(30);
	        button.setMaxWidth(150);
	        button.setLayoutX(440);
	        button.setLayoutY(326);
			button.setOnAction(actionEvent -> {

			progg.setProgress(0.50F);
			group g = new group();
			g.showgroup(progg);

			});
	        Label label = new Label("Order Description");
	        label.setLayoutX(67);
	        label.setLayoutY(72);
	        TextArea textArea = new TextArea();
			textArea.setEditable(false);
	        textArea.setMaxHeight(175);
	        textArea.setMaxWidth(425);
	        textArea.setLayoutX(67);
	        textArea.setLayoutY(109);
	        textArea.setText("Pizza Type: " + oll.getType() + "\nPizza Toppings: " + oll.getToppings() + "\nPickup Time:"+oll.getPickup());
	        Rectangle r = new Rectangle();
	        r.setFill(Color.web("#bcbcbc"));
	        r.setHeight(40);
	        r.setWidth(647);
	        r.setLayoutX(-7);
	        r.setLayoutY(-7);

	        Label l3 = new Label("SunDevil Pizza");
	        l3.setLayoutX(552);
	        l3.setLayoutY(6);
	        Pane pane = new Pane();
	        pane.getChildren().add(button);
	        pane.getChildren().add(label);
	        pane.getChildren().add(textArea);
	        pane.getChildren().add(r);
	        pane.getChildren().add(l3);
	        Scene scene = new Scene(pane, 640, 400);
			primaryStage.setScene(scene);
			primaryStage.show();

	}


}