import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class Main extends Application{
	
	private Rectangle2D bounds;
	
	public static void main(String args[]) {
		launch(args);
		
	}
	public void start(Stage stage) {
		Pane pane = new Pane();
		Scene scene = new Scene(pane, 1000, 1000);
		Screen screen = Screen.getPrimary();
		bounds = screen.getVisualBounds();
		stage.setScene(scene);
		stage.setX(bounds.getMinX());
		stage.setY(bounds.getMinY());
		stage.setWidth(bounds.getWidth());
		stage.setHeight(bounds.getHeight());
		TextArea title = new TextArea("BTG FTP v1.0");
		title.setLayoutX(bounds.getWidth() / 10);
		title.setLayoutY(bounds.getWidth() / 10);
		title.setPromptText("Hello there");
		Button test = new Button("Hello World. Click this.");
		test.setOnAction(e->{
			System.out.println("hello");
		});
		pane.getChildren().add(title);
		//pane.getChildren().add(test);
		stage.setTitle("BTGFTP");
		stage.show();
	}
}
