public class FactoryVolvo implements CarFactory{

    @Override
    public Carro criaCarro(){
        return new Volvo();
    }

    @Override
    public Motor criaMotor(){
        return new VolvoMotor();
    }

    @Override
    public Acessorio criaAcessorio(){
        return new VolvoAcessorio();
    }
}
