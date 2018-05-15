package prjava01;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lasase1718dam2vib
 */
public class Prjava01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File f = new File("fitxer.html");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(f))) {
            bw.write("<html>");
            bw.newLine();
            bw.write("  <head>");
            bw.newLine();
            bw.write("    <title>");
            bw.newLine();
            bw.write("      Nova pàgina  web");
            bw.newLine();
            bw.write("    </title>");
            bw.newLine();
            bw.write("  </head>");
            bw.newLine();
            bw.write("  <body>");
            bw.newLine();
            bw.write("    <h1>DAW2 m08uf4pr2</h1>");
            bw.newLine();
            bw.write("    Nova pàgina web");
            bw.newLine();
            bw.write("  </body>");
            bw.newLine();
            bw.write("</html>");
            bw.newLine();
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(Prjava01.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
