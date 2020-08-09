
import java.util.*;
public class HelloWorld{

     public static void main(String []args){
       Scanner sc=new Scanner(System.in);
        String S=sc.nextLine();
        int l=S.length();
        int max1=1;
        int max2=1;
        int curr1=1;
        int curr2=2;
        
        
        for(int i=1;i<l;i++){
            if(S.charAt(i)=='A'){
                if(S.charAt(i)==S.charAt(i-1))
                curr1++;
            }
            else if(S.charAt(i)=='?')
            curr1++;
            else
            {
                max1=Math.max(curr1,max1);
                curr1=1;
            }
            
        }
        max1=Math.max(curr1,max1);
        for(int i=1;i<l;i++){
            if(S.charAt(i)=='C'){
                if(S.charAt(i)==S.charAt(i-1))
                curr2++;
            }
            if(S.charAt(i)=='?')
            curr2++;
            
            else
            {
                max2=Math.max(curr2,max2);
                curr2=1;
            }
            
        }
        max2=Math.max(curr2,max2);
        System.out.println(Math.max(max1,max2));
     }
}
