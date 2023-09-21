package application;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
 
 
public class basica extends Application{

	    public static void main(String[] args) {
	        launch(args);
	    }
	    

		@Override
		public void start(Stage PrimaryStage) throws Exception {
		
			// Creating the button
			Button PrimaryButton = new Button("Click Me!!!!");
						
			// Create a text field
	        TextField textField = new TextField();
	        
	        
	        
	        // Create a Label object
	        Label label = new Label("Label");	
			// Set the font size and style
	        label.setFont(Font.font("Arial", FontWeight.BOLD, 32)); 
 			// Creating the Scene Graph
 			VBox root = new VBox();
 			// Adding the Button to the Scene
 			root.getChildren().addAll(label);
 			
 			
 			
 			// Linking the Scene Graph to the Scene
 			Scene PrimaryScene = new Scene(root);
 			
 			// Linking the Scene to the Stage
 			PrimaryStage.setScene(PrimaryScene);
 			
 			PrimaryStage.setTitle("Primary Stage");
 			
 			// Spawning the Scene
 			PrimaryStage.show();
					
		}

		
	
	
	
}
