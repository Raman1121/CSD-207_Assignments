package Assignments;

import java.io.*;
import java.util.*;

public class count_objects_variables {

	public static int object_count = 0;
	public static int variable_count = 0;

	public static void main(String[] args) {

		String code;
		String next_word;
		int num;
		Scanner s = new Scanner(System.in);
		ArrayList<String> var_list = new ArrayList<>(1);
		ArrayList<String> obj_list = new ArrayList<>(1);
		String ans = null;
		String word;
		System.out.println("Enter the number of lines in the code");
		num = s.nextInt();
		System.out.println("Enter the code line by line");
		for(int i=0; i<num; i++) {
			code = s.nextLine();
			StringTokenizer token = new StringTokenizer(code, " ");
			
			String[] split = code.split(" ");
			for(int j=0; j<split.length; j++) {
				if(split[j].equals("new")) {
					obj_list.add(split[j-2]);
				}
				if(split[j].equals("int") || split[j].equals("String") || split[j].equals("float") || split[j].equals("double") || split[j].equals("ArrayList")) {
					var_list.add(split[j+1]);
				}
			}
			
			while(token.hasMoreTokens()) {
				word = token.nextToken();
				if(word.equals("new")) {
					object_count++;
				}else if(word.equals("int") || word.equals("String") || word.equals("float") || word.equals("double") || word.equals("ArrayList")) {
					variable_count++;
					
				}
				//if(word.equals("String") || word.equals("int") || word.equals("double") || word.equals("float"))
			}
		}
		System.out.printf("The number of variables and objects are %d  %d", variable_count, object_count);
		System.out.println("The objects in the program are: ");
		for(int k=0; k<obj_list.size(); k++) {
			System.out.println(obj_list.get(k));
		}
		System.out.println("The variables in the program are: ");
		for(int l=0; l<var_list.size(); l++) {
			System.out.println(var_list.get(l));
		}
	
	}
}
