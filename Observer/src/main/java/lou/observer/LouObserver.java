package lou.observer;

import java.util.Observable;
import java.util.Observer;

import lou.observable.WeatherInfo;
import lou.observable.WeatherObservable;

public class LouObserver implements DisplayResult, Observer{
	
	private float temperature;
	private float pression;
	private float humidity;
	
	private boolean imCrazy;
	public LouObserver(WeatherObservable weatherObservable, boolean imCrazy) {
		weatherObservable.addObserver(this);
		this.imCrazy = imCrazy;
	}
	
	@Override
	public void display() {
		System.out.println("-" + hashCode() + "-");
		System.out.println("temperature: " + temperature);
		System.out.println("pression: " + pression);
		System.out.println("humidity: " + humidity);
		
	}

	@Override
	public void update(Observable o, Object arg) {
		if(arg == null)
			return;
		
		crasyness();
		
		temperature = ((WeatherInfo)arg).getTemperature();
		pression = ((WeatherInfo)arg).getPression();
		humidity = ((WeatherInfo)arg).getHumidity();
		display();
	}
	
	private void crasyness(){
		if(imCrazy)
			sleep(5000);
		
	}
	
	private void sleep(int millisec){
		try {
			Thread.sleep(millisec);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
