/*
 * Write a program that displays four images in a grid pane.
 
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.geometry.*;

public class C14E1GridPaneImages extends Application{
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) 
	{
		// Create a gridpane to hold the image views
		GridPane gpane = new GridPane();
	
		gpane.setGridLinesVisible(false); //Set Gridline visibility to false
		gpane.setAlignment(Pos.CENTER); //Resizing the window will keep the grid pane in the center of the window
		gpane.setVgap(10); // set Vertical Gap
		gpane.setHgap(10); // set Horizontal Gap
		gpane.setPadding(new Insets(10, 10, 10, 10)); //set Padding
	
		Image image = new Image("4.png");
	
		ImageView imageView1 = new ImageView(image);
		imageView1.setPreserveRatio(true);
		imageView1.setFitHeight(500);
		imageView1.setFitWidth(500);
	
		image = new Image("1.png");
		ImageView imageView2 = new ImageView(image);
		imageView2.setPreserveRatio(true);
		imageView2.setFitHeight(500);
		imageView2.setFitWidth(500);
	
		image = new Image("2.png");
		ImageView imageView3 = new ImageView(image);
		imageView3.setPreserveRatio(true);
		imageView3.setFitHeight(500);
		imageView3.setFitWidth(500);
	
		image = new Image("3.png");
		ImageView imageView4 = new ImageView(image);
		imageView4.setPreserveRatio(true);
		imageView4.setFitHeight(500);
		imageView4.setFitWidth(500);
		
		gpane.add(imageView1, 0, 0);
		gpane.add(imageView2, 1, 0);
		gpane.add(imageView3, 0, 1);
		gpane.add(imageView4, 1, 1);
	
		Scene scene = new Scene(gpane);
		primaryStage.setTitle("Show Images in GridPane"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.sizeToScene();
		primaryStage.show();
	}
	
	public static void main(String[] args) 
	{
		System.out.println("This program displays four images in a grid pane");
		Application.launch(args);
	}
}
