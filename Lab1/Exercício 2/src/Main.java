//Faça um programa que lê uma string e conta os caracteres que aparecem nela, colocando caracteres e suas quantidades 
//em um HashMap. Ao terminar a leitura, o programa mostra os caracteres e a quantidade de cada um;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {

        int j=0;
        HashMap<Character, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        //colocando caracteres e suas quantidades
        for(int i=0; i<a.length(); i++){
            //charAt = conseguir acessar qualquer caracter que esteja na string
            char chave = a.charAt(i);

            if(map.containsKey(chave)){
                map.put(chave, map.get(chave)+1);
            }else{
                map.put(chave, 1);
            }
            
            System.out.println(map);
        }
        
        

        
    }
}
