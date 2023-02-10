package tipos_liskov;

public class CarroEletrico implements Carro {


    @Override
    public void ligarOMotor() {
        throw new AssertionError("não tenho motor!");
    }

    @Override
    public void acelerar() {
        //essa aceleração é uma loucura!
    }
}
