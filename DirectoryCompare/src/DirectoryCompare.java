
import java.io.File;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.stage.Stage;


public class DirectoryCompare extends Application  {
	public Scene scene;
	public int XSize = 1000;
	public int YSize = 1000;
	public String fileDirectory1 = "/Users/Ben/Documents/Programming";
	public String fileDirectory2 = "/Users/Ben/Documents/Programming/Java Projects";
	
	private String FileName, FileName2;
	
	
	
	
	public static void main(String[] args) {
		Application.launch(args);
	}
	
	public void start(Stage primaryStage) throws Exception {
		
		primaryStage.setScene(scene);
		primaryStage.show();
		primaryStage.setTitle("BTG DirectoryCompare");
		primaryStage.setResizable(true);
		buildWindows();
		checkFiles();
		checkFilesAgain(primaryStage);
		sameDirectory();
		
		
	}
	
	public void buildWindows() {
		
		BorderPane GUI = new BorderPane();
		scene = new Scene(GUI,XSize,YSize);
		GUI.setStyle("-fx-background-color:gray;");
		
		
	}
	
	public void checkFiles() {
		File folder = new File(fileDirectory1);
		File[] listOfFiles = folder.listFiles();

		    for (int i = 0; i < listOfFiles.length; i++) {
		      if (listOfFiles[i].isFile()) {
				FileName =("File " + listOfFiles[i].getName());
				System.out.println(FileName);
		      } 
		      else if (listOfFiles[i].isDirectory()) {
		        fileDirectory1 = ("FOLDER " + listOfFiles[i].getName());
		        System.out.println(fileDirectory1);
		      }
		     
		    }
		    
		}
	
		public void checkFilesAgain(Stage primaryStage) {
			 DirectoryChooser directoryChooser = new DirectoryChooser();
			  	directoryChooser.setTitle("Open Resource File");
			  	directoryChooser.showDialog(primaryStage);
			  	File newFile = directoryChooser.showDialog(primaryStage);
			 
			  	
			File folder = new File(fileDirectory2);
			
			File[] listOfFiles = folder.listFiles();
			System.out.println("Directory 2");
			    for (int i = 0; i < listOfFiles.length; i++) {
			      if (listOfFiles[i].isFile()) {
					FileName2 =("File " + listOfFiles[i].getName());
					System.out.println(FileName2);
			      } 
			      else if (listOfFiles[i].isDirectory()) {
			        fileDirectory2 = ("FOLDER " + listOfFiles[i].getName());
			        System.out.println(fileDirectory2);
			      }
			      
			     

		}
	}
		public void sameDirectory() {
			if(FileName.equals(FileName2)) {
				System.out.println("The two directories have the same files in them.");
			}
			else {
				System.out.println("The two directories do not have the same files in them.");
			}
			
			if(fileDirectory1.equals(fileDirectory2)) {
				System.out.println("The two directories have the same folders in them.");
			}
			
			else {
				System.out.println("The two directories do not have the same folders in them.");
			}
		}
}



