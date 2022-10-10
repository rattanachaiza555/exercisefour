package exercise4;

public class NVSlotStore extends SlotStore {
	
	@Override
	protected Slot makeSlot(String item) {
		Slot slot = null;
		SlotComponentFactory componentFactory = new NVSlotComponentFactory();
 
		if (item.equals("straight") || item.equals("Straight")) {
  
			slot = new StraightSlot(componentFactory,item);
			slot.setName("Nevada Straight Slot");
  
		} else if (item.equals("bonus") || item.equals("Bonus")) {
 
			slot = new BonusSlot(componentFactory,item);
			slot.setName("Nevada Bonus Slot");
 
		} else if (item.equals("progressive") || item.equals("Progressive")) {
 
			slot = new ProgressiveSlot(componentFactory,item);
			slot.setName("Nevada Progressive Slot");
		}
		return slot ;
	}

}
