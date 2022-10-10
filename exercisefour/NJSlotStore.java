package exercise4;

public class NJSlotStore extends SlotStore {
	
	@Override
	protected Slot makeSlot(String item) {
		Slot slot = null;
		SlotComponentFactory componentFactory = new NJSlotComponentFactory();
 
		if (item.equals("straight") || item.equals("Straight")) {
  
			slot = new StraightSlot(componentFactory,item);
			slot.setName("New Jersey Straight Slot");
  
		} else if (item.equals("bonus") || item.equals("Bonus")) {
 
			slot = new BonusSlot(componentFactory,item);
			slot.setName("New Jersey Bonus Slot");
 
		} else if (item.equals("bonus") || item.equals("Bonus")) {
 
			slot = new ProgressiveSlot(componentFactory,item);
			slot.setName("New Jersey Progressive Slot");
		}
		return slot ;
	}

}