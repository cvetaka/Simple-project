public class TernaryOperatorExam {
    public static void main (String args[]){
        int num1, num2;
        num1 = 25;

        num2 = (num1 == 10)? 100:200;
        System.out.println(" num2 :"+num2);

        num2 = (num1 == 25)? 100:200;
        System.out.println(" num2 :"+num2);

        num2 = (num1 >= 10)? 100:200;
        System.out.println(" num2 :"+num2);

        num2 = (num1 >= 25)? 100:200;
        System.out.println( " num2 :"+num2);

        num2 = ( num1 >= 30)? 100:200;
        System.out.println(" num2 : "+num2);

        num2 = (num1 <= 10)? 100:200;
        System.out.println(" num2 : "+num2);

        num2 = ( num1 <=30)? 100:200;
        System.out.println(" num2 : "+num2);
    }
}
