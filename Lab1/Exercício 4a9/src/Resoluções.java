import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import javax.xml.crypto.Data;


public class Resoluções {
    public void Exercicios4_7(){
        Scanner sc = new Scanner(System.in);

        //Vetor de atletas
        Atleta[] atletas = new Atleta[3];
        atletas[0] = new Futebolista("Jorge", 20, 60, 160);
        atletas[1] = new Tenista("Giovani", 21, 61, 161);
        atletas[2] = new Corredor("Alberto", 22, 62, 162);

        //Criando ArrayList
        ArrayList <Atleta> arrayList = new ArrayList<>();
        //Inserindo dados no Array
        arrayList.add(new Corredor("William", 20, 60, 180));
        arrayList.add(new Futebolista("Arthur", 21, 61, 181));
        arrayList.add(new Tenista("Bernardo", 22, 62, 182));
        
        Arrays.sort(atletas);
        System.out.println("Ordenação do array:");
        for(int i=0; i<3; i++){
            atletas[i].Aquecer(10);
            atletas[i].jogar();
            System.out.println("\n");
        }

        
        Collections.sort(arrayList);
        System.out.println("Ordenação do arrayList:");
        for (Atleta atleta : arrayList) {
            atleta.Aquecer(10);
            atleta.jogar();
            System.out.println("\n");
        }
        
        
    }

    public void proximaOlimpiada(){
        //Calcular a data daté as próximas olimpíadas
        LocalDate data = LocalDate.now();
        LocalDate dataOlimpiadas = LocalDate.parse("2024-07-24");
        
        //Duration t1 = Duration.between(null, 2024-07-26);
        Duration restante = Duration.between(data.atTime(0, 0), dataOlimpiadas.atTime(0, 0));
        System.out.println("Para as próximas olimpíadas faltam em dias: " + restante.toDays());
        System.out.println("");
    }
    

}
