import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class WeatherData {
    private final SimpleStringProperty windSpeed;
    private final SimpleStringProperty tempMax;
    private final SimpleStringProperty windDir;
    private final SimpleStringProperty tempMin;
    private final SimpleStringProperty time;
    private final SimpleIntegerProperty weatherCode;

    public WeatherData(double windSpeed, double tempMax, int windDir, double tempMin, String time, int weatherCode){
        this.windSpeed = new SimpleStringProperty(windSpeed + " mph");
        this.tempMax = new SimpleStringProperty(tempMax + " °F");
        this.windDir = new SimpleStringProperty(windDir + " °");
        this.tempMin = new SimpleStringProperty(tempMin + " °F");
        this.time = new SimpleStringProperty(time);
        this.weatherCode = new SimpleIntegerProperty(weatherCode);
    }

    public String getWindSpeed(){
        return windSpeed.get();
    }
    public SimpleStringProperty windSpeedProperty(){
        return this.windSpeed;
    }

    public String getTempMax() {
        return tempMax.get();
    }
    public SimpleStringProperty tempMaxProperty(){
        return this.tempMax;
    }

    public String getWindDir() {
        return windDir.get();
    }
    public SimpleStringProperty windDirProperty(){
        return this.windDir;
    }

    public String getTempMin(){
        return tempMin.get();
    }
    public SimpleStringProperty tempMinProperty(){
        return this.tempMin;
    }

    public String getTime() {
        return time.get();
    }
    public SimpleStringProperty timeProperty(){
        return this.time;
    }

    public int getWeatherCode() {
        return weatherCode.get();
    }
    public SimpleIntegerProperty weatherCodeProperty(){
        return this.weatherCode;
    }
}
