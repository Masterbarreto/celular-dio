package com.exemplo.modelos;

import com.exemplo.interfaces.ReprodutorMusical;
import com.exemplo.interfaces.AparelhoTelefonico;
import com.exemplo.interfaces.NavegadorInternet;

/**
 * Classe que representa um iPhone, implementando as interfaces ReprodutorMusical, AparelhoTelefonico e NavegadorInternet.
 */
public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    // Métodos de reprodução de música
    @Override
    public void tocar() {
        System.out.println("Reproduzindo música...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica);
    }

    // Métodos de telefone
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    // Métodos de navegação na internet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página...");
    }
}