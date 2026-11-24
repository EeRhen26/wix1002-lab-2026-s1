package l6q1;
public class MyProfile {
    public static void main(String[] args) {
        for (int i = 1; i<=20; i++){
            System.out.println(triangular(i));
        }
    }
    public static int triangular(int n){
        int sum = 0;
        for (int i=1; i<=n; i++){
            sum = sum + i;
        }    
        return sum;
    }
}
