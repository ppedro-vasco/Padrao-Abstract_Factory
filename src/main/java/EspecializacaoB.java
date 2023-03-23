public class EspecializacaoB implements IEspecializacaoAbstrata {
    @Override
    public IArvoreTalentos selectTalentos(){
        return new TalentosB();
    }

    @Override
    public IHabilidade selectHabilidades(){
        return new HabilidadeB();
    }
}
