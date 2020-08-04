import java.util.Scanner;

import javax.swing.*;


public class BankingApplication {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in); 
		
		JFrame f;
	    f=new JFrame();   
	    String userName = JOptionPane.showInputDialog(f,"Enter User Name: "); 
	    String accountNum = JOptionPane.showInputDialog(f,"Enter Pin: "); 
	    
		/*
		System.out.println("Enter your user name:\n ");
		String userName = s.nextLine();
		System.out.println("Enter your pin number: \n");
		String accountNum = s.nextLine();
		*/ 
		
		BankAccount obj1 = new BankAccount(userName, accountNum);
		obj1.showMenu();
		
	}
	
}


