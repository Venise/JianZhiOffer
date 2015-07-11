package com.offer.question42;

import java.util.Scanner;

public class Test {
    @SuppressWarnings("resource")
	public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
             if (input == null || input.length() == 0) {
                  System. out.println("");
            } else{
                  StringBuilder builder = new StringBuilder(input);
                  System. out.println(builder.reverse().toString());
            }
      }
}

