import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlunoArtesMarciaisTest {

    @Test
    void deveExibirArteJudo(){
        FabricaAbstrata fabrica = new FabricaJudo();
        AlunoArtesMarciais aluno = new AlunoArtesMarciais(fabrica);
        assertEquals("Judo", aluno.exibirArteMarcial());
    }

    @Test
    void deveExibirArteKarate(){
        FabricaAbstrata fabrica = new FabricaKarate();
        AlunoArtesMarciais aluno = new AlunoArtesMarciais(fabrica);
        assertEquals("Karate", aluno.exibirArteMarcial());
    }

    @Test
    void deveExibirProfessorJudo(){
        FabricaAbstrata fabrica = new FabricaJudo();
        AlunoArtesMarciais aluno = new AlunoArtesMarciais(fabrica);
        assertEquals("Professor de Judo", aluno.exibirProfessor());
    }

    @Test
    void deveExibirProfessorKarate(){
        FabricaAbstrata fabrica = new FabricaKarate();
        AlunoArtesMarciais aluno = new AlunoArtesMarciais(fabrica);
        assertEquals("Professor de Karate", aluno.exibirProfessor());
    }
}
