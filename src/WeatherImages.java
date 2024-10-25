//using the weather codes gotten from here https://gist.github.com/stellasphere/9490c195ed2b53c707087c8c2db4ec0c
//a full list of codes which include those unused https://www.nodc.noaa.gov/archive/arc0021/0002199/1.1/data/0-data/HTML/WMO-CODE/WMO4677.HTM

public class WeatherImages{
    public static String getWeatherImage(int weatherCode){
        switch(weatherCode){
            case 0:
                return "http://openweathermap.org/img/wn/01d@2x.png";
            case 1:
                return "http://openweathermap.org/img/wn/01d@2x.png";
            case 2:
                return "http://openweathermap.org/img/wn/02d@2x.png";
            case 3:
                return "http://openweathermap.org/img/wn/03d@2x.png";
            case 45:
                return "http://openweathermap.org/img/wn/50d@2x.png";
            case 48:
                return "http://openweathermap.org/img/wn/50d@2x.png";
            case 51:
                return "http://openweathermap.org/img/wn/09d@2x.png";
            case 53:
                return "http://openweathermap.org/img/wn/09d@2x.png";
            case 55:
                return "http://openweathermap.org/img/wn/09d@2x.png";
            case 56:
                return "http://openweathermap.org/img/wn/09d@2x.png";
            case 57:
                return "http://openweathermap.org/img/wn/09d@2x.png";
            case 61:
                return "http://openweathermap.org/img/wn/10d@2x.png";
            case 63:
                return "http://openweathermap.org/img/wn/10d@2x.png";
            case 65:
                return "http://openweathermap.org/img/wn/10d@2x.png";
            case 66:
                return "http://openweathermap.org/img/wn/10d@2x.png";
            case 67:
                return "http://openweathermap.org/img/wn/10d@2x.png";
            case 71:
                return "http://openweathermap.org/img/wn/13d@2x.png";
            case 73:
                return "http://openweathermap.org/img/wn/13d@2x.png";
            case 75:
                return "http://openweathermap.org/img/wn/13d@2x.png";
            case 77:
                return "http://openweathermap.org/img/wn/13d@2x.png";
            case 80:
                return "http://openweathermap.org/img/wn/09d@2x.png";
            case 81:
                return "http://openweathermap.org/img/wn/09d@2x.png";
            case 82:
                return "http://openweathermap.org/img/wn/09d@2x.png";
            case 85:
                return "http://openweathermap.org/img/wn/13d@2x.png";
            case 86:
                return "http://openweathermap.org/img/wn/13d@2x.png";
            case 95:
                return "http://openweathermap.org/img/wn/11d@2x.png";
            case 96:
                return "http://openweathermap.org/img/wn/11d@2x.png";
            case 99:
                return "http://openweathermap.org/img/wn/11d@2x.png";
            default:
                return "http://openweathermap.org/img/wn/01d@2x.png";
        }
    }
}