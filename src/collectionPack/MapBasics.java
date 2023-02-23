package collectionPack;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import static java.util.Map.entry;

@FunctionalInterface
interface PlaceCommonData{
	public void print(String str);
}


public class MapBasics {
 
	Map<String , String> studentData = new  HashMap<String , String>();
	
	//creating a map with data in one line //allows only 10 entries
	Map<String , String> student = Map.of("xavier" , "Ajay" , "dps" , "Sanchit");
	
	//creating a map of more than 10 entries in one line
	Map<String , String> studentinfo2 = Map.ofEntries(entry("xavier" , "manju"), entry("dps" , "sallu"));
	
	public void setData(String school , String name)
	{
	   studentData.put(school, name);
	}
	public void iterateMap()
	{
		//using lambda expression implemented a abstract method of functional interface.
		PlaceCommonData stepInfo = (p) -> System.out.println(p);
	    
		stepInfo.print("iterate using iterator");
		//iterate using iterator
		Iterator<Map.Entry<String , String>> itr = studentData.entrySet().iterator();
		while(itr.hasNext())
		{
			Map.Entry<String, String> entry = itr.next();
			System.out.println(entry.getKey() + " "+ entry.getValue());
			
		}
		stepInfo.print("iterate using for each");
		//iterate using for each
		for(Map.Entry<String, String> entry2 : studentData.entrySet())
			System.out.println(entry2.getKey() + " "+entry2.getValue());
		stepInfo.print("iterate using keyset and keyvalue");
		//iterate using keyset and keyvalue
		for(String str : studentData.keySet())
			System.out.print(str + " ");
		for(String str : studentData.values())
			System.out.println(str);
		
		//for each lambda
		studentData.forEach((k , v) -> System.out.println(k + "  "+v));
		
		//looping over keys
		for(String sc : studentData.keySet())
			System.out.println(sc + " "+ studentData.get(sc));
			
	}
	//test storage of objects in map
	public Map<StoreData, String> addtomap(StoreData []store)
	{
		Map<StoreData, String > data = new LinkedHashMap<>();
		for(StoreData o:store)
		data.put(o,"SampleData");
		
		return data;
	}
	
}
