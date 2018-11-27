package triviaapp;

import java.util.Scanner;

public class TriviaMainApp {

	public static void main(String args[])
	{
		Scanner obj= new Scanner(System.in);
		Category category []= new Category[10];
		int choice=0;
		System.out.println("Welcome to Trivia Application");
		System.out.println("To start Trivia app. - enter one option (or special code to manage it):\r\n" + 
				"1. Art\r\n" + 
				"2. Food\r\n" + 
				"3. History\r\n" + 
				"4. Java\r\n" + 
				"5. Sport\r\n" + 
				"6. Movie\r\n" + 
				"7. Exit the application with confirmation");
		System.out.println("Enter your choice:");
		choice= obj.nextInt();
		switch(choice)
		{
		case 1:
		{
			
		}
		}
		
	}

}

