package collectionPack;

import java.util.HashSet;
import java.util.Set;
import java.util.*;
public class SetBasics {

	Set<String> movies = new HashSet<String>();
	public SetBasics() {
		// TODO Auto-generated constructor stub
	}
	public void addtoSet(String[] data)
	{
		for(String title: data)
		movies.add(title);
		
	}
	public void iterateSet()
	{
		//for each iteration 
		for(String title: movies)
			System.out.println(title);
		//Using iterator interface
		Iterator setitr = movies.iterator();
		while(setitr.hasNext())
			System.out.println(setitr.next());
	}
}
