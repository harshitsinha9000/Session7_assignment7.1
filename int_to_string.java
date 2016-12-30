//assignment 7.1
package java_session_7;

import java.util.Scanner;

public class int_to_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		String s = null;
		String instance;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		number=sc.nextInt();
		
		
		
		s=s.valueOf(number);
		System.out.println("converted value of String to an integer ="+s+"and it's type ="+s.getClass().getName());
		
	}

}
