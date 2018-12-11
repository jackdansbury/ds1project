package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import objects.User;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;

import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.PasswordField;
import javafx.scene.control.SplitMenuButton;

public class LoginPageController implements Initializable {

	
	@FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="AdminAccountOption"
    private MenuItem AdminAccountOption; // Value injected by FXMLLoader
    
    @FXML
    private TextField username;
    @FXML
    private Button loginButton;
    @FXML
    private Label userPassError;
    @FXML
    private PasswordField pb;
    @FXML
    private PasswordField NewUserPassword;
    @FXML
    private TextField NewUserFirstName;
    @FXML
    private TextField NewUserLastName;
    @FXML
    private TextField NewUserName;
    @FXML
    private TextField NewUserStreetAddress;
    @FXML
    private TextField NewUserCity;
    @FXML
    private TextField NewUserState;
    @FXML
    private Button signUpButton;
    @FXML
    private Label RegisterErrorLabel;

    @FXML // fx:id="AccountTypeMenuButton"
    private SplitMenuButton AccountTypeMenuButton; // Value injected by FXMLLoader

	
	private static HashMap<String,String> AccountList = new HashMap<String,String>();

	public HashMap<String,String> getAccountList() {
		return AccountList;
	}

	public void setAccountList(HashMap<String, String> accountList) {
		AccountList = accountList;
	}
	
	
	
	

	// Event Listener on Button[#loginButton].onAction
	@FXML
	public void login(ActionEvent event) throws IOException {
		loadAccountInfo();
		if (checkLogin(this.username.getText(), this.pb.getText()) == true) {
			Parent homescreen = FXMLLoader.load(getClass().getResource("/application/AfterLogInPage.fxml"));
			Scene loginScene = new Scene(homescreen);
			Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
			window.setScene(loginScene);
			window.show();
		} 
		if (checkLogin(this.username.getText(), this.pb.getText()) == false) {
//			userPassError.setVisible(true);
			Parent homescreen = FXMLLoader.load(getClass().getResource("/application/LogInPage.fxml"));
			Scene loginScene = new Scene(homescreen);
			Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
			window.setScene(loginScene);
			window.show();

		}
	}

	private boolean checkLogin(String username, String password) {
		if(AccountList.containsKey(username) == true) {
			if(AccountList.get(username).equals(password)) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
		return false;
	}
	}
	
	private void loadAccountInfo() throws IOException {
		
		String cwd = System.getProperty("user.dir");
		try {
			cwd = cwd.substring(0,cwd.lastIndexOf("/"));
		}
		catch(Exception e) {} //do nothing if no /
		
		File recordFile = new File(cwd+"/ds1Project/src/AppResources/AppUserData/AppUsers.txt");
		FileReader fileReader = new FileReader(recordFile);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String line;
		while ((line = bufferedReader.readLine()) != null) {
			String[] temp = new String[2];
					temp = line.split(",");
					User user = new User(temp[0],temp[1]);
					AccountList.put(user.getUsername(),user.getPassword());
		}
		fileReader.close();
		
	}
	

	// Event Listener on Button[#SignUpButton].onAction
	@FXML
	public void register(ActionEvent event) throws IOException {
		
		String cwd = System.getProperty("user.dir");
		try {
			cwd = cwd.substring(0,cwd.lastIndexOf("/"));
		}
		catch(Exception e) {} //do nothing if no /
		
		if(!checkLogin(NewUserName.getText(),NewUserPassword.getText())) {
		   try (BufferedWriter bw = new BufferedWriter(new FileWriter(cwd+"/ds1Project/src/AppResources/AppUserData/AppUsers.txt", true))) {
			   bw.write(NewUserName.getText()+",");
			   bw.write(NewUserPassword.getText());
			   bw.newLine();
	        Parent homescreen = FXMLLoader.load(getClass().getResource("application.AfterLogInPage.fxml"));
			Scene loginScene = new Scene(homescreen);
			Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
			window.setScene(loginScene);
			window.show();
		   }catch(Exception e) {
			   e.getMessage();
	}
		}
		else {
			RegisterErrorLabel.setVisible(true);
			Parent homescreen = FXMLLoader.load(getClass().getResource("application.LogInPage.fxml"));
			Scene loginScene = new Scene(homescreen);
			Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
			window.setScene(loginScene);
			window.show();
		}
		  
}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
//		assert AdminAccountOption != null : "fx:id=\"AdminAccountOption\" was not injected: check your FXML file 'LoginPage.fxml'.";
//        assert NewUserName31 != null : "fx:id=\"NewUserName31\" was not injected: check your FXML file 'LoginPage.fxml'.";
//        assert NewUserName3 != null : "fx:id=\"NewUserName3\" was not injected: check your FXML file 'LoginPage.fxml'.";
//        assert NewUserName2 != null : "fx:id=\"NewUserName2\" was not injected: check your FXML file 'LoginPage.fxml'.";
//        assert label != null : "fx:id=\"label\" was not injected: check your FXML file 'LoginPage.fxml'.";
//        assert NewUserName1 != null : "fx:id=\"NewUserName1\" was not injected: check your FXML file 'LoginPage.fxml'.";
//        assert pb != null : "fx:id=\"pb\" was not injected: check your FXML file 'LoginPage.fxml'.";
//        assert NewUserPassword1 != null : "fx:id=\"NewUserPassword1\" was not injected: check your FXML file 'LoginPage.fxml'.";
//        assert NewUserPassword != null : "fx:id=\"NewUserPassword\" was not injected: check your FXML file 'LoginPage.fxml'.";
//        assert AccountTypeMenuButton != null : "fx:id=\"AccountTypeMenuButton\" was not injected: check your FXML file 'LoginPage.fxml'.";
//        assert SignUpButton != null : "fx:id=\"SignUpButton\" was not injected: check your FXML file 'LoginPage.fxml'.";
//        assert RegistrationErrorLabel != null : "fx:id=\"RegistrationErrorLabel\" was not injected: check your FXML file 'LoginPage.fxml'.";
//        assert loginButton != null : "fx:id=\"loginButton\" was not injected: check your FXML file 'LoginPage.fxml'.";
//        assert NewUserName != null : "fx:id=\"NewUserName\" was not injected: check your FXML file 'LoginPage.fxml'.";
//        assert username != null : "fx:id=\"username\" was not injected: check your FXML file 'LoginPage.fxml'.";
	
	}


}
