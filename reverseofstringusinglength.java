package Stringsinjan;

public class reverseofstringusinglength {
	
		    public static void main(String[] args) {
		        String s = "mounika";
		        String rev = "";
		        for (int i = s.length() - 1; i >= 0; i--) {
		            rev = rev + s.charAt(i);
		        }
		        System.out.println("Reversed string: " + rev);
		    }
		}


