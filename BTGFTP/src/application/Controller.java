package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

public class Controller implements Initializable {
	
	@FXML
	Button connect;
	@FXML
	Pane UI;
	@FXML
	Text ProgramTitle;
	@FXML
	Text host;
	@FXML
	TextField hostField;
	@FXML
	Text dir;
	@FXML
	TextField dirField;
	@FXML
	Text username;
	@FXML
	TextField userField;
	@FXML
	Text password;
	@FXML
	PasswordField passField;
	@FXML
	TableView tableView;
	@FXML
	Text ServerStatus;
	@FXML
	TextArea ServerStat;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}
	
	@FXML
	public void connectClient(){
		System.out.println("The connect button was clicked!");
	}
	
	public void print(){
		try{
			
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}
	
	
	
	

}