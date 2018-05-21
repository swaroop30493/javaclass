package Collections;

import java.util.ArrayList;
import java.util.List;

public class List_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> l = new ArrayList<String>();
		l.add("Hi");
		l.add("How");
		l.add("are");
		l.add("you");
		l.add("doing?");
		
		Object[] array = l.toArray();
		for(Object object : array) {
			System.out.println(object);
		}
		
	}

}
