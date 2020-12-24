package ba.unsa.etf.rpr;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        KorisniciModel model = new KorisniciModel();
        Controller controller = new Controller(model);

        FXMLLoader loader = new FXMLLoader(getClass().getResource("sample.fxml"));
        loader.setController(controller);
        Parent root = loader.load();

        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.setMinHeight(400);
        primaryStage.setMinWidth(600);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
