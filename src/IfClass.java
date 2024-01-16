import java.sql.SQLOutput;
import java.util.Scanner;

public class IfClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,num;
        System.out.print("ENTER THE VALUE OF THE I =");
        i = sc.nextInt();
        System.out.print("ENTER THE VALUE OF THE NUM =");
        num = sc.nextInt();
        System.out.print("OUTPUT =");
        if(i < num){
            System.out.println("hey google");
        }else if (i > num) {
            System.out.println("goodbye");
        }else{
            System.out.println("forever");
        }
    }
}
