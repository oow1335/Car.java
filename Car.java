public class Car {
	//  creating new data member
	public String make;
	public int year;

/* ----------------------------------------------------------------- */
// contains three constuctors
Car () {
	make = "Unknown";
	year = 2015;
	}

Car (String thisMake) {
	this();
	make = thisMake;
	}

Car (String thisMake, int thisYear) {
	make = thisMake;
	year = thisYear;
	}
// Prints the value of the data members of the given object
public String toString() {
	String desc = "Make: " + make + " Year: " + year;
	return desc;
	}
}
