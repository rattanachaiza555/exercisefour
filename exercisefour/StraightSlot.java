package exercise4;

public class StraightSlot extends Slot {
	
	SlotComponentFactory componentFactory;
	String type ;
	
	public StraightSlot(SlotComponentFactory componentFactory, String type) {
		this.componentFactory = componentFactory;
		if (componentFactory instanceof NVSlotComponentFactory) {
			
			software = "Linux" ;
		}
		else if (componentFactory instanceof NJSlotComponentFactory) {
			software = "Window ME";
		}
		else if (componentFactory instanceof DCSlotComponentFactory) {
			software = "Linux";
		}
		this.type = type ;
	}
	@Override
	void collectParts() {
		// TODO Auto-generated method stub
		System.out.println("Collecting components of " + name);
		cabinet = componentFactory.createCabinet(type);
		payment = componentFactory.createPayment(type);
		display = componentFactory.createDisplay(type);
		gpu 	= componentFactory.createGPU(type) ;
	}

}
