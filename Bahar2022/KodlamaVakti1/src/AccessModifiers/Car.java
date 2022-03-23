package AccessModifiers;

public class Car {
 
		private int enginePower, engine;
		public int speed,model;
		protected String colour;
		
		Car (){
			this.model= 2020;
			this.enginePower=300;
			this.speed= 120;
			this.colour= "red";
		}
		public void print() {
			System.out.println(model);
		}
		public void run() {
			print();
	}

}
