package AL1S;

import java.io.*;
import java.util.Scanner;

public class MainStage {
    public void start() throws IOException {
        Scanner typing = new Scanner(System.in);


        FileText txt = new FileText();
        txt.start("src/files/MainStage.txt");
        txt.start("src/files/startmenu.txt");

        String console = typing.next();

    }
}
