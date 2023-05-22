public class Farmer implements Observer{

    @Override
    public void update(float temperature, float humidity, float rain, float windVelocity) {

        System.out.println("---------------------FARMER---------------------");


        if(rain > 50){
            System.out.println("No need to water the crops today, it's raining like crazy");
        }else if(rain < 50 && rain > 0){
            System.out.println("No need to water the crops today");
        }else{
            System.out.println("Let's water the crops, is not raining");
        }

        if(temperature > 30){
            System.out.println("Too hot, nice temperature to grow oranges");
        }else if(temperature < 10){
            System.out.println("Too cold, nice temperature to grow grapes");
        }else{
            System.out.println("The temperature is pleasent, can't get wrong with apples");
        }

    }
    
}
