public class Airport implements Observer{

    @Override
    public void update(float temperature, float humidity, float rain, float windVelocity) {

        System.out.println("---------------------AIRPORT---------------------");


        if(windVelocity > 50){
            System.out.println("Dear passangers, todays's flight are cancelled due to high speed winds");
        }else{
            System.out.println("The winds are perfecs for flying");
        }

        if(rain > 50){
            System.out.println("Dear passangers, todays's flight are cancelled due to high rain");
        }else if(rain < 50 && rain > 0){
            System.out.println("The rain it's looking ok to flying");
        }

    }
    
}
