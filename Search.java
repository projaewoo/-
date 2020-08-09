import java.util.Scanner;

public class Search {
	private Friend [] array;
	private int count;
	private Scanner scan;
	
	public Search(Scanner scan, Friend[] array, int count) {	//main에서 gotoSearch()메소드 호출될 때, Search 생성자 생성되고, main에서 넘겨준 scan, array, count를 parameter로 받음.
		this.scan = scan;					
		this.array = array;
		this.count = count;
	}
	
	public void search() {			//검색 메소
		if(this.count == 0) System.out.println("회원이 한 명도 없습니다.");	//main에서 gotoSearch()호출 될 때, count == 0이면(gotoInput()이 한번도 호출되지 않았을 때) 출력하는 문장. 
		else {				//count >= 1일
			Friend searchFriend = null;			//search()안의 local variable 초기화.
			System.out.print("검색하실 회원 이름 : ");
			String searchname = this.scan.next();		//회원의 이름을 String형 searchname에 저장.
			for(int i = 0 ; i < this.count; i++) {			//입력받은 횟수(count)만큼 for문 반복.
				if(this.array[i].getName().equals(searchname))	//배열의 이름을 가져와서 입력받은 이름(searchname)과 일치하는지 비교.
					searchFriend = this.array[i];			//일치한다면 searchFirend에 배열을 대입. 
			}
			if(searchFriend == null) System.out.println("Friend Not Found"); //일치하는 이름이 없을때, 출력하는 문장.			
			else System.out.println(searchFriend);	//일치하는 친구의 이름, 번호, 관계를 Friend에서 재정의한 toString()호출해서 출력.
		}
	}
	
}
