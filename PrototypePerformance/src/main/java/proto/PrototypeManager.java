package proto;

import java.util.HashMap;

public class PrototypeManager {
	HashMap<String, PrototypePen> cache = new HashMap<String, PrototypePen>();
	public PrototypeManager() {
		cache.put("green", new Pen("green", 20));
		cache.put("red", new Pen("red", 15));
		cache.put("blue", new Pen("blue", 10));
	}
	
	public PrototypePen generatePen(String color){
		return cache.get(color);
	}
}
