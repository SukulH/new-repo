package Phase3;



import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class orderProg {
	ProgressBar p1 = new ProgressBar();

	public void setProgress(float value){
		p1.setProgress(value);
	}
	public void start(Stage primaryStage) {

		p1.setMinHeight(100);
		p1.setMinWidth(500);
		
		Label acc = new Label("Accepted     ");
		Label rc = new Label("Ready to Cook     ");
		Label cooking = new Label("Cooking     ");
		Label ready = new Label("Ready!     ");
		Label Os = new Label("Order Status");
		Os.setFont(new Font(40));
		HBox labels = new HBox();
		labels.getChildren().add(acc);
		labels.getChildren().add(rc);
		labels.getChildren().add(cooking);
		labels.getChildren().add(ready);
			VBox pane = new VBox(8);
			labels.setAlignment(Pos.CENTER);
			labels.setSpacing(40);
			pane.getChildren().add(Os);
	        pane.getChildren().add(p1);
	        pane.getChildren().add(labels);
	        pane.setAlignment(Pos.CENTER);
	        Scene scene = new Scene(pane, 640, 400);
			primaryStage.setScene(scene);
			primaryStage.show();

	}

}
