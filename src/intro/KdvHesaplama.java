package intro;

import java.util.Scanner;

public class KdvHesaplama {

	public static void main(String[] args) {
		double tutar , kdvliFiyat, kdv = 0.18;
		Scanner input= new Scanner(System.in);
		System.out.println("Ürünün tutatını giriniz : ");
		tutar = input.nextDouble();
		kdvliFiyat = tutar + (tutar*kdv);
		System.out.println("Kdvli fiyat : " + kdvliFiyat);

	}

}
