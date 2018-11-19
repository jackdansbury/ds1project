package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class AfterLoginControl implements Initializable {
	
	   @FXML
	   private Button loginButton;
	   
	   private Button accountButton;
	   
	   
	   // When user click on loginButton
	   // this method will be called.
	   public void goToHomeScreen(ActionEvent event) throws IOException {
		   Parent parent = FXMLLoader.load(getClass().getResource("HomePage.fxml"));
		   Scene loginScene = new Scene(parent);
		   
		   Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		   window.setScene(loginScene);
		   window.show();
		   
		   }
	   
	   public void goToProfileScreen(ActionEvent event) throws IOException {
		   Parent parent = FXMLLoader.load(getClass().getResource("AccountHomePage.fxml"));
		   Scene loginScene = new Scene(parent);
		   
		   Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		   window.setScene(loginScene);
		   window.show();
		   
		   }
	   
	   @FXML public void goToLoginScreen() {}



@Override
public void initialize(URL location, ResourceBundle resources) {
	// TODO Auto-generated method stub
	
}



}