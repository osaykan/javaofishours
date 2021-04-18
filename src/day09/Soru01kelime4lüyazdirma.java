package day09;

import java.util.ArrayList;
import java.util.Arrays;

public class Soru01kelime4lüyazdirma {

	public static void main(String[] args) {
		  //String array dizisindeki 4 harfli kelimeleri return eden methodu yazınız.
		        String []str ={"sali","cuma","pazar","persembe","pers"};
		        System.out.println(Arrays.toString(dortHarfli(str)));

		    }
		  
	public static String [] dortHarfli(String []str){
		        ArrayList <String> list =new ArrayList();
		        for ( String w:str) {
		            if (w.length() == 4) {
		                list.add(w);
		            }
		        }
		            String [] result =list.toArray(new String[list.size()]);
		            // char arr [] =new char[3];
		return result;    

	}

}
