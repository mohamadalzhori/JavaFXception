import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;

public class test extends Application {
    private ImageView imageView;
    private int currentImageIndex = 0;
    private String[] imagePaths = {
        "img1.jpg",
        "img2.jpg",
        "img3.jpg"
    };

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Create an ImageView to display images
        imageView = new ImageView();
        imageView.setImage(loadImage(imagePaths[currentImageIndex]));

        // Create navigation buttons
        Button prevButton = new Button("Previous");
        Button nextButton = new Button("Next");

        // Handle button clicks
        prevButton.setOnAction(e -> showPreviousImage());
        nextButton.setOnAction(e -> showNextImage());

        // Create an HBox for buttons
//        HBox buttonBox = new HBox(prevButton, nextButton);

//         Create a VBox layout to hold the ImageView and buttons
//        VBox root = new VBox(imageView, buttonBox);
        VBox root = new VBox(imageView);

        // Create a scene and set it on the stage
        Scene scene = new Scene(root, 800, 600);
        primaryStage.setScene(scene);

        primaryStage.setTitle("Image Slider");
        primaryStage.show();
    }

    private Image loadImage(String imagePath) {
        return new Image(getClass().getResourceAsStream(imagePath));
    }

    private void showPreviousImage() {
        if (currentImageIndex > 0) {
            currentImageIndex--;
            imageView.setImage(loadImage(imagePaths[currentImageIndex]));
        }
    }

    private void showNextImage() {
        if (currentImageIndex < imagePaths.length - 1) {
            currentImageIndex++;
            imageView.setImage(loadImage(imagePaths[currentImageIndex]));
        }
    }
}
