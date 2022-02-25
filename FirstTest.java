package HelloWorld.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 * @author vmuralimohanarao
 *
 */

public class FirstTest {
	public static void main(String args[]) {
		System.out.println("Java Util Collections --> List --> ArrayList");
		System.out.println("############################################");
		
		List<String> list = new ArrayList<>();

		list.add("c");
		list.add("b");
		list.add("a");

		//sorting collections
		Collections.sort(list);
		
		//print the list
		System.out.println("(1) Printing list as-is");
		System.out.println(list);
		
		//traverse the list using for loop and print
		System.out.println("(2) using for loop by index");
		for (int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("(3) using for loop for objects");
		for(Object element : list) {
		    System.out.println(element);
		}
		
		//traverse using Iterator and while loop to print list
		System.out.println("(4) using Iterator and while loop");
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		//converting array to list
		System.out.println("(5) converting array to list");
		String[] values = new String[]{ "one", "two", "three" };
		List<String> list1 = (List<String>) Arrays.asList(values);
		System.out.println(list1);
		System.out.println("####################################");
		
		List<Car> cars = new ArrayList<>();

		cars.add(new Car("Volvo V40" , "XYZ 201845", 5));
		cars.add(new Car("Citroen C1", "ABC 164521", 4));
		cars.add(new Car("Dodge Ram" , "KLM 845990", 2));

		Comparator<Car> carBrandComparator = new Comparator<Car>() {
		    @Override
		    public int compare(Car car1, Car car2) {
		        return car1.brand.compareTo(car2.brand);
		    }
		};

		//Collections.sort(list, carBrandComparator);
		
	}
}
