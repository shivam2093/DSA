package Recursion.RecursionOnWayUp;

// 1. You are given a string str.
// 2. Complete the body of printSS function - without changing signature - to calculate and print all subsequences of str.
// Use sample input and output to take idea about subsequences.

// Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.

public class printSubSequence {
  
        public static void printSubsequence(String str, String asf){
    
    if(str.length() == 0){
        System.out.println(asf + " ");
        return;
    }
    
    char ch = str.charAt(0);
    String ros = str.substring(1);
    
    printSubsequence(ros, asf + ch);
    
    
    printSubsequence(ros, asf);
    
    }
    public static void main(String[] args) {
        printSubsequence("abc", "");
    }
}
