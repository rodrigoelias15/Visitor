public class Tecnico implements Pessoa {

    private int documento;
    private String nome;

    public Tecnico(int documento, String nome) {
        this.documento = documento;
        this.nome = nome;
    }

    public int getDocumento() {
        return documento;
    }

    public String getNome() {
        return nome;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirTecnico(this);
    }

}
