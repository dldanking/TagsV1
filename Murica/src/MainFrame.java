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
public class MainFrame extends Application{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
	@Override
	public void start(Stage primaryStage){
		CheckToggle check = new CheckToggle();
		
		CheckBox c1 = new CheckBox();
		CheckBox c2 = new CheckBox();
		CheckBox c3 = new CheckBox();
        Text t1 = new Text();
        t1.setText("Woast Witvik");
        Text t2 = new Text();
        t2.setText("Genocide the weebs");
        Text t3 = new Text();
        t3.setText("Woast Witvik");
		GridPane root = new GridPane();
		root.setAlignment(Pos.CENTER_LEFT);
		root.setHgap(10);
		root.setVgap(10);
		root.setPadding(new Insets(25, 25, 25, 25));
		root.add(c1,0,0);
		root.add(t1,1,0);
		root.add(c2,0,1);
		root.add(t2,1,1);
		root.add(c3,0,2);
		root.add(t3,1,2);
		root.add(check,1, 3);
        Scene scene =new Scene(root, 300, 250);
        //scene.getStylesheets().add(this.getClass().getResource("MainFrame.css").toExternalForm());
		primaryStage.setScene(scene);
        primaryStage.show();
	}
}
