package tipos_ocp;

public class Guitarra {

    private String marca;
    private String modelo;
    private int volume;

    public Guitarra(String marca, String modelo, int volume) {
        this.marca = marca;
        this.modelo = modelo;
        this.volume = volume;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
