
public class BirthdayBook {
	int i;
	private int noe; 
	Entry[] entries;
		
//	BirthdayBook[] birthdaybook(Birthday birthday) {
//		BirthdayBook[] birthdayBook = new BirthdayBook[i];
//		i++;
//		return birthdayBook;
//	}
	public BirthdayBook() {
	entries = new Entry[10];
	}
	
	public void setNumberOfEntries(int n) {
		this.noe = n;
	}
	
	public int getNumberOfEntries() {
		return this.noe;
	}
	
	public Entry[] getEntries() {
		Entry[] es = new Entry[noe];
		return es;
 	}
	public String toString() {
		return "There are " + noe + " entries in the book\n";
	}
	//number11
	public boolean nameExists(String a) {
		for(i=0; i<noe; i++) {
		if( entries.name == a;) { return true }
		
		}
	}
}

