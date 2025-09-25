package programs;

import java.util.HashMap;
import java.util.Map;

public class NumberOfOccurence {
    public static void main(String[] args) {
//        String s="iam a java developer";
//        char[] a = s.replace(" ","").toCharArray();
        int[]a={1,4,8,1,4,7,2,6,6,8,7,7};
        Map<Integer,Integer> map=new HashMap<>();
        for(int g:a){
            if(!map.containsKey(g)){
                map.put(g,1);
            }else {
                Integer v = map.get(g);
                map.put(g,v+1);
            }
        }
        System.out.println(map);
    }
}
