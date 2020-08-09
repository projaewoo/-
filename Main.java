import java.util.Scanner;

public class Main {
	private int count;					//Main에서 자주 쓰일 변수들을 member variable로 선
	private Scanner scan;
	private Friend [] array;
	
	public Main() {				//Constructor
		this.count = 0;					//Member variable 초기		
		this.scan = new Scanner(System.in);
		this.array = new Friend[10];
	}
	
	public static void main(String[] args) {		//Main클래스의 main메소
		Main m = new Main();						//heap에 Main을 생성. stack의 m에 Main의 주소 저장.
		do {
			int choice = m.showMenu();			//Main의 showMenu의 반환값 choice를 local variable choice에 저장.
			if(choice == 4) break;					//사용자가 4를 입력했을 경우, main() 정
			m.process(choice);							//Main의 public Method인 process를 주소로 접근 //choice에 맞는 메소드로 이동.  
		}while(m.count < m.array.length);		//Main의 Member변수 < Main의 Member변수 array의 길이일 경우, while반복.
		System.out.println("Program is Over");	//array.length만큼 돌고 난 뒤, 문장 출력.
	}
	
	private void process(int choice) {			//choice를 parameter로 받아서 choice에 해당하는 메소드로 이동하게 하는 메소드.
		switch(choice) {
		case 1 : gotoInput();	break;
		case 2 : gotoSearch();	break;
		case 3 : gotoOutput();	break;
		}
	}
	private void gotoInput() {				//choice가 1일 경우 실행되는 메소드.
		this.count++;							
		Input input = new Input(this.array, this.scan, this.count);		//Input생성자 만듬.
		input.input();			//Input의 public 메소드 input을 주소로 호출.
	}
	private void gotoSearch() {			//choice가 2일 경우 실행되는 메소드.
		Search search = new Search(this.scan, this.array, this.count);		//Search생성자 만듬.
		search.search();		//Search의 public 메소드 search를 주소로 호출.
	}
	private void gotoOutput() {			//choice가 3일 경우  실행되는 메소드.
		Output output = new Output(this.array, this.count);		//Output생성자 만듬.
		output.output();		//Output의 public 메소드 output을 주소로 호출.
	}
	private int showMenu() {			//choice하기 전, 메뉴를 보여주는 메소드.
		System.out.println("\n                              <<주소록 관리프로그램>>");
		System.out.println("1. 추가                     2. 검색                  3. 목록보기                 4. 종료");
		System.out.print("선택 :");
		int choice = scan.nextInt();			//사용자의 입력값을 choice로 받음.
		return choice;							//choice를 반환함. 
	}
}
