/*
 * Sapayth Hossain
 */
package WeatherForecast;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import javax.swing.JLabel;
import org.codehaus.jackson.map.ObjectMapper;

/*
 * @author sapaythhossain
 */
public class FetchWeatherInfo {

    // API key
    static String id = "0227e6010071a6909fc84a8b6c5d2037";
    
    // For temperature in Fahrenheit use units=imperial
    // For temperature in Celsius use units=metric
    // Temperature in Kelvin is used by default, no need to use units parameter in API call
    static String units = "metric";

    public FetchWeatherInfo(String location) {
        ObjectMapper mapper = new ObjectMapper();
        //mapper.configure(DeserializationConfig.Feature.UNWRAP_ROOT_VALUE, true);
        //Coord cor = objectMapper.readValue(responseString, Coord.class);
        try {
            URL jsonURI = new URL("http://api.openweathermap.org/data/2.5/weather?q=" + location + "&units=" + units + "&appid=" + id);
            JSONgen obj = mapper.readValue(jsonURI, JSONgen.class);
        } catch (IOException err) {
            System.out.println(err.toString());
        }
    }

    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        //mapper.configure(DeserializationConfig.Feature.UNWRAP_ROOT_VALUE, true);
        //Coord cor = objectMapper.readValue(responseString, Coord.class);
        try {
            JSONgen obj = mapper.readValue(new URL("http://api.openweathermap.org/data/2.5/weather?q=dhaka&units=metric&appid=0227e6010071a6909fc84a8b6c5d2037"), JSONgen.class);
            System.out.println(obj.getMain().getTemp());
            System.out.println( Arrays.toString(obj.getWeather()) );

        } catch (IOException err) {
            System.out.println(err.toString());
        }
    }

    public static String fetchCurrent(String location, JLabel w, JLabel desc) {
        w.setText("");
        ObjectMapper mapper = new ObjectMapper();
        String temp = "";
        //mapper.configure(DeserializationConfig.Feature.UNWRAP_ROOT_VALUE, true);
        //Coord cor = objectMapper.readValue(responseString, Coord.class);
        try {
            JSONgen obj = mapper.readValue(new URL("http://api.openweathermap.org/data/2.5/weather?q=" + location + "&units=" + units + "&appid=" + id), JSONgen.class);
            desc.setText( Arrays.toString(obj.getWeather()) );
            
            double tempD = Double.valueOf(obj.getMain().getTemp());
            int tempInt = (int) tempD;
            temp = String.valueOf(tempInt);

        } catch (IOException err) {
            w.setText("Enter a valid city name");
        }
        return temp;
    }
}