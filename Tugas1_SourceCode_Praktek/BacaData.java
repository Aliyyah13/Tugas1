/*Nama		: A.Nur Aliyyah
  Nim		: 13020210016
  Hari/Tgl	: Kamis, 09 Maret 2023
  Waktu		: 19.46*/
 
import java.util.Scanner;
public class BacaData {

	public static void main(String[] args) {

		int a;
		Scanner masukan;

		System.out.print("Contoh membaca dan menulis, ketik nilai integer: \n");
		masukan = new Scanner(System.in);
		a = masukan.nextInt(); /* coba ketik : masukan.nextInt(); 
		Apa akibatnya ?*/
		System.out.print ("Nilai yang dibaca : "+ a);
	}
}