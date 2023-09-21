import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class test2 extends Application {

    @Override
    public void start(Stage primaryStage) {
        Pane root = new Pane();
        Scene scene = new Scene(root, 400, 400);

        // Add a key event handler to the scene
        scene.setOnKeyPressed(event -> {
            // Check if the pressed key is the left arrow key
            if (event.getCode() == KeyCode.LEFT) {
                System.out.println("Left arrow key pressed");
            }
        });

        primaryStage.setScene(scene);
        primaryStage.setTitle("Left Arrow Key Event Handling Example");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
