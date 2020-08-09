public class Output {
	private Friend [] array;
	private int count;
	
	public Output(Friend[] array, int count) {		//main의 gotoOutput()메소드 호출할 때, 생성되는 생성자. (main에서 array, count를 parameter로 넘겨받음).
		this.array = array;
		this.count = count;
	}
	
	private void printLabel() {			//라벨 출력하는 메소드 (Output에서만 사용하므로 private 메소드로 선언해도 무방).
		System.out.println("\n                          <<주소록>>                     ");
		System.out.println("이름\t\t전화번호\t\t관계");
		System.out.println("------------------------------------------------------------");
	}
	public void output() {				//main에서 호출해야하므로 public메소드로 선언.
		if(this.count == 0) System.out.println("현재 회원이 한 명도 없습니다.");	//단 한번도 gotoInput()메소드가 호출되지 않았을 때, 출력하는 문장.
		else {			//main의 gotoInput()메소드가 한 번 이상 호출됐을 경우.
			this.printLabel();
			for(int i = 0 ; i < this.count; i++) {		//입력받은 횟수만큼 for문 진행.
				System.out.println(array[i]);			//Friend형 변수는 toString()을 재정의해서 변수 이름만 호출해도 인적사항 출력.
			}														//Friend형 배열도 배열이름만 호출해도 인적사항 출력되는 듯.
		}
	}
}
