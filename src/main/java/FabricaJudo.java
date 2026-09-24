public class FabricaJudo implements FabricaAbstrata {

    @Override
    public ArteMarcial createArteMarcial() {
        return new ArteJudo();
    }

    @Override
    public Professor createProfessor() {
        return new ProfessorJudo();
    }
}
