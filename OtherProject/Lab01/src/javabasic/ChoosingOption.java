package javabasic;
// Exercise 6.1: ChoosingOption.java

import javax.swing.*;
public class ChoosingOption {

	public static void main(String[] args) {
// 		Yes/ No/ Cancel button
//		int option = JOptionPane.showConfirmDialog(null, 
//				"Do you want to change to the first class ticket?");
//		
//		JOptionPane.showMessageDialog(null, "You've chosen: "
//				+ (option == JOptionPane.YES_OPTION ? "Yes" : "No"));
//		
//		System.exit(0);
//      ----------------------------------------------------------		
//		Only two options: "I do" and "I don't"
//		If want only two options: "Yes" and "No"
//		, change options = {"Yes", "No"}
		
		String[] options = {"I do", "I don't"};
        int iOption = JOptionPane.showOptionDialog(null, 
        		"Do you want to change to the first class ticket?", 
        		null, 
        		JOptionPane.YES_NO_OPTION, 
        		JOptionPane.QUESTION_MESSAGE, 
        		null, 
        		options, 
        		options[0]);
        
        JOptionPane.showMessageDialog(null, "You've chosen: "
				+ (iOption == JOptionPane.YES_OPTION ? options[0] : options[1]));
	}

}
