/*
 * Write a program that uses a bar chart to display the percentages of the overall grade 
 * represented by projects, quizzes, midterm exams, and the final exam
 * Suppose that projects take 20 percent and are displayed in red, 
 * quizzes take 10 percent and are displayed in blue,
 * midterm exams take 30 percent and are displayed in green, 
 * and the final exam takes 40 percent and is displayed in orange. 
 * Use the Rectangle class to display the bars.
 *
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;


	public class C14E12BarChart extends Application {
	  @Override // Override the start method in the Application class
	  public void start(Stage primaryStage) 
	  {       
	    
		  Pane pane = new Pane();
	       
		  double h = 300;
		  double paneH = 150;
	    
		  Text txt1 = new Text(10, paneH - h * 0.2 - 10, "Project -- 20%");
		  Rectangle r1 = new Rectangle(10, paneH - h * 0.2, 100, h * 0.2);
		  r1.setFill(Color.RED);
	    
		  Text txt2 = new Text(10 + 110, paneH - h * 0.1 - 10, "Quiz -- 10%");
		  Rectangle r2 = new Rectangle(10 + 110, paneH - h * 0.1, 100, h * 0.1);
		  r2.setFill(Color.BLUE);
	    
		  Text txt3 = new Text(10 + 220, paneH - h * 0.3 - 10, "Midterm -- 30%");
		  Rectangle r3 = new Rectangle(10 + 220, paneH - h * 0.3, 100, h * 0.3);
		  r3.setFill(Color.GREEN);
	    
		  Text txt4 = new Text(10 + 330, paneH - h * 0.4 - 10, "Final -- 40%");
		  Rectangle r4 = new Rectangle(10 + 330, paneH - h * 0.4, 100, h * 0.4);
		  r4.setFill(Color.ORANGE);	    

		  pane.getChildren().addAll(r1, txt1, r2, txt2, r3, txt3, r4, txt4);

		  // 	Create a scene and place it in the stage
		  Scene scene = new Scene(pane, 450, paneH);
		  primaryStage.setTitle("Bar Chart Display"); // Set the stage title
		  primaryStage.setScene(scene); // Place the scene in the stage
		  primaryStage.show(); // Display the stage
	  }

	  public static void main(String[] args) 
	  {
		  System.out.println("This program displays four bar graphs in a grid pane");
		  Application.launch(args);
	  }
	} 
