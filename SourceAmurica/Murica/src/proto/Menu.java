package proto;

import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Menu extends BorderPane{
	private ArrayList<Location> myLocs;
	private Scene myScene;
	public Menu() {
		// TODO Auto-generated constructor stub
		myLocs = new ArrayList<Location>();
		this.getStyleClass().add("menu");

	}
	public Scene getMyScene(){
		return myScene;
	}
	public void updateScene(){
		myScene =new Scene(this,getPrefWidth(),getPrefHeight());
		myScene.getStylesheets().add("MainStyle.css");
	}
	public void addLoc(Location l){
		myLocs.add(l);
	}
	public void drawMe(){
		getChildren().clear();
		int c = 0;
		GridPane gp = new GridPane();
		gp.setHgap(10);
		gp.setVgap(10);
		for(Location l : myLocs){
			Button b = new Button(l.getName());
			b.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent arg0) {
					l.drawMe();
					getScene().setRoot(l);
					
				}
	 
	            
	        });
			b.getStyleClass().add("menu-button");
			
			gp.add(b,0,c);
			c++;
		}
		gp.setAlignment(Pos.CENTER);
		this.setCenter(gp);
		setAlignment(getCenter(), Pos.CENTER);
	}

}
