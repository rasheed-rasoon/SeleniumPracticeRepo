package CollectionsSample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class TreeSetSample {
	
	public static void treeSetAddingElements()
	{
		
	
	
		TreeSet<Integer> treeSet=new TreeSet<Integer>();

		treeSet.add(9);

		treeSet.add(99);

		treeSet.add(77);

		treeSet.add(222);

		treeSet.add(3);

		treeSet.add(8);
		
		for(int value:treeSet)
		{
			System.out.println(value);
			
		}
		
		System.out.println("Tree set using treeset");
		
		treeSet.forEach(
				
				(n)->
				{
				System.out.println(n);	
					
				}
				);
		
	}
	
	public static void arrayListToTreeSet()
	{
		ArrayList<String> aList=new ArrayList<String>(Arrays.asList("Rasheed","ahmed","Rasheed","Rasheed","sheik"));
		
		//Before removing arrayLists
		System.out.println("Before converting to treeset");
		for(String str:aList)
		{
			System.out.println(str);
		}
		
		
		System.out.println("After converting to treeset");
		TreeSet<String> treeToList=new TreeSet<>(aList)	;
		treeToList.forEach((n)->
				
				{
			System.out.println(n);
				}	
				
				
				);
					
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TreeSetSample.treeSetAddingElements();
		TreeSetSample.arrayListToTreeSet();
}
}