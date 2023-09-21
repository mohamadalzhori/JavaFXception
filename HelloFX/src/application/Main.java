package application;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Main extends Application {

    private ImageView img;
    private Label MainTitle;
    private Label SubTitle;
    private Label hyperLink;

    private int slideIndex = 0;
    private int imgIndex = 0;
    
    

    private String[] mainTitles = {
            ">Introduction to JavaFX",
            ">Manipulating JavaFX GUI components (1)",
            "> References"
    };

    private String[] subTitles = {
            ">Getting Started with JavaFX",
            ">Why JavaFX?",
            ">Key features",
            ">Architecture",
            ">APIs",
            ">Labels",
            ">Buttons",
            ">Checkboxes",
            ">Combo Boxes",
            ">Text Fields",
            ">Password Fields",
            ">Scroll Bar",
            ">Scroll Pane",
            ">Separators",
            ">Sliders",
            "> Alot of References"
    };

    private String[] imagePaths = {
    		"",
            "label.jpg",
            "button.png",
            "checkBox.png",
            "comboBox.png",
            "textField.png",
            "passwordField.png",
            "scrollBar.png",
            "scrollPane.png",
            "slider.png",
            "separator.png",
            ""
            
    };

    private Image loadImage(String imagePath) {
        return new Image(getClass().getResourceAsStream(imagePath));
    }

    private void showMTitle() {
    
        if (slideIndex < 5) {
            MainTitle.setText(mainTitles[0]);
        } else if(slideIndex == 15){
        	MainTitle.setText(mainTitles[2]);
        } else {
            MainTitle.setText(mainTitles[1]);
            MainTitle.setFont(Font.font("Arial", FontWeight.BOLD, 60));
        }  
    }
    
    private void showSubTitle() {
       
        	SubTitle.setText(subTitles[slideIndex]);
          
    }
    
    private void showImg() {
        
    	img.setImage(new Image(getClass().getResourceAsStream(imagePaths[imgIndex])));
      
}
    
    

    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage PrimaryStage) throws Exception {

        MainTitle = new Label(mainTitles[0]);
        MainTitle.setFont(Font.font("Arial", FontWeight.BOLD, 70));
        MainTitle.setLayoutX(680);
        MainTitle.setLayoutY(20);

        SubTitle = new Label(subTitles[slideIndex]);
        SubTitle.setFont(Font.font("Arial", FontWeight.BOLD, 50));
        SubTitle.setLayoutX(500);
        SubTitle.setLayoutY(120);
        
        Label hyperLink = new Label();
        hyperLink.setStyle(
                "-fx-text-fill: #0073e6;" + // Text color (blue)
                "-fx-underline: true;" +     // Underline the text
                "-fx-font-family: Arial;" +  // Font family
                "-fx-font-size: 30px;"       // Font size
        );
        hyperLink.setLayoutX(500);
        hyperLink.setLayoutY(220);
        
        Label ref = new Label("https://openjfx.io/openjfx-docs/");
        ref.setStyle(
                "-fx-text-fill: #0073e6;" + // Text color (blue)
                "-fx-underline: true;" +     // Underline the text
                "-fx-font-family: Arial;" +  // Font family
                "-fx-font-size: 30px;"       // Font size
        );
        ref.setLayoutX(500);
        ref.setLayoutY(220);
        
        Label whys = new Label();
        whys.setFont(Font.font("Arial", FontWeight.BOLD, 30));
        whys.setLayoutX(500);
        whys.setLayoutY(220);
        
        Label features = new Label();
        features.setFont(Font.font("Arial", FontWeight.BOLD, 30));
        features.setLayoutX(500);
        features.setLayoutY(220);
        

        ImageView arch = new ImageView();
        arch.setImage(new Image(getClass().getResourceAsStream("arch.jpg")));
        arch.setLayoutX(500);
        arch.setLayoutY(220);
        arch.setFitWidth(650);
        arch.setFitHeight(550);
        if (slideIndex != 3) {
            arch.setVisible(false);
        }
        
        ImageView apiInArch = new ImageView();
        apiInArch.setImage(new Image(getClass().getResourceAsStream("apiInArch.jpg")));
        apiInArch.setLayoutX(900);
        apiInArch.setLayoutY(120);
        apiInArch.setFitWidth(600);
        apiInArch.setFitHeight(300);
        if (slideIndex != 4) {
        	apiInArch.setVisible(false);
        }
        
        Label apis = new Label();
        apis.setFont(Font.font("Arial", FontWeight.BOLD, 30));
        apis.setLayoutX(500);
        apis.setLayoutY(220);
        
        
        
        
        img = new ImageView();
        img.setImage(new Image(getClass().getResourceAsStream(imagePaths[imgIndex])));
        img.setLayoutX(500);
        img.setLayoutY(220);


        Label labelDemo = new Label("");
        labelDemo.setFont(Font.font("Arial", FontWeight.BOLD, 30));
        labelDemo.setLayoutX(500);
        labelDemo.setLayoutY(720);
        
        
        Button button = new Button("Click me");
        button.setVisible(false);
        button.setLayoutX(500);
        button.setLayoutY(720);
        button.setFocusTraversable(false);
        button.setPrefWidth(200);
        button.setPrefHeight(50);
        button.setStyle("-fx-font-size: 20;");
        
        CheckBox checkBox = new CheckBox("Check me!");
        checkBox.setVisible(false);
        checkBox.setLayoutX(500);
        checkBox.setLayoutY(720);
        checkBox.setFocusTraversable(false);
        checkBox.setPrefWidth(200);
        checkBox.setPrefHeight(50);
        checkBox.setStyle("-fx-font-size: 20;");

        
        ComboBox<String> comboBox = new ComboBox<>();
        comboBox.setItems(FXCollections.observableArrayList(
            "Option 1",
            "Option 2",
            "Option 3",
            "Option 4"
        ));
        comboBox.setVisible(false);
        comboBox.setLayoutX(500);
        comboBox.setLayoutY(720);
        comboBox.setFocusTraversable(false);
        comboBox.setPrefWidth(200);
        comboBox.setStyle("-fx-font-size: 20;");
        
        
	    TextField nameField = new TextField();
	    nameField.setVisible(false);
	    nameField.setLayoutX(500);
	    nameField.setLayoutY(720);
	    nameField.setPrefWidth(300); // Set the width to 300 pixels
	    nameField.setPrefHeight(40);
	    nameField.setStyle("-fx-font-size: 20;");
	    Button buttonTF = new Button("Submit");
	    buttonTF.setVisible(false);
	    buttonTF.setLayoutX(900);
	    buttonTF.setLayoutY(720);
	    buttonTF.setPrefWidth(200);
	    buttonTF.setPrefHeight(50);
	    buttonTF.setStyle("-fx-font-size: 20;");
	    buttonTF.setOnAction(event -> {
	    	nameField.setVisible(false);
        	buttonTF.setVisible(false);
        });
        
	    PasswordField passwordField = new PasswordField();
	    passwordField.setVisible(false);
	    passwordField.setLayoutX(500);
	    passwordField.setLayoutY(720);
	    passwordField.setPrefWidth(300); // Set the width to 300 pixels
	    passwordField.setPrefHeight(40);
	    passwordField.setStyle("-fx-font-size: 20;");
	    Button buttonPF = new Button("Submit");
	    buttonPF.setVisible(false);
	    buttonPF.setLayoutX(900);
	    buttonPF.setLayoutY(720);
	    buttonPF.setPrefWidth(200);
	    buttonPF.setPrefHeight(50);
	    buttonPF.setStyle("-fx-font-size: 20;");
	    buttonPF.setOnAction(event -> {
	    	passwordField.setVisible(false);
	    	buttonPF.setVisible(false);
        });
	    
	    
	    ScrollBar scrollbar = new ScrollBar();
	    scrollbar.setVisible(false);
        scrollbar.setOrientation(Orientation.HORIZONTAL);
        scrollbar.setLayoutX(700);
	    scrollbar.setLayoutY(720);
        scrollbar.setFocusTraversable(false);
        scrollbar.setStyle("-fx-pref-width: 200px; -fx-pref-height: 20px;");
        scrollbar.setPrefWidth(200);
        
        // Create a VBox with some content
        VBox content = new VBox();
        for (int i = 1; i <= 20; i++) {
            content.getChildren().add(new javafx.scene.control.Label("Label " + i));
        }

        // Create a ScrollPane and set its content
        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setContent(content);
        scrollPane.setPrefSize(400, 200); 
        scrollPane.setVisible(false);
        scrollPane.setLayoutX(650);
        scrollPane.setLayoutY(620);
        scrollPane.setFocusTraversable(false);
        scrollPane.setStyle("-fx-font-size: 20;");

        

        
        Separator separator = new Separator();
        separator.setVisible(false);
        separator.setOrientation(Orientation.HORIZONTAL);
        separator.setLayoutX(400);
        separator.setLayoutY(720);
        separator.setPrefWidth(1000);
        separator.setStyle("-fx-border-color:#F40306; -fx-border-width:4");
        
        Slider slider = new Slider(0,100,50);
        slider.setVisible(false);
        slider.setLayoutX(500);
        slider.setLayoutY(720);
        slider.setMajorTickUnit(50);
        slider.setShowTickLabels(true);
        slider.setShowTickMarks(true);
        slider.setFocusTraversable(false);
        slider.setPrefWidth(300);
        slider.setPrefHeight(40);
        slider.setStyle("-fx-font-size: 20;");
        Button buttonSlider = new Button("The End");
        buttonSlider.setVisible(false);
        buttonSlider.setLayoutX(900);
        buttonSlider.setLayoutY(720);
        buttonSlider.setPrefWidth(200);
        buttonSlider.setPrefHeight(50);
        buttonSlider.setStyle("-fx-font-size: 20;");
        buttonSlider.setOnAction(event -> {
        	slider.setVisible(false);
	    	buttonSlider.setVisible(false);
        });
        
        
        ImageView BG = new ImageView();
        BG.setImage(new Image(getClass().getResourceAsStream("BG.jpg")));

        ImageView logoView = new ImageView();
        logoView.setImage(new Image(getClass().getResourceAsStream("logo.jpg")));
        logoView.setLayoutX(0);
        logoView.setLayoutY(850);
        

        Pane root = new Pane();
        root.getChildren().addAll(BG,hyperLink,whys,arch,apiInArch, features,img, labelDemo, apis,ref, logoView, MainTitle, SubTitle, button, checkBox, comboBox, nameField, buttonTF, passwordField, buttonPF, scrollbar, content, scrollPane, slider, separator, buttonSlider);

        Scene PrimaryScene = new Scene(root);

        
        
        
        PrimaryScene.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.LEFT) {
                if (slideIndex > 0) {
                    slideIndex--;
                }
                
            }
            if (event.getCode() == KeyCode.RIGHT) {
                if (slideIndex < subTitles.length - 1) {
                    slideIndex++;
                }
                
            }
            
            if(slideIndex != 0) {
            	hyperLink.setText("");
            }else {hyperLink.setText("https://openjfx.io/openjfx-docs/");}
            if(slideIndex != 1) {
            	whys.setText("");
            }else {whys.setText(" <^> Legacy Systems \n <^> Intro to Visual Frameworks");}
            
            if(slideIndex != 15) {
            	ref.setText("");
            }else {ref.setText("> https://docs.oracle.com/javafx/2/architecture/jfxpub-architecture.htm\n"
            		+ "> https://www.tutorialspoint.com/javafx/javafx_application.htm\n"
            		+ "> https://docs.oracle.com/javafx/2/css_tutorial/jfxpub-css_tutorial.htm\n"
            		+ "> https://www.youtube.com/watch?v=MqLhU1UrXro\n"
            		+ "> https://www.youtube.com/watch?v=UaKQHy-_WMQ\n"
            		+ "> http://docs.oracle.com/javase/8/javase-clienttechnologies.htm\n"
            		+ "> https://www.tutorialspoint.com/javafx/\n"
            		+ "> http://www.javafxtutorials.com/\n");}
            
            if(slideIndex != 2) {
            	features.setText("");
            }else {features.setText("> Rich UI Controls \n> CSS Styling \n> Animations & Transitions \n> Web Integration \n> Touch & Gestures");}
           
            if (slideIndex == 3) {
                arch.setVisible(true);
            } else {
                arch.setVisible(false); // Hide the image if slideIndex is not 4
            }
            if (slideIndex == 4) {
            	apiInArch.setVisible(true);
            } else {
            	apiInArch.setVisible(false); // Hide the image if slideIndex is not 4
            }
            
            if(slideIndex == 4) {
            	apis.setText("> javafx.animation \n> javafx.application \n> javafx.css\n> javafx.event \n> javafx.geometry \n> javafx.stage \n> javafx.scene");
            }else {apis.setText("");}
            
            if(slideIndex == 5) {
            	labelDemo.setText("Label");
            }else {labelDemo.setText("");}
            
            if(slideIndex == 6) {
                button.setVisible(true);
            }else { button.setVisible(false);}
            
            if(slideIndex == 7) {
                checkBox.setVisible(true);
            }else { checkBox.setVisible(false);            }
            
            if(slideIndex == 8) {
            	comboBox.setVisible(true);
            }else { comboBox.setVisible(false);            }
            
            if(slideIndex == 9) {
            	nameField.setVisible(true);
            	buttonTF.setVisible(true);
            	
            }else { nameField.setVisible(false);
            buttonTF.setVisible(false);
            }
            
            if(slideIndex == 10) {
            	passwordField.setVisible(true);
            	buttonPF.setVisible(true);
            	
            }else { passwordField.setVisible(false);
            buttonPF.setVisible(false);
            }
            
            if(slideIndex == 11) {
            	scrollbar.setVisible(true);
            }else { scrollbar.setVisible(false);}
            
            if(slideIndex == 12) {
            	scrollPane.setVisible(true);            	
            }else { scrollPane.setVisible(false);}
            
            if(slideIndex == 13) {
            	separator.setVisible(true);            	
            }else { separator.setVisible(false);}
            
            if(slideIndex == 14) {
            	slider.setVisible(true);   
            	buttonSlider.setVisible(true);
            }else { slider.setVisible(false);
        			buttonSlider.setVisible(false);
            }
            

           
            imgIndex = (slideIndex > 4)? slideIndex - 4 : 0;

            
            
            System.out.println(slideIndex);
            showMTitle();
            showSubTitle();
            
            showImg();   
            
        });

        PrimaryStage.setScene(PrimaryScene);
        PrimaryStage.setTitle("Power FX");
        PrimaryStage.show();
    }
}
