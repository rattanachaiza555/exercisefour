package exercise4;

public class DCSlotStore extends SlotStore {

	@Override
	protected Slot makeSlot(String item) {
		Slot slot = null;
		SlotComponentFactory componentFactory = new DCSlotComponentFactory();
 
		if (item.equals("straight") || item.equals("Straight")) {
  
			slot = new StraightSlot(componentFactory,item);
			slot.setName("Washington Straight Slot");
  
		} else if (item.equals("bonus") || item.equals("Bonus")) {
 
			slot = new BonusSlot(componentFactory,item);
			slot.setName("Washington Bonus Slot");
 
		} else if (item.equals("progressive") || item.equals("Progressive")) {
 
			slot = new ProgressiveSlot(componentFactory,item);
			slot.setName("Washington Progressive Slot");
		}
		return slot ;
	}

}
