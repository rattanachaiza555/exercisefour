package exercise4;

public class NJSlotComponentFactory implements SlotComponentFactory {

	@Override
	public Cabinet createCabinet(String type) {
		// TODO Auto-generated method stub
		if (("Straight".equals(type)) ||  ("straight".equals(type)) ){
			return new smallCabinet() ;
		}
		else if (("Bonus".equals(type)) ||  ("bonus".equals(type)) ) {
			return new largeCabinet() ;
		}
		else if (("Progressive".equals(type)) ||  ("progressive".equals(type)) ) {
			return new smallCabinet();
		}
		return null;
	}

	@Override
	public Payment createPayment(String type) {
		// TODO Auto-generated method stub
		if (("Straight".equals(type)) ||  ("straight".equals(type)) ){
			return new coinsPayment() ;
		}
		else if (("Bonus".equals(type)) ||  ("bonus".equals(type)) ) {
			return new coinsPayment() ;
		}
		else if (("Progressive".equals(type)) ||  ("progressive".equals(type)) ) {
			return new billsPayment();
		}
		return null;
	}

	@Override
	public Display createDisplay(String type) {
		// TODO Auto-generated method stub
		if (("Straight".equals(type)) ||  ("straight".equals(type)) ){
			return new LCDDisplay() ;
		}
		else if (("Bonus".equals(type)) ||  ("bonus".equals(type)) ) {
			return new reelsDisplay() ;
		}
		else if (("Progressive".equals(type)) ||  ("progressive".equals(type)) ) {
			return new CRTDisplay();
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
			return new ARMGPU() ;
		}
		else if (("Progressive".equals(type)) ||  ("progressive".equals(type)) ) {
			return new X86GPU();
		}
		return null;
	}

}
