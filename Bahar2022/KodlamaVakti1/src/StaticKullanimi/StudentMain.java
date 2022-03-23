package StaticKullanimi;

public class StudentMain {

	public static void main(String[] args) {

		
		System.out.println("online ogrenci: "+ Student.howStudent());
		
		Student s1= new Student("ali",220,90);
		Student s2= new Student("ayse",330,100);
		Student s3= new Student("ali",200,60);
		
		System.out.println("online ogrenci: "+ Student.howStudent());
		s1.exit();
		System.out.println("online ogrenci: "+ Student.howStudent());
		
		int[] notlar = new int [3];
		notlar[0]=s1.point;
		notlar[1]=s2.point;
		notlar[2]=s3.point;
		System.out.println("not ortalamasi: " +Student.calculateMean(notlar));// calculateMean not ortalamasi oluyor
		
	}

}
