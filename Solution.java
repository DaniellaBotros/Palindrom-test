import java.util.HashMap;
import java.util.Scanner;
 class Solution {
    public static boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        
        else{
        String str_x=Integer.toString(x);
        int size=str_x.length();
        if(size==1){
            return true;
        }
       
        for(int i=0; i<(size/2);i++){
            if(!(str_x.charAt(i)==(str_x.charAt(size-1-i))) ){
                return false;
            }
        }
        return true;
        }
        

        
    }


public static int lengthOfLongestSubstring(String s) {
      
     if(s.length()==1 || s==""){
            return 1;
        }

        int size=0;
       HashMap<Character, Integer> str=new HashMap<Character,Integer>();
       int i=0;
       int start=0;
       

       while(i<s.length()){
        if(str.isEmpty()|| !(str.containsKey(s.charAt(i)))){
            str.put(s.charAt(i),i);
            i++;
        }
        else if(str.containsKey(s.charAt(i))){
            if(size<str.size()){
                size=str.size();
            }
            str.clear();
            start++;
            i=start;
        }

        if(size<str.size()){
            size=str.size();
        }



        
       }
       
       return size;

    }


    public static void main(String args[]){
        Scanner myObj = new Scanner(System.in); 
        //System.out.println("Enter Number");//Palindrom
        //int x=myObj.nextInt();
        // System.out.println(isPalindrome(x));
        System.out.println("Enter String");
        String s=myObj.nextLine();
    
        System.out.println(lengthOfLongestSubstring(s));


       
    }



}