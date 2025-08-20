package biblioteca;

import livro.Livro;

public class SistemaDeBiblioteca {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.adicionarLivro(new Livro("Dom Casmurro", "Machado de Assis", 1899));
        biblioteca.adicionarLivro(new Livro("O Alquimista", "Paulo Coelho", 1988));
        biblioteca.adicionarLivro(new Livro("Memórias Póstumas de Brás Cubas", "Machado de Assis", 1881));

        System.out.println("Todos os livros:");
        biblioteca.listarLivros();

        System.out.println("\nLivros de Machado de Assis:");
        biblioteca.buscarPorAutor("Machado de Assis");

        System.out.println("\nRemovendo 'O Alquimista'...");
        biblioteca.removerLivro("O Alquimista");

        System.out.println("\nLivros após remoção:");
        biblioteca.listarLivros();
    }
}