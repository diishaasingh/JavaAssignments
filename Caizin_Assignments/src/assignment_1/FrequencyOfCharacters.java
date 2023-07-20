package assignment_1;
import java.util.*;
public class FrequencyOfCharacters {
    static void frequency(String str) {
    	HashMap<Character,Integer> map=new HashMap<>();
    	for(int i=0;i<str.length();i++) {
    		map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
    	}
    	for(Map.Entry<Character,Integer> entry:map.entrySet()) {
    		System.out.println(entry.getKey()+": "+entry.getValue());
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     frequency("Hello World");
	}

}
