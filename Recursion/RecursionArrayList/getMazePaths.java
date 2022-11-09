package Recursion.RecursionArrayList;

import java.io.*;
import java.util.*;

// 1. You are given a number n and a number m representing number of rows and columns in a maze.
// 2. You are standing in the top-left corner and have to reach the bottom-right corner. Only two moves are allowed 'h' (1-step horizontal) and 'v' (1-step vertical).
// 3. Complete the body of getMazePath function - without changing signature - to get the list of all paths that can be used to move from top-left to bottom-right.
// Use sample input and output to take idea about output.

// Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.

public class getMazePaths {
    
        public static void main(String[] args) throws Exception {
    
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        
        System.out.print(getMazePaths(0 , 0 , n - 1 , m - 1));
    
    
        }
    
        // sr - source row
        // sc - source column
        // dr - destination row
        // dc - destination column
        public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr > dr || sc > dc){
            ArrayList<String> bans = new ArrayList<>();
            return bans;
        }    
        if(sr == dr && sc == dc){
            ArrayList<String> bans = new ArrayList<>();
            bans.add("");
            return bans;
        }
        
            
            
            ArrayList<String> first = getMazePaths(sr , sc + 1 , dr , dc);
            ArrayList<String> second = getMazePaths(sr + 1, sc, dr , dc);
            
            ArrayList<String> mr = new ArrayList<>();
            
            for(int i = 0; i < first.size(); i++){
                mr.add("h" + first.get(i));
            }
            
            for(int i = 0; i < second.size(); i++){
                mr.add("v" + second.get(i));
            }
            
            return mr;
        }
    
    }   
