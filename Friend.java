public class Friend {
	private String name, tel, relationship;

	public Friend(String name, String tel, String relationship) {		//Friend 생성자 만듬.
		this.name = name;
		this.tel = tel;
		this.relationship = relationship;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getRelationship() {
		return relationship;
	}

	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}

	@Override
	public String toString() {			//Friend의 참조변수만 호출하면 Friend의 Member variable이 출력되게 하는 메소드.
		return String.format("%s\t\t %s\t\t %s",
							this.name, this.tel, this.relationship);
	
	
	}
}