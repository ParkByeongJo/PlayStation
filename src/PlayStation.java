import java.util.Scanner;

public class PlayStation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String name;
		int age;
		double height;
		
		System.out.println("�̸� �Է�:");
		name=scan.nextLine();
		System.out.println("���� �Է�:");
		age=scan.nextInt();
		System.out.println("Ű �Է�:");
		height=scan.nextDouble();
		
		boolean b1=(age>=13) ? true:false;
		boolean b2=(height>=130) ? true:false;
		
		System.out.println(name+" ����");
		System.out.println("���� "+age+"�� �̰� "+"Ű "+height+"�̹Ƿ�");
		
		if((b1==true)&&(b2==true)) {
			System.out.println("�̿밡���մϴ�.");
		}
		
		else if((b1!=true)||(b2!=true)) {
			System.out.println("�̿��� �Ұ����մϴ�.");
		}
		
	}

}

