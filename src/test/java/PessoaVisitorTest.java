import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaVisitorTest {
    @Test
    void deveExibirJogador() {
        Jogador jogador = new Jogador(15489365, "Gabigol", new Time("Flamengo"));

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Jogador{documento=15489365, nome='Gabigol', time=Flamengo}",
                visitor.exibir(jogador));
    }

    @Test
    void deveExibirTecnico() {
        Tecnico tecnico = new Tecnico(14578965, "Paulo Sousa");

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Tecnico{documento=14578965, nome='Paulo Sousa'}",
                visitor.exibir(tecnico));
    }
}