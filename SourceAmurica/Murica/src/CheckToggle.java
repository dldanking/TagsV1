import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.ToggleButton;


public class CheckToggle extends ToggleButton {
	public CheckToggle(){
		this.setStyle(" -fx-graphic: url(file:src/white.jpg)");
		this.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				if(isSelected()){
					setStyle(" -fx-graphic: url(file:src/check2.gif)");
				}else{
					setStyle(" -fx-graphic: url(file:src/white.jpg)");
				}
				
			}
 
            
        });
	}
}

