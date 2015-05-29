
public class SortiranoBinarnoStablo {
	
	CvorStabla koren;
	
	public void ubaci(int kljuc, String vr, CvorStabla cvor) {
		if (koren == null) {
			koren = new CvorStabla(kljuc, vr, null, null);
		}
		
		CvorStabla pom = koren;
		if (pom.kljuc < kljuc) {
			if (pom.desno == null) {
				pom.desno = new CvorStabla(kljuc, vr, null, null);
			} else {
				ubaci(kljuc, vr, pom.desno);
			}
		} else {
			if (pom.levo == null) {
				pom.levo = new CvorStabla(kljuc, vr, null, null);
			} else {
				ubaci(kljuc, vr, pom.levo);
			}
		}
	}
	
	public String pronadji(int k, CvorStabla c) {
		if (koren == null) {
			throw new RuntimeException("Stablo je prazno.");
		}
		
		if (c == null) {
			return null;
		}
		
		CvorStabla pom = koren;
		if (pom.kljuc == k) {
			return pom.vrednost;
		}
		if (pom.kljuc < k) {
			return pronadji(k, pom.desno);
		} else {
			return pronadji(k, pom.levo);
		}
		
	}

}
