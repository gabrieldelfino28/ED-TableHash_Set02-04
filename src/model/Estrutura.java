package model;

public class Estrutura {
    public int andar;
    public String nomeDepartamento;
    public String descricao;

    public Estrutura(int andar, String nomeDepartamento, String descricao) {
        this.andar = andar;
        this.nomeDepartamento = nomeDepartamento;
        this.descricao = descricao;
    }

    public Estrutura() {
        super();
    }

    @Override
    public String toString() {
        return andar + ";" + nomeDepartamento + ";" + descricao;
    }
}
