import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import java.util.List;

public class WeatherApp extends Application {
    @FXML private TableView<WeatherData> weatherTable;
    @FXML private TableColumn<WeatherData, Double> windSpeedCol;
    @FXML private TableColumn<WeatherData, Double> tempMaxCol;
    @FXML private TableColumn<WeatherData, Integer> windDirCol;
    @FXML private TableColumn<WeatherData, Double> tempMinCol;
    @FXML private TableColumn<WeatherData, String> timeCol;
    @FXML private TableColumn<WeatherData, Integer> weatherCodeCol;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/weekWeather.fxml"));
        primaryStage.setTitle("Weather App");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }

    @FXML
    public void initialize(){
        windSpeedCol.setCellValueFactory(new PropertyValueFactory<>("windSpeed"));
        windDirCol.setCellValueFactory(new PropertyValueFactory<>("windDir"));
        tempMinCol.setCellValueFactory(new PropertyValueFactory<>("tempMin"));
        tempMaxCol.setCellValueFactory(new PropertyValueFactory<>("tempMax"));
        timeCol.setCellValueFactory(new PropertyValueFactory<>("time"));
        weatherCodeCol.setCellValueFactory(new PropertyValueFactory<>("weatherCode"));

        List<WeatherData> weekData = WeatherAPI.fetchWeatherData();
        weatherTable.getItems().addAll(weekData);


    }

    public static void main(String[] args) {
        launch(args);
    }
}
