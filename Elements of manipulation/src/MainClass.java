import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;
import javafx.scene.Scene;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control. ComboBox;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;
import javafx.scene.control.TextField;
public class MainClass extends Application implements EventHandler<ActionEvent> {
	Button button;
	public static void main (String[] args) {
		launch(args);
	}
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("First elements");
		button = new Button("Click here");
		ComboBox<String> comboBox = new ComboBox<>();
		GridPane gridPane = new GridPane();
		StackPane layout = new StackPane();
		button.setOnAction(this);
		gridPane.setPadding(new Insets (10, 10, 10, 10));
		gridPane.setVgap(10);
		gridPane.setHgap(12);
		TextField textInput = new TextField();
		textInput.setPromptText("Enter something ");
		gridPane.getChildren().addAll(textInput);
		comboBox.setEditable(true);
		layout.getChildren().addAll(button, comboBox);
		Scene scene = new Scene(layout, 300, 300);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public void handle(ActionEvent event) {
		if (event.getSource() == button) {
			
		}
	}
}