package application;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
 
 
public class Main extends Application{

	    public static void main(String[] args) {
	        launch(args);
	    }
	    

		@Override
		public void start(Stage PrimaryStage) throws Exception {
		
			Label headerLabel = new Label("Registration Form");
		    headerLabel.setFont(Font.font("Arial", FontWeight.BOLD, 24));
		    
		    Label nameLabel = new Label("Full Name : ");
		    nameLabel.setFont(Font.font("Arial", FontWeight.BOLD, 14));
		    
		    TextField nameField = new TextField();
		    
		    Label emailLabel = new Label("Email ID : ");
		    emailLabel.setFont(Font.font("Arial", FontWeight.BOLD, 14));
		    
		    TextField emailField = new TextField();
		    
		    Label passwordLabel = new Label("Password : ");
		    passwordLabel.setFont(Font.font("Arial", FontWeight.BOLD, 14));
		    
		    PasswordField passwordField = new PasswordField();
		    
		    CheckBox checkBox = new CheckBox("Check me!");

		    Button submitButton = new Button("Submit");
		    
		 // Create a ComboBox with some sample options
	        ComboBox<String> comboBox = new ComboBox<>();
	        comboBox.setItems(FXCollections.observableArrayList(
	            "Option 1",
	            "Option 2",
	            "Option 3",
	            "Option 4"
	        ));
		    
	     // Create a vertical scrollbar
	        ScrollBar scrollbar = new ScrollBar();
	        scrollbar.setOrientation(Orientation.VERTICAL);
	        
	        
			GridPane pane = new GridPane();
			pane.add(headerLabel, 0,0);
			pane.add(nameLabel, 0,1);
			pane.add(nameField, 1,1);
			pane.add(emailLabel, 0, 2);
			pane.add(emailField, 1, 2);
			pane.add(passwordLabel, 0, 3);
			pane.add(passwordField, 1, 3);
			pane.add(checkBox, 0, 4);
			pane.add(comboBox, 0, 5);
			pane.add(submitButton, 0, 10, 2, 1);
			pane.add(scrollbar, 0, 6);
 			
 			// Linking the Scene Graph to the Scene
 			Scene PrimaryScene = 	new Scene(pane, 500, 500);
 			
 			// Linking the Scene to the Stage
 			PrimaryStage.setScene(PrimaryScene);
 			
 			PrimaryStage.setTitle("Primary Stage");
 			
 			// Spawning the Scene
 			PrimaryStage.show();
					
		}

		
	
	
	
}
