package CollectionsSample;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class LinkedHashMapSample {
	
	public static void linkedHashMap()
	{
		LinkedHashMap<String,Integer> lHashMap=new LinkedHashMap<String, Integer>();
		
		lHashMap.put("Rasheed",66);
		lHashMap.put("bannu",99);
		
		lHashMap.put("pavani",5);
		
		lHashMap.put("Nagendra",4);
		
		for(Entry<String,Integer> entry:lHashMap.entrySet())
		{
			
			System.out.println(entry);
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMapSample.linkedHashMap();
	}

}
