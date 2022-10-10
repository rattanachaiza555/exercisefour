package exercise4;

public abstract class SlotStore {
	public Slot orderSlot(String type) throws NoSuchFieldException, Throwable {
		Slot slot = makeSlot(type);
		System.out.println("--- Making a " + slot.getName() + " ---");
		slot.collectParts();
		slot.assembleParts();
		slot.test(type);
		slot.uploadSoftware();
		slot.ship();
		return slot;
	}
	abstract Slot makeSlot(String item);
}