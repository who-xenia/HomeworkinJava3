package h3;

public class H3_main {

	public static void main(String[] args) {
		int max = 5;       
        int fix = 2;       
        int wartend = 12;  
        boolean istVoll = false; 

        int freiePlaetze = max - fix;
        
        if (freiePlaetze > 0 && wartend > 0) {
            int neuAufgenommen = Math.min(freiePlaetze, wartend);

            fix += neuAufgenommen;
            wartend -= neuAufgenommen;
        }
        istVoll = (fix == max);

        System.out.println("Maximale Plätze: " + max);
        System.out.println("Fixplätze: " + fix);
        System.out.println("Warteliste: " + wartend);
        System.out.println("Ist voll: " + istVoll);
    }


	}


