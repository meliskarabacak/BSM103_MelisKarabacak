package Uygulamalar;


public class Pokemon {
	int level; 
	public Pokemon(int level) {
		this.level=level;
	}


	public static void main(String[] args) {
		int hp=10;
		Pokemon squirtle= new Pokemon(5);
		battle(squirtle,hp);
		System.out.println("level"+ squirtle.level+" ,"+ hp+"hp");
		hp= hp+ squirtle.level;
		battle(squirtle, hp+1);
		System.out.println("level"+ squirtle.level+" ,"+hp+ "hp");
	}
	public static void battle (Pokemon poke,int hp) {
		poke.level++;
		hp-=5;
		System.out.println("level"+ poke.level+" ,"+ hp+"hp");
	}
}
