import View.MainWindow;
import javafx.application.Application;
import javafx.stage.Stage;

public class MainClass extends Application{
	
	public static void main(String[] args) {
	       launch(args);
	   }
	
	public void start(Stage primaryStage){
		
	MainWindow main = new MainWindow();
	main.start(primaryStage);
	
	}
}
