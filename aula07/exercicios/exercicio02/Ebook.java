package exercicios.exercicio02;

public class Ebook {
    private String titulo, autor;
    private int paginaAtual, totalPaginas;

    public Ebook(String titulo, String autor, int totalPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        if(totalPaginas > 0){
            this.totalPaginas = totalPaginas;
        }
        this.paginaAtual = 0;
    }

    public void exibirCapa() {
        System.out.println(titulo + ", " + autor + "- " + totalPaginas);
    }

    public void avancarPagina() {
        if(paginaAtual < totalPaginas) {
            paginaAtual++;
        }
    }

    public void retrocederPagina() {
        if(paginaAtual > 0) {
            paginaAtual--;
        }
    }

    public int exibirPagina() {
        return paginaAtual;
    }

    public void irParaPagina(int pagina) {
        if(pagina >=0 && pagina <= totalPaginas) {
            paginaAtual = pagina;
        }
    }

}
