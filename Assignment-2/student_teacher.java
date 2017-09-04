package Assignments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class student_teacher {
	
	static int score;

	// Create 2 modes (Student, Teacher)
	// In teacher Mode, take questions, choices and answers as input.
	// The teacher can also delete a question from the set.
	// In student mode, first ask how many questions the student wants to answer.
	// Then randomly display the questions.
	// Collect the answer from that student and then display the score in the end.

	questions q = new questions();

	public class questions {

		String ques1 ;
		String ques2 ;
		String ques3 ;
		String ques4 ;
		String ques5 ;

		int ans1;
		int ans2;
		int ans3;
		int ans4;
		int ans5;

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
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		public void enter_ques(int ques) throws IOException {   //Allows to enter the question along with the choices.
			if (ques == 1) {
				System.out.println("Enter the question.");
				ques1 = br.readLine();
				System.out.println("Now enter the choices for the question.");
				q1_c1 = br.readLine();
				q1_c2 = br.readLine();
				q1_c3 = br.readLine();
				q1_c4 = br.readLine();

			}
			if (ques == 2) {
				System.out.println("Enter the question.");
				ques2 = br.readLine();
				System.out.println("Now enter the choices for the question.");
				q2_c1 = br.readLine();
				q2_c2 = br.readLine();
				q2_c3 = br.readLine();
				q2_c4 = br.readLine();
			}
			if (ques == 3) {
				System.out.println("Enter the question.");
				ques3 = br.readLine();
				System.out.println("Now enter the choices for the question.");
				q3_c1 = br.readLine();
				q3_c2 = br.readLine();
				q3_c3 = br.readLine();
				q3_c4 = br.readLine();

			}
			if (ques == 4) {
				System.out.println("Enter the question.");
				ques4 = br.readLine();
				System.out.println("Now enter the choices for the question.");
				q4_c1 = br.readLine();
				q4_c2 = br.readLine();
				q4_c3 = br.readLine();
				q4_c4 = br.readLine();
			}
			if (ques == 5) {
				System.out.println("Enter the question.");
				ques5 = br.readLine();
				System.out.println("Now enter the choices for the question.");
				q5_c1 = br.readLine();
				q5_c2 = br.readLine();
				q5_c3 = br.readLine();
				q5_c4 = br.readLine();
			}
		}


		public void enter_ans(int ques) {

			if (ques == 1) {
				System.out.println("Enter the answer for this question.");
				ans1 = s.nextInt();
			}
			if (ques == 2) {
				System.out.println("Enter the answer for this question");
				ans2 = s.nextInt();
			}
			if (ques == 3) {
				System.out.println("Enter the answer for this question");
				ans3 = s.nextInt();
			}
			if (ques == 4) {
				System.out.println("Enter the answer for this question");
				ans4 = s.nextInt();
			}
			if (ques == 5) {
				System.out.println("Enter the answer for this question");
				ans5 = s.nextInt();
			}
		}

		public void check_ans(int ques, int ans) {

			if(ques == 1) {
				if(ans == ans1) {
					score++;
				}
			}
			if(ques == 2) {
				if(ans == ans2) {
					score++;
				}
			}
			if(ques == 3) {
				if(ans == ans3) {
					score++;
				}
			}
			if(ques == 4) {
				if(ans == ans4) {
					score++;
				}
			}
			if(ques == 5) {
				if(ans == ans5) {
					score++;
				}
			}
		}
		
		public void get_score() {
			System.out.printf("Your score is %d", score);
		}

		public void displayQuesChoice(int n) {

			Random rand = new Random();
			Scanner s = new Scanner(System.in);
			int ans;

			for (int i = 0; i < n; i++) {
				int rand_int = 0;
				rand_int = rand.nextInt(n) + 1;

				if (rand_int == 1) {
					System.out.println(ques1);
					System.out.println(q1_c1);
					System.out.println(q1_c2);
					System.out.println(q1_c3);
					System.out.println(q1_c4);
					System.out.printf("\n");
					System.out.println("Enter the answer...");
					ans = s.nextInt();
					check_ans(rand_int, ans);
					//Call the function to check the answer and update the score here. 
					
				}

				if (rand_int == 2) {
					System.out.println(ques2);
					System.out.println(q2_c1);
					System.out.println(q2_c2);
					System.out.println(q2_c3);
					System.out.println(q2_c4);
					System.out.print("\n");
					System.out.println("Enter the answer...");
					ans = s.nextInt();
					check_ans(rand_int, ans);
					//Call the function to check the answer and update the score here.
				}
				
				if(rand_int == 3) {
					System.out.println(ques3);
					System.out.println(q3_c1);
					System.out.println(q3_c2);
					System.out.println(q3_c3);
					System.out.println(q3_c4);
					System.out.print("\n");
					System.out.println("Enter the answer...");
					ans = s.nextInt();
					check_ans(rand_int, ans);
					//Call the function to check the answer and update the score here.
				}
				
				if(rand_int == 4) {
					System.out.println(ques4);
					System.out.println(q4_c1);
					System.out.println(q4_c2);
					System.out.println(q4_c3);
					System.out.println(q4_c4);
					System.out.print("\n");
					System.out.println("Enter the answer...");
					ans = s.nextInt();
					check_ans(rand_int, ans);
					//Call the function to check the answer and update the score here.
				}
				
				if(rand_int == 5) {
					System.out.println(ques5);
					System.out.println(q5_c1);
					System.out.println(q5_c2);
					System.out.println(q5_c3);
					System.out.println(q5_c4);
					System.out.print("\n");
					System.out.println("Enter the answer...");
					ans = s.nextInt();
					check_ans(rand_int, ans);
					//Call the function to check the answer and update the score here.
				}
			}
		}

		public void student_portal() {

			int num = 0;
			Scanner s = new Scanner(System.in);

			System.out.println("Welcome to the Students portal");
			System.out.println("How many questions do you want to solve?");
			num = s.nextInt();

			displayQuesChoice(num);
			get_score();
		}
	}

	public static void main(String[] args) throws IOException {
		
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

			for (int i = 1; i <= n; i++) {
				
				st.q.enter_ques(i);
				st.q.enter_ans(i);
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
