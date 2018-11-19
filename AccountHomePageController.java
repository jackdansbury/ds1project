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


public class AccountHomePageController implements Initializable {
	
	   @FXML
	   private Button loginButton;
	   
	   
	   // When user click on loginButton
	   // this method will be called.
	   public void goToLoginScreen(ActionEvent event) throws IOException {
		   System.out.println("log in button click");
		   Parent parent = FXMLLoader.load(getClass().getResource("LoginPage.fxml"));
		   Scene loginScene = new Scene(parent);
		   
		   Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		   window.setScene(loginScene);
		   window.show();
		   
		   }



@Override
public void initialize(URL location, ResourceBundle resources) {
	// TODO Auto-generated method stub
	
}

}