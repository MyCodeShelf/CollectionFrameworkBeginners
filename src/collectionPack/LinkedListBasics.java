package collectionPack;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListBasics {
	private LinkedList<String> data;
public LinkedListBasics() {
	// TODO Auto-generated constructor stub
	this.data = new LinkedList<String>();
}
public void storeToLinkedList(String[] arr)
{
	for(String info: arr)
		data.add(info);
}
public void iterateList()
{
	for(String individualdata : data)
		System.out.println(individualdata);
	
	for(int i = 0; i < data.size();i++)
		 System.out.println(data.get(i));
	
	data.forEach(dt -> System.out.println(dt));
	
	Iterator<String > itr = data.iterator();
	while(itr.hasNext())
		System.out.println(itr.next());
	
	
}
}
