    import java.io.*;
    import java.util.*;
    import java.text.*;
    import java.math.*;
    import java.util.regex.*;

    public class Solution {

        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();            
            String ans="";
            if(n%2==1){
              ans = "Weird";
            }
            else{
            
               //Complete the code
                if ((n == 2 || n == 4 || n > 20)){
                    ans = "Not Weird";
                }
                else {
                    ans = "Weird";
                } 
            }
            System.out.println(ans);
            
        }
    }