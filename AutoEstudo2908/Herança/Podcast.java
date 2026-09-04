public class Podcast extends Conteudo {

    public String apresentador;

    public Podcast(String titulo, int duracaoMinutos, String apresentador) {
        // Inicializa os atributos herdados de Conteudo.
        super(titulo, duracaoMinutos);
        this.apresentador = apresentador;
    }

    public void ouvirPodcast() {
        System.out.println("Podcast apresentado por " + apresentador + ".");
    }
}
