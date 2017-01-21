package videos.CollectionsFramework;

import java.util.List;
import java.util.ArrayList;

public class App01_ArrayList {
	
	public static void main(String args[]){
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		//Adding
		numbers.add(10);
		numbers.add(100);
		numbers.add(40);
		
		System.out.println("Iteration #1");
		for(int i=0;i<numbers.size();i++){
			System.out.println(numbers.get(i));
		}
		//Last item - faster than the first item removal
		numbers.remove(numbers.size()-1);
		//Remove first item is VERY VERY Slow! (if the list is bigger)
		numbers.remove(0);
		
		System.out.println("\nIteration #2");
		for(Integer value:numbers){
			System.out.println(value);
		}
		
		//Correct way of creating an ArrayList 
		List<Integer> values = new ArrayList<Integer>();
	}

}
