//subject

import java.util.ArrayList;
import java.util.List;
import java.lang.Math;

public class WeatherForecast implements Observable{
    private float temperature;
    private float humidity;
    private float rain;
    private float windVelocity;
    private List<Observer> observers;

    public WeatherForecast(){
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    @Override
    public void notifyObservers() {
        observers.forEach(observers -> observers.update(temperature, humidity, rain, windVelocity));
    }

    public void valuesUpdated(float temperature, float humidity, float rain, float windVelocity){
        this.temperature = temperature;
        this.humidity = humidity;
        this.rain = rain;
        this.windVelocity = windVelocity;
        notifyObservers();  //will notify about the updated methods
    }

    public void randomWeather(){
        float max=100, min = 1, distance = max-min+1, x;
        float temperature = (float)(Math.random() * distance) + min;
        float humidity = (float)(Math.random() * distance) + min;
        float rain = (float)(Math.random() * distance) + min;
        float windVelocity = (float)(Math.random() * distance) + min;
        setTemperature(temperature);
        setHumidity(humidity);
        setRain(rain);
        setWindVelocity(windVelocity);
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getRain() {
        return rain;
    }

    public void setRain(float rain) {
        this.rain = rain;
    }

    public float getWindVelocity() {
        return windVelocity;
    }

    public void setWindVelocity(float windVelocity) {
        this.windVelocity = windVelocity;
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }

    

}
