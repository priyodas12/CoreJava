package basic;

import java.util.Arrays;
/*
 * for "." use "\\." ;
 * for non-numbers "\\D"
 */

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		String comp="Apple   Amazon   Facebook  Google Intuit";
		//for multiple white space
		String [] outputComp=comp.split("\\s+");
		Arrays.stream(outputComp).forEach(a->System.out.println(a));
	}

}
