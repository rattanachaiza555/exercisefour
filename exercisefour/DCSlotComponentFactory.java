package exercise4;

public class DCSlotComponentFactory implements SlotComponentFactory {

	@Override
	public Cabinet createCabinet(String type) {
		if (("Straight".equals(type)) ||  ("straight".equals(type)) ){
			return  new largeCabinet() ;
		}
		else if (("Bonus".equals(type)) ||  ("bonus".equals(type)) ) {
			return new mediumCabinet() ;
		}
		else if (("Progressive".equals(type)) ||  ("progressive".equals(type)) ) {
			return   new largeCabinet() ;
		}
		return null;
	}

	@Override
	public Payment createPayment(String type) {
		if (("Straight".equals(type)) ||  ("straight".equals(type)) ){
			return new billsPayment() ;
		}
		else if (("Bonus".equals(type)) ||  ("bonus".equals(type)) ) {
			return new ticketinticketout() ;
		}
		else if (("Progressive".equals(type)) ||  ("progressive".equals(type)) ) {
			return new coinsPayment();
		}
		return null;
	}

	@Override
	public Display createDisplay(String type) {
		if (("Straight".equals(type)) ||  ("straight".equals(type)) ){
			return new reelsDisplay() ;
		}
		else if (("Bonus".equals(type)) ||  ("bonus".equals(type)) ) {
			return new VGADisplay() ;
		}
		else if (("Progressive".equals(type)) ||  ("progressive".equals(type)) ) {
			return new reelsDisplay();
		}
		return null;
	}

	@Override
	public GPU createGPU(String type) {
		// TODO Auto-generated method stub
		return new ARMGPU();
	}

}
