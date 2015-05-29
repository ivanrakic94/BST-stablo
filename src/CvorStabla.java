
public class CvorStabla {
	
	int kljuc;
	String vrednost;
	CvorStabla levo;
	CvorStabla desno;
	
	public CvorStabla(int kljuc, String vrednost, CvorStabla l, CvorStabla d) {
		this.kljuc = kljuc;
		this.vrednost = vrednost;
		levo = l;
		desno = d;
	}

}
