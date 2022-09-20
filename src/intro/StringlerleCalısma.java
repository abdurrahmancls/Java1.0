package intro;

public class StringlerleCalısma {

	public static void main(String[] args) {
		
		String haber = "Putin savaş başlattı!!!";
		System.out.println(haber);
				
		System.out.println("Eleman sayısı: "+haber.length());
		System.out.println("9.Eleman "+ haber.charAt(8));
		System.out.println(haber.concat("Maalesef:((("));
		System.out.println(haber.startsWith("T"));
		System.out.println(haber.endsWith("!"));
		
		
		String yenihaber = haber.replace('a' ,'-');
		System.out.println(yenihaber);
		System.out.println(haber.substring(0,5));
	}
	

}
