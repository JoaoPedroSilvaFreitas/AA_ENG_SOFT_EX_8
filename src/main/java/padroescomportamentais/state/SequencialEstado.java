package padroescomportamentais.state;

public abstract class SequencialEstado {
    
    public abstract String getEstado();

    public boolean aplicado(Sequencial sequencial) {
        return false;
    }

    public boolean emBranco(Sequencial sequencial) {
        return false;
    }

    public boolean anulado(Sequencial sequencial) {
        return false;
    }

    public boolean valido(Sequencial sequencial) {
        return false;
    }

    public boolean invalido(Sequencial sequencial) {
        return false;
    }

    
}
