package CollectionsSample;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;



public class HashMapSample {

	public static void hashMapAddElements()
	{
HashMap<String,Integer> hMap=new HashMap<String, Integer>();
hMap.put("Rasheed",8);
hMap.put("ahmed",6);


hMap.put("sheik",21);


hMap.put("Boby",2);

for(Entry<String,Integer> entry:hMap.entrySet())
		{
	System.out.println(entry);
	
		}


//converting in to Linked hashMap to print insertion order
LinkedHashMap<String,Integer> lHashMap=new LinkedHashMap<String, Integer>(hMap);

System.out.println("elements in insertion order are ");
for(Entry<String,Integer> entry2:lHashMap.entrySet())
	
{
	System.out.println(entry2);
}

System.out.println("key value pairs are lements are ");

for(Entry<String,Integer> entry2:lHashMap.entrySet())
	
{
	System.out.println(entry2.getKey() +" : "+entry2.getValue());
}

	}
	
	public static void HashMapIterations()
	{
		HashMap<String,Integer> hMap=new HashMap<String, Integer>();
		hMap.put("Rasheed",8);
		hMap.put("ahmed",6);


		hMap.put("sheik",21);


		hMap.put("Boby",2);
		
		System.out.println("iterate using Iterator ");
		
		Iterator itr=hMap.entrySet().iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
public static void hashMapToArrayList()
{
	HashMap<String,Integer> hMap=new HashMap<String, Integer>();
	hMap.put("Rasheed",8);
	hMap.put("shiva",6);


	hMap.put("karthik",21);


	hMap.put("Balu",2);
	
	
	
	
	



}

public static void main(String args[])

{
	//HashMapSample.hashMapAddElements();	
	HashMapSample.HashMapIterations();
	
}

}

