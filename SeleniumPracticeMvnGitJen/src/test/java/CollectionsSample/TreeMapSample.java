package CollectionsSample;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;


public class TreeMapSample {
	
	public static void treeMapAddingStringKeyElements()
	{
		TreeMap<String,Integer> treeMap=new TreeMap<>();
		treeMap.put("Rasheed",1000);
		treeMap.put("Uday",999);
		
		treeMap.put("Naresh",2222);
		treeMap.put("Sandhya",6666);
		
		treeMap.put("Meenakshi",123);
		
		for(Entry<String,Integer> entry:treeMap.entrySet())
				{
			
			System.out.println(entry.getKey()+" : "+entry.getValue());
			
				}

	}
	public static void treeMapAddingIntegerKeyElements()
	{
		TreeMap<Integer,String> treeMap=new TreeMap<>();
		treeMap.put(1000,"Rasheed");
		treeMap.put(999,"Uday");
		
		treeMap.put(2222,"Naresh");
		treeMap.put(6666,"Sandhya");
		
		treeMap.put(123,"Meenakshi");
		
		for(Entry<Integer,String> entry:treeMap.entrySet())
				{
			
			System.out.println(entry.getKey()+" : "+entry.getValue());
			
				}
		System.out.println("Converting HashMap to ArrayList");
		
		Set<Integer> keySet=treeMap.keySet();
		ArrayList<Integer> list=new ArrayList<>(keySet);
		
		for(int i:list)
		{
			System.out.println(i);
		}
		
		
		System.out.println("Converting treeMap in to arrayList");
		//Converting treeMap in to arrayList
		Collection<String> collection=treeMap.values();
		
		for(String str:collection)
		{
			
			System.out.println(str);
		}
		
		System.out.println("Converting Tree KayValue pairs in to arrayList");
		
		Set<Entry<Integer,String>> entrySet=treeMap.entrySet();
		
		for(Entry<Integer,String> entry:entrySet)
				{
			System.out.println(entry.getKey()+" :"+entry.getValue());
			
				}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		treeMapAddingIntegerKeyElements();
	}

}
