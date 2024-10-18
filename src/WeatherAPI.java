import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import org.json.JSONArray;
import org.json.JSONObject;
import java.util.ArrayList;
import java.util.List;

public class WeatherAPI {
    public static void main(String[] args) {
        try {
            String url = "https://api.open-meteo.com/v1/forecast?latitude=38.5816&longitude=121.4944&daily=weather_code,temperature_2m_max,temperature_2m_min,precipitation_sum,precipitation_hours,precipitation_probability_max,wind_speed_10m_max,wind_direction_10m_dominant&temperature_unit=fahrenheit&wind_speed_unit=mph&precipitation_unit=inch&timezone=America%2FLos_Angeles";

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            JSONObject weatherData = new JSONObject(response.body());
            JSONArray dailyData = weatherData.getJSONObject("daily").getJSONArray("wind_speed_10m_max");

            List<WeatherData> weekData = new ArrayList<>();
            for(int i = 0; i < dailyData.length(); i ++){
                double windSpeed = weatherData.getJSONObject("daily").getJSONArray("wind_speed_10m_max").getDouble(i);
                int precProb = weatherData.getJSONObject("daily").getJSONArray("precipitation_probability_max").getInt(i);
                double tempMax = weatherData.getJSONObject("daily").getJSONArray("temperature_2m_max").getDouble(i);
                int windDir = weatherData.getJSONObject("daily").getJSONArray("wind_direction_10m_dominant").getInt(i);
                double tempMin = weatherData.getJSONObject("daily").getJSONArray("temperature_2m_min").getDouble(i);
                String time = weatherData.getJSONObject("daily").getJSONArray("time").getString(i);
                int weatherCode = weatherData.getJSONObject("daily").getJSONArray("weather_code").getInt(i);
                double precSum = weatherData.getJSONObject("daily").getJSONArray("precipitation_sum").getDouble(i);
                double precHours = weatherData.getJSONObject("daily").getJSONArray("precipitation_hours").getDouble(i);

                weekData.add(new WeatherData(windSpeed, precProb, tempMax, windDir, tempMin, time, weatherCode, precSum, precHours));
            }

            for(WeatherData day : weekData){
               System.out.println("Wind Speed: " + day.getWindSpeed() + " mp/h");
               System.out.println("Precipitation Probability Max: " + day.getPrecProb() + "%");
               System.out.println("Temperature Max: " + day.getTempMax() + "°F");
               System.out.println("Wind Direction: " + day.getWindDir() + "°");
               System.out.println("Temperature Min: " + day.getTempMin());
               System.out.println("Date: " + day.getTime());
               System.out.println("Weather Code (whatever that means): " + day.getWeatherCode());
               System.out.println("Precipitation Total: " + day.getPrecSum() + " inches");
               System.out.println("Precipitation Hours: " + day.getPrecHours() + " h");
            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
