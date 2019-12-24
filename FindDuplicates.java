package packCoreJava;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Character, Integer> map_Repetition_str = new HashMap<Character, Integer>();
		String str = "Hi Welcome to CTS";
		//int countOfChar = 0;
		char char_str[] = str.toLowerCase().toCharArray();
		for(char ch:char_str){
			//System.out.println("The characters are "+ch);
			if(map_Repetition_str.containsKey(ch)){
				System.out.println("get method from Map "+map_Repetition_str.get(ch));
				map_Repetition_str.put(ch, map_Repetition_str.get(ch)+1);
			}
			else{
				map_Repetition_str.put(ch, 1);
			}
		}
		System.out.println(map_Repetition_str.values());
		System.out.println(map_Repetition_str.keySet());
		System.out.println(map_Repetition_str.toString());
	}

}
