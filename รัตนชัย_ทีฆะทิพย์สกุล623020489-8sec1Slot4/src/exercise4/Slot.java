package exercise4;

public abstract class Slot {
	
	String name ;
	
	Cabinet cabinet;
	Payment payment;
	Display display;
	GPU		gpu;
	
	String software ;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	abstract void collectParts();
	
	void assembleParts() {
		System.out.println("assembling components");
	}
	
	void test(String type) {
		if (type.equals("hardware")) System.out.println("testing hardware");
		else System.out.println("testing software");
	}
	
	void uploadSoftware() {
		System.out.println("uploading software:" + software);
	}
	void ship() {
		System.out.println("wrapping the slot machine in Ceran Wrap and shipping it with UPS");
	}
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("--------" + name + "--------- including:\n");
		if (cabinet != null) {
			result.append(cabinet);
			result.append("\n");
		}

		if (display != null) {
			result.append(display);
			result.append("\n");
		}
		if (payment != null) {
			result.append(payment);
			result.append("\n");
		}
//		if (components != null) {
//			for (int i = 0; i < components.length; i++) {
//				result.append(components[i]);
//				if (i < components.length-1) {
//					result.append(", ");
//				}
//			}
//			result.append("\n");
//		}
		if (gpu != null) {
			result.append(gpu);
			result.append("\n");
		}

		return result.toString();
	}
}
