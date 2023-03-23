public class EspecializacaoA implements IEspecializacaoAbstrata {
    @Override
    public IArvoreTalentos selectTalentos(){
        return new TalentosA();
    }

    @Override
    public IHabilidade selectHabilidades(){
        return new HabilidadeA();
    }
}
