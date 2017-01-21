package videos.CollectionsFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StringLengthComparator implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		int len1 = s1.length();
		int len2 = s2.length();
		if(len1>len2){
			return 1;
		}else if(len1 < len2 ){
			return -1;
		}
		
		return 0;
	}
	
}

public class App07_SortingLists {
	
	public static void main(String args[]){
		List<String> animals = new ArrayList<String>();
		animals.add("cat");
		animals.add("ant");
		animals.add("zebra");
		animals.add("dog");
		
		Collections.sort(animals,new StringLengthComparator());
		for(String s:animals)
			System.out.println(s);
		
		
		List<Integer> nums = new ArrayList<Integer>();
		nums.add(7);
		nums.add(2);
		nums.add(3);
		nums.add(19);
		
		Collections.sort(nums);
		for(Integer i:nums)
			System.out.println(i);
	}

}
