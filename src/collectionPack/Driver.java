package collectionPack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

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
		//Storing objects as key and analyzing the behhaviour
		StoreData one = new StoreData("BMW", "Cars");
		StoreData two = new StoreData("Vector" ,"Tools");
		StoreData three = new StoreData("BMW" , "Cars");
		StoreData[] store = {one , two ,three};
		if(one.hashCode()== three.hashCode())
			System.out.println("same hash value and now check the equals function");
		else
			System.out.println("Hashes are not same. No need to check equals for further evaluation");
		data.addtomap(store).forEach((StoreData , String)->System.out.println(StoreData.name + " "+StoreData.organisation+" "+String));
		
		//TreeMap
		TreeMap<String, String> sorteddefaultmap = new TreeMap<>();
		//LinkedHashMap
		LinkedHashMap<String, String> maintaininsertionordermap = new LinkedHashMap<>();
		for(StoreData obj : store)
			{sorteddefaultmap.put(obj.name, obj.organisation);
		    maintaininsertionordermap.put(obj.name, obj.organisation);}
		//
//---------------------------------------------------------------------------//
		//Driver for set
		SetBasics setdata = new SetBasics();
		setdata.addtoSet(new String[] {"Batman", "Spiderman","Loki", "Avengers"});
		setdata.iterateSet();
		//treeset for storing in sorted way
		TreeSet<String> defaultsorted = new TreeSet<>();
		//linkedhashset to preserve the insertion order
	    LinkedHashSet<String> insertionorder = new LinkedHashSet<>();
	    
			
		for (String string :new String[] {"Batman", "Spiderman","Loki", "Avengers"} ) {
			defaultsorted.add(string);
			insertionorder.add(string);
		}
		System.out.println(defaultsorted);
		System.out.println(insertionorder);
		

	}

}
