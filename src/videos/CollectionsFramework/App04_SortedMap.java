package videos.CollectionsFramework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;


public class App04_SortedMap {
	
	public static void main(String args[]){
		Map<Integer, String> hashMap = new HashMap<Integer, String>();
		Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		Map<Integer, String> treeHasMap = new TreeMap<Integer, String>();
		System.out.println("HashMap...");
		testMap(hashMap);
		System.out.println("\nLinkedHashMap...");
		testMap(linkedHashMap);
		System.out.println("\nTreeMap...");
		testMap(treeHasMap);
		
		
	}

	private static void testMap(Map<Integer, String> map){
		map.put(5, "Five");
		map.put(8, "Eight");
		map.put(2, "Two");
		map.put(1, "One");
		map.put(3, "Three");
		map.put(9, "Nine");
		
		for(Integer key : map.keySet()){
			System.out.println(key+":"+map.get(key));
		}
	}
	

}
