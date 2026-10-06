package padroescomportamentais.state;

public class SequencialEstadoEmBranco extends SequencialEstado {

    private SequencialEstadoEmBranco() {};
    private static SequencialEstadoEmBranco instance = new SequencialEstadoEmBranco();
    public static SequencialEstadoEmBranco getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Em Branco";
    }

    public boolean invalido(Sequencial aluno) {
        aluno.setEstado(SequencialEstadoInvalido.getInstance());
        return true;
    }


}

