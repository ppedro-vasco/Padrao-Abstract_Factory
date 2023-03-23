public class Personagem {
    private IArvoreTalentos arvoreTalentos;
    private IHabilidade habilidade;


    public Personagem (IEspecializacaoAbstrata especializacao){
        this.arvoreTalentos = especializacao.selectTalentos();
        this.habilidade = especializacao.selectHabilidades();
    }

    public String usarTalentos(){
        return this.arvoreTalentos.usar();
    }
    public String usarHabilidades(){
        return this.habilidade.usar();
    }
}
