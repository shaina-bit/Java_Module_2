package Java_Module_2;
public class positiveNegativeZero {
    public static void main(String[] args) {
        int num=-5;
        String result= (num>0)? "Positive" : (num<0) ? "Negative" : "Zero";
        System.out.println("The number" + num + "is" + result);
    }
}
