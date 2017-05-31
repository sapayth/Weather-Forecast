/*
 * Sapayth Hossain
 */

package WeatherForecast;

import java.io.IOException;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;

/*
 * @author sapaythhossain
 */
public class JSONutil {
    private static ObjectMapper mapper;
    
    static{
        mapper = new ObjectMapper();
    }
    
    // method to convert JSON to Java
    public static <T> T convertJsonToJava(String JsonString, Class<T> cls) {
        T result = null;
        
        try {
            mapper.readValue(JsonString, cls);
            mapper.configure(DeserializationConfig.Feature.UNWRAP_ROOT_VALUE, true);
        } catch (IOException err) {
            System.out.println( err.toString() );
        }
        
        return result;
    }
}