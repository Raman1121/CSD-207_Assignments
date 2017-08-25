package Assignments;

import java.util.*;

public class student_teacher {

	// Create 2 modes (Student, Teacher)
	// In teacher Mode, take questions, choices and answers as input.
	// The teacher can also delete a question from the set.
	// In student mode, first ask how many questions the student wants to answer.
	// Then randomly display the questions.
	// Collect the answer from that student and then display the score in the end.

	// public void getQuestions() {
	// //To get a random question from the database.
	//
	// }
	//
	// public void enterQuestion() {
	// //To store a question.
	// //Also include the option to enter the choices and the answer.
	// }
	//
	// public void deleteQues() {
	// //Can take an integer as an input and delete the question associated with it.
	// }
	questions q = new questions();

	public class questions {
		
		String ques1 = null;
		String ques2 = null;
		String ques3 = null;
		String ques4 = null;
		String ques5 = null;

		String ans1;
		String ans2;
		String ans3;
		String ans4;
		String ans5;

		Scanner s = new Scanner(System.in);
		int score = 0;

		public String getQues(int n) {
			// randomly return a question. range (0-n)

			String s = null;
			return s;
		}

		public void enter_ques(int ques) {
			if (ques == 1) {
				System.out.println("Enter the question.");
				ques1 = s.nextLine();
			} else if (ques == 2) {
				System.out.println("Enter the question.");
				ques2 = s.nextLine();

			} else if (ques == 3) {
				System.out.println("Enter the question.");
				ques3 = s.nextLine();

			} else if (ques == 4) {
				System.out.println("Enter the question.");
				ques4 = s.nextLine();

			} else if (ques == 5) {
				System.out.println("Enter the question.");
				ques5 = s.nextLine();

			}
		}

		public void enter_choices() {
			//get the choices here.
			System.out.println("Enter the choices for this question.");
			
			
		}

		public void display_choices(String ques) {
			if (ques.equals(ques1)) {
				// display choices of ques1
			} else if (ques.equals(ques2)) {
				// display choices of ques2
			} else if (ques.equals(ques3)) {
				// display choices of ques3
			} else if (ques.equals(ques4)) {
				// display choices of ques4
			} else if (ques.equals(ques5)) {
				// display choices of ques5
			}
		}

		public String getans(String ques) {

			String warning = "You have entered a wrong choice.";

			if (ques.equals(ques1)) {
				return ans1;
			} else if (ques.equals(ques2)) {
				return ans2;
			} else if (ques.equals(ques3)) {
				return ans3;
			} else if (ques.equals(ques4)) {
				return ans4;
			} else if (ques.equals(ques5)) {
				return ans5;
			} else
				return warning;
		}
	}
	
	

	public static void main(String[] args) {
		// First create a choice to enter the student or teacher mode.
		Scanner s = new Scanner(System.in);
		student_teacher st = new student_teacher();

		int choice; // Choice of entering student or teacher portal.
		int num; // Number of questions the student wants to answer.
		System.out.println("<=== WELCOME TO THE STUDENT-TEACHER PORTAL ===>");
		System.out.println("Please select one of the follwing options:-");
		System.out.println("1. Teacher Portal");
		System.out.println("2. Student Portal");

		choice = s.nextInt();

		if (choice == 1) {
			
			System.out.println("Welcome to the Teachers portal");
			for(int i=0; i<5; i++) {
				int ques_num = 0;
				
			System.out.println("Please enter the question number");
			st.q.enter_ques(ques_num);
			//Now enter the choices and then the answer.
			
			
			}

		} else if (choice == 2) {
			// Enter student portal
			// Set a limit to the max number of questions a student can anwer. eg = 5;
			System.out.println("Welcome to the Students portal");
			System.out.println("How many questions do you want to solve?");
			num = s.nextInt();

			for (int i = 0; i < num; i++) {
				// n
				// display questions
				// call the function getQues(num) n times.
			}

		} else {
			System.out.println("Wrong choice entered."); // Can provide an option to enter the choice again.
		}

	}
}
