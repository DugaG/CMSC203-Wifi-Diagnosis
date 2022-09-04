/*
 * Class: CMSC203 
 * Instructor: Farnaz Eivazi
 * Description: This goes through steps to troubleshoot and help the user reconnect to their WiFi.
 * Due: 09/05/2022
 * Platform/compiler: Java
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Duga Gang
*/

package wifi;

import java.util.Scanner; //for user inputs
public class WifiDiagnosis
{
	public static void main(String[] args)
	{
		System.out.println("If you have a problem with internet connectivity, this WiFi diagnosis might work.");
		System.out.println("Reboot the computer and try to connect");
		System.out.println("Did that fix the problem? (Yes or No)");
		
		Scanner myscanner = new Scanner (System.in);
		
		String ans1 = myscanner.nextLine();
		if (ans1.toLowerCase().equals("yes")) //use "input.toLowerCase()" to make the input lower case and ".equals()" to compare
			{	
			myscanner.close();
			System.out.println("Done\nProgrammer: Duga Gang");
			}
		else if (!ans1.toLowerCase().equals("no")) // "!" at the beginning of the input for "not equals"
			{
			System.out.println("Invalid answer; try again\nProgrammer: Duga Gang" );
			}
		else{ // Beginning of nested if else statements
			System.out.println("Reboot the router and try to connect");
			System.out.println("Did that fix the problem? (Yes or No)");
			String ans2 = myscanner.nextLine();
			if(ans2.toLowerCase().equals("yes"))
			{
				System.out.println("Done\nProgrammer: Duga Gang");
			}
			else if (!ans2.toLowerCase().equals("no")) 
			{
				System.out.println("Invalid answer; try again\nProgrammer: Duga Gang" );
			}		
			else{
				System.out.println("Make sure the cables connecting the router are firmly plugged in and power is getting to the router");
				System.out.println("Did that fix the problem? (Yes or No)");
				String ans3 = myscanner.nextLine();
				if(ans3.toLowerCase().equals("yes"))
				{
					System.out.println("Done\nProgrammer: Duga Gang");
				}
				else if (!ans3.toLowerCase().equals("no")) 
				{
					System.out.println("Invalid answer; try again\nProgrammer: Duga Gang" );
				}
				else{
					System.out.println("Move the computer closer to the router and try to connect");
					System.out.println("Did that fix the problem? (Yes or No)");
					String ans4 = myscanner.nextLine();
					if(ans4.toLowerCase().equals("yes"))
					{
						System.out.println("Done\nProgrammer: Duga Gang");
					}
					else if (!ans4.toLowerCase().equals("no")) 
					{
						System.out.println("Invalid answer; try again\nProgrammer: Duga Gang" );
					}
					else{
						System.out.println("Contact your ISP");
						System.out.println("Done\nProgrammer: Duga Gang");
						} 	
					}	
				}
			}
	}
}