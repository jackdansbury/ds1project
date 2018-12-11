package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;



//public class RestaurantHomePageController implements Initializable {
public class RestaurantHomePageController implements Initializable {
	
	   @FXML
	    private Text TopReviewsHeader;

	    @FXML
	    private Text AuthorUpvotes_3;

	    @FXML
	    private Text AuthorUpvotes_2;

	    @FXML
	    private Text AuthorUpvotes_1;

	    @FXML
	    private Polygon star_32;

	    @FXML
	    private Button SaveDraftButton;

	    @FXML
	    private Text AuthorLocation_2;

	    @FXML
	    private Text AuthorLocation_1;

	    @FXML
	    private Text AuthorLocation_3;

	    @FXML
	    private Text AuthorIReviews_2;

	    @FXML
	    private AnchorPane TopReviewLeftPane_12;

	    @FXML
	    private AnchorPane TopReviewLeftPane_11;

	    @FXML
	    private Polygon star_22;

	    @FXML
	    private Tab ReviewTab;

	    @FXML
	    private AnchorPane TopReviewAnchorPane_1;

	    @FXML
	    private AnchorPane TopReviewAnchorPane_2;

	    @FXML
	    private Label HomeLabel;

	    @FXML
	    private Label ViewProfileLabel_3;

	    @FXML
	    private Label ViewProfileLabel_2;

	    @FXML
	    private Label ViewProfileLabel_1;

	    @FXML
	    private Text AuthorUsername_3;

	    @FXML
	    private AnchorPane TopReviewMiddlePane_11;

	    @FXML
	    private AnchorPane TopReviewMiddlePane_12;

	    @FXML
	    private Button PublishButton;

	    @FXML
	    private Text ReviewUpvoteCount_1;

	    @FXML
	    private Text ReviewUpvoteCount_2;

	    @FXML
	    private Text AuthorUsername_1;

	    @FXML
	    private AnchorPane TopReviewRightPane_12;

	    @FXML
	    private AnchorPane TopReviewRightPane_11;

	    @FXML
	    private Polygon star_52;

	    @FXML
	    private Polygon star_12;

	    @FXML
	    private AnchorPane TopReviewLeftPane_1;

	    @FXML
	    private GridPane AuthorInfo_1;

	    @FXML
	    private Polygon review_1_star_2;

	    @FXML
	    private Polygon review_2_star_4;

	    @FXML
	    private Polygon review_1_star_3;

	    @FXML
	    private Polygon review_2_star_3;

	    @FXML
	    private Label SeeAllReviewsLabel;

	    @FXML
	    private Polygon review_2_star_2;

	    @FXML
	    private Tab MenuTab;

	    @FXML
	    private Polygon review_1_star_1;

	    @FXML
	    private Polygon review_2_star_1;

	    @FXML
	    private AnchorPane TopReviewRightPane_1;

	    @FXML
	    private Polygon review_1_star_4;

	    @FXML
	    private AnchorPane TopReviewMiddlePane_1;

	    @FXML
	    private Polygon review_1_star_5;

	    @FXML
	    private Polygon review_2_star_5;

	    @FXML
	    private Rectangle Row1Image41;

	    @FXML
	    private Rectangle Row1Image2;

	    @FXML
	    private Polygon star_42;

	    @FXML
	    private Rectangle Row1Image1;

	    @FXML
	    private VBox TopReviewsVBox;

	    @FXML
	    private Text AuthorUsername_11;

	    @FXML
	    private Text AuthorReviews_1;

	    @FXML
	    private Text AuthorReviews_3;

	    @FXML
	    private Text ReviewUpvoteCount_12;

	    @FXML
	    private Circle AuthorProfilePicture_1;

	    @FXML
	    private Tab OverviewTab;

	    @FXML
	    private Circle AuthorProfilePicture_2;

	    @FXML
	    private Label AccountButton;

	    @FXML
	    private StackPane HeaderStackPane;

