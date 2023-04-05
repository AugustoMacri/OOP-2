public class FactoryFerrari implements CarFactory{

    @Override
    public Carro criaCarro(){
        return new F40();
    }

    @Override
    public Motor criaMotor(){
        return new F40Motor();
    }

    @Override
    public Acessorio criaAcessorio(){
        return new F40Acessorio();
    }
}
