package Exercicios.Biblioteca;

public class Livro{
    private int isbn;
    private String titulo;
    private String autor;
    private String anoPub;
    private Boolean disponivel;

    Livro(int isbn, String titulo, String autor, String anoPub, Boolean disponivel){
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.anoPub = anoPub;
        this.disponivel = disponivel;
    }

    public int getIsbn(){
        return isbn;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public String getAnopub(){
        return anoPub;
    }
    public Boolean getDis(){
        return disponivel;
    }
}