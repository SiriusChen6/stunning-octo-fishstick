package Example8;

import java.util.Scanner;
public class Example8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("�������·ݣ�1-12����");
        int month = scanner.nextInt();

        switch (month) {
            case 1:
            case 2:
            case 12:
                System.out.println("���·�Ϊ������");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("���·�Ϊ������");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("���·�Ϊ�ļ���");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("���·�Ϊ�＾��");
                break;
            default:
                System.out.println("��Ч���·����롣");
                break;
        }

        scanner.close();
		    }
		
		

	}


