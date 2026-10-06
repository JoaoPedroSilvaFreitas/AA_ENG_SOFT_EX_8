package padroescomportamentais.state;

public class SequencialEstadoValido extends SequencialEstado {

    private SequencialEstadoValido() {};
    private static SequencialEstadoValido instance = new SequencialEstadoValido();
    public static SequencialEstadoValido getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Valido";
    }

}
