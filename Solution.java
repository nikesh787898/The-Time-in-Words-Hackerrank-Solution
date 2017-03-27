import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int m = in.nextInt();
        String arr [] = new String[]{"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen","twenty","twenty one","twenty two","twenty three","twenty four","twenty five","twenty six" , "twenty seven","twenty eight","twenty nine"};
        if(m == 0){
            System.out.println(arr[h]+" o' clock");
        }
        else{
            if(m < 30){
                if(m==1){
                    System.out.println("one minute past "+arr[h]);
                }
                else if(m==15){
                    System.out.println("quarter past "+arr[h]);
                }
                else{
                    System.out.println ( arr[m]  +" minutes past "+arr[h]);
                }
            }
            else if(m==30){
                System.out.println("half past "+arr[h]);
            }
            else if(m==45){
                System.out.println("quarter to "+arr[h+1]);
            }
            else {
                System.out.println(arr[60-m]+" minutes to "+arr[h+1]);
            }
        }
    }
}
