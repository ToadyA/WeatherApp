import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;
import java.util.List;

public class WeatherApp extends Application {
    /*
    @FXML private VBox vboxDay1;
    @FXML private VBox vboxDay2;
    @FXML private VBox vboxDay3;
    @FXML private VBox vboxDay4;
    @FXML private VBox vboxDay5;
    @FXML private VBox vboxDay6;
    @FXML private VBox vboxDay7;
    */
    @FXML private TableView<WeatherData> weatherTable;
    @FXML private TableColumn<WeatherData, Double> windSpeedCol;
    @FXML private TableColumn<WeatherData, Integer> precProbCol;
    @FXML private TableColumn<WeatherData, Double> tempMaxCol;
    @FXML private TableColumn<WeatherData, Integer> windDirCol;
    @FXML private TableColumn<WeatherData, Double> tempMinCol;
    @FXML private TableColumn<WeatherData, String> timeCol;
    @FXML private TableColumn<WeatherData, Integer> weatherCodeCol;
    @FXML private TableColumn<WeatherData, Double> precSumCol;
    @FXML private TableColumn<WeatherData, Double> precHoursCol;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/weekWeather.fxml"));
        primaryStage.setTitle("Weather App");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }

    @FXML
    public void initialize(){
        List<WeatherData> weekData = WeatherAPI.fetchWeatherData();
        /*
        VBox[] vboxes = {vboxDay1, vboxDay2, vboxDay3, vboxDay4, vboxDay5, vboxDay6, vboxDay7};
        for(int i = 0; i < vboxes.length; i++){
            VBox vbox = vboxes[i];
            WeatherData data = weekData.get(i);
            ((TextField) vbox.lookup("#windSpeed" + (i + 1))).setText(String.valueOf(data.getWindSpeed()));
            ((TextField) vbox.lookup("#precProb" + (i + 1))).setText(String.valueOf(data.getPrecProb()));
            ((TextField) vbox.lookup("#tempMax" + (i + 1))).setText(String.valueOf(data.getTempMax()));
            ((TextField) vbox.lookup("#windDir" + (i + 1))).setText(String.valueOf(data.getWindDir()));
            ((TextField) vbox.lookup("#tempMin" + (i + 1))).setText(String.valueOf(data.getTempMin()));
            ((TextField) vbox.lookup("#time" + (i + 1))).setText(String.valueOf(data.getTime()));
            ((TextField) vbox.lookup("#weatherCode" + (i + 1))).setText(String.valueOf(data.getWeatherCode()));
            ((TextField) vbox.lookup("#precSum" + (i + 1))).setText(String.valueOf(data.getPrecSum()));
            ((TextField) vbox.lookup("#precHours" + (i + 1))).setText(String.valueOf(data.getPrecHours()));
        }
        */

        windSpeedCol.setCellValueFactory(new PropertyValueFactory<>("windSpeed"));
        precProbCol.setCellValueFactory(new PropertyValueFactory<>("precProb"));
        tempMaxCol.setCellValueFactory(new PropertyValueFactory<>("tempMax"));
        windDirCol.setCellValueFactory(new PropertyValueFactory<>("windDir"));
        tempMinCol.setCellValueFactory(new PropertyValueFactory<>("tempMin"));
        timeCol.setCellValueFactory(new PropertyValueFactory<>("time"));
        weatherCodeCol.setCellValueFactory(new PropertyValueFactory<>("weatherCode"));
        precSumCol.setCellValueFactory(new PropertyValueFactory<>("precSum"));
        precHoursCol.setCellValueFactory(new PropertyValueFactory<>("precHours"));

        weatherTable.getItems().addAll(weekData);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
