import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.ToggleButton;


public class CheckToggle extends ToggleButton {
	public CheckToggle(){
		this.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				if(isSelected()){
					setStyle(" -fx-graphic: url(file://PV152-DATA//STUHOME//326469//documents//SourceAmurica//Murica//src//check2.gif)");
				}else{
					setStyle(" -fx-graphic: url(file://PV152-DATA//STUHOME//326469//documents//SourceAmurica//Murica//src//white.jpg)");
				}
				
			}
 
            
        });
	}
}
