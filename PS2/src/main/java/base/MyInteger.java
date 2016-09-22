package base;

public class MyInteger{

	private int iValue; // that stores the int value represented by this object

	public MyInteger(int iValue) { 	//Constructor

		this.iValue = iValue;
	}

	
	public int getiValue() { // set the getter for the iValue
		return iValue;
	}


	
	public boolean isEven() {
		if (getiValue() % 2 == 0) { //checks if iValue is even, if remainder divided by 2 = 0
			return true;
		}else{
		return false;
		}
	}

	
	public boolean isOdd() {
		if (getiValue() % 2 != 0) { //checks if iValue is odd, if remainder divided by 2 != 0
			return true;
		}
		return false;
	}

	
	public boolean isPrime() {
		    for(int i=2; i < getiValue();i++) { //checks to see if iValue is prime
		        if(getiValue()%i==0)
		            return false;
		    }
		    return true;
		}


	//STATIC METHODS
	public static boolean isEven(int ivalue) { //checks if iValue is even, if remainder divided by 2 = 0
		if (ivalue % 2 == 0) {
			return true;
		}
		return false;
	}

	
	public static boolean isOdd(int ivalue) { //checks if iValue is odd, if remainder divided by 2 != 0
		if (ivalue % 2 != 0) {
			return true;
		}
		return false;
	}

	
	public static boolean isPrime(int ivalue) { //checks to see if iValue is prime
		    for(int i=2;i<ivalue;i++) {
		        if(ivalue % i==0)
		            return false;
		    }
		    return true;
		}

	//Static methods that take in MyInteger parameter
	
	public static boolean isEven(MyInteger thevalue) {
		return thevalue.isEven(); //calls isEven method
	}

	
	public static boolean isOdd(MyInteger thevalue) {
		return thevalue.isOdd(); //calls isOdd method
	}

	
	public static boolean isPrime(MyInteger thevalue) {
		return thevalue.isPrime(); //calls isPrime method
	}

	public boolean equals(int thevalue) { 	// returns true if the value in the object is equal to the specified value

		return iValue == thevalue;
	}

	
	public boolean equals1(MyInteger thevalue) { 	// returns true if the value in the object is equal to the specified value

		return thevalue.equals(thevalue.getiValue());
	}
}