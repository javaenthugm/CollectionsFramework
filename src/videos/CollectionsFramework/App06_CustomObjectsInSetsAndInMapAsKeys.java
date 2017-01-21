package videos.CollectionsFramework;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

class Person{
	private int id;
	private String name;
	public Person(int id, String name){
		this.id=id;
		this.name=name;
	}
	
	public String toString(){
		return "{ ID: "+id+", Name: "+name+"}";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}

public class App06_CustomObjectsInSetsAndInMapAsKeys {
	
	public static void main(String args[]){
		Person p1 = new Person(1, "Gopi");
		Person p2 = new Person(2, "Sindhu");
		Person p3 = new Person(3, "Paru");
		Person p4 = new Person(2, "Sindhu");
		
		
		Map<Person, Integer> lMap = new LinkedHashMap<Person, Integer>();
		lMap.put(p1, 1);
		lMap.put(p2, 2);
		lMap.put(p3, 3);
		lMap.put(p4, 4);
		
		for(Person p : lMap.keySet())
			System.out.println(p+":"+lMap.get(p));
		

		Set<Person> lSet = new LinkedHashSet<Person>();
		lSet.add(p1);
		lSet.add(p2);
		lSet.add(p3);
		lSet.add(p4);
		
		/*Set<Person> tSet = new TreeSet<Person>();
		tSet.add(p1);
		tSet.add(p2);
		tSet.add(p3);
		tSet.add(p4);*/
		
		
		
		System.out.println(lSet);
		

	}

}
