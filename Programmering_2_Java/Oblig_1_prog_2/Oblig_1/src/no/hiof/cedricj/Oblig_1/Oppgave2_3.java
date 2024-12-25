package no.hiof.cedricj.Oblig_1;

import no.hiof.cedricj.Oblig_1.models.Planet;

public class Oppgave2_3 {
    public static void main(String[] args) {

        Planet planet1 = new Planet("Mars", 3389.5, 6.39E23);
        Planet planet2 = new Planet("Mercury", 2439.5, 3.285E23);
        Planet planet3 = new Planet("Venus", 6051.8, 4.867E24);

        planet1.printBeskrivelse();
        planet2.printBeskrivelse();
        planet3.printBeskrivelse();
    }
}
