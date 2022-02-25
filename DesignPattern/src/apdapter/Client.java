package apdapter;

public class Client {

	public static void main(String[] args) {
		// 현재 가지고 있는 충전기
		ThunderboltCharger tc = new ThunderboltCharger();
		
		UsbcCharger uc = new UsbcCharger();
		
		System.out.println(tc.chargeIphone());
		System.out.println(uc.charge());

		System.out.println("========================");
		
		IphoneCharger adapter = new ThunderboltToUsbc(uc);
		System.out.println(adapter.chargeIphone());
	}
}
