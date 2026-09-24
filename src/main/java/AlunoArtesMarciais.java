public class AlunoArtesMarciais {

    private ArteMarcial arte;
    private Professor professor;

    public AlunoArtesMarciais (FabricaAbstrata fabrica){
        this.arte = fabrica.createArteMarcial();
        this.professor = fabrica.createProfessor();
    }

    public String exibirArteMarcial(){
        return this.arte.exibirArte();
    }

    public String exibirProfessor(){
        return this.professor.exibirProfessor();
    }

}
