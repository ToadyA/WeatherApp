import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class WeatherData {
    private final SimpleDoubleProperty windSpeed;
    private final SimpleIntegerProperty precProb;
    private final SimpleDoubleProperty tempMax;
    private final SimpleIntegerProperty windDir;
    private final SimpleDoubleProperty tempMin;
    private final SimpleStringProperty time;
    private final SimpleIntegerProperty weatherCode;
    private final SimpleDoubleProperty precSum;
    private final SimpleDoubleProperty precHours;

    /*
    public WeatherData(){
        this.windSpeed = 0.0;
        this.precProb = 0;
        this.tempMax = 0.0;
        this.windDir = 0;
        this.tempMin = 0.0;
        this.time = "who could tell?";
        this.weatherCode = 0;
        this.precSum = 0.0;
        this.precHours = 0.0;
    }
    */

    public WeatherData(double windSpeed, int precProb, double tempMax, int windDir, double tempMin, String time, int weatherCode, double precSum, double precHours){
        this.windSpeed = new SimpleDoubleProperty(windSpeed);
        this.precProb = new SimpleIntegerProperty(precProb);
        this.tempMax = new SimpleDoubleProperty(tempMax);
        this.windDir = new SimpleIntegerProperty(windDir);
        this.tempMin = new SimpleDoubleProperty(tempMin);
        this.time = new SimpleStringProperty(time);
        this.weatherCode = new SimpleIntegerProperty(weatherCode);
        this.precSum = new SimpleDoubleProperty(precSum);
        this.precHours = new SimpleDoubleProperty(precHours);
    }

    public double getWindSpeed(){
        return windSpeed.get();
    }
    public SimpleDoubleProperty windSpeedProperty(){
        return this.windSpeed;
    }

    public int getPrecProb() {
        return precProb.get();
    }
    public SimpleIntegerProperty precProbProperty(){
        return this.precProb;
    }

    public double getTempMax() {
        return tempMax.get();
    }
    public SimpleDoubleProperty tempMaxProperty(){
        return this.tempMax;
    }

    public int getWindDir() {
        return windDir.get();
    }
    public SimpleIntegerProperty windDirProperty(){
        return this.windDir;
    }

    public double getTempMin(){
        return tempMin.get();
    }
    public SimpleDoubleProperty tempMinProperty(){
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

    public double getPrecSum() {
        return precSum.get();
    }
    public SimpleDoubleProperty precSumProperty(){
        return this.precSum;
    }

    public double getPrecHours() {
        return precHours.get();
    }
    public SimpleDoubleProperty precHoursProperty(){
        return this.precHours;
    }
}
