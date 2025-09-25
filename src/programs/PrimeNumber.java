package programs;

public class PrimeNumber {
    public static void checkPrimeNumber(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.print(" "+n);
        }
    }

    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            checkPrimeNumber(i);
        }
    }
}
