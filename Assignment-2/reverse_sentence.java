package Assignments;

import java.util.ArrayList;
import java.util.Scanner;

public class reverse_sentence {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		String str;
		System.out.println("Please enter your sentence");
		str = s.nextLine();
		String[] split = str.split(" ");
		String result = "";
		
		for (int i = split.length - 1; i >= 0; i--) {
		  result += (split[i] + " ");
		}
		System.out.println(result.trim());
	}

}
