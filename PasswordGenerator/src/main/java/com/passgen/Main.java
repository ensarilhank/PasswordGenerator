package com.passgen;

import java.util.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
public class Main{

public static void main(String[] args) {
	  String CHAR_LOWER = "abcdefghijklmnopqrstuvwxyz";
      String CHAR_UPPER = CHAR_LOWER.toUpperCase();
      String NUMBER = "0123456789";
      String OTHER_CHAR = "!@#$%&*()_+-=[]?";
	  String all=CHAR_LOWER+CHAR_UPPER+NUMBER+OTHER_CHAR;

		Random rand = new Random();
	//	Scanner scanner = new Scanner(System.in);
		
	 // System.out.println("Password Length : ");
	  int length = Integer.parseInt(args[0]);
	  
	 
	  String deneme="";
	   
		for (int i = 0 ; i<length;i++){

			int PassLen = rand.nextInt(all.length());
			deneme += all.charAt(PassLen);

		}
		System.out.println(deneme);
		StringSelection selection = new StringSelection(deneme);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(selection, selection);
		System.out.println("Password Copied !");
	}



}