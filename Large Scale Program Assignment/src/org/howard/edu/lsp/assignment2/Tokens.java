package org.howard.edu.lsp.assignment2;
import java.util.Scanner; 
import java.util.*;
import java.io.*;
import java.util.function.Supplier;

public class Tokens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
	    int product = 1;
	    boolean loop = true;
	    while(loop == true){
	      
	      Scanner reader = new Scanner(System.in);
	      System.out.println("string?");

	      String str = reader.nextLine(); 
	      if (str.equals("Goodbye")) {
	        loop = false;
	      }
	      else{ 
	        String token = str.replaceAll("[^0-9]", "");
	        int[] tok = new int[token.length()];
	        System.out.println("Tokens");
	        for (int i = 0; i < token.length(); i++) {
	          tok[i] = token.charAt(i) - '0';
	          System.out.println(tok[i]);
	          sum += tok[i];
	          product *= tok[i];
	        }

	        System.out.println("Sum: " + sum);
	        System.out.println("Product: " + product);
	        sum = 0;
	        product = 1;
	      }
	    }
	}

}
