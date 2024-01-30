import java.util.Scanner;

public class UC2 extends UC1 {
    public int line2() {

        System.out.println("lets start calculating length of 2nd line with 2 points ");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the X1 and Y1 coordinates of first point of line  ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.println("enter the X2 and Y2 coordinates of second point of line ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int root = (int) (Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        int length2 = (int) Math.sqrt(root);
        System.out.println("length of line is " + length2+"\n");
        return length2;

    }

    public static void main(String[] args) {
        UC1 obj1 = new UC1();
int output1 = obj1.line1();

        UC2 obj2 = new UC2();
      int output2 = obj2.line2();

       if(output1==output2){
           System.out.println("lines are equal in length ");
       }
       else{
           System.out.println("lines are not equal in length ");
       }
       }

    }


