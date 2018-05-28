/* user input given number to check if its an palindrome or else loop until its palindrome*/


import java.util.*;
public class UntilPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner user_input = new Scanner(System.in);
		int n;
		System.out.println("please enter the number you want to check:");
		n = user_input.nextInt();
		String s= String.valueOf(n);
		while(!isPalindrome(s))
		{
			n = sum(n);
			System.out.println(n);
			s=String.valueOf(n);
		}

	}
	
	public static boolean isPalindrome(String s)
	{
		int i =0;
		int j = s.length()-1;
		while(i<s.length()/2)
		{
			
			if(s.charAt(i)!=s.charAt(j))
			{
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

	public static int sum(int integer)
	{
		int palindrome = integer;
		int reverse = 0;
		while(palindrome!=0)
		{
			int remainder = palindrome %10;
			reverse = reverse *10 +remainder;
			palindrome = palindrome/10;
		}
		return reverse + integer;
	}
}
