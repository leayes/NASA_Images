import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;


public class SatImage {

  private static float lat;
  private static float lon;
  private static String date = new String();
  private static float dim;
  private static String api_key = new String("RpdnpLcMys5GGuQwkRsgrL8mMoxMJGRdY9AB2IWp");


  public static void main(String args[]){

    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter a Latitude:");
    lat = myObj.nextFloat();
    System.out.println("Enter a Longitude:");
    lon = myObj.nextFloat();
    System.out.println("Enter a Dimension:");
    dim = myObj.nextFloat();
    System.out.println("Enter a Date:");
    date = myObj.next();



    try {
      URL url = new URL("https://api.nasa.gov/planetary/earth/assets?lon=" + lon + "&lat="+lat + "&date=" + date + "&&dim=" + dim + "&api_key=" + api_key);
      URL url2 = new URL("https://api.nasa.gov/planetary/earth/assets?lon="+lon+"&lat="+lat+"&date="+date+"&&dim="+dim+"&api_key=RpdnpLcMys5GGuQwkRsgrL8mMoxMJGRdY9AB2IWp");
      URL url3 = new URL ("https://api.nasa.gov/planetary/earth/assets?lon="+lon+"&lat="+lat+"&date="+date+"&&dim="+dim+"&api_key=RpdnpLcMys5GGuQwkRsgrL8mMoxMJGRdY9AB2IWp");


            // read text returned by server
            BufferedReader in = new BufferedReader(new InputStreamReader(url3.openStream()));
            
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
            in.close();

        }
        catch (MalformedURLException e) {
            System.out.println("Malformed URL: " + e.getMessage());
        }
        catch (IOException e) {
            System.out.println("I/O Error: " + e.getMessage());
