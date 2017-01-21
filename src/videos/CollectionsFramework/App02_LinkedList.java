package videos.CollectionsFramework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App02_LinkedList {

	public static void main(String args[]) {
		List<Integer> arrayList = new ArrayList<Integer>();
		List<Integer> linkedList = new LinkedList<Integer>();

		doTimings("ArrayList", arrayList);
		doTimings("LinkedList", linkedList);
	}

	private static void doTimings(String type, List<Integer> list) {
		for (int i = 0; i < 1E5; i++) {
			list.add(i);
		}
		long start = System.currentTimeMillis();

		//Adding items ate the end
		//ArrayList is faster compared to LinkedList
		for(int i=0;i<1E5;i++){
			list.add(i);
		}
		
	
		//Adding items elsewhere
		//Arraylist is very slow compared to LinkedList
		for(int i=0;i<1E5;i++){
			list.add(0,i);
		}
	
		
		long end = System.currentTimeMillis();
		
		System.out.println("Time taken "+ (end-start) +" ms for " + type);
	}

}
