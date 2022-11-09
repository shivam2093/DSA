package Recursion.RecursionArrayList;
import java.io.*;
import java.util.*;

// 1. You are given a number n representing number of stairs in a staircase.
// 2. You are standing at the bottom of staircase. You are allowed to climb 1 step, 2 steps or 3 steps in one move.
// 3. Complete the body of getStairPaths function - without changing signature - to get the list of all paths that can be used to climb the staircase up.
// Use sample input and output to take idea about output.

// Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.

public class getStairPaths {    
        public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
          System.out.print(getStairPaths(n));
        }
    
        public static ArrayList<String> getStairPaths(int n) {
            
           if(n == 0){
               
               ArrayList<String> bans = new ArrayList<>();
               bans.add("");
              return bans;
           } 
           if(n < 0){
              ArrayList<String> bans = new ArrayList<>();
              return bans;
           }
            
            
            ArrayList<String> mm = getStairPaths(n - 1);
            ArrayList<String> ms = getStairPaths(n - 2);
            ArrayList<String> aa = getStairPaths(n - 3);
            
            ArrayList<String> mr = new ArrayList<>();
            
            for(int i = 0; i < mm.size(); i++){
                mr.add("1" + mm.get(i));
            }
              for(int j = 0; j < ms.size(); j++){
                mr.add("2" + ms.get(j));
            }
              for(int k = 0; k < aa.size(); k++){
                mr.add("3" + aa.get(k));
            }
            
            
            
            return mr;
        }
    
    }