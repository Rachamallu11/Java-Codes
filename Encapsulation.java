package package1;

class cinema{
	
	
	
	
    private int HeroAge;
	private int HeroineAge;
	private String name;
	private String character;
	
	
	public int getHeroAge() {
		return HeroAge;
	}
	public void setHeroAge(int heroAge) {
		HeroAge = heroAge;
	}
	public int getHeroineAge() {
		return HeroineAge;
	}
	public void setHeroineAge(int heroineAge) {
		HeroineAge = heroineAge;
     }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCharacter() {
		return character;
	}
	public void setCharacter(String character) {
		this.character = character;
	}
	
}

public class Encapsulation {

	public static void main(String[] args) {
		
		cinema cin = new cinema();
		cin.setHeroAge(30);
		cin.setHeroineAge(25);
		cin.setName("Mahesh");
		cin.setCharacter("Good");
		
		System.out.println(cin.getHeroAge() +":"+ cin.getHeroineAge() + ":" + cin.getName() + ":" + cin.getCharacter());
		
		
		// TODO Auto-generated method stub

	}

}
