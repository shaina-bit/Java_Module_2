package Java_Module_2;

public class continueEx {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            if(i==3){
                System.out.println("Skipping i = " + i);
                continue;
            }
            System.out.println("i = " + i);
        }
    }
}
