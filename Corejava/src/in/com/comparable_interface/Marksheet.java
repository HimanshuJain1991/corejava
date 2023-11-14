package in.com.comparable_interface;

public class Marksheet implements Comparable<Marksheet> {
	public String rollNo;
	public String name;
	public int marks;
	public Marksheet(String rollNo,String name,int marks) {
	this.rollNo=rollNo;
	this.name=name;
	this.marks=marks;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return rollNo+" "+name+" "+marks;
	}
	
	@Override
	public int compareTo(Marksheet m) {
		// TODO Auto-generated method stub
		return (this.marks-m.marks);
	}

}
