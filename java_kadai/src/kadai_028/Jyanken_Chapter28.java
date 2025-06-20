package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	
	public String getMyChoice() {
		
		Scanner scanner = new Scanner(System.in);
		String input;
		
		while(true) {
			input = scanner.next();
			if((input.equals("r")) || (input.equals("s")) || (input.equals("p"))) {
				return input;
			
			}else {
				System.out.println("エラーです。再度入力してください");
			}
		}
		
	}
	
	public String getRandom() {
		
		String opponentHand ="";
		
		String[] opponentHands = {"r", "s", "p"};
		
		int result = (int)Math.floor(Math.random() * 3);
		
		switch(result) {
		
			case 0 -> {
				opponentHand = opponentHands[0];
			}
			case 1 -> {
				opponentHand = opponentHands[1];
			}
			case 2 -> {
				opponentHand = opponentHands[2];
			}
		}
		
		return opponentHand;
		
	}
	
	public void playGame() {
		
		String myChoice = getMyChoice();
		String opponentChoice = getRandom();
		
		HashMap<String, String> handMap = new HashMap<>();
		handMap.put("r", "グー");
		handMap.put("s", "チョキ");
		handMap.put("p", "パー");
		
		//"r"がキーとなりそれに対応した値を取得している
		System.out.println("自分の手は" + handMap.get(myChoice) + "," + "対戦相手の手は" + handMap.get(opponentChoice));
		
		if(myChoice.equals(opponentChoice)) {
			System.out.println("あいこです");
		} else if((myChoice.equals("r") && opponentChoice.equals("s")) ||
				  (myChoice.equals("s") && opponentChoice.equals("p")) ||
				  (myChoice.equals("p") && opponentChoice.equals("r"))) {
			System.out.println("あなたの勝ちです");
		} else {
			System.out.println("あなたの負けです");
		}
	}

}
