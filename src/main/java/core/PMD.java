package core;

import java.math.BigInteger;
// https://pmd.github.io/pmd-5.1.3/
public class PMD {
	
	
	// BigIntegerInstantiation
	public void BigInteger() {
		BigInteger bi1 = BigInteger.ONE;//BigInteger("1"); 	// reference BigInteger.ONE
												// instead
		BigInteger bi2 = BigInteger.ZERO;//new BigInteger("0"); 	// reference BigInteger.ZERO
												// instead
		BigInteger bi3 = BigInteger.ZERO;//new BigInteger("0.0"); // reference BigInteger.ZERO
												// instead
		BigInteger bi4;
		bi4 = BigInteger.ZERO;//new BigInteger("0"); 				// reference BigInteger.ZERO instead
		System.out.println(bi1 + ", " + bi2 + ", " + bi3 + ", " + bi4);
	}

}
