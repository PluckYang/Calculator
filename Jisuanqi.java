import java.util.Scanner;
public class Jisuanqi {
    public static void main(String[] args) {
        Double op1;
        Double op2;
        String op;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个操作数(回车结束)");
        op1=sc.nextDouble();
        System.out.println("请输入运算符(回车结束)");
        op=sc.next();
        System.out.println("请输入第二个操作数(回车结束)");
        op2=sc.nextDouble();
        System.out.print("结果是：");
        switch(op) {
            case "+":System.out.println(op1+op2);break;
            case "-":System.out.println(op1-op2);break;
            case "*":System.out.println(op1*op2);break;
            case "/":System.out.println(op1/op2);break;
        }
    }
}