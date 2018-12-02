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


public class HomePageController implements Initializable {
	
	   @FXML
	   private Button loginButton;
	   
	   @FXML
	   private Button findRestaurantsButton;
	   
	   @FXML
	   private Button dataButton;
	   
	   @FXML
	   private Button writeAReviewButton;
	   
	   private Button SearchButton;
	   
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
	   
	   public void goToResultsPage(ActionEvent event) throws IOException {
		   System.out.println("find restaurants button click");
		   Parent parent = FXMLLoader.load(getClass().getResource("AfterLoginPage.fxml"));
		   Scene resultsScene = new Scene(parent);
		   
		   Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		   window.setScene(resultsScene);
		   window.show();
		   
	   }
	   
	   public void goToWriteAReviewPage(ActionEvent event) throws IOException {
		   System.out.println("Write a Review button click");
		   Parent parent = FXMLLoader.load(getClass().getResource("ReviewEditorPage.fxml"));
		   Scene reviewEditorScene = new Scene(parent);
		   
		   Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		   window.setScene(reviewEditorScene);
		   window.show(); 
	   }
	   
	   public void goToSearchRestaurant(ActionEvent event) throws IOException {
		   Parent parent = FXMLLoader.load(getClass().getResource("put something here"));
		   Scene SearchedRestaurantScene = new Scene(parent);
		   
		   Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		   window.setScene(SearchedRestaurantScene);
		   window.show();
	   }

@Override
public void initialize(URL location, ResourceBundle resources) {
	// TODO Auto-generated method stub
	
}

}
