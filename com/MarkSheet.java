package rays.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class MarkSheet implements Comparable<MarkSheet> {
	public String rollNo;
	public String fname;
	public String lname;
	private int phy;
	private int chem;
	private int maths;

	public MarkSheet() {
//		System.out.println("Default");
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getPhy() {
		return phy;
	}

	public void setPhy(int phy) {
		this.phy = phy;
	}

	public int getChem() {
		return chem;
	}

	public void setChem(int chem) {
		this.chem = chem;
	}

	public int getMaths() {
		return maths;
	}

	public void setMaths(int maths) {
		this.maths = maths;
	}

	@Override
	public int compareTo(MarkSheet o) {
		return this.rollNo.compareTo(rollNo);

	}
public static void main(String[] args) {
	MarkSheet m=new MarkSheet();
	System.out.println("Testing");
	

}
}
