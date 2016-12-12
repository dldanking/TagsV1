package proto;

import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

public class Location extends BorderPane{
	private String myName;
	private ArrayList<Task> myTasks;
	private Menu parentMenu;
	public Location(String name, Menu parent){
		myName = name;
		myTasks = new ArrayList<Task>();
		parentMenu = parent;
	}
	public void addTask(Task t){
		myTasks.add(t);
	}
	public String getName() {
		// TODO Auto-generated method stub
		return myName;
	}
	public ArrayList<Task> getTasks(){
		return myTasks;
	}
	public void drawMe(){
		GridPane gp = new GridPane();
		gp.setHgap(10);
		gp.setVgap(10);
		gp.setAlignment(Pos.CENTER);
		gp.setPrefHeight(myTasks.size()*100);
		gp.setPrefWidth(300);
		int c = 0;
		for (Task t : myTasks){
			gp.add(t,0,c);
			c++;
		}
		this.setCenter(gp);
		HBox hb = new HBox();
		Button ret = new Button("return");
		ret.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {		
				getScene().setRoot(parentMenu);
			}
 
            
        });
		hb.setPadding(new Insets(25, 25, 25, 25));
		hb.setAlignment(Pos.CENTER_RIGHT);
		setBottom(hb);
		setAlignment(getBottom(), Pos.BOTTOM_RIGHT);
		hb.getChildren().add(ret);
	}
}
