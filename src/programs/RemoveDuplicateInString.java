package programs;

import java.util.HashSet;

public class RemoveDuplicateInString {
    public static void main(String[] args) {
        String s= "madamm";
        char[] a = s.toCharArray();
        char[]v= new char[a.length-1];
//        HashSet<Character> set = new HashSet<>();
//        char[] a = s.toCharArray();
//        for(char h:a){
//            set.add(h);
//        }
//        System.out.println(set);
        int k=0;

        for(int i=0;i<a.length-1;i++){
            boolean alreadyexist=false;
            for(int j=i+1;j<a.length-1;j++){
                if(a[i]==a[j]){
                    alreadyexist=true;
                    break;
                }
            }
            if(!alreadyexist){
                v[k]=a[i];
                k++;
            }
        }
      for(char h:v){
          System.out.println(h);
      }
    }
}
