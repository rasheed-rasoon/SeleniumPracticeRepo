 package rough;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class CollectionPrograms {

public static void arryListExample()
{
ArrayList<String> aList=new ArrayList<String>();
aList.add("Rasheed");
aList.add("ahmed");
aList.add("Sheik");

System.out.println("Advanced for loop");
  
System.out.println("traverse using each loop is  ");

for(String eachValue:aList)
{
	
System.out.println(eachValue);
}
   
Iterator<String> itr=aList.iterator();

System.out.println("traversing  using iterator ");
while(itr.hasNext())
{
System.out.println(itr.next());	
}	


System.out.println("Traversing using List iterator in forward direction");
ListIterator<String> listItr=aList.listIterator();

while(listItr.hasNext())
{
System.out.println(listItr.next());	

}
System.out.println("Traversing the list in reverse direction");
ListIterator<String> listItrBack=aList.listIterator(aList.size());

while(listItrBack.hasPrevious())
{
System.out.println(listItrBack.previous());	

}
}



//add all method in collections


public static void addAllMethodList()
{
	
	
	//ArrayList 1
ArrayList<String> list1=new ArrayList<String>();
list1.add("Rasheed");
list1.add("ahmed");

list1.add("sheik");

list1.add("boby");
System.out.println("list1 size is "+list1.size());

System.out.println("list1 elements are");
for(String list1Ele:list1)
{
System.out.println(list1);
System.out.println(list1+"data is ");
}

//array list2
ArrayList<String> list2=new ArrayList<String>();
list2.add("fathima");
list2.add("baban saheb");
// adding all the elements of list1 to list2
list2.addAll(list1);
System.out.println("list 2 size is "+list2.size());
System.out.println("list2 elements are");
for(String str:list2)
{
	
System.out.println(str);
}

System.out.println("after remove index 0");
list2.remove(0);  // removing elements with index 0
list2.remove("ahmed");

System.out.println("after removing ahmed");
for(String str:list2)
{
	
System.out.println(str);
}


System.out.println("list 1 elements After removing list2 from list1");
list2.removeAll(list1);
for(String str:list1)
{
	
System.out.println(str);
}
}



public static void arrayListToHashset()
{
ArrayList<String>	list1=new ArrayList<String>();
list1.add("basheer");
list1.add("ahmed");

list1.add("rahil");

list1.add("basheer");
list1.add("basheer");

System.out.println("list1 elements are");

for(String list1Elements:list1)
{
	System.out.println(list1Elements);

}

// array elements convert in to set to remove duplicates 


Set< String> set=new HashSet<String>(list1);

System.out.println("set elements are");
for(String setElements:set)
	{
	System.out.println(setElements);
}

}

public static void sortingIpAddress()
{
	
ArrayList<String> list=new ArrayList<String>();
list.add("192.56.13.1");
list.add("192.98.13.1");
list.add("192.43.13.1");
list.add("192.43.13.2");
Collections.sort(list);



System.out.println("array elements after sorting");

for(String listElements:list)
{
System.out.println(listElements);	
}
}

public static void ReverseString()
{
//ArrayList<String> list=new ArrayList<String>();
//
//list.add("Rasheed");
////list.add("ahmed");
//list.add("sheik");
//System.out.println("Before reverse"+list);
//Collections.reverse(list);
//System.out.println(list);
//
String str="Rasheed";
ArrayList<Character> list2=new ArrayList<Character>();

for(int i=str.length()-1;i>0;i--)
{
	
list2.add(str.charAt(i));
}


for(char c:list2)
{
System.out.println(c);	
}
}

public static void CollectionClassEx()
{
List fruits=new ArrayList<String>();
Collections.addAll(fruits,"apple","orange","banana");

for(Object str:fruits)
{
System.out.println(str);	
}
//System.out.println(fruits);
System.out.println("reverse a string");

Collections.reverse(fruits);
System.out.println("list after reverse");
for(Object obj:fruits)
{
System.out.println(obj);	
}
}


public static void main(String[] args)
{
	//CollectionPrograms.arryListExample();

	//CollectionPrograms.addAllMethodList();
	//CollectionPrograms.sortingIpAddress();
	//CollectionPrograms.ReverseString();
CollectionClassEx();
}
}


