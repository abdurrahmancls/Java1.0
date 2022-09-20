package intro;

import java.util.Scanner;

public class WhileÖrnekleri {

	public static void main(String[] args) {
		//Örnek 1 : 1 den 100 e kadar çift sayıları ekrana yaz.
				//Örnek 2: Negattif bir değer girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden tek sayıları toplayan program
				//Örnek 3: Girilen sayıya kadar 2 nin kuvvetleri.
				
				
				/*Örnek 1
				 * 
				int i=1;
				while(i<=100) {
					if(i % 2==0) {
						System.out.println(i);
					}
					i++;
				}
				*/
				
				
				/*Örnek 2
				 
				try (Scanner scan = new Scanner(System.in)) {
					int toplam=0;
					int input;
					while(true) {
						System.out.print("Lütfen sayı giriniz : ");
						input=scan.nextInt();
						
						if(input<0) {
							System.out.println("Program bitti");
							System.out.println("Girilen tek sayıların toplamı : " + toplam);
							break;
						}
						if(input % 2==1) {
							//toplam =toplam+input
							toplam+=input;
						}
					}
					*/
				
					
				Scanner scan = new Scanner(System.in);
				System.out.println("Sayı giriniz : ");
				int input = scan.nextInt();
				int k=1;
				
				while(k <= input) {
					System.out.println(k);
					k = k * 2;
				
				}

	}

}
