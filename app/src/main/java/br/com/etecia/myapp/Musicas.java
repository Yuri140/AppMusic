package br.com.etecia.myapp;

import java.sql.Time;

public class Musicas {
    private int imagem;
    private String nomeMusica;
    private int ano;
    private String artista;
    private String Album;
    private Time duracao;

    public Musicas(int imagem, String nomeMusica, int ano, String artista) {
        this.imagem = imagem;
        this.nomeMusica = nomeMusica;
        this.ano = ano;
        this.artista = artista;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    public String getAlbum() {
        return Album;
    }

    public void setAlbum(String album) {
        Album = album;
    }

    public Time getDuracao() {
        return duracao;
    }

    public void setDuracao(Time duracao) {
        this.duracao = duracao;
    }

    public int getImage() {
        return imagem;
    }

    public void setImage(int image) {
        this.imagem = image;
    }

    public String getNomeMusica() {
        return nomeMusica;
    }

    public void setNomeMusica(String nomeMusica) {
        this.nomeMusica = nomeMusica;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }
}
