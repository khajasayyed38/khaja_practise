package programs;

public class ReverseString {
    public static void main(String[] args) {
        String s="iam a java developer";
        char[] a = s.toCharArray();
        for(int i= a.length-1;i>=0;i--){
            System.out.print(a[i]);
        }
    }
}
