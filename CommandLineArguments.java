package com.day6;

public class CommandLineArguments {

	public static void main(String[] args) {
		 System.out.println("Command-Line arguments are");

		 if(args.length == 1) {
			 int n = Integer.parseInt(args[0]);
			 int fact=1;
			 for(int i=1;i<=n; i++) {
				 fact*=i;
			 }
			 System.out.println(fact);
		 }
		 else if(args.length == 2) {
			 int n1 = Integer.parseInt(args[0]);
			 int n2 = Integer.parseInt(args[1]);
			 int ans1 = n1-n2;
			 if(ans1<0) {
				 int fact=1;
				 for(int i=1;i<=(ans1 * -1); i++) {
					 fact*=i;
				 }
				 System.out.println(fact);
			 }
			 else {
				 int fact=1;
				 for(int i=1;i<=ans1; i++) {
					 fact*=i;
				 }
				 System.out.println(fact);
			 }
			 
		 }
		 else if(args.length >2) {
			 System.out.println("Error");
		 }

	}

}
