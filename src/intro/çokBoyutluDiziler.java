package intro;

public class çokBoyutluDiziler {

	public static void main(String[] args) {
		String[][] sehirler =new String[3][3];
		
		sehirler[0][0]="Adıyaman";
		sehirler[0][1]="Diyarbakır";
		sehirler[0][2]="İzmir";
		sehirler[1][0]="Ankara";
		sehirler[1][1]="İstanbul";
		sehirler[1][2]="Adana";
		sehirler[2][0]="Konya";
		sehirler[2][1]="Zonguldak";
		sehirler[2][2]="Mardin";
		
		for(int i=0; i<=2; i++) {
			System.out.println("-------");
			for(int j=0; j<=2; j++) {
				System.out.println(sehirler[i][j]);
			}
		}
	}

}
