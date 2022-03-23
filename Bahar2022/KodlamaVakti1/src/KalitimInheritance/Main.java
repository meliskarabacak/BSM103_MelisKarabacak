package KalitimInheritance;

public class Main {

	public static void main(String[] args) {

		Calisan c= new Calisan();
//		c.giris();
		Akademisyen a= new Akademisyen();
//		a.giris();	//giris() metodu aslinda calisan classinda ama akademisyen classi calisan classin bir alt sinifi
//					//oldugu icin (extends ile belirledik) 
		Memurlar m= new Memurlar();
//		m.giris();
////		
//		System.out.println(Akademisyen.giris());
//		System.out.println(Memurlar.giris());
	}

}


				       Calisan
		Akademisyen					Memurlar
	Asistan  Ogretmen		  guvenlik     BilgiIslem
