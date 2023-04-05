import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.Reader;

public class LineCounter implements Runnable{
    private String file = "C:\\Users\\augus\\OneDrive\\Área de Trabalho\\POO 2\\Lab2\\arquivosTxt";
    private String arquivo;
    private int i;

    public LineCounter(String file){
        this.file = file;
    }

    public LineCounter(int i){
        this.i = i;
    }

    public String getFile(){
        return file;
    }

    public void runSemThreads(){
        
    }


    @Override
    public void run(){
        
        try {
            LineNumberReader linhas = new LineNumberReader(new FileReader(file + "\\txt" + i + ".txt"));
            linhas.skip(Long.MAX_VALUE);
            int retorno = linhas.getLineNumber();
            System.out.println(retorno + " Linhas tem o arquivo: " + file);

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado");

        } catch (IOException e) {
            e.printStackTrace();
        } 
        
    }


    public void LineCounter2(){
        try {
            LineNumberReader linhas = new LineNumberReader(new FileReader(file + "\\txt" + i + ".txt"));
            linhas.skip(Long.MAX_VALUE);
            int retorno = linhas.getLineNumber();
            System.out.println(retorno + " Linhas tem o arquivo: " + file);
    
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado");
    
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}

