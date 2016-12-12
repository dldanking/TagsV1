package proto;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import sun.audio.*;
import javax.sound.sampled.AudioInputStream;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

public class Task extends GridPane{
	private ToggleButton myCheck;
	private String myText;
	
	public Task(String s) throws IOException{
		InputStream in = new FileInputStream("C:\\Users\\USER\\Downloads\\veg.mp3");
		AudioStream as = new AudioStream(in);
		myText = s;
		myCheck = new ToggleButton();
		myCheck.getStyleClass().add("custom");
		myCheck.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				
				
			}
 
            
        });
		setAlignment(Pos.CENTER_LEFT);
		add(myCheck,0,0);
		Text t = new Text(myText);
		t.getStyleClass().add("task-text");
		add(t,1,0);
	}
	
}
