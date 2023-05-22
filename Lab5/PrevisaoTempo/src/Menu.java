import java.util.Scanner;

public class Menu {
    public static void main(String[] args) throws Exception {
        System.out.println("---------------------------------------------");
        System.out.println("                     Menu                    ");
        System.out.println("---------------------------------------------");
        
        Scanner sc = new Scanner(System.in);
        WeatherForecast weather = new WeatherForecast();
        Farmer farmer = new Farmer();
        Airport airport = new Airport();
        News news = new News();
        
        int op = 0;
        
        while(op != 4){

            System.out.println("");
            System.out.println("Select one of the options");
            System.out.println("[1] Add new observer");
            System.out.println("[2] Remove a observer");
            System.out.println("[3] Randomize the values of the weather");
            System.out.println("[4] Exit");
            
            op = sc.nextInt();


            switch(op){
                case 1:
                    weather.addObserver(farmer);
                    weather.addObserver(airport);
                    weather.addObserver(news);
                    System.out.println("Adding 3 new observers");
                    break;
                case 2:
                    weather.removeObserver(farmer);
                    weather.removeObserver(airport);
                    weather.removeObserver(news);
                    System.out.println("Removing 3 observers");
                    break;
                case 3:
                    weather.randomWeather();
                    weather.valuesUpdated(weather.getTemperature(), weather.getHumidity(), weather.getRain(), weather.getWindVelocity());
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Error! Select a valid option");
            }
        }
    }
}
