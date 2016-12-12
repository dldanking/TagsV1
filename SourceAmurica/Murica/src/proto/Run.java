package proto;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.Background;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Run extends Application{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
	@Override
	public void start(Stage primaryStage){
		Menu root = new Menu();
		Location printer = new Location("Printer",root);
		Location pool = new Location("Pool Closet",root);
		Location weight = new Location("Weight Equipment",root);
		printer.addTask(new Task("Load paper"));
		printer.addTask(new Task("Load paper"));
		printer.addTask(new Task("Load paper"));
		pool.addTask(new Task("Noodle the noodles"));
		pool.addTask(new Task("Stuff"));
		pool.addTask(new Task("Load paper"));
		weight.addTask(new Task("Wipe"));
		root.addLoc(printer);
		root.addLoc(pool);
		root.addLoc(weight);
		root.setPadding(new Insets(25, 25, 25, 25));
		root.drawMe();
		Scene myScene =new Scene(root);
        myScene.getStylesheets().add("MainStyle.css");
        primaryStage.setFullScreen(true);
        primaryStage.setResizable(true);
        primaryStage.setScene(myScene);
        primaryStage.show();
	}
}
