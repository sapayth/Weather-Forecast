/*
 * Sapayth Hossain
 */
package WeatherDB;

import java.awt.List;
import java.io.Serializable;
import net.aksingh.owmjapis.AbstractForecast;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

/*
 * @author sapaythhossain
 */
public class WeatherClass implements Serializable {
    
//    @JsonProperty("coord")
//    @JsonIgnore
    private List coord;
    
    private Weather123 weather;
    
    //@JsonIgnore
    private double lon;
    private double lat;

    private int id;
    private String main;
    private String description;
    private String icon;

    private String base;
    private double temp;
    private int pressure;
    private int humidity;
    private double temp_min;
    private double temp_max;

    private String Country;
    private int sunrise;
    private int sunset;

    private String name;
    private int cod;

    public List getCoord() {
        return coord;
    }

    public void setCoord(List coord) {
        this.coord = coord;
    }

    public Weather123 getWeather() {
        return weather;
    }

    public void setWeather(Weather123 weather) {
        this.weather = weather;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public double getTemp_min() {
        return temp_min;
    }

    public void setTemp_min(double temp_min) {
        this.temp_min = temp_min;
    }

    public double getTemp_max() {
        return temp_max;
    }

    public void setTemp_max(double temp_max) {
        this.temp_max = temp_max;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public int getSunrise() {
        return sunrise;
    }

    public void setSunrise(int sunrise) {
        this.sunrise = sunrise;
    }

    public int getSunset() {
        return sunset;
    }

    public void setSunset(int sunset) {
        this.sunset = sunset;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    

    

    @Override
    public String toString() {
        return String.format("Name: %s%n"
                + "Temp: %.2f%n"
                + "Temp min: %.2f%n"
                + "Temp max: %.2f%n",
                getName(), getTemp(), getTemp_min(), getTemp_max() );
    }
}
