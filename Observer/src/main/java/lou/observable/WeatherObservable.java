package lou.observable;

import java.util.Observable;
import java.util.Random;

public class WeatherObservable extends Observable{

	private WeatherInfo weatherInfo;
	
	public WeatherObservable() {
		weatherInfo = new WeatherInfo();
	}
	
	public void measuramentChanged(){
		setChanged();
		notifyObservers(weatherInfo);
	}
	
	public void measure(){
		Random rand = new Random();
		while(true){
			System.out.println("Observer listening: " + countObservers());
			try {
				Thread.sleep(3000);
				weatherInfo.setHumidity(rand.nextFloat());
				weatherInfo.setTemperature(rand.nextFloat());
				weatherInfo.setPression(rand.nextFloat());
			} catch (InterruptedException e) {
				weatherInfo = null;
			}
			measuramentChanged();
		}
	}
}
