package Example8;

import java.util.Scanner;
public class Example8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("请输入月份（1-12）：");
        int month = scanner.nextInt();

        switch (month) {
            case 1:
            case 2:
            case 12:
                System.out.println("该月份为冬季。");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("该月份为春季。");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("该月份为夏季。");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("该月份为秋季。");
                break;
            default:
                System.out.println("无效的月份输入。");
                break;
        }

        scanner.close();
		    }
		
		

	}


