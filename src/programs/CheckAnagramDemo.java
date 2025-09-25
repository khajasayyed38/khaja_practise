package programs;

import java.util.Arrays;

public class CheckAnagramDemo {
    public static void main(String[] args) {
        System.out.println(checkAnagram("SILENT","listen"));
    }
    public static boolean checkAnagram(String s,String s2){
        char[] a1 = s.toLowerCase().toCharArray();
        char[] a2 = s2.toLowerCase().toCharArray();
        if(a1.length!=a2.length){
            return false;
        }
            Arrays.sort(a1);
            Arrays.sort(a2);
            return Arrays.equals(a1,a2);

    }
}
