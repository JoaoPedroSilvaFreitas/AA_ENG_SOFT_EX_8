package padroescomportamentais.state;

public class SequencialEstadoAnulado extends SequencialEstado {

    private SequencialEstadoAnulado() {};
    private static SequencialEstadoAnulado instance = new SequencialEstadoAnulado();
    public static SequencialEstadoAnulado getInstance() {
        return instance;
    }
    
    public String getEstado() {
        return "Anulado";
    }

    public boolean invalido(Sequencial aluno) {
        aluno.setEstado(SequencialEstadoInvalido.getInstance());
        return true;
    }

}
