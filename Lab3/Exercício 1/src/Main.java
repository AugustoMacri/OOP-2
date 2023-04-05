//Implemente o padrão Abstract Factory em uma aplicação de Combo, em que há fábricas diferentes
//para carros de marcas diferentes. Cada Carro possui um Motor e Acessórios. Demonstre o funcionamento do 
//padrão na sua função main, fabricando pelo menos 3 tipos diferentes de Carro.


public class Main {
    public static void main(String[] args) throws Exception {
        
        System.out.println();
        System.out.println("Criando um veiculo da marca Audi:");
        //Criano Carro Audi
        FactoryAudi factoryAudi = new FactoryAudi(); //Criando uma Factory da Audi
        Carro carroAudi = factoryAudi.criaCarro(); //Criando o carro da Audi
        Motor motorAudi = factoryAudi.criaMotor(); //Criando o motor do carro da audi
        Acessorio acessorioAudi = factoryAudi.criaAcessorio(); //Criando os acessorios que o carro em questao possui
        carroAudi.info();
        motorAudi.info();
        acessorioAudi.info();

        System.out.println();
        System.out.println("Criando um veiculo da Marca Ferrari");
        //Criando Carro Ferrari
        FactoryFerrari factoryFerrari = new FactoryFerrari(); //Criando uma factory da Ferrari
        Carro carroFerrari = factoryFerrari.criaCarro(); //Criando uma ferrari 
        Motor motorFerrari = factoryFerrari.criaMotor(); //Criando um motor da Ferrari
        Acessorio acessorioFerrari = factoryFerrari.criaAcessorio(); //Criando acessorio da Ferrari
        carroFerrari.info();
        motorFerrari.info();
        acessorioFerrari.info();

        System.out.println();
        System.out.println("Criando um veiculo da Marca Volvo");
        //Criando um carro da marca Volvo
        FactoryVolvo factoryVolvo = new FactoryVolvo(); //Criando uma factory da Volvo
        Carro carroVolvo = factoryVolvo.criaCarro(); //Criando um carro da Volvo
        Motor motorVolvo = factoryVolvo.criaMotor(); //Criando um motor do carro Volvo
        Acessorio acessorioVolvo = factoryVolvo.criaAcessorio(); //Criando acessorio da marca Volvo
        carroVolvo.info();
        motorVolvo.info();
        acessorioVolvo.info();

    }
}
