package l6q2;
public class MyProfile {
    public static void multiPrint(int n, char c){
        for (int i=1; i<=n; i++){
            System.out.print(c);
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        System.out.println("Triangle: ");
        multiPrint(1,'*');
        multiPrint(2,'*');
        multiPrint(3,'*');
        multiPrint(4,'*');
        multiPrint(5,'*');
        System.out.println("Diamond: ");
        System.out.print("  ");
        multiPrint(1,'*');
        System.out.print(" ");
        multiPrint(3,'*');
        multiPrint(5,'*');
        System.out.print(" ");
        multiPrint(3,'*');
        System.out.print("  ");
        multiPrint(1,'*');
    }
    
}
