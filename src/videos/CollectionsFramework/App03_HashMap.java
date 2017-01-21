package videos.CollectionsFramework;

import java.util.HashMap;
import java.util.Map;

public class App03_HashMap {
	
	public static void main(String args[]){
		
		//Map Doesn't maintain any order;
		//Can contain duplicate values;
		//Cannot have duplicate keys. If you add an item with the same key 
		//-the second key will override the value of the first key-value;
	
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(5, "Five");
		map.put(8, "Eight");
		map.put(2, "Two");
		map.put(1, "One");
		map.put(3, "Three");
		map.put(9, "Nine");
		
		for(Map.Entry<Integer, String> entry: map.entrySet()){
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key+":"+value);
		}
	}

}
