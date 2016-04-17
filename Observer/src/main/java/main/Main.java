package main;

import lou.observable.WeatherObservable;
import lou.observer.LouObserver;

public class Main {
	public static void main(String[] args) {
		WeatherObservable weatherObservable = new WeatherObservable();
		for(int i = 0; i<5; i++){
			new LouObserver(weatherObservable, i == 3);
		}
		
		weatherObservable.measure();
	}
}
