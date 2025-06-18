package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	
	HashMap<String,String> dictionaryMap = new HashMap<String,String>();
	
	public Dictionary_Chapter21() {
	dictionaryMap.put("apple", "りんご");
	dictionaryMap.put("peach", "桃");
	dictionaryMap.put("banana", "バナナ");
	dictionaryMap.put("lemon", "レモン");
	dictionaryMap.put("pear", "梨");
	dictionaryMap.put("kiwi", "キウィ");
	dictionaryMap.put("strawberry", "いちご");
	dictionaryMap.put("grape", "ぶどう");
	dictionaryMap.put("muscat", "マスカット");
	dictionaryMap.put("cherry", "さくらんぼ");
	}
	
	public void research(String[] dictionaryArray) {
		
		for(String researchKey : dictionaryArray) {
			
			boolean found = false;
			
			for(String Key : dictionaryMap.keySet()) {
				
				if(researchKey.equals(Key)) {
					
					System.out.println(researchKey + "の意味は" + dictionaryMap.get(Key));
					found = true;
					//もうfor文のループをここで強制終了」という命令
					//例えば100個の単語があっても、2番目で見つかったなら、
					//3番目以降を比べる必要がない
					break;
				}
			}
			if(!found){
					System.out.println(researchKey + "は辞書に存在しません");
			}	
		}
	}	
}
