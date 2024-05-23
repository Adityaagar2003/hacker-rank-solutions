import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("================================");

    for(int i=1;i<4;i++){
    String s=new String();
    s=sc.next();
    int a=sc.nextInt();
    System.out.print(s);
    for(int j=0;j<15-s.length();j++){
        System.out.print(" ");

    }

    if(a==0){
    System.out.print("000");
        
    }
    else if(a>99){
    System.out.print(a);
        
    }
    else if(a>9&&a<100){
    System.out.print("0"+a);
        
    }else{
    System.out.print("00"+a);
        
    }
        System.out.println();

    }
    System.out.println("================================");

    
    }
}
