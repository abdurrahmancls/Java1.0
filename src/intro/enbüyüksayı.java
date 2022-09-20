package intro;

public class enbüyüksayı {

	public static void main(String[] args) {
		int sayi1 =20;
		int sayi2 = 45;
		int sayi3 = 8;
		int enBüyük = sayi1;
		
		
		if(enBüyük<sayi2) {
			enBüyük = sayi2;
		}
		if(enBüyük<sayi3) {
			enBüyük=sayi3;
		}
		
		System.out.println("En büyük sayı " + enBüyük);

	}

}
