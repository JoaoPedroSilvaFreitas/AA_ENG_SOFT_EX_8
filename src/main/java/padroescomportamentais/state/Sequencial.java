package padroescomportamentais.state;

public class Sequencial {
    
    private String codigoBarras;
    private SequencialEstado estado;    

    public Sequencial() {
        this.estado = SequencialEstadoAplicado.getInstance();
    }
    
    public void setEstado(SequencialEstado estado) {
        this.estado = estado;
    }
    
    public boolean aplicado() {
        return estado.aplicado(this);
    }
    
    public boolean emBranco() {
        return estado.emBranco(this);
    }
    
    public boolean anulado() {
        return estado.anulado(this);
    }
    
    public boolean valido() {
        return estado.valido(this);
    }
    
    public boolean invalido() {
        return estado.invalido(this);
    }

    public String getcodigoBarrasEstado() {
        return estado.getEstado();
    }
    
    public String getcodigoBarras() {
        return codigoBarras;
    }

    public void setcodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public SequencialEstado getEstado() {
        return estado;
    }    
}
