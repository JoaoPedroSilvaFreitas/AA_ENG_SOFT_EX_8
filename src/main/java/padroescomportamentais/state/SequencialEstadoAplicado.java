package padroescomportamentais.state;

public class SequencialEstadoAplicado extends SequencialEstado {

    private SequencialEstadoAplicado() {};
    private static SequencialEstadoAplicado instance = new SequencialEstadoAplicado();
    public static SequencialEstadoAplicado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Aplicado";
    }
    
    public boolean valido(Sequencial aluno) {
        aluno.setEstado(SequencialEstadoValido.getInstance());
        return true;
    }
    
    public boolean emBranco(Sequencial aluno) {
        aluno.setEstado(SequencialEstadoEmBranco.getInstance());
        return true;
    }
    
    public boolean anulado(Sequencial aluno) {
        aluno.setEstado(SequencialEstadoAnulado.getInstance());
        return true;
    }
    
    public boolean invalido(Sequencial aluno) {
        aluno.setEstado(SequencialEstadoInvalido.getInstance());
        return true;
    }


}
