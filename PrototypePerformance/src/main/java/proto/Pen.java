package proto;

public class Pen implements PrototypePen{
	String color;
	int price;
	float weight;
	
	Pen(){}
	Pen(String nColor, int nPrice){
		color = nColor;
		price = nPrice;
		weight = 1.2f;
	}
	
	@Override
	public PrototypePen clone(){
		try {
			return (PrototypePen) super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}
}
