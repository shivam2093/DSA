package Recursion.RecursionArrayList;
import java.io.*;
import java.util.*;

// get the subsequence of the 
// given string and store in the array list
public class getSubSequence {

    public static void main(String[] args) throws Exception {

    Scanner scn = new Scanner(System.in);
    String s = scn.nextLine();
    System.out.print(gss(s));
    
    }

    public static ArrayList<String> gss(String str) {
        // this is wrong to equal string
        // if(str == ""){
            
        // }
        
        if(str.equals("") == true){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        
        // or 
        
        // if(str.length() == 0){
        //     ArrayList<String> base = new ArrayList<>();
        //     base.add("");
        //     return base;
        // }
        
        char ch = str.charAt(0);
        String restos = str.substring(1);
        
        ArrayList<String> rr = gss(restos);
        ArrayList<String> mr = new ArrayList<>();
        
        for(int i = 0; i < rr.size(); i++){
            
            mr.add(rr.get(i));
            
        }
        
        for(int i = 0; i< rr.size(); i++){
            mr.add(ch + rr.get(i));
        }
        
        return mr;
        
    }

}
