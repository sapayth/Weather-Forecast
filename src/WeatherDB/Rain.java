/*
 * Sapayth Hossain
 */

package WeatherDB;

/*
 * @author sapaythhossain
 */
public class Rain
{
    private String a3h;

    public String get3h ()
    {
        return a3h;
    }

    public void seta3h (String a3h)
    {
        this.a3h = a3h;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [a3h = "+a3h+"]";
    }
}