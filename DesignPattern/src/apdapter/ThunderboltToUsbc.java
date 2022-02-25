package apdapter;

public class ThunderboltToUsbc implements IphoneCharger {
	private UsbcCharger usbcCharger;
	
	public ThunderboltToUsbc(UsbcCharger uc) {
		this.usbcCharger = uc;
	}
	
	@Override
	public String chargeIphone() {
		return usbcCharger.charge() + "(using adapter)";
	}
}
