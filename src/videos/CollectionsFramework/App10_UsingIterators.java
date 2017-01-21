package videos.CollectionsFramework;

import java.util.LinkedList;
import java.util.ListIterator;

public class App10_UsingIterators {
	
	public static void main(String args[]){
		
		LinkedList<String> animals = new LinkedList<>();
		animals.add("zebra");
		animals.add("cat");
		animals.add("lion");
		animals.add("dog");
		animals.add("fox");
		
		/*//Using ListIterator 
		//Modify the list while iterating through it - by removign
		Iterator<String> iter = animals.iterator();
		while(iter.hasNext()){
			String s = iter.next();
			System.out.println(s);
			if(s=="cat")
				iter.remove();
		}

		System.out.println();
		
		//You cannot remove item while iterating 
		//Can't modify the list while iterating
		for(String animal:animals){
			System.out.println(animal);
		
		}*/
		
		System.out.println("--------------");
		
		//Using ListIterator 
		//You can add items (add()) while iterator through it and you can go to previous() item
		//Modify the list while iterating through it
		
		ListIterator<String> lIter = animals.listIterator();
		while(lIter.hasNext()){
			String s = lIter.next();
			System.out.println(s);
			if(s=="cat"){
				lIter.remove();
				lIter.add("catty");
			}
		}
		
		System.out.println();
		for(String animal:animals){
			System.out.println(animal);
		
		}
		
	}

}
