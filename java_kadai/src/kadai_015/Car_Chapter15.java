package kadai_015;

public class Car_Chapter15 {
	private int gear = 1;
	private int speed = 10;

	
	public void gearChange(int afterGear) {
		switch(afterGear) {
			case 1 -> {
				System.out.println("ギア" + gear + "から" + afterGear + "に切り替えました");
				this.gear = afterGear;
				speed = 10;
			}
			case 2 -> {
				System.out.println("ギア" + gear + "から" + afterGear + "に切り替えました");
				this.gear = afterGear;
				speed = 20;
			}
			case 3 -> {
				System.out.println("ギア" + gear + "から" + afterGear + "に切り替えました");
				this.gear = afterGear;	
				speed = 30;
			}
			case 4 -> {
				System.out.println("ギア" + gear + "から" + afterGear + "に切り替えました");
				this.gear = afterGear;
				speed = 40;
			}
			case 5 -> {
				System.out.println("ギア" + gear + "から" + afterGear + "に切り替えました");
				this.gear = afterGear;
				speed = 50;
			}
			default -> {
				System.out.println("ギアの切替えに失敗しました" + gear + "から" + 1 + "に切り替えました");
				this.gear = 1;
				speed = 10;
			}
		}
	}
	
	public void run() {
		System.out.println("速度は時速" + speed + "kmです");
	}
}
