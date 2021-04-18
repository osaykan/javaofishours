package day5stringmethod;

public class StringMethod {

	public static void main(String[] args) {
		//concat() methodu concatination yapmamizi saglar.Yani stringleri birlestirir.
		
		
		String str1 = "ankara";
		String str2 = "van";
		System.out.println(str1.concat(str2));
		System.out.println(str1+str2);
		
		//replace() stringdeki istenilen bir characteri baska bir characterle degistirmemizi saglar
		
		String str3 = "karate";
		System.out.println(str3.replace("a","o"));
		
		//valueOf()  1) String icindeki int characterleri sayiya cevirir
		
		String butce1 = "12000";
		String butce2 = "13000";
		System.out.println(butce1+butce2);//1200013000
		System.out.println(Integer.valueOf(butce1)+Integer.valueOf(butce2));//25000

		
		//2) Int i Stringe cevirir
		
		int yas1 =12;
		int yas2 = 15;
		System.out.println(yas1+yas2);//27
		System.out.println(String.valueOf(yas1)+String.valueOf(yas2));//1215
		
		
	}

}
