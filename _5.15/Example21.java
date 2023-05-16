import java.util.Random;
import java.util.Scanner;

public class Example21 {

    public static void main(String[] args) {
        // TODO 自动生成的方法存根
        Random random =new Random();

        Scanner scanner =new Scanner(System.in);
        System.out.print("请输入姓名：");
        String name=scanner.next();
        System.out.print("请输入年龄：");
        int age=scanner.nextInt();
        System.out.print("请输入岗位：");
        String gw=scanner.next();

        System.out.print("请输入期望工资：");
        int num=scanner.nextInt();
        System.out.println("姓名："+name+"  年龄："+age+"  岗位："+gw+"  期望工资："+num+"  实际工资："+random.nextInt(num-5000,num+5000));

    }

}