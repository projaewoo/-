import java.util.Scanner;

public class Input {
	private Scanner scan;
	private int count;
	private Friend [] array;
	
	public Input(Friend [] array, Scanner scan, int count) {		//Input생성자 만듬.
		this.array = array;
		this.scan = scan;
		this.count = count;		//main()에서 gotoInput()이 호출되면, count++이  됨.  
	}
	
	public void input() {				//main()에서 gotoInput()에서 호출되는 메소드.	 //Main의 member variable인 array, scan, count를 생성자 통해 넘겨받음  //넘겨받은 Main의 array, scan, count가 Input의 지역변수가 됨.
		System.out.printf("현재 10명 중 %d번째 입력입니다. %n", this.count);		//Main에서 넘겨받은 count -> Input의 생성자를 통해 Input의 멤버변수 count에 대입됨.	//그 count를 출력. 	
		System.out.print("이름 : ");		String name = this.scan.next();	//이름 입력받음.
		System.out.print("전화번호 : ");	String tel = this.scan.next();	//전화번호 입력 받음.
		System.out.println("관계 : ");		String relationship = this.scan.next();	//관계 입력받음.
		this.array[this.count - 1] = new Friend(name, tel, relationship);		//입력받은 local변수를 생성자 통해서 Friend배열에 대입.
	}
}
