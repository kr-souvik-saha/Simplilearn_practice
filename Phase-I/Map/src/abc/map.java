package abc;

import java.util.*;

public class map {

	public static void main(String[] args) {
		// HashMap
		System.out.println("HashMap");
		HashMap<Integer, String> hm= new HashMap<Integer, String>();
		hm.put(01," String 1");
		hm.put(02," String 2");
		for(Map.Entry n:hm.entrySet()) {
			System.out.println(n.getKey()+""+n.getValue());
		}
		//Hashtable
		System.out.println("\n");
		System.out.println("HashTable");
		Hashtable<Integer, String> ht= new Hashtable<Integer, String>();
		ht.put(3," String3");
		ht.put(4," String4");
		for(Map.Entry o:ht.entrySet()) {
			System.out.println(o.getKey()+""+o.getValue());
		}
		//TreeMap
		System.out.println("\n");
		System.out.println("TreeMap");
		TreeMap<Integer, String> tm= new TreeMap<Integer, String>();
		tm.put(5," String5");
		tm.put(6," String6");
		for(Map.Entry p:tm.entrySet()) {
			System.out.println(p.getKey()+""+p.getValue());
		}
		
	}

}
