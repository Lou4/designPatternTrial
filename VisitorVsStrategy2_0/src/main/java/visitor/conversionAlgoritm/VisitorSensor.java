package visitor.conversionAlgoritm;

import visitor.concreteSensor.SensorCelsius;
import visitor.concreteSensor.SensorFarheneit;
import visitor.concreteSensor.SensorKelvin;
import visitor.concreteSensor.SensorNewton;
import visitor.concreteSensor.SensorRankine;
import visitor.concreteSensor.SensorReaumur;
import visitor.concreteSensor.SensorRomer;

public interface VisitorSensor {
	float visit(SensorCelsius sensor);
	float visit(SensorFarheneit sensor);
	float visit(SensorKelvin sensor);
	float visit(SensorNewton sensor);
	float visit(SensorRankine sensor);
	float visit(SensorReaumur sensor);
	float visit(SensorRomer sensor);
}
