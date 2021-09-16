//penentuan nama nama hari dengan menggunakan java

import java.util.scanner;

public class hari {
	public static void main (String[] args) {
		system.out.println("penentuan nama hari");
		system.out.println(" 0 = minggu    1 = senin");
		system.out.println(" 2 = selasa    3 = rabu");
		system.out.println(" 4 = kamis     5 = jumat");
		system.out.println(" 6 = sabtu");
		
		system.out.println("---------------------------")
		
		int KodeHari;
		
		scanner kbd = new Scanner(susyem.in);
		
		system.out.println(Kode Hari = ");
		KodeHari = kbd.nextInt();
		
		// penentuan nama nama hari
		string info;
		if (KodeHari == 0)
			info = "minggu";
		else
		if (KodeHari == 1)
			info = "senin";
		else
		if (KodeHari == 2)
			info = "selasa";
		else
		if (KodeHari == 3
			info = "rabu";
		else
		if (KodeHari == 4)
			info = "kamis";
		else
		if (KodeHari == 5)
			info = "jumat";
		else
		if (KodeHari == 6)
			info = "sabtu";
		else
		
	system.out.println(info);
  }
}