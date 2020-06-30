package intermediateJavaTut;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class PlayingWithList {
	public static void main(String[] args) {
		String stuff[]= {"lmao","lol","lamfao","issa mood","flex"};
		
		List<String> theList= new LinkedList<String>();
		theList=Arrays.asList(stuff);
		List<String> theList1=new ArrayList<String>();
		theList1=Arrays.asList(stuff);
		Collections.sort(theList);
		Collections.reverse(theList1);
		System.out.println(theList1);
		Collections.sort(theList,Collections.reverseOrder()) ;
		System.out.println(Collections.frequency(theList,"lol"));
		System.out.println(Collections.disjoint(theList, theList1));
		
	}
	}

