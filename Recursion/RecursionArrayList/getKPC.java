package Recursion.RecursionArrayList;

import java.io.*;
import java.util.*;
//Question
// 1. You are given a string str. The string str will contains numbers only, where each number stands for a key pressed on a mobile phone.
// 2. The following list is the key to characters map :
//     0 -> .;
//     1 -> abc
//     2 -> def
//     3 -> ghi
//     4 -> jkl
//     5 -> mno
//     6 -> pqrs
//     7 -> tu
//     8 -> vwx
//     9 -> yz
// 3. Complete the body of getKPC function - without changing signature - to get the list of all words that could be produced by the keys in str.
// Use sample input and output to take idea about output.

// Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.

public class getKPC {
    public static void main(String[] args) throws Exception {

Scanner scn = new Scanner(System.in);
    String mm = scn.nextLine();
    
        System.out.print(getKPC(mm));
    }
  static String[] myarr = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    
    public static ArrayList<String> getKPC(String str) {
        
    if(str.length() == 0){
        ArrayList<String> bans = new ArrayList<>();
        bans.add("");
        return bans;
    }
        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> rr = getKPC(ros);
        ArrayList<String> mr = new ArrayList<>();
        
        String code = myarr[ch - '0'];
        
        for(int i = 0; i < code.length(); i++){
            char c = code.charAt(i);
            for(int j = 0; j < rr.size(); j++){
                mr.add(c + rr.get(j));
            }
        }
        
        
        return mr;
    }


    
}
