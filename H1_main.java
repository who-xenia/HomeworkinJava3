package h1;
public class H1_main {

	public static void main(String[] args) {
		int rating = 4;
		double guthaben = 3;
		double monEingang = 2;
		boolean warnhinweis = false;
		boolean negativ = true;
		
	if (guthaben < 0) {
		negativ=false;
		//System.out.println ("negativ = true");
	}
	else {
		System.out.println ("negativ = false");
	}
		if (guthaben > 0) {
			rating = rating + 3;
		}
		if (guthaben == 0) {
			rating = rating + 2;
		}
		if (guthaben < 0 && Math.abs(monEingang) >= Math.abs(guthaben)) {
			rating = rating + 1;
		}
		
		if (guthaben < 0 && Math.abs(monEingang) < Math.abs(guthaben) && rating < 0 ) {
		    rating = rating - 1;
		    warnhinweis = true;
        if (guthaben < 0 && Math.abs(monEingang) < Math.abs(guthaben) && rating < 0 ) {
	    rating = rating - 1;
	    	warnhinweis = true;
    	}
        }
        }
}

	


