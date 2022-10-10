package exercise4;

public class ProgressiveSlot extends Slot {

	SlotComponentFactory componentFactory;
	 String type ;
	public ProgressiveSlot(SlotComponentFactory componentFactory,String type ) {
		this.componentFactory = componentFactory;
		if (componentFactory instanceof NVSlotComponentFactory) {
			
			software = "Android" ;
		}
		else if (componentFactory instanceof NJSlotComponentFactory) {
			software = "Window XP";
		}
		else if (componentFactory instanceof DCSlotComponentFactory) {
			software = "Android" ;
		}
		this.type = type ;
		
	}
	@Override
	void collectParts()  {
		System.out.println("Collecting components of " + name);
	
		cabinet = componentFactory.createCabinet(type);
		payment = componentFactory.createPayment(type);
		display = componentFactory.createDisplay(type);
		gpu = componentFactory.createGPU(type);
	}

}
