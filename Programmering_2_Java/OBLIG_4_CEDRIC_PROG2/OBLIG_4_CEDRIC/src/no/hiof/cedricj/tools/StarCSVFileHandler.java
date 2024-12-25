package no.hiof.cedricj.tools;

import no.hiof.cedricj.interfaces.ObjectFileHandler;
import no.hiof.cedricj.models.Star;

import java.io.*;
import java.util.ArrayList;

public class StarCSVFileHandler implements ObjectFileHandler<ArrayList<Star>> {

    @Override
    public void writeObjectsToFile(ArrayList<Star> stjerneListe, File file) {
        try (BufferedWriter bufretSkriver = new BufferedWriter(new FileWriter(file))){
            for (Star enStjerne : stjerneListe){
                bufretSkriver.write(enStjerne.getName() + ";" + enStjerne.getRadius() + ";" + enStjerne.getMass() + ";" + enStjerne.getEffectiveTemp());
                bufretSkriver.newLine();
            }

        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    public ArrayList<Star> readObjectsFromFile (File file){
        ArrayList<Star> returListe = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {

            String linje;
            while ( (linje = bufferedReader.readLine()) != null) {

                String[] verdier = linje.split(";");

                Star star = new Star(verdier[0], Double.parseDouble(verdier[1]), Double.parseDouble(verdier[2]), Double.parseDouble(verdier[3]));

                returListe.add(star);
            }

        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return returListe;
    }
}

