// BinaryAndHexaNum.java 
// Code by Peter Stackebrandt

/* // Task by Kofler:Java.-2022, 3.7. W6 p. 73
	- save hex number AA00 and binary number 10101111 to int vars

	// Task by PS
	- compile and run file from console
*/

// javac Main.class
// java Main

public class BinaryAndHexaNum{
	public static void main(String[] args){
		System.out.println("binaryAndHexaNum.java started");

		int fromBin = 0b10101111;
		int fromHex = 0xAA00;
		
		System.out.println("     Binary representation: " + Integer.toBinaryString(fromBin) + " Decimal representation: " + fromBin);
		System.out.println("Hexadecimal representation: " + Integer.toHexString(fromHex) + " Decimal representation: " + fromBin);
	}
}