package collectionPack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Stream;

import LambdaExamples.Sum;

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
		
//-----------------------------------------------------------------------------//
		//Driver for linkedlist
		LinkedListBasics lstobj = new LinkedListBasics();
		lstobj.storeToLinkedList(new String[] {"Java" , "Kotlin" , "Xtend"});
		lstobj.iterateList();

//----------------------------------------------------------------------------//
        
		//over here we have created an anonymous inner class to save from creating multiple 
		//class.java files as the sole purpose of the class was to provide implementation to
		//the abstract method of implemented sum interface 
		Sum anonymousClassobj = new Sum() {
		 	@Override
		 	public void add(int a, int b, int c) {
		 		// TODO Auto-generated method stub
		 	System.out.println(a+b+c);	
		 	}
		}; //end of anonymous inner class
		
		//same above can be done using lambda expression as shown below
		Sum anonymousImplementation = (int a ,int b ,int c)->{
			System.out.println(a+b+c);
		};
//----------------------------------------------------------------------------//
		//stream api use with created linkedlist
		List<String> one2 = new LinkedList<>(Arrays.asList("a","b","c"));
		Stream<String> onestream = one2.stream();
		//onestream.forEach(t -> System.out.println(t));
		//onestream.map(t -> t+2).forEach(t -> System.out.println(t));
		onestream.filter(t -> t.contains("a")).forEach(t->System.out.println(t));
		//STREAM API WITH MAPS
	    Map<Integer , String> mp = new LinkedHashMap<Integer , String>();
	    mp.put(1 , "Java");
	    mp.put(2, "kotlin");
		Stream<Map.Entry<Integer, String>> mpstream = mp.entrySet().stream();
		//mpstream.forEach(System.out::println);
		mpstream.forEach(entry -> System.out.println(entry.getValue()+ " "+entry.getKey()));
	}

}
