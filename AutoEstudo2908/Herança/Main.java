public class Main {
    public static void main(String[] args) {
        VideoAula video = new VideoAula("Encapsulamento", 40, "Teams");
        Podcast podcast = new Podcast("Herança em Java", 25, "Mariana");

        // Métodos herdados de Conteudo.
        video.exibirResumo();
        podcast.exibirResumo();

        // Métodos específicos de cada subclasse.
        video.reproduzirVideo();
        podcast.ouvirPodcast();
    }
}
