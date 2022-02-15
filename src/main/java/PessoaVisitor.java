public class PessoaVisitor implements Visitor {

    public String exibir(Pessoa pessoa) {
        return pessoa.aceitar(this);
    }

    @Override
    public String exibirJogador(Jogador jogador) {
        return "Jogador{" +
                "documento=" + jogador.getDocumento() +
                ", nome='" + jogador.getNome() + '\'' +
                ", time=" + jogador.getNomeTime() +
                '}';
    }

    @Override
    public String exibirTecnico(Tecnico tecnico) {
        return "Tecnico{" +
                "documento=" + tecnico.getDocumento() +
                ", nome='" + tecnico.getNome() + '\'' +
                '}';
    }

}
