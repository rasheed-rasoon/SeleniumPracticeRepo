package CollectionsSample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

import javax.print.DocFlavor.STRING;
import org.apache.poi.hssf.util.HSSFColor.LIGHT_YELLOW;

public class VectorSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> vector = new Vector<String>(Arrays.asList("Rasheed", "Naresh", "uday", "Sandhya"));

		for (String str : vector) {

			System.out.println(str);

		}

		List<String> list = new ArrayList<String>(vector);
		list.add("sharath");
		System.out.println("Iterate " + "Using Lambda");

		list.forEach((n) -> {
			System.out.println(n);
		});

		System.out.println("After removing Rasheed from the list");

		list.forEach((n) -> {
			System.out.println(n);
		});

		System.out.println("Using List iterator forward");

		ListIterator<String> itr2 = vector.listIterator(1);

		while (itr2.hasNext()) {

			System.out.println(itr2.next());

		}

		System.out.println("Iterate using backward");
		while (itr2.hasPrevious()) {
			System.out.println(itr2.previous());
		}
//
		
		System.out.println("Iterate forward using index");
		while (itr2.hasNext()) {

			System.out.println(itr2.nextIndex() + ":" + itr2.next());

		}
		
		System.out.println("Iterate backward using index");
		itr2.add("Prakruthi");
		itr2.add("Meenakshi");
		itr2.remove();
		while (itr2.hasPrevious()) {

			
			System.out.println(itr2.previousIndex() + ":" + itr2.previous());
			

		}
//
//
//		while (itr2.hasPrevious()) {
//
//			System.out.println(itr2.previousIndex() + ":" + itr2.previous());
//
//		}

	}

}
