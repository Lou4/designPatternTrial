package visitor;

public interface ISensorVisitor<T> {
	T accept(VisitorSensor<T> visitor);
}
