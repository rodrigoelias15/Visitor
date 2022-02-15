public class Jogador implements Pessoa {

    private int documento;
    private String nome;
    private Time time;

    public Jogador(int documento, String nome, Time time) {
        this.documento = documento;
        this.nome = nome;
        this.time = time;
    }

    public int getDocumento() {
        return documento;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeTime() {
        return this.time.getNome();
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirJogador(this);
    }

}
