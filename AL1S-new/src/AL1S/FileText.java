package AL1S;

import java.io.*;

public class FileText {
    String path;

    void start(String path) throws IOException {
        File inStream = new File(path);
        BufferedReader input = null;
        input = new BufferedReader(new InputStreamReader(new FileInputStream(inStream), "UTF-8"));
        int line;
        while ((line = input.read()) != -1) {
            System.out.print((char) line);
        }
    }
}
