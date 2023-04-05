import java.lang.Math;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        int max = 100, min = 1, distancia = max - min + 1, x;

        //agora aqui iremos pegar um valor aleatório
            int valor = (int)(Math.random() * distancia) + min;
            
        do{
            x = sc.nextInt();

            if(x < valor){
                System.out.println("Valor menor que o sorteado, tente novamente");
            }else if(x > valor){
                System.out.println("Valor maior que o sorteado, tente novamente");
            }

        }while(x != valor);
        System.out.println("Parabéns, você encontrou o valor sorteado.");

    }
}
