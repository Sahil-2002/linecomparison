public class UC3 {
    public static void main(String[] args) {
        UC1 obj1 = new UC1();
        int output1 = obj1.line1();
        UC2 obj2 = new UC2();
        int output2 = obj2.line2();
        if(output1==output2){
            System.out.println("lines are equal in length ");
        } else if (output1>output2) {
            System.out.println("line 1 if bigger ");

        }
        else {
            System.out.println("line 2 is bigger ");
        }

    }
}
