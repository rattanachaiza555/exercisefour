package exercise4;

public interface SlotComponentFactory {
	public Cabinet createCabinet(String type) ;
	public Payment createPayment(String type);
	public Display createDisplay(String type) ;
	public GPU createGPU(String type) ;
}
