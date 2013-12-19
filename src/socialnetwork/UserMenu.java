package socialnetwork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserMenu implements Menu{

	@Override
	public int show() {
		// TODO Auto-generated method stub
		BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("1.Search");
//		System.out.println("2.Add friend");
		System.out.println("2.Share sth. on your wall");
		System.out.println("3.Sign out");
		

		int input;
		try {
			input = Integer.parseInt(bufferRead.readLine());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			input = -999;
		}
		
		return input;
	}
	
	
	
}