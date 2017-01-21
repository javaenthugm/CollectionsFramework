package videos.CollectionsFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class App05_Sets {
	
	public static void main(String args[]){
		//HashSet - maintains no order
		
		
		Set<String> set = new HashSet<String>();
		if(set.isEmpty()){
			System.out.println("Set at the biggining..."+set);
			System.out.println("Adding the following elements: cat, dog, mouse, tiger and lion");
		}
		set.add("cat");
		set.add("dog");
		set.add("mouse");
		set.add("tiger");
		set.add("lion");
	
		System.out.println("Set after adding elements....");
		System.out.println(set);
		
		//LinkedHashSet - maintains the order in which the items were added
		Set<String> linkedHashet = new LinkedHashSet<String>();
		if(linkedHashet.isEmpty()){
			System.out.println("LinkedHashSet at the biggining..."+linkedHashet);
			System.out.println("Adding the following elements: cat, dog, mouse, tiger and lion");
		}
		linkedHashet.add("cat");
		linkedHashet.add("dog");
		linkedHashet.add("mouse");
		linkedHashet.add("tiger");
		linkedHashet.add("lion");
		System.out.println("LinkedHashSet after adding elements");
		System.out.println(linkedHashet);
		
		//TreeSet - maintains the natural order
		
		Set<String> treeSet = new TreeSet<String>();
		if(treeSet.isEmpty()){
			System.out.println("TreeSet at the biggining..."+linkedHashet);
			System.out.println("Adding the following elements: cat, dog, mouse, tiger and lion");
		}
		
		treeSet.add("cat");
		treeSet.add("dog");
		treeSet.add("mouse");
		treeSet.add("tiger");
		treeSet.add("lion");
		System.out.println("TreeSet after adding elements");
		System.out.println(treeSet);
		
		//Intersections 
		
		Set<String> set2 = new HashSet<String>();
		set2.add("tiger");
		set2.add("lion");
		
		Set<String> intersection = new HashSet<String>(set);
		//intersection.retainAll(set2);
		intersection.removeAll(set2);
		System.out.println(intersection);
		
		
		
		
		
		
		
	}

}
