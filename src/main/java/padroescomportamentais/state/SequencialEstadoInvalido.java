package padroescomportamentais.state;

public class SequencialEstadoInvalido extends SequencialEstado {

    private SequencialEstadoInvalido() {};
    private static SequencialEstadoInvalido instance = new SequencialEstadoInvalido();
    public static SequencialEstadoInvalido getInstance() {
        return instance;
    }
    
    public String getEstado() {
        return "Invalido";
    }
     
}

