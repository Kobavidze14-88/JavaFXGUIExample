package sample;

import javafx.application.Application;
import javafx.geometry.Pos;

import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main extends Application {

    @Override public void start(Stage stage) throws FileNotFoundException {
        // load the image
        Image image = new Image(new FileInputStream("E:\\8_march.gif"));

        // simple displays ImageView the image as is
        ImageView iv1 = new ImageView();
        iv1.setImage(image);
        FlowPane root = new FlowPane();
        Scene scene = new Scene(root, 450, 450);
        scene.setFill(Color.LIME);
        HBox box = new HBox();
        box.getChildren().add(iv1);
        root.getChildren().add(box);
        stage.setTitle("Authentication");
        root.setAlignment(Pos.CENTER);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}