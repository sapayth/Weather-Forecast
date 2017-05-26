/*
 * Sapayth Hossain
 */
package WeatherDB;

import java.io.IOException;
import java.net.URL;
import javax.swing.JLabel;
import org.codehaus.jackson.map.ObjectMapper;

/*
 * @author sapaythhossain
 */
public class FetchWeatherInfo {

    public FetchWeatherInfo(String location) {
        ObjectMapper mapper = new ObjectMapper();
        //mapper.configure(DeserializationConfig.Feature.UNWRAP_ROOT_VALUE, true);
        //Coord cor = objectMapper.readValue(responseString, Coord.class);
        try {
            JSONgen obj = mapper.readValue(new URL("http://api.openweathermap.org/data/2.5/weather?q=" + location + "&units=metric&appid=0227e6010071a6909fc84a8b6c5d2037"), JSONgen.class);
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
            System.out.println(obj.getMain().getTemp_min());
            System.out.println(obj.getMain().getTemp_max());

        } catch (IOException err) {
            System.out.println(err.toString());
        }
    }

    public static String fetchCurrent(String location, JLabel w, JLabel min, JLabel max) {
        w.setText("");
        ObjectMapper mapper = new ObjectMapper();
        String temp = "";
        //mapper.configure(DeserializationConfig.Feature.UNWRAP_ROOT_VALUE, true);
        //Coord cor = objectMapper.readValue(responseString, Coord.class);
        try {
            JSONgen obj = mapper.readValue(new URL("http://api.openweathermap.org/data/2.5/weather?q=" + location + "&units=metric&appid=0227e6010071a6909fc84a8b6c5d2037"), JSONgen.class);
            double tempD = Double.valueOf(obj.getMain().getTemp());
            int tempInt = (int) tempD;
            temp = String.valueOf(tempInt);
            
            double minD = Double.valueOf(obj.getMain().getTemp_min());
            int minInt = (int) minD;
            String minS = String.valueOf(minInt);
            min.setText(minS + "°");
            
            double maxD = Double.valueOf(obj.getMain().getTemp_max());
            int maxInt = (int) maxD;
            String maxS = String.valueOf(maxInt);
            max.setText(maxS + "°");
            
        } catch (IOException err) {
            w.setText("Enter a valid city name");
        }
        return temp;
    }
}
