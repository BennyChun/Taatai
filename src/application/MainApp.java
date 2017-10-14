package application;
import java.io.IOException;

import application.view.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainApp extends Application {

	private Stage _primaryStage;
	private AnchorPane _startMenu;
	
	@Override
	public void start(Stage primaryStage) {
		_primaryStage = primaryStage;
		_primaryStage.setTitle("Tātai!");
		initStartMenu();
	}

	public void initStartMenu(){
		try {
			//load start menu from fxml file.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("view/StartMenu.fxml"));
			_startMenu = (AnchorPane) loader.load();

			// Show the scene containing the start menu
			Scene scene = new Scene(_startMenu);
			_primaryStage.setScene(scene);
			_primaryStage.show();
			_primaryStage.setResizable(false);
			_primaryStage.sizeToScene();
			
			//give the start menu controller access to the MainApp
			StartMenuController controller = loader.getController();
			controller.setMainApp(this);
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public void initStageSelect(){
		try {
			//load start menu from fxml file.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("view/StageSelect.fxml"));
			AnchorPane _stageSelect = (AnchorPane) loader.load();

			// Show the scene containing the start menu
			Scene scene = new Scene(_stageSelect);
			_primaryStage.setScene(scene);
			_primaryStage.show();
			_primaryStage.setResizable(false);

			
			//give stage select controller access to the main app
			StageSelectController controller = loader.getController();
			controller.setMainApp(this);//this will set the main app scene to the stage select scene
		}catch(IOException e){
			e.printStackTrace();
		}
	}


	/**
	 * initializes the PlaySelectScreen
	 * and passes the scene to the PlaySelectScreenController
	 *
	 */
	public void initPlaySelect(){
		try {
			//load start menu from fxml file.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("view/PlaySelectScreen.fxml"));
			AnchorPane _playSelect = (AnchorPane) loader.load();

			// Show the scene containing the start menu
			Scene scene = new Scene(_playSelect);
			_primaryStage.setScene(scene);
			_primaryStage.show();
			_primaryStage.setResizable(false);


			//give stage select controller access to the main app
			PlaySelectScreenController controller = loader.getController();
			controller.setMainApp(this);//this will set the main app scene to the stage select scene
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	/**
	 * this method will get called by the StageSelectController,
	 * that controller will pass an argument (string) 
	 * which is either easy or hard for the level to be generated
	 * @param selectedLevel
	 */
	public void initLevelScreen(String selectedLevel){
		try {
			//load start menu from fxml file.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("view/PracticeLevelScreen.fxml"));
			AnchorPane _levelScreen = (AnchorPane) loader.load();

			// Show the scene containing the start menu
			Scene scene = new Scene(_levelScreen);
			_primaryStage.setScene(scene);
			_primaryStage.show();
			_primaryStage.setResizable(false);
			
			//give stage select controller access to the main app
			PracticeLevelScreenController controller = loader.getController();
			controller.setLevel(selectedLevel);//passes the selected level to the controller
			controller.setMainApp(this);//this will set the mainapp scene to the level controller scene
			
			
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public void initInstructions(){
		try {
			//load start menu from fxml file.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("view/PracticeInstructions.fxml"));
			//loader.setController(new StartMenuController(_navigator));
			AnchorPane instructions = (AnchorPane) loader.load();

			// Show the scene containing the start menu
			Scene scene = new Scene(instructions);
			_primaryStage.setScene(scene);
			_primaryStage.show();
			_primaryStage.setResizable(false);
			
			//give stage select controller access to the main app
			PracticeInstructionsController controller = loader.getController();
			controller.setMainApp(this);
		}catch(IOException e){
			e.printStackTrace();
		}
	}

	
	public void initEndScreen(int finalScore , String currentLevel){
		try {
			//load start menu from fxml file.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("view/PracticeEndScreen.fxml"));
			AnchorPane endScreen = (AnchorPane) loader.load();

			// Show the scene containing the start menu
			Scene scene = new Scene(endScreen);
			_primaryStage.setScene(scene);
			_primaryStage.show();
			_primaryStage.setResizable(false);
			
			//give stage select controller access to the main app
			PracticeEndScreenController controller = loader.getController();
			
			
			controller.setScoreLabel(finalScore);
			controller.setPreviousLevel(currentLevel);
			controller.disableHardButton(finalScore);
			controller.setMainApp(this);
			
			
		}catch(IOException e){
			e.printStackTrace();
		}
	}

	public void initAchievements(){
		try {
			//load start menu from fxml file.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("view/AchievementsScreen.fxml"));
			//loader.setController(new StartMenuController(_navigator));
			AnchorPane achievements = (AnchorPane) loader.load();

			// Show the scene containing the start menu
			Scene scene = new Scene(achievements);
			_primaryStage.setScene(scene);
			_primaryStage.show();
			_primaryStage.setResizable(false);

			//give stage select controller access to the main app
			AchievementsScreenController controller = loader.getController();
			controller.setMainApp(this);
		}catch(IOException e){
			e.printStackTrace();
		}
	}

	public void initOptions(){
		try {
			//load start menu from fxml file.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("view/OptionsScreen.fxml"));
			//loader.setController(new StartMenuController(_navigator));
			AnchorPane options = (AnchorPane) loader.load();

			// Show the scene containing the start menu
			Scene scene = new Scene(options);
			_primaryStage.setScene(scene);
			_primaryStage.show();
			_primaryStage.setResizable(false);

			//give stage select controller access to the main app
			OptionsScreenController controller = loader.getController();
			controller.setMainApp(this);
		}catch(IOException e){
			e.printStackTrace();
		}
	}

	public void initCharacters(){
		try {
			//load start menu from fxml file.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("view/CharacterPurchaseScreen.fxml"));
			//loader.setController(new StartMenuController(_navigator));
			AnchorPane chars = (AnchorPane) loader.load();

			// Show the scene containing the start menu
			Scene scene = new Scene(chars);
			_primaryStage.setScene(scene);
			_primaryStage.show();
			_primaryStage.setResizable(false);

			//give stage select controller access to the main app
			CharacterPurchaseScreenController controller = loader.getController();
			controller.setMainApp(this);
		}catch(IOException e){
			e.printStackTrace();
		}
	}

	public void initStatistics(){
		try {
			//load start menu from fxml file.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("view/StatisticsScreen.fxml"));
			//loader.setController(new StartMenuController(_navigator));
			AnchorPane stats = (AnchorPane) loader.load();

			// Show the scene containing the start menu
			Scene scene = new Scene(stats);
			_primaryStage.setScene(scene);
			_primaryStage.show();
			_primaryStage.setResizable(false);

			//give stage select controller access to the main app
			StatisticsScreenController controller = loader.getController();
			controller.setMainApp(this);
		}catch(IOException e){
			e.printStackTrace();
		}
	}

	public void initGameInstructions(){
		try {
			//load start menu from fxml file.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("view/Instructions.fxml"));
			//loader.setController(new StartMenuController(_navigator));
			AnchorPane gameInstructions = (AnchorPane) loader.load();

			// Show the scene containing the start menu
			Scene scene = new Scene(gameInstructions);
			_primaryStage.setScene(scene);
			_primaryStage.show();
			_primaryStage.setResizable(false);

			//give stage select controller access to the main app
			InstructionsController controller = loader.getController();
			controller.setMainApp(this);
		}catch(IOException e){
			e.printStackTrace();
		}
	}

	public void initCustom(){
		try {
			//load start menu from fxml file.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("view/CustomLevelScreen.fxml"));
			//loader.setController(new StartMenuController(_navigator));
			AnchorPane customLevel = (AnchorPane) loader.load();

			// Show the scene containing the start menu
			Scene scene = new Scene(customLevel);
			_primaryStage.setScene(scene);
			_primaryStage.show();
			_primaryStage.setResizable(false);

			//give stage select controller access to the main app
			CustomLevelScreenController controller = loader.getController();
			controller.setMainApp(this);
		}catch(IOException e){
			e.printStackTrace();
		}
	}

	/**
	 * this method initializes the QuestionSlectionScreen (the screen with the plus, minus .... buttons)
	 * this method takes an argument of type string
	 * saying if the user selected either easy or hard
	 *
	 * easy level: will have all 4 operators, but the sum only goes from 1 to 20
	 * hard level: will have all 4 operators, but the sum only goes from 1 to 99
	 *
	 * @param selectedLevel
	 */
	public void initQuestionSelect(String selectedLevel){//either easy or hard
		try {
			//load start menu from fxml file.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("view/QuestionSelectScreen.fxml"));
			//loader.setController(new StartMenuController(_navigator));
			AnchorPane questionSelect = (AnchorPane) loader.load();

			// Show the scene containing the start menu
			Scene scene = new Scene(questionSelect);
			_primaryStage.setScene(scene);
			_primaryStage.show();
			_primaryStage.setResizable(false);


			//give stage select controller access to the main app
			QuestionSelectScreenController controller = loader.getController();
			controller.setLevel(selectedLevel);
			controller.setMainApp(this);


		}catch(IOException e){
			e.printStackTrace();
		}
	}

	/**
	 * This initialises the main game levels, takes a difficulty and a multiplication level
	 */
	public void initMainLevelScreen(){
		try {
			//load start menu from fxml file.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("view/LevelScreen.fxml"));
			//loader.setController(new StartMenuController(_navigator));
			AnchorPane questionSelect = (AnchorPane) loader.load();

			// Show the scene containing the start menu
			Scene scene = new Scene(questionSelect);
			_primaryStage.setScene(scene);
			_primaryStage.show();
			_primaryStage.setResizable(false);

			//give stage select controller access to the main app
			LevelScreenController controller = loader.getController();
			controller.setMainApp(this);
		}catch(IOException e){
			e.printStackTrace();
		}
	}






	/**
	 * when this method gets called
	 * it closes the primaryStage
	 */
	public void close() {
		_primaryStage.close();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
