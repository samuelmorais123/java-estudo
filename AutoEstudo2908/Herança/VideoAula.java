public class VideoAula extends Conteudo {

    public String plataforma;

    public VideoAula(String titulo, int duracaoMinutos, String plataforma) {
        // Inicializa os atributos herdados de Conteudo.
        super(titulo, duracaoMinutos);
        this.plataforma = plataforma;
    }

    public void reproduzirVideo() {
        System.out.println("Reproduzindo na plataforma " + plataforma + ".");
    }
}
