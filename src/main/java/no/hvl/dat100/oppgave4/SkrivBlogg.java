package no.hvl.dat100.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave3.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SkrivBlogg {

    public static boolean skriv(Blogg samling, String mappe, String filnavn) {
        String fullFilsti = mappe + "/" + filnavn;

        try (PrintWriter skriver = new PrintWriter(new FileWriter(fullFilsti))) {
            skriver.print(samling.toString());
            return true;
        } catch (IOException e) {
            e.printStackTrace(); 
            return false;
        }
    }
}