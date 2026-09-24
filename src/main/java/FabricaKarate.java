public class FabricaKarate implements FabricaAbstrata {
    @Override
    public ArteMarcial createArteMarcial() {
        return new ArteKarate();
    }

    @Override
    public Professor createProfessor() {
        return new ProfessorKarate();
    }
}
