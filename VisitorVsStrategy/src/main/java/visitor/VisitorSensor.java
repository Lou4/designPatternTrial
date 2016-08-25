package visitor;

public interface VisitorSensor<T> {
	T visit(SensorVisitor<T> sensor);
}
