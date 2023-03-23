import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class PersonagemTest {

    @Test
    void deveUsarHabilidadeA(){
        IEspecializacaoAbstrata espec = new EspecializacaoA();
        Personagem personagem = new Personagem(espec);
        assertEquals("utilizando conjunto de habilidades A", personagem.usarHabilidades());
    }
    @Test
    void deveUsarHabilidadeB(){
        IEspecializacaoAbstrata espec = new EspecializacaoB();
        Personagem personagem = new Personagem(espec);
        assertEquals("utilizando conjunto de habilidades B", personagem.usarHabilidades());
    }
    @Test
    void deveUsarTalentoA(){
        IEspecializacaoAbstrata espec = new EspecializacaoA();
        Personagem personagem = new Personagem(espec);
        assertEquals("Utilizando conjunto de talentos A", personagem.usarTalentos());
    }
    @Test
    void deveUsarTalentoB(){
        IEspecializacaoAbstrata espec = new EspecializacaoB();
        Personagem personagem = new Personagem(espec);
        assertEquals("Utilizando conjunto de talentos B", personagem.usarTalentos());
    }
}
