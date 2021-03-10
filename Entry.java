
public class Entry {
	
	private String name;
	private Birthday birthday;
	private int month;
	private int day;
	
	/*
	 * this is for entering birthday
	 */
	public Entry( String name , Birthday birthday) {
		this.name = name;
		this.birthday = birthday;
	}
	/*
	 * this is for entering month and day
	 */
	public Entry( String name , int day , int month) {
		this.name = name;
		Birthday birthday = new Birthday(day, month);
		this.birthday = birthday;
	}
	
	public String getName() {
		return this.name;
	}
	
	public Birthday getBirthday() {
		return this.birthday;
	}
	
	public String toString() {
		
		return this.name + " was born on " + this.getBirthday();
	}
	
	@Override
	public boolean equals(Object obj) {
		if( this == obj) { return true; }
		else if( obj == null || this.getClass() != obj.getClass()) { return false; }
		
		Entry other = (Entry) obj;
		return this.month == other.month && this.day == other.day && this.name.equals(other.name);
	}
	
	public void setName(String n) {
		this.name = n;
	}
	
	public void setBirthday(int d, int m) {
		this.birthday = new Birthday(d, m);
	}
	
	public void setBirthday(Birthday birthday) {
		this.birthday = birthday;
	}
}
