package videos.CollectionsFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

class MPerson implements Comparable<MPerson>{
	private String name;
	public MPerson(String newName){
		this.name = newName; 
	}
	
	public String toString(){
		return name;
	}

	@Override
	public int compareTo(MPerson person) {
		
		int len1 = name.length();
		int len2 = person.name.length();
		if(len1>len2){
			return 1;
		}else if(len1<len2){
			return -1;
		}else{
			//return 0;
			return name.compareTo(person.name);
		}
		//return name.compareTo(person.name);
		
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MPerson other = (MPerson) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
}

public class App08_NaturalOrding {

	
	
	public static void main(String args[]){
		
		List<MPerson> list = new ArrayList<MPerson>();
		Set<MPerson> set = new TreeSet<MPerson>();
		
		addElemens(list);
		
		Collections.sort(list);
		
		addElemens(set);
		
		displayElements(list);
		
		displayElements(set);
		
	}
	
	public static void addElemens(Collection<MPerson> coll){
		coll.add(new MPerson("Paru"));
		coll.add(new MPerson("Sindhu"));
		coll.add(new MPerson("Gopi"));
		coll.add(new MPerson("Babu"));
		
	}
	
	public static void displayElements(Collection<MPerson> col){
		for(MPerson element:col)
			System.out.println(element);
		System.out.println();
	}
	
}
