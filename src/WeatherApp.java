import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
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
    @FXML private TableColumn<WeatherData, String> statusCol;

    @FXML private ImageView img1;
    @FXML private ImageView img2;
    @FXML private ImageView img3;
    @FXML private ImageView img4;
    @FXML private ImageView img5;
    @FXML private ImageView img6;
    @FXML private ImageView img7;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/weekWeather.fxml"));
        primaryStage.setTitle("Weather App");
        primaryStage.setScene(new Scene(root, 700, 400));
        primaryStage.show();
    }

    @FXML
    public void initialize(){
        weatherTable.setFixedCellSize(50);
        windSpeedCol.setCellValueFactory(new PropertyValueFactory<>("windSpeed"));
        windDirCol.setCellValueFactory(new PropertyValueFactory<>("windDir"));
        tempMinCol.setCellValueFactory(new PropertyValueFactory<>("tempMin"));
        tempMaxCol.setCellValueFactory(new PropertyValueFactory<>("tempMax"));
        timeCol.setCellValueFactory(new PropertyValueFactory<>("time"));
        statusCol.setCellValueFactory(new PropertyValueFactory<>("weatherStatus"));

        List<WeatherData> weekData = WeatherAPI.fetchWeatherData();
        weatherTable.getItems().addAll(weekData);

        for(int i = 0; i < weekData.size(); i++){
            WeatherData data = weekData.get(i);
            int wCode = data.getWeatherCode();
            String imgUrl = WeatherImages.getWeatherImage(wCode);
            Image image = new Image(imgUrl);

            switch(i){
                case 0:
                    img1.setImage(image);
                    break;
                case 1:
                    img2.setImage(image);
                    break;
                case 2:
                    img3.setImage(image);
                    break;
                case 3:
                    img4.setImage(image);
                    break;
                case 4:
                    img5.setImage(image);
                    break;
                case 5:
                    img6.setImage(image);
                    break;
                case 6:
                    img7.setImage(image);
                    break;
            }
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