	    @FXML
	    private Circle AuthorProfilePicture_3;

	    @FXML
	    private Rectangle Row1Image4;

	    @FXML
	    void goToHome(MouseEvent event) throws IOException {
	    	System.out.println("find restaurants button click");
	    	Parent parent = FXMLLoader.load(getClass().getResource("/application/AfterLoginPage.fxml"));
	    	Scene resultsScene = new Scene(parent);

	    	Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
	    	window.setScene(resultsScene);
	    	window.show();

	    }
	    
	    @FXML
	    void goToAccountHome(MouseEvent event) throws IOException {
	    	System.out.println("Account button click");
	    	Parent parent = FXMLLoader.load(getClass().getResource("/application/AccountHomePage.fxml"));
	    	Scene resultsScene = new Scene(parent);

	    	Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
	    	window.setScene(resultsScene);
	    	window.show();

	    }

	    public void goToWriteAReviewPage(ActionEvent event) throws IOException {
	    	System.out.println("Write a Review button click");
	    	Parent parent = FXMLLoader.load(getClass().getResource("/application/ReviewEditorPage.fxml"));
	    	Scene reviewEditorScene = new Scene(parent);

	    	Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
	    	window.setScene(reviewEditorScene);
	    	window.show(); 
	    }
	    
	    public void goToAllReviews(ActionEvent event) throws IOException {
	    	System.out.println("Write a Review button click");
	    	Parent parent = FXMLLoader.load(getClass().getResource("/application/ReviewEditorPage.fxml"));
	    	Scene reviewEditorScene = new Scene(parent);

	    	Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
	    	window.setScene(reviewEditorScene);
	    	window.show(); 
	    }
	    
	    
	    static String restaurantName;
		static String[] info;
		
		  	@FXML
		    private Button Signout;
		  	

		    @FXML
		    private Button WriteReview;
		    @FXML
		    private Button orderFood;
		    @FXML
		    private Button Back;
		
		
		    @FXML
		    private Text Email;

		    @FXML
		    private Text Category;

		    @FXML
		    private Text Price;

		    @FXML
		    private Text Hours;

		    @FXML
		    private Text Phone;

		    @FXML
		    private Text Adress;

		    @FXML
		    private Text Rating;

		    @FXML
		    private Text Name;
		
		public void initialize() {	
			Name.setText(info[0]);
			Rating.setText(info[1]);
			Adress.setText(info[2]);
			Hours.setText(info[3]);
			Phone.setText(info[4]);
			Price.setText(info[5]);
			Category.setText(info[6]);
			Email.setText(info[7]);
			
		}
		
		public void publishRestaurantReview(ActionEvent event) throws IOException {
			System.out.println("publish button click");
	    	Parent parent = FXMLLoader.load(getClass().getResource("/application/RestaurantHomePage.fxml"));
	    	Scene reviewEditorScene = new Scene(parent);
	    	
	    	//NEED TO CREATE OBJECT

	    	Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
	    	window.setScene(reviewEditorScene);
	    	window.show();
			
		}
		
		public void SaveReviewAsDraft(ActionEvent event) throws IOException {
			System.out.println("save draft button click");
			
			
			//NEED TO CREATE OBJECT
			
			
			
			
	    	Parent parent = FXMLLoader.load(getClass().getResource("/application/RestaurantHomePage.fxml"));
	    	Scene reviewEditorScene = new Scene(parent);

	    	Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
	    	window.setScene(reviewEditorScene);
	    	window.show();
			
		}
		
		public void setRestaurantName(String[] vals)
		{
			info=vals;
			
			
		}

		@Override
		public void initialize(URL location, ResourceBundle resources) {
			// TODO Auto-generated method stub
			Name.setText(info[0]);
			Rating.setText(info[1]);
			Adress.setText(info[2]);
			Hours.setText(info[3]);
			Phone.setText(info[4]);
			Price.setText(info[5]);
			Category.setText(info[6]);
			Email.setText(info[7]);
			
		}

	}



