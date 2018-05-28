/* take user input of a sentence and print the last second word*/

import java.util.*;
public class LastSecondWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner user_input = new Scanner(System.in);
		String sentence;
		System.out.println("Please enter the sentence you would like to find the last second word for:");
		sentence = user_input.nextLine();
		// if we use next() we only get the first word of the sentence we give, so we need to use nextLine()
		String[] bits = sentence.split(" ");
		String lastword = bits[bits.length-2];
		System.out.println(lastword);
	}

}
