package File;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile{

        public static void main(String[] args) throws IOException {

                String caminho = "C:\\Users\\Riva Investimentos\\Documents\\"
                		    + "Eclipse-trabalhos-main\\Algoritimo\\src\\File\\txt";
                String conteudo = "Hello Lucas\n";

                FileWriter escritor = new FileWriter(caminho, true);
                escritor.write(conteudo);
                escritor.close();

        }

}


