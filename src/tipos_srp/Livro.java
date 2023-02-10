package tipos_srp;

public class Livro {

    private String nome;
    private String autor;
    private String texto;

    public Livro(String nome, String autor, String texto) {
        this.nome = nome;
        this.autor = autor;
        this.texto = texto;
    }

    // métodos que se relacionam diretamente com as
    // propriedades do livro

//    public String substituirPalavraNotexto(String palavra, String
//            substituiçãoPalavra){
//        return text.replaceAll(palavra, substituiçãoPalavra);
//    }
//    public boolean eAPalavraNoTexto(String palavra){
//        return text.contains(palavra);
//    }

    void imprimirTextoNoConsole(){
        // nosso código para formatar e imprimir o texto
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
