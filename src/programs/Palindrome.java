package programs;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int num=121;
        int rem=0;int rev=0;
        while (num!=0){
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
//        System.out.println(rev);

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter te string");
        String s = sc.next();
        char[] a = s.toCharArray();
        StringBuilder sb=new StringBuilder();
        for(int i=a.length-1;i>=0;i--){
            sb.append(a[i]);
        }
        if(s.equals(sb.toString())){
            System.out.println("Palindrome");
        }else {
            System.out.println("not palindrome");
        }
    }
}
