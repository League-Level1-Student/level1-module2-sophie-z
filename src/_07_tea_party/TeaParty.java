package _07_tea_party;

public class TeaParty {
	private String name;
	private boolean isWoman;
	private boolean isKnighted;
	
	public String welcome(String name, boolean isWoman, boolean isKnighted) {
		this.name = name;
		this.isWoman = isWoman;
		this.isKnighted = isKnighted;
		return "Hello " + name;
	}
}
