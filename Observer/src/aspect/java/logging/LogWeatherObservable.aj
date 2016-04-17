package logging;

import lou.observable.WeatherObservable;
public aspect LogWeatherObservable {
	pointcut weatherMethod(): execution(* WeatherObservable.*(..));
	
	before() : weatherMethod(){
		System.out.println("--A- " + thisJoinPoint.getSignature().getName());
	}

}
