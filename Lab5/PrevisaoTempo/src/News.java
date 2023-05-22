public class News implements Observer{

    @Override
    public void update(float temperature, float humidity, float rain, float windVelocity) {

        System.out.println("---------------------NEWS---------------------");

        if(rain > 50){
            System.out.println("Breaking News, today will be raining cats and dogs");
        }else if(rain < 50 && rain > 0){
            System.out.println("Today's News, It's looking like moderate rain will be coming today");
        }else{
            System.out.println("Sorry guys, no rainning for today");
        }

        if(temperature > 30){
            System.out.println("Today's News, It's looking like a good time for a pool and ice cream");
        }else if(temperature < 10){
            System.out.println("Today's News, it's extremaly cold, dont forget your jacket");
        }else{
            System.out.println("Temperature it's looking good");
        }

        if(humidity > 50){
            System.out.println("Today's News, it's very humid, probably it's raining somewhere around");
        }else if(humidity < 30){
            System.out.println("Today's News, watch out fot the dry weather");
        }else{
            System.out.println("Today's News, it's a nice humidity");
        }
    }
    
}
