package rough;

public class StringStringBufferStringBuilder {
	
	public static void stringExample()
	{
		String str="rasheed";
		System.out.println("string before change  "+str);
		str.concat("ahmed");
		System.out.println("string after change  "+str);
		
		
		String s="Sachin";  
		   s.concat(" Tendulkar");//concat() method appends the string at the end  
		   System.out.println(s);//will print Sachin because strings are immutable objects  
	}
	
	
	public static void StringBuffer()
	{
		
		
		StringBuffer strBuffer=new StringBuffer("rasheed");
		strBuffer.append("ahmed");
		System.out.println("String buffer value is  "+strBuffer);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringStringBufferStringBuilder.stringExample();
StringStringBufferStringBuilder.StringBuffer();  }

}



/*
String is one of the most widely used class in java programming and one of the most important topic in core java interview. If you are writing a program which prints something on console, we use String.

This tutorial is aimed to focus on major features of String class and then we will compare String vs StringBuffer vs StringBuilder.
String in Java

    String class represents character strings, we can instantiate String by two ways.
    String str = "abc"; or String str = new String ("abc");
    String is immutable in java, so its easy to share it across different threads or functions.
    When we create a String using double quotes, it first looks for the String with same value in the JVM string pool, if found it returns the reference else it creates the String object and then place it in the String pool. This way JVM saves a lot of space by using same String in different threads. But if new operator is used, it explicitly creates a new String in the heap memory.
    + operator is overloaded for String and used to concatenate two Strings. Although internally it uses StringBuffer to perform this action.
    String overrides equals() and hashCode() methods, two Strings are equal only if they have same characters in same order. Note that equals() method is case sensitive, so if you are not looking for case sensitive checks, you should use equalsIgnoreCase() method.
    A String represents a string in the UTF-16 format
    String is a final class with all the fields as final except “private int hash”. This field contains the hashCode() function value and created only when hashCode() method is called and then cached in this field. Furthermore, hash is generated using final fields of String class with some calculations, so every time hashCode() method is called, it will result in same output. For caller, its like calculations are happening every time but internally it’s cached in hash field.

String vs StringBuffer

Since String is immutable in java, whenever we do String manipulation like concat, substring etc, it generates a new String and discard the older String for garbage collection.

These are heavy operations and generate a lot of garbage in heap. So Java has provided StringBuffer and StringBuilder class that should be used for String manipulation.

StringBuffer and StringBuilder are mutable objects in java and provide append(), insert(), delete() and substring() methods for String manipulation.
StringBuffer vs StringBuilder

StringBuffer was the only choice for String manipulation till Java 1.4 but it has one disadvantage that all of its public methods are synchronized. StringBuffer provides Thread safety but on a performance cost.

In most of the scenarios, we don’t use String in multithreaded environment, so Java 1.5 introduced a new class StringBuilder that is similar with StringBuffer except thread safety and synchronization.

So if you are in a single threaded environment or don’t care about thread safety, you should use StringBuilder else use StringBuffer. See this post for performance benchmarking between StringBuffer and StringBuilder.
String vs StringBuffer vs StringBuilder

    String is immutable whereas StringBuffer and StringBuider are mutable classes.
    StringBuffer is thread safe and synchronized whereas StringBuilder is not, thats why StringBuilder is more faster than StringBuffer.
    String concat + operator internally uses StringBuffer or StringBuilder class.
    For String manipulations in non-multi threaded environment, we should use StringBuilder else use StringBuffer class.



*/