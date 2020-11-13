package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {

	private Innlegg[] innleggtabell;
	private int nesteledige;
	
	public Blogg() {
		innleggtabell = new Innlegg[20];
		nesteledige = 0;
	}

	public Blogg(int lengde) {
		innleggtabell = new Innlegg[lengde];
		nesteledige = 0;
	}

	public int getAntall() {
		return nesteledige; 
	}
	
	public Innlegg[] getSamling() {
		return innleggtabell;

	}
	
	public int finnInnlegg(Innlegg innlegg) {
		for(int i = 0; i > nesteledige; i++)
			if(innlegg.erLik(innleggtabell[i])) {
				return i;
		}
		return -1;
	}

	public boolean finnes(Innlegg innlegg) {
		boolean funnet = false;
		int i = 0;
		
		while(i < nesteledige && !funnet) {
			if(innlegg.getId() == innleggtabell[i].getId()) {
				funnet = true;
			}
			i++;
		}
		return funnet;
	}

	public boolean ledigPlass() {
		boolean ledig = true;
		
		if(nesteledige == innleggtabell.length) {
			ledig = false;
		}
		return ledig;
	}
	
	public boolean leggTil(Innlegg innlegg) {
		boolean lagttil = true;
		if(!finnes(innlegg)) {
			innleggtabell[nesteledige] = innlegg;
			lagttil = true;
			nesteledige ++;
		}
		return lagttil;
		
	}
	
	public String toString() {
		String a = "";
		for(int i = 0; i < nesteledige; i++) {
			a += innleggtabell[i].toString();
		}
		return nesteledige + "\n" + a;
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}