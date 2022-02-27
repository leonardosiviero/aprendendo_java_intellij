package br.com.dio;

/*para rodar o programa java primeira vez: ctrl + shft + F10, depois é só shft + F10 */

/*    Comentar bloco ctrl + shft + /       */
/* clicar em cima do primeiroProgramaJava e ctrl + F6 para mudar o nome do programa */
/* Ctrl + Alt + L organiza o  código */
/* Ctrl + Y duplica linha // Ctrl + Y deleta linha */

import br.com.dio.model.gato;

public class primeiroProgramaJava {
    public static void main(String[] args) {

        gato gato = new gato();
        System.out.println(gato);

        livro livro1 = new livro("O problema dos três corpos.", 300);
        System.out.println(livro1);

/*        int a = 5;
        int b = 3;
        System.out.println("Hello World! Soma de a + b é " + (a+b));
*/

    }
}

class livro {
    private String nome;
    private Integer nnumPaginas;

    public livro(String nome, Integer nnumPaginas) {
        this.nome = nome;
        this.nnumPaginas = nnumPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNnumPaginas() {
        return nnumPaginas;
    }

    public void setNnumPaginas(Integer nnumPaginas) {
        this.nnumPaginas = nnumPaginas;
    }

    @Override
    public String toString() {
        return "livro{" +
                "nome='" + nome + '\'' +
                ", nnumPaginas=" + nnumPaginas +
                '}';
    }
}