package programs;

public class SortArray {
    public static void main(String[] args) {
        int[]a={3,5,8,1,5,6,4,5,8,5,5};
        int temp=0;
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-1;j++){
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for(int g:a){
            System.out.print(" "+g);
        }
    }
}
