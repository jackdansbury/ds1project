package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;



public class Main extends Application {
	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
//		readData.getRestaurantData();
		
		try {

			Parent root = FXMLLoader.load(getClass().getResource("/application/HomePage.fxml"));
			
			Scene scene = new Scene(root);

			primaryStage.setTitle("Home Screen");

			primaryStage.setScene(scene);

			primaryStage.show();

		} catch(Exception e) {

			e.printStackTrace();

		}

	}



	public static void main(String[] args) {
		launch(args);
	}
}
