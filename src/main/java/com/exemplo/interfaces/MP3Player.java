public class MP3Player implements ReprodutorMusical {
    @Override
    public void tocar() {
        System.out.println("Tocando música...");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música: " + musica);
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música...");
    }
}