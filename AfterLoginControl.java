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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.media.MediaView;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.media.*;


public class AfterLoginControl implements Initializable {
	
	   @FXML
	   private Label AccountLabel;
	   @FXML
	   private Label HomeLabel;
	   @FXML
	   private TextField searchBar;
	   @FXML
	   private Button SearchButton;

	   @FXML
	   private Rectangle Row1Image2;

	   @FXML
	   private Rectangle Row1Image3;

	   @FXML
	   private Rectangle Row1Image1;

	   @FXML
	   private Rectangle Row2Image4;

	   @FXML
	   private Label Header1;

	   @FXML
	   private Rectangle Row2Image3;

	   @FXML
	   private Label Header2;

	   @FXML
	   private Label Header3;

	   @FXML
	   private Rectangle Row3Image4;

	   @FXML
	   private Rectangle Row3Image3;

	   @FXML
	   private Rectangle Row3Image2;

	   @FXML
	   private Rectangle Row3Image1;

	   @FXML
	   private Rectangle Row2Image2;

	   @FXML
	   private Rectangle Row2Image1;


	   @FXML
	   private Rectangle Row1Image4;

	   public void searchResults(ActionEvent event) throws IOException {}
	   
	   // When user click on loginButton
	   // this method will be called.
	   public void goToHome(ActionEvent event) throws IOException {
		   Parent parent = FXMLLoader.load(getClass().getResource("/application/HomePage.fxml"));
		   Scene loginScene = new Scene(parent);
		   
		   Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		   window.setScene(loginScene);
		   window.show();
		   
		   }
	   
	   public void goToProfileScreen(ActionEvent event) throws IOException {
		   Parent parent = FXMLLoader.load(getClass().getResource("/application/AccountHomePage.fxml"));
		   Scene profileScene = new Scene(parent);
		   
		   Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		   window.setScene(profileScene);
		   window.show();
		   
		   }
	  
	   
	   @FXML public void goToLoginScreen(ActionEvent event) throws IOException {
		   Parent parent = FXMLLoader.load(getClass().getResource("/application/LoginPage.fxml"));
		   Scene loginScene = new Scene(parent);
		   
		   Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
		   window.setScene(loginScene);
		   window.show();
		   
	   }
	   
	   public void goToRestaurantPage(MouseEvent event) throws IOException {
		   Parent parent = FXMLLoader.load(getClass().getResource("/application/RestaurantHomePage.fxml"));
		   Scene loginScene = new Scene(parent);
		   
		   Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
		   window.setScene(loginScene);
		   window.show();
		   
	   }
	   
		@Override
		public void initialize(URL location, ResourceBundle resources) {
			// TODO Auto-generated method stub



		}
}
