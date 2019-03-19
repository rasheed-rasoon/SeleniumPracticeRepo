package rough;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class ProgramsOnExcelData {
	
	
	public static void readDat() throws FileNotFoundException
	{
		HashMap<String,Integer> hMap=new HashMap<String, Integer>();
		hMap.put("Rasheed",123);
		
		hMap.put("sheik",456);
		
		hMap.put("Ahmed",789);
		hMap.put("Rasheed",98);
		System.out.println("key value pairs using for each loop");
		for(Entry<String,Integer> entry:hMap.entrySet())
		{
			System.out.println(entry);
			
			
		}
		System.out.println("keys are");
		for(Entry<String, Integer> entry:hMap.entrySet())
		{
		System.out.println(entry.getKey());
		//System.out.println(entry.getValue());
			
			
		}
		System.out.println("values  are");
		for(Entry<String, Integer> entry:hMap.entrySet())
		{
		System.out.println(entry.getValue());
		//System.out.println(entry.getValue());
			
			
		}
		
		
		System.out.println("using iterator");
	Iterator<Entry<String,Integer>> itr=hMap.entrySet().iterator();
	
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ProgramsOnExcelData.readDat();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
