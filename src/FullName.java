import java.util.*;
public class FullName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner user_input = new Scanner(System.in);
		String First_Name;
		System.out.println("please enter your first name:");
		First_Name = user_input.nextLine();
		
		String Last_Name;
		System.out.println("please enter your last name:");
		Last_Name  = user_input.nextLine();
		
		String Full_Name;
		Full_Name = First_Name + " " + Last_Name;
		System.out.println("you are " + Full_Name);
		

	}

}
