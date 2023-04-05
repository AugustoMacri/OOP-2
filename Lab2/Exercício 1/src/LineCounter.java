import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;


public class LineCounter extends Thread{
    private String file;

    public LineCounter(String file){
        this.file = file;
    }


    @Override
    public void run(){
        
        try {
            LineNumberReader linhas = new LineNumberReader(new FileReader(file));
            linhas.skip(Long.MAX_VALUE);
            int retorno = linhas.getLineNumber();
            System.out.println(retorno + " Linhas tem o arquivo" + file);

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado");

        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}
