package com.exemplo;

interface ReprodutorMusical {
    void tocar();
    void selecionarMusica(String musica);
    void pausar();
}

interface AparelhoTelefonico {
    void ligar(String numero);
    void atender();
    void iniciarCorreioVoz();
}

interface NavegadorInternet {
    void exibirPagina(String pagina);
    void adicionarNovaAba();
    void atualizarPagina();
}

class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
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

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    @Override
    public void exibirPagina(String pagina) {
        System.out.println("Exibindo página: " + pagina);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }
}

public class Main {
    public static void main(String[] args) {
        IPhone meuIPhone = new IPhone();

        // Testando Reprodutor Musical
        meuIPhone.tocar();
        meuIPhone.selecionarMusica("Imagine - John Lennon");
        meuIPhone.pausar();

        // Testando Aparelho Telefônico
        meuIPhone.ligar("123-4567");
        meuIPhone.atender();
        meuIPhone.iniciarCorreioVoz();

        // Testando Navegador na Internet
        meuIPhone.exibirPagina("www.example.com");
        meuIPhone.adicionarNovaAba();
        meuIPhone.atualizarPagina();
    }
}