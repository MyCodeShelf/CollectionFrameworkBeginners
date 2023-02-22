package collectionPack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	List<String> abc=new 	ArrayList<String>() ;
		//abc.add("Mouli");
		//abc.add("Vikas");
		abc =  Arrays.asList(new String[] {"Mouli" , "Vikas", "ABC"});
		//Comparable
		int[] arr = {2,4,6};
		Collections.sort(abc);
		System.out.println(abc);
		
		//to iterate 
		for(String str: abc)
			System.out.println(str);
		//second way
		Iterator<String> itr = abc.iterator();
		while(itr.hasNext()) {
            // if(itr.next().equals("ABC"))
			//itr.remove();
              //// no  ConcurrentModificationexception
             
			System.out.println(itr.next());
		//itr.remove();
		}
			
		//third way 
		Enumeration e =Collections.enumeration(abc);
		while(e.hasMoreElements())
			System.out.println(e.nextElement());
//---------------------------------------------------------------------------//
		//Driver for map
		MapBasics data =new MapBasics();
		data.setData("Xavier", "Suku");
		data.setData("dps", "Kartik");
		data.iterateMap();
		

	}

}
