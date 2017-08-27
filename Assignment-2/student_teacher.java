package Assignments;

import java.util.*;

public class student_teacher {

	// Create 2 modes (Student, Teacher)
	// In teacher Mode, take questions, choices and answers as input.
	// The teacher can also delete a question from the set.
	// In student mode, first ask how many questions the student wants to answer.
	// Then randomly display the questions.
	// Collect the answer from that student and then display the score in the end.

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

		String q1_c1;
		String q1_c2;
		String q1_c3;
		String q1_c4;

		String q2_c1;
		String q2_c2;
		String q2_c3;
		String q2_c4;

		String q3_c1;
		String q3_c2;
		String q3_c3;
		String q3_c4;

		String q4_c1;
		String q4_c2;
		String q4_c3;
		String q4_c4;

		String q5_c1;
		String q5_c2;
		String q5_c3;
		String q5_c4;

		Scanner s = new Scanner(System.in);
		int score = 0;

		public void getQues(int n) {
			// randomly return a question. range (0-n)
			System.out.println(ques1);
			System.out.println(ques2);
			System.out.println(ques3);
			System.out.println(ques4);
			System.out.println(ques5);
		}

		public void enter_ques(int ques) {
			if (ques == 1) {
				System.out.println("Enter the question.");
				ques1 = s.nextLine();
				System.out.println("Now enter the choices for the question.");
				q1_c1 = s.nextLine();
				q1_c2 = s.nextLine();
				q1_c3 = s.nextLine();
				q1_c4 = s.nextLine();

			}
			if (ques == 2) {
				System.out.println("Enter the question.");
				ques2 = s.nextLine();
				System.out.println("Now enter the choices for the question.");
				q2_c1 = s.nextLine();
				q2_c2 = s.nextLine();
				q2_c3 = s.nextLine();
				q2_c4 = s.nextLine();

			}
			if (ques == 3) {
				System.out.println("Enter the question.");
				ques3 = s.nextLine();
				System.out.println("Now enter the choices for the question.");
				q3_c1 = s.nextLine();
				q3_c2 = s.nextLine();
				q3_c3 = s.nextLine();
				q3_c4 = s.nextLine();

			}
			if (ques == 4) {
				System.out.println("Enter the question.");
				ques4 = s.nextLine();
				System.out.println("Now enter the choices for the question.");
				q4_c1 = s.nextLine();
				q4_c2 = s.nextLine();
				q4_c3 = s.nextLine();
				q4_c4 = s.nextLine();

			}
			if (ques == 5) {
				System.out.println("Enter the question.");
				ques5 = s.nextLine();
				System.out.println("Now enter the choices for the question.");
				q5_c1 = s.nextLine();
				q5_c2 = s.nextLine();
				q5_c3 = s.nextLine();
				q5_c4 = s.nextLine();

			}
		}

		public void display_choices(int ques) {
			if (ques == 1) {

				System.out.println(q1_c1);
				System.out.println(q1_c2);
				System.out.println(q1_c3);
				System.out.println(q1_c4);
			}
			if (ques == 2) {

				System.out.println(q2_c1);
				System.out.println(q2_c2);
				System.out.println(q2_c3);
				System.out.println(q2_c4);
			}
			if (ques == 3) {

				System.out.println(q3_c1);
				System.out.println(q3_c2);
				System.out.println(q3_c3);
				System.out.println(q3_c4);
			}
			if (ques == 4) {

				System.out.println(q4_c1);
				System.out.println(q4_c2);
				System.out.println(q4_c3);
				System.out.println(q4_c4);
			}
			if (ques == 5) {

				System.out.println(q5_c1);
				System.out.println(q5_c2);
				System.out.println(q5_c3);
				System.out.println(q5_c4);
			}
		}

		public void enter_ans(int ques) {

			if (ques == 1) {
				System.out.println("Enter the answer for this question.");
				ans1 = s.nextLine();
			}
			if (ques == 2) {
				System.out.println("Enter the answer for this question");
				ans2 = s.nextLine();
			}
			if (ques == 3) {
				System.out.println("Enter the answer for this question");
				ans3 = s.nextLine();
			}
			if (ques == 4) {
				System.out.println("Enter the answer for this question");
				ans4 = s.nextLine();
			}
			if (ques == 5) {
				System.out.println("Enter the answer for this question");
				ans5 = s.nextLine();
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

		public void displayQuesChoice() {
			System.out.println(ques1);
			System.out.println(q1_c1);
			System.out.println(q1_c2);
			System.out.println(q1_c3);
			System.out.println(q1_c4);

			System.out.println(ques2);
			System.out.println(q2_c1);
			System.out.println(q2_c2);
			System.out.println(q3_c3);
			System.out.println(q4_c4);

			System.out.println(ques3);
			System.out.println(q3_c1);
			System.out.println(q3_c2);
			System.out.println(q3_c3);
			System.out.println(q3_c4);

			System.out.println(ques4);
			System.out.println(q4_c1);
			System.out.println(q4_c2);
			System.out.println(q4_c3);
			System.out.println(q4_c4);

			System.out.println(ques5);
			System.out.println(q5_c1);
			System.out.println(q5_c2);
			System.out.println(q5_c3);
			System.out.println(q5_c4);

		}

		public void student_portal() {

			int num = 0;
			Scanner s = new Scanner(System.in);

			System.out.println("Welcome to the Students portal");
			System.out.println("How many questions do you want to solve?");
			num = s.nextInt();

			displayQuesChoice();
			// TODO: FIX THE displayQuesChoice function
			// TODO: MAKE THE getques() function return a random question.

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
			int n = 0;
			System.out.println("Welcome to the Teachers portal");

			System.out.println("How many questions do you want to enter?");
			n = s.nextInt();

			for (int i = 0; i < n; i++) {
				int ques_num = 0;

				System.out.println("Please enter the question number");
				ques_num = s.nextInt();
				st.q.enter_ques(ques_num);
				st.q.enter_ans(ques_num);
			}

			System.out.println("Thank you for your patience. Exiting Teachers' portal now...");
			System.out.printf("\n\n");

			st.q.student_portal();

		} else if (choice == 2) {
			st.q.student_portal();

		} else {
			System.out.println("Wrong choice entered."); // Can provide an option to enter the choice again.
		}

	}
}
