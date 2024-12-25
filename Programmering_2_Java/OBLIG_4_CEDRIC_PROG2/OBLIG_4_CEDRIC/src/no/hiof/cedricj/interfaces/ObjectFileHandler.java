package no.hiof.cedricj.interfaces;

import no.hiof.cedricj.models.Star;

import java.io.File;
import java.util.ArrayList;

public interface ObjectFileHandler<T>{

    void writeObjectsToFile(ArrayList<Star> stjerneListe, File file);

    T readObjectsFromFile(File file);
}
