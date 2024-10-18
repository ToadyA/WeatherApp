public class WeatherData {
    private double windSpeed;
    private int precProb;
    private double tempMax;
    private int windDir;
    private double tempMin;
    private String time;
    private int weatherCode;
    private double precSum;
    private double precHours;

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

    public WeatherData(double windSpeed, int precProb, double tempMax, int windDir, double tempMin, String time, int weatherCode, double precSum, double precHours){
        this.windSpeed = windSpeed;
        this.precProb = precProb;
        this.tempMax = tempMax;
        this.windDir = windDir;
        this.tempMin = tempMin;
        this.time = time;
        this.weatherCode = weatherCode;
        this.precSum = precSum;
        this.precHours = precHours;
    }

    public double getWindSpeed(){
        return this.windSpeed;
    }
    public int getPrecProb(){
        return this.precProb;
    }
    public double getTempMax(){
        return this.tempMax;
    }
    public int getWindDir(){
        return this.windDir;
    }
    public double getTempMin(){
        return this.tempMin;
    }
    public String getTime(){
        return this.time;
    }
    public int getWeatherCode(){
        return this.weatherCode;
    }
    public double getPrecSum(){
        return this.precSum;
    }
    public double getPrecHours(){
        return this.precHours;
    }
}
