public class FactoryAudi implements CarFactory{

    @Override
    public Carro criaCarro(){
        return new AudiSport();
    }

    @Override
    public Motor criaMotor(){
        return new AudiSportMotor();
    }

    @Override
    public Acessorio criaAcessorio(){
        return new AudiSportAcessorio();
    }

}
