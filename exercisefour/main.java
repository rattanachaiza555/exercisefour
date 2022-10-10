package exercise4;


public class main {

	public static void main(String[] args) throws NoSuchFieldException, Throwable {
		// TODO Auto-generated method stub
		SlotStore nvStore = new NVSlotStore();
		SlotStore njStore = new NJSlotStore();
		Slot slot = nvStore.orderSlot("progressive");
		System.out.println("Joel ordered a "+slot );
		
		slot = njStore.orderSlot("straight");
		System.out.println("JJ ordered a " + slot);
	}

}