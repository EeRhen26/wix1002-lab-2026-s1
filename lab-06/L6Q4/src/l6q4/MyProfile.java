package l6q4;
public class MyProfile {
    public static void main(String[] args) {
        int num = GCD(24,8);
        System.out.println("GCD for 24 and 8 is "+num);
        num = GCD(200,625);
        System.out.println("GCD for 200 and 625 is "+num);
    }
    public static int GCD(int a, int b){
        int remainder = 0, lower = 0, higher = 0, ans = 0;
        if(a > b){
            remainder = a%b;
            lower = remainder;
            higher = b;
        }
        else if(b > a){
            remainder = b%a;
            lower = remainder;
            higher = a;
        }
        while(remainder != 0){
            remainder = higher % lower;
            higher = lower;
            lower = remainder;
        }
        ans = higher;
        return ans;
    }
}
