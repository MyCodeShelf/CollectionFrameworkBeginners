package collectionPack;

public class StoreData {
String organisation;
String name;

public StoreData(String organisation, String category) {
	this.organisation = organisation;
	this.name = category;
}
@Override
	public boolean equals(Object obj) {
		// return true if current obj name and organisation are same as compared obj name & organisation
		return ((StoreData)obj).organisation.equals(this.organisation) && ((StoreData)obj).name.equals(this.name);
	
	}
@Override
	public int hashCode() {
	
		// check for object equality .i.e equals() fn  only when current object organisation length and name length are same
	//returning sum of remainders of name & organisation length
		return (this.organisation.length()%10)+(this.name.length()%10);
	}
	
}
