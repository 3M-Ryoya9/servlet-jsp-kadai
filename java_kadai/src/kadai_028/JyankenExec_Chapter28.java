package kadai_028;

public class JyankenExec_Chapter28 {

	public static void main(String[] args) {
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		Jyanken_Chapter28 Jyanken = new Jyanken_Chapter28();
		
		Jyanken.playGame();

	}

}
