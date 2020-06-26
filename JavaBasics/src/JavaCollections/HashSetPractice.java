package JavaCollections;

import java.util.HashSet;

public class HashSetPractice {

	public static void main(String[] args) {
		//Set removes the duplicates
		HashSet<Integer> values = new HashSet<>();
		values.add(1);
		values.add(1);
		values.add(1);
		values.add(1);
		System.out.println(values);//1
		
		//Remove duplicates with Objects?
		HashSet<HashSetHuman> persons = new HashSet<>();//Try LinkedHashSet
		persons.add(new HashSetHuman("Eric", 100));
		persons.add(new HashSetHuman("A", 1000));
		persons.add(new HashSetHuman("Eric", 100));
		
		for (HashSetHuman HashSetHuman : persons) {
			System.out.println(HashSetHuman);
		}
		
		//Solution
		HashSet<HashSetHashSetHuman2> persons2 = new HashSet<>();
		
		HashSetHashSetHuman2 dup = new HashSetHashSetHuman2("Eric", 100);
		HashSetHashSetHuman2 dup2 = new HashSetHashSetHuman2("Eric", 100);
		
		persons2.add(dup);
		persons2.add(new HashSetHashSetHuman2("A", 1000));
		persons2.add(dup2);
		
		System.out.println(dup.hashCode());
		System.out.println(dup2.hashCode());

		for (HashSetHashSetHuman2 HashSetHashSetHuman2 : persons2) {
			System.out.println(HashSetHashSetHuman2);
		}
	}
	 
}

class HashSetHuman{
	String name;
	int age;
	public HashSetHuman(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "HashSetHuman [name=" + name + ", age=" + age + "]";
	}	
}


class HashSetHashSetHuman2{
	String name;
	int age;
	public HashSetHashSetHuman2(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "HashSetHashSetHuman2 [name=" + name + ", age=" + age + "]";
	}
	//Generate Hashcode for the hashset
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
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
		HashSetHashSetHuman2 other = (HashSetHashSetHuman2) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}
