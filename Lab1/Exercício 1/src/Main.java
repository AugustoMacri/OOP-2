//Faça um programa que lê 2 strings e checa se a primeira termina com os caracteres da segunda.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira palavra:");
        String a = sc.nextLine();
        System.out.println("Digite a segunda palavra:");
        String b = sc.nextLine();

        if(a.endsWith(b) == true){
            System.out.println("A primeira string termina com os mesmo caracteres da segunda");
        }else{
            System.out.println("A primeira string NÃO termina com os mesmo caracteres da segunda");
        }
    }
}
