package basicDsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Adding final to the list - > We cant reassign the list ref to another list, However it is still mutable
		final List<String> list1 = new ArrayList<>();
		list1.add("Prashant Patil...");
		System.out.println(list1);
		
		
		
		//Below lists are Immutable, However if you reassign the ref. then it behaves as per the assignment
		List<String> list2 = Arrays.asList("XYZ","PQR","LMN","ABC");
		/*
		 * list2.add("KLM"); System.out.println(list2);
		 */
		list2 = new ArrayList<>();
		list2.add("GHJ");
		System.out.println(list2);
		 
		
		List<String> list3 = List.of("Rahul", "Chandan");
		/*
		 * list3.add("Pankaj"); System.out.println(list3);
		 */
		
		list3 = new ArrayList<>();
		list3.add("LLL");
		System.out.println(list3);

	}

}
