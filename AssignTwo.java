import java.util.Scanner;

public class AssignTwo
{
    public static void main(String []args){
        System.out.println("Enter the valur of x and y");
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println("before swapping numbers:");

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("After swapping numbers: "+ x +" " + y);
}

}
