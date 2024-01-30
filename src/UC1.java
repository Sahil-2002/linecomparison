import java.util.Scanner;

public class UC1 {
    public int line1()

    {

        System.out.println("lets start calculating length of line with 2 points ");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the X1 and Y1 coordinates of first point of line  ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.println("enter the X2 and Y2 coordinates of second point of line ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int root = (int) (Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        int length = (int) Math.sqrt(root);
        System.out.println("length of line is " + length);
        return length;

    }
}


