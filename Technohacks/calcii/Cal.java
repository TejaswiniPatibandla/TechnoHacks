import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Cal {
    public static void main(String[] args){
        final String input=Samplecalc.read();
        Queue<String> operations;
        Queue<String> numbers;
        String[] num=input.split("[-+*/]");
        String[] oper=input.split("[0-9]+");
        numbers=new LinkedList<String>(Arrays.asList(num));
        operations=new LinkedList<String>(Arrays.asList(oper));
        Double res=Double.parseDouble(numbers.poll());
        while(!numbers.isEmpty()){
            String opr=operations.poll();
           Operate operate;
           switch(opr){
            case "+":
            operate=new Add();
            break;
            case "-":
            operate=new Subtract();
            break;
            case "*":
            operate=new Multiply();
            break;
            case "/":
            operate= new Divide();
            break;
            default:
            continue;
           }
           Double anum=Double.parseDouble(numbers.poll());
           res=operate.getResult(res,anum);
        }
        System.out.println(res);

    }
}
