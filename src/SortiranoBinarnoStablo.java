
public class SortiranoBinarnoStablo {
	
	CvorStabla koren=null;
	
	public void ubaci(int kljuc, String vr, CvorStabla cvor) {
		if (koren == null) {
			koren = new CvorStabla(kljuc, vr, null, null);
			return;
		}
		if (cvor.kljuc < kljuc) {
			if (cvor.desno == null) {
				cvor.desno = new CvorStabla(kljuc, vr, null, null);
				return;
			} else {
				ubaci(kljuc, vr, cvor.desno);
			}
		} else {
			if (cvor.levo == null) {
				cvor.levo = new CvorStabla(kljuc, vr, null, null);
				return;
			} else {
				ubaci(kljuc, vr, cvor.levo);
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
		
		if (c.kljuc == k) {
			return c.vrednost;
		}
		if (c.kljuc < k) {
			return pronadji(k, c.desno);
		} else {
			return pronadji(k, c.levo);
		}
		
	}

}
