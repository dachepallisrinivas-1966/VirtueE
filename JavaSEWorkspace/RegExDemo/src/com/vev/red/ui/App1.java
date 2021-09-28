package com.vev.red.ui;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App1 {

	public static void main(String[] args) {
		 String mobile = "9247175823";
         String mobile2 = "92471";

         
         // System.out.println(mobile.matches("[1-9][0-9]{9}"));
         // System.out.println(mobile.matches("[1-9]\\d{9}"));
         
         // System.out.println(mobile2.matches("[1-9][0-9]{9}"));
         
         Pattern mobP = Pattern.compile("[1-9][0-9]{9}");
         Matcher m1 = mobP.matcher(mobile);
         System.out.println(m1.matches());
         
         String passage = "I have to port 9247212540 into a new 9247212539";
         Matcher m2 = mobP.matcher(passage);
         System.out.println(m2.find());
	}

}
