package exercise4;

public class BonusSlot extends Slot {
	SlotComponentFactory componentFactory;
	String type ;
	 
	public BonusSlot(SlotComponentFactory componentFactory, String type) {
		this.componentFactory = componentFactory;
		if (componentFactory instanceof NVSlotComponentFactory) {
			
			software = "Linux" ;
		}
		else if (componentFactory instanceof NJSlotComponentFactory) {
			software = "Window ME";
		}
		else if (componentFactory instanceof DCSlotComponentFactory) {
			software = "Symbian" ;
		}
		this.type = type ;
	}
	@Override
	void collectParts() {
		System.out.println("Collecting components of " + name);
	
		cabinet = componentFactory.createCabinet(type);
		payment = componentFactory.createPayment(type);
		display = componentFactory.createDisplay(type);
		gpu = componentFactory.createGPU(type);
	}

}