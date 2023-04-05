public class Main {
    public static void main(String[] args){
       
        LineCounter x = new LineCounter("C:\\Users\\augus\\OneDrive\\Área de Trabalho\\POO 2\\Lab2\\arquivosTxt\\txt1.txt");
        x.run();
        LineCounter y = new LineCounter("C:\\Users\\augus\\OneDrive\\Área de Trabalho\\POO 2\\Lab2\\arquivosTxt\\txt2.txt");
        y.run();

        System.out.println();
    }
}
