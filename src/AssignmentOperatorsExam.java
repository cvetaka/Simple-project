import java.sql.SQLOutput;

public class AssignmentOperatorsExam {
    public static void main (String args []){
        int num1 = 10;
        int num2 = 20;

        num2 = num1;
        System.out.println(" = Output: "+ num2);

        num2+= num1;
        System.out.println(" += Output: "+num2);

        num2 -= num1;
        System.out.println(" -= Otput: "+num2);

        num2 *= num1;
        System.out.println(" *= Otput: "+ num2);

        num2 /= num1;
        System.out.println(" /= Otput: "+ num2);
    }
}
