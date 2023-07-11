import java.util.Scanner;
public class Samplecalc {
    public static String read(){
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter the expression");
        String input=Sc.nextLine();
        Sc.close();
        return input;
    }
}
