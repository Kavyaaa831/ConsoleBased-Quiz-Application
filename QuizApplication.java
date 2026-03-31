package com.GQT.JavaBasics.projects;

import java.util.Scanner;

public class QuizApplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String questions[] = {"1.Which of the following is not a Java feature? ",
				"2.What is the size of float and double in Java? ",
				"3.When an array is passed to a method, what does the method receive? ",
				"4.Which keyword is used to explicitly call a superclass constructor? ",
				"5.What is the default value of a boolean variable in Java?  ",
				"6.What is the output of System.out.println(5 + 3 * 2);?",
				"7.Which component is used to compile, debug and execute the java programs?",
				"8.Who invented Java Programming?",
				"9.Which of these cannot be used for a variable name in Java?",
				"10.What is the extension of java code files?"
		};
		String options[][] = {
			    {"A. Object-oriented", "B. Use of pointers", "C. Portable", "D. Dynamic and Extensible"},
			    {"A. 32 and 64", "B. 64 and 32", "C. 32 and 32", "D. 64 and 63"},
			    {"A. The reference of the array", "B.  A copy of the array", "C. Length of the array", "D. Copy of the first element"},
			    {"A. super", "B. this ", "C. extend", "D. parent"},
			    {"A. true", "B. false", "C. null", "D. 0"},
			    {"A. 16", "B. 10", "C. 11", "D. 13"},
			    {"A. JRE","B. JIT","C. JDK","D. JVM"},
			    {"A. Guido van Rossum","B. James Gosling","C. Dennis Ritchie","D.Bjarne Stroustrup"},
			    {"A. identifier & keyword","B. identifier","C. keyword","D. none of the mentioned"},
			    {"A. .js","B. .txt","C. .class","D. .java"}
			    };
	String correct_ans[]= {"B","A","A","A","B","C","C","B","C","D"};
	String lifeLine[]= {"1.Phonecall","2.Skip","3.Audiance poll"};
	int safe_zone[]= {400,700,1000};
	
	int user_lifeline_count=3;
	int reward=0;
	
	for(int i=0;i<questions.length;i++) {
		System.out.println();
		System.out.println(questions[i]);
		for(int j=0;j<options[i].length;j++) {
			System.out.println(options[i][j]);
		}
		
		System.out.println("\n1. A/B/C/D | 2. LifeLine | 3. Quit the game\n");
		System.out.print("Choose any one Choice : ");
		int choice = sc.nextInt();
		int user_lifeline=0;
		int ch=0;
		
		switch(choice) {
		case 1:
			System.out.print("Enter your answer : ");
			String user_input=sc.next();
	   
	        if(user_input.equalsIgnoreCase(correct_ans[i])) {
	    	  System.out.println("\u001B[32mYour answer is correct\u001B[0m\n");
	          reward+=100;
	          System.out.println("\u001B[35mYou won Rs."+reward+" for this question\u001B[0m");
	          System.out.println("---------------------------------------");
	    	  }
	        else {
	        	System.out.println("------------------------------------------");
		    	System.out.println("\u001B[31mOOPS! Your answer is wrong\u001B[0m");
		    	System.out.println("\u001B[32mCorrect answer is option : "+correct_ans[i]+"\u001B[0m");
		    	System.out.println("------------------------------------------");
	    	  if(i<=3) {
	    		  System.out.print("\u001B[31mYou Lost the game and also lost the reward earned\u001B[0m");
	    	  }
	    	  else if(i>3 && i<=6) {
	    		  System.out.print("Your final amount earned is Rs."+safe_zone[0]);
	    	  }
	    	  else if(i>6 && i<=8) {
	    		  System.out.print("Your final amount earned is Rs."+safe_zone[1]);
	    	  }
	    	  else {
	    		  System.out.print("Your final amount earned is Rs."+safe_zone[2]);
	    	  }
	    	  System.exit(0);
	    	  }
	    	  
	    	
	      break;
	    
		case 2:
			
			if(user_lifeline_count>0 && i!=8 && i!=9) {
			
			for(int l=0;l<lifeLine.length;l++) {
			if(lifeLine[l]!=null)
			   System.out.println(lifeLine[l]);
		  }
			 System.out.print("\nChoose any one choice : ");
		     user_lifeline = sc.nextInt();
		     lifeLine[--user_lifeline]=null;
		     user_lifeline_count--;
		     System.out.println("\nLifeLines left="+user_lifeline_count);
		     }
			
		     else {
		    	 if(i==8 || i==9) {
		    		 System.out.println("\nNo life lines applicable for this question");
		    		 System.out.println("\n1. A/B/C/D | 2. Quit the game\n");
		    		 System.out.print("Choose any one choice : ");
				     ch=sc.nextInt();
				      switch(ch) {
				 
				           case 1:
				            System.out.println("\nYou must answer this question");
				            
				            break;
				            
				           case 2:
					        System.out.println("Thanks for playing.");
					        System.exit(0);}
				      }
		    	 
			      else {
			           System.out.println("No life lines left:");
			           System.out.println("\n1. A/B/C/D | 2. Quit the game\n");
			           System.out.print("Choose any one choice : ");
			           ch=sc.nextInt();
			           switch(ch) {
			 
			             case 1:
			               System.out.println("\nYou must answer this question");
			            
			               break;
			            
			             case 2:
				           System.out.println("Thanks for playing.");
				           System.exit(0);}
			      }
		     }
	     
			 
		break;
		
		case 3:System.out.println("Thanks for playing.");
		System.exit(0);
		
		break;
		
		default:
			System.out.println("Invalid choice");
		}
		
		if(choice!=1   && user_lifeline!=2-1 || ch==1 ) {
			
			System.out.print("Enetr you correct answer : ");
			String user_input=sc.next();
			   
		    if(user_input.equalsIgnoreCase(correct_ans[i])) {
		    	System.out.println("\u001B[32mYour answer is correct\u001B[0m");
		        reward+=100;
		        System.out.println("\u001B[35m\nYou won Rs."+reward+"for this question\u001B[0m");
		          System.out.println("---------------------------------------");
		    	}
		    else {
		    	System.out.println("------------------------------------------");
		    	System.out.println("\u001B[31mOOPS! Your answer is wrong\u001B[0m");
		    	System.out.println("\u001B[31mCorrect answer is option : "+correct_ans[i]+"\u001B[0m");
		    	System.out.println("------------------------------------------");
		    	if(i<=3) {
		    		  System.out.print("\u001B[31mYou Lost the game and also lost the reward earned\u001B[0m");
		    	  }
		    	  else if(i>3 && i<=6) {
		    		  System.out.print("Your final amount earned is Rs."+safe_zone[0]);
		    	  }
		    	  else if(i>6 && i<=8) {
		    		  System.out.print("Your final amount earned is Rs."+safe_zone[1]);
		    	  }
		    	  else {
		    		  System.out.print("Your final amount earned is Rs."+safe_zone[2]);
		    	  }
		    	  System.exit(0);
		    	break;
		    }
		}
		
		 if(user_lifeline==2-1) {
			  System.out.println("Your question is skipped");
			  continue;
		  }	

}
}}