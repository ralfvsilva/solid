package tipos_ocp;

public class GuitarraSuperLegalcomChamas extends Guitarra{

    private String corDaChama;

    public GuitarraSuperLegalcomChamas(String marca, String modelo, int volume) {
        super(marca, modelo, volume);
    }

    public GuitarraSuperLegalcomChamas(String marca, String modelo, int volume, String corDaChama) {
        super(marca, modelo, volume);
        this.corDaChama = corDaChama;
    }

    public String getCorDaChama() {
        return corDaChama;
    }

    public void setCorDaChama(String corDaChama) {
        this.corDaChama = corDaChama;
    }
}
