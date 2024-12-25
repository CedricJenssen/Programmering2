package no.hiof.cedricj.Oblig_1;

import java.util.ArrayList;
import java.util.Scanner;
import no.hiof.cedricj.Oblig_1.models.Planet;

public class Bonus {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            ArrayList<Planet> planets = new ArrayList<>();

            while (true) {
                String planetNavn, planetContinue;
                float planetRadius, planetMasse;

                System.out.println("Skriv inn navnet på planeten: ");
                planetNavn = input.nextLine();

                System.out.println("Skriv inn radius til planeten: ");
                planetRadius = Float.parseFloat(input.nextLine());

                System.out.println("Skriv inn massen til planeten: ");
                planetMasse = Float.parseFloat(input.nextLine());

                Planet p = new Planet(planetNavn, planetRadius, planetMasse);
                planets.add(p);
                p.printBeskrivelse();

                System.out.println("Vil du fortsette? Y/N ");
                planetContinue = input.nextLine();

                if (planetContinue.equals("N")) {
                    break;
                }

                System.out.println();

            }

            planets.get(0).printBeskrivelse();
            input.close();

        }

}
