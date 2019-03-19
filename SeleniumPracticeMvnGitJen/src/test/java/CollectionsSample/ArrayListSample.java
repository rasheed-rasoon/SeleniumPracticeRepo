package CollectionsSample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListSample {
	public static void arrayListInitializeTypes()
	{
		
	//Initialize type 2
		ArrayList<String> aList=new ArrayList<String>(Arrays.asList("fathima","Hazarath","Vaheeda","LalBeebi","pavani"));
		
			System.out.println(aList);
		
			
			
			//initialize type 2
			ArrayList<String> aList2=new ArrayList<String>();
			//adding list of elements
			
			aList2.add("rasheed");
			aList2.add("ahmed");
			aList2.add("sheik");
			aList2.add("boby");
			
			//iterate using for eachLoop
			System.out.println("iterate using for eachLoop");
			for(String str:aList2)
			{
				System.out.println(str);
				
			}
			
			
			//using nCopies
			ArrayList<Integer> aList3=new ArrayList<Integer>(Collections.nCopies(10,10));
			
			for(int i:aList3)
			{
				System.out.println(i);
			}
	}
	
	
	public static void ArrayListInerationTypes()
	{
		ArrayList<String> aList=new ArrayList<String>();
		//adding list of elements
		
		aList.add("rasheed");
		aList.add("ahmed");
		aList.add("sheik");
		aList.add("boby");
		
		
		
		//Iterate using lambda expressions
		
		System.out.println("Iterate using Lambda expression");
	aList.forEach(
			
			(n)->System.out.println(n)
			
			);
		
		//iterate using for eachLoop 
		System.out.println("Itearting using for each loop");

		for(String str:aList)
		{
			System.out.println(str);
			
		}
		
		//iterating using normal for loop
		System.out.println("Array list iteration using normal for loop");
		for(int i=0;i<aList.size();i++)
		{
			
			System.out.println(aList.get(i));
		}
		
		//Itearting using while loop
		
		System.out.println("Itearting using while loop");
		int count =0;
		while(aList.size()>count)
		{
		System.out.println(aList.get(count));	
			
		count++;		
		}
		
		System.out.println("iterate using iterator");
		Iterator<String> itr=aList.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		//"iterate using List Iterator"
		System.out.println("iterate using List Iterator");
		ListIterator<String> lItr=aList.listIterator();
		while(lItr.hasNext())
		{
			
			System.out.println(lItr.next());
		}
		
		
		//using enumerator
		System.out.println("Iteartor using enumerator");
		Enumeration<String> eNum=Collections.enumeration(aList);
		
		while(eNum.hasMoreElements())
		{
			
			System.out.println(eNum.nextElement());
		}
		
		
	}
	
	
public static void arrayListSorting()
{
	
	
	//Sorting of arralList Integer
	System.out.println("Sorting of arralList Integer");
ArrayList<Integer>	numbers=new ArrayList<Integer>(Arrays.asList(8,81,46,21,190,101));

//ArrayList elements Before sorting
System.out.println("ArrayList elements Before sorting");
int count=0;
while(numbers.size()>count)
{
	System.out.println(numbers.get(count));
count ++;	
}


System.out.println("ArrayList elements Before sorting");
Collections.sort(numbers);
System.out.println("ArrayList elements After sorting");

for(int i:numbers)
{
System.out.println(i);	
}


//Sorting of arralList String
System.out.println("Sorting of arralList String");

System.out.println("String arrayList before sorting");
ArrayList<String> names=new ArrayList<String>();
names.add("Rasheed");
names.add("Bannu");
names.add("Sharath");
names.add("sheik");

for(String name:names)
{
	System.out.println(name);
	}

System.out.println("String arrayList after sorting");

Collections.sort(names);

Enumeration<String> eNum=Collections.enumeration(names);

while(eNum.hasMoreElements())
{
	System.out.println(eNum.nextElement());
	
}


}


public static void removeDuplicatesInArraylist()
{
	ArrayList<String> aList=new ArrayList<String>(Arrays.asList("Rasheed","ahmed","Rasheed","Rasheed"));
	
	//Before removing arrayLists
	System.out.println("Before removing arrayLists");
	for(String str:aList)
	{
		System.out.println(str);
	}
	
	//after removing arrayLists
	System.out.println("after removing arrayLists");
	HashSet<String> hSet=new HashSet<String>(aList);
	 
	for(String str:hSet)
	{
		
		System.out.println(str);
	}
}


public static void sortArrayList()
{
ArrayList<String> aList=new ArrayList<String>(Arrays.asList("Rasheed","Bannu","Fathima","Nagendra"));

System.out.println("Before sorring the elements of arrayList are");
for(String str:aList)
{
System.out.println(str);

}

Collections.sort(aList);


System.out.println("ArrayList elements after sorting are");
int count=0;
while(aList.size()>count)
{
System.out.println(aList.get(count));
count++;
}



//Sorting arrayList Integers 

System.out.println("Sorting arrayList integers");
System.out.println("ArrayList elements before sorting");
ArrayList<Integer> aList2=new  ArrayList<Integer>();

aList2.add(88);
aList2.add(5);aList2.add(112);
aList2.add(21);

aList2.add(32);
aList2.add(1);

Enumeration<Integer> eNum=Collections.enumeration(aList2);

while(eNum.hasMoreElements())
{
	
System.out.println(eNum.nextElement());

}
System.out.println("ArrayList elemnets after sorting");
Collections.sort(aList2);
Enumeration<Integer> eNum2=Collections.enumeration(aList2);

while(eNum2.hasMoreElements())
{
	
System.out.println(eNum2.nextElement());

}

System.out.println("Sorting arrayList in Descending order");

Collections.reverse(aList2);

Iterator<Integer> itr=aList2.iterator();
while(itr.hasNext())
{
	
System.out.println(itr.next());

}
}
public static void sortArrayListDescendingOrder()
{
ArrayList<Integer> aList=new ArrayList<Integer>(Arrays.asList(90,87,112,96,7,9));

ListIterator<Integer> itr=aList.listIterator();
System.out.println("elements before sorting in to descending order");
while(itr.hasNext())
{
	System.out.println(itr.next());
}

System.out.println("ArrayList after sorting in descending order");

Collections.sort(aList,Collections.reverseOrder());


Iterator<Integer> itr2=aList.iterator();

while(itr2.hasNext())
{
	System.out.println(itr2.next());}


}
	public static void arrayListBasicMethods()
	{
		ArrayList<String> aList=new ArrayList<String>();
		//adding list of elements
		
		aList.add("rasheed");
		aList.add("ahmed");
		aList.add("sheik");
		aList.add("boby");
		
		//iterate using for eachLoop
		System.out.println("iterate using for eachLoop");
		for(String str:aList)
		{
			System.out.println(str);
			
		}
		
		//iterate using iterator
		
		
		System.out.println("iterate using iterator");
		Iterator<String> itr=aList.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		//"iterate using List Iterator"
		System.out.println("iterate using List Iterator");
		ListIterator<String> lItr=aList.listIterator();
		while(lItr.hasNext())
		{
			
			System.out.println(lItr.next());
		}
		//add element at specific position

		
		aList.add(0,"Bannu");
		System.out.println("iterate using for eachLoop after adding element bannu at 1st position");
		for(String str:aList)
		{
			System.out.println(str);
			
		}
		
		//remove elements from the arraylist
		
		System.out.println("all the elements before removing ");
		
		
		for(String str:aList)
		{
			System.out.println(str);
			
		}
		
		//removing element besed on object
		
		aList.remove("rasheed");
		//removing element based on index
		
		
		System.out.println("All the elements after remove");
		aList.remove(0);
		for(String str:aList)
		{
			System.out.println(str);
			
		}
	
	}
	public static void AppendCollectionElementsToArrayList()
	{
	ArrayList<Integer> aList1=new ArrayList<Integer>(Arrays.asList(100,102,102,103,104,105));
	System.out.println("arrayList1 elements are");
	for(int k:aList1)
	{
		System.out.println(k);
	}
	System.out.println("ArrayList2 elements are");
	ArrayList<Integer>  aList2=new ArrayList<Integer>(Arrays.asList(106,107,108,109));
	for(int j:aList2)
	{
		System.out.println(j);
	}
	aList1.addAll(aList2);
	System.out.println("ArrayList2 elements append to ArrayList1 ,So elements after copying from ArrayList1 to ArrayList2");
	
	for(int k:aList1)
	{
		System.out.println(k);
	}
	
	
	System.out.println("adding List elements to ArrayList");
	
	List<String> list=new ArrayList<String>();
	list.add("rasheed");
	list.add("ahmed");
	list.add("sheik");
	
	System.out.println("List Elements are");
	
	for(String str:list)
	{
		System.out.println(str);
	}
	ArrayList<String> aList=new ArrayList<String>(Arrays.asList("Rafiq","rahil","Nadeem","Chinnu"));
	
	System.out.println("ArrayList elements are");

	int count=0;
	while(aList.size()>count)
	{
		System.out.println(aList);
		count ++;
	}
	{
		
		System.out.println("Adding list elements to ArrayList");
		
		aList.addAll(list);
		
		System.out.println("ArrayList Elements after adding list elements are");
		for(String str:aList)
		{
			
			System.out.println(str);
			
		}
		
	}
	}
	public static void arrayToArrayList()
	{
		
		//
		
		//List<Element> ele
	//	ArrayList<Integer> aList=new ArrayList<Integer>(arr);
		   
	}
	
	
	public static void arrayListSize()
	{
		ArrayList<String> aList=new ArrayList<String>();
		//adding list of elements
		
		aList.add("rasheed");
		aList.add("ahmed");
		aList.add("sheik");
		aList.add("boby");
		System.out.println("List size is "+ aList.size());
		
		
		
		
	}
	
	public static void arrayListCloneMethod()
	{
		
		ArrayList<String> aList=new ArrayList<String>();
		//adding list of elements
		
		aList.add("rasheed");
		aList.add("ahmed");
		aList.add("sheik");
		aList.add("boby");
		//System.out.println("List size is "+ aList.size());
		
		ArrayList<String> aList2=(ArrayList<String>)aList.clone();
		
		aList.remove("rasheed");
		
		System.out.println("arraylist after remove rasheed from the list");
		for(String str:aList)
		{
			
			System.out.println(str);
		}
		
		
		System.out.println("arraylist2 after remove rasheed from the list");
		for(String str:aList2)
		{
			
			System.out.println(str);
		}
		
		
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayListSample.arrayListBasicMethods();
		
		//ArrayListSample.arrayListInitializeTypes();
		//ArrayListSample.ArrayListInerationTypes();
		//ArrayListSample.arrayListSorting();
		//ArrayListSample.removeDuplicatesInArraylist();
		//ArrayListSample.sortArrayList();
		
		//ArrayListSample.sortArrayListDescendingOrder();
		ArrayListSample.AppendCollectionElementsToArrayList();
		//ArrayListSample.arrayListSize();
	
		ArrayListSample.arrayListCloneMethod();
	}

}
