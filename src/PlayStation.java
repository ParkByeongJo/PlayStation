import java.util.Scanner;

public class PlayStation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String name;
		int age;
		double height;
		
		System.out.println("이름 입력:");
		name=scan.nextLine();
		System.out.println("나이 입력:");
		age=scan.nextInt();
		System.out.println("키 입력:");
		height=scan.nextDouble();
		
		boolean b1=(age>=13) ? true:false;
		boolean b2=(height>=130) ? true:false;
		
		System.out.println(name+" 고객님");
		System.out.println("나이 "+age+"세 이고 "+"키 "+height+"이므로");
		
		if((b1==true)&&(b2==true)) {
			System.out.println("이용가능합니다.");
		}
		
		else if((b1!=true)||(b2!=true)) {
			System.out.println("이용이 불가능합니다.");
		}
		
	}

}

