package exercise4;

public class NVSlotComponentFactory implements SlotComponentFactory {

	@Override
	public Cabinet createCabinet(String type) {
		// TODO Auto-generated method stub
		if (("Straight".equals(type)) ||  ("straight".equals(type)) ){
			return new largeCabinet() ;
		}
		else if (("Bonus".equals(type)) ||  ("bonus".equals(type)) ) {
			return new smallCabinet() ;
		}
		else if (("Progressive".equals(type)) ||  ("progressive".equals(type)) ) {
			return new mediumCabinet();
		}
		return null;
	}

	@Override
	public Payment createPayment(String type) {
		// TODO Auto-generated method stub
		return new ticketinticketout();
	}

	@Override
	public Display createDisplay(String type) {
		// TODO Auto-generated method stub
		if (("Straight".equals(type)) ||  ("straight".equals(type)) ){
			return new reelsDisplay() ;
		}
		else if (("Bonus".equals(type)) ||  ("bonus".equals(type)) ) {
			return new CRTDisplay() ;
		}
		else if (("Progressive".equals(type)) ||  ("progressive".equals(type)) ) {
			return new LCDDisplay();
		}
		return null;
	
	}

	@Override
	public GPU createGPU(String type) {
		// TODO Auto-generated method stub
		if (("Straight".equals(type)) ||  ("straight".equals(type)) ){
			return new ARMGPU() ;
		}
		else if (("Bonus".equals(type)) ||  ("bonus".equals(type)) ) {
			return new X86GPU() ;
		}
		else if (("Progressive".equals(type)) ||  ("progressive".equals(type)) ) {
			return new X77GPU();
		}
		return null;
	}

}
