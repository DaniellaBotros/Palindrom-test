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




    public static void main(String args[]){
        Scanner myObj = new Scanner(System.in); 
        System.out.println("Enter Number");//Palindrom
        int x=myObj.nextInt();
        System.out.println(isPalindrome(x));
        myObj.close();
    }



}