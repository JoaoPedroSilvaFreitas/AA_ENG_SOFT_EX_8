package padroescomportamentais.state;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SequencialTest {

    Sequencial aluno;

    @BeforeEach
    public void setUp() {
        aluno = new Sequencial();
    }

    // Sequencial Aplicado
    @Test
    public void naoDeveAplicarSequencialAplicado() {
        aluno.setEstado(SequencialEstadoAplicado.getInstance());
        assertFalse(aluno.aplicado());
    }

    @Test
    public void deveAnularSequencialAplicado() {
        aluno.setEstado(SequencialEstadoAplicado.getInstance());
        assertTrue(aluno.anulado());
        assertEquals(SequencialEstadoAnulado.getInstance(), aluno.getEstado());
    }

    @Test
    public void deveEmBrancoSequencialAplicado() {
        aluno.setEstado(SequencialEstadoAplicado.getInstance());
        assertTrue(aluno.emBranco());
        assertEquals(SequencialEstadoEmBranco.getInstance(), aluno.getEstado());
    }

    @Test
    public void deveValidarSequencialAplicado() {
        aluno.setEstado(SequencialEstadoAplicado.getInstance());
        assertTrue(aluno.valido());
        assertEquals(SequencialEstadoValido.getInstance(), aluno.getEstado());
    }

    @Test
    public void deveInvalidarSequencialAplicado() {
        aluno.setEstado(SequencialEstadoAplicado.getInstance());
        assertTrue(aluno.invalido());
        assertEquals(SequencialEstadoInvalido.getInstance(), aluno.getEstado());
    }


    // Sequencial Em Branco
    @Test
    public void naoDeveAplicarSequencialEmBranco() {
        aluno.setEstado(SequencialEstadoEmBranco.getInstance());
        assertFalse(aluno.aplicado());
    }

    @Test
    public void naoDeveAnularSequencialEmBranco() {
        aluno.setEstado(SequencialEstadoEmBranco.getInstance());
        assertFalse(aluno.anulado());
    }

    @Test
    public void naoDeveEmBrancoSequencialEmBranco() {
        aluno.setEstado(SequencialEstadoEmBranco.getInstance());
        assertFalse(aluno.emBranco());
    }

    @Test
    public void naoDeveValidarSequencialEmBranco() {
        aluno.setEstado(SequencialEstadoEmBranco.getInstance());
        assertFalse(aluno.valido());
    }

    @Test
    public void deveInvalidarSequencialEmBranco() {
        aluno.setEstado(SequencialEstadoEmBranco.getInstance());
        assertTrue(aluno.invalido());
        assertEquals(SequencialEstadoInvalido.getInstance(), aluno.getEstado());
    }

    // Sequencial Anulado
    @Test
    public void naoDeveAplicarSequencialAnulado() {
        aluno.setEstado(SequencialEstadoAnulado.getInstance());
        assertFalse(aluno.aplicado());
    }

    @Test
    public void naoDeveAnularSequencialAnulado() {
        aluno.setEstado(SequencialEstadoAnulado.getInstance());
        assertFalse(aluno.anulado());
    }

    @Test
    public void naoDeveEmBrancoSequencialAnulado() {
        aluno.setEstado(SequencialEstadoAnulado.getInstance());
        assertFalse(aluno.emBranco());
    }

    @Test
    public void naoDeveValidarSequencialAnulado() {
        aluno.setEstado(SequencialEstadoAnulado.getInstance());
        assertFalse(aluno.valido());
    }

    @Test
    public void deveInvalidarSequencialAnulado() {
        aluno.setEstado(SequencialEstadoAnulado.getInstance());
        assertTrue(aluno.invalido());
        assertEquals(SequencialEstadoInvalido.getInstance(), aluno.getEstado());
    }


    // Sequencial Valido
    @Test
    public void naoDeveAplicarSequencialValido() {
        aluno.setEstado(SequencialEstadoValido.getInstance());
        assertFalse(aluno.aplicado());
    }

    @Test
    public void naoDeveAnularSequencialValido() {
        aluno.setEstado(SequencialEstadoValido.getInstance());
        assertFalse(aluno.anulado());
    }

    @Test
    public void naoDeveEmBrancoSequencialValido() {
        aluno.setEstado(SequencialEstadoValido.getInstance());
        assertFalse(aluno.emBranco());
    }

    @Test
    public void naoDeveValidarSequencialValido() {
        aluno.setEstado(SequencialEstadoValido.getInstance());
        assertFalse(aluno.valido());
    }

    @Test
    public void naoDeveInvalidarSequencialValido() {
        aluno.setEstado(SequencialEstadoValido.getInstance());
        assertFalse(aluno.invalido());
    }

    // Sequencial Invalido
    @Test
    public void naoDeveAplicarSequencialInvalido() {
        aluno.setEstado(SequencialEstadoInvalido.getInstance());
        assertFalse(aluno.aplicado());
    }

    @Test
    public void naoDeveAnularSequencialInvalido() {
        aluno.setEstado(SequencialEstadoInvalido.getInstance());
        assertFalse(aluno.anulado());
    }

    @Test
    public void naoDeveEmBrancoSequencialInvalido() {
        aluno.setEstado(SequencialEstadoInvalido.getInstance());
        assertFalse(aluno.emBranco());
    }

    @Test
    public void naoDeveValidarSequencialInvalido() {
        aluno.setEstado(SequencialEstadoInvalido.getInstance());
        assertFalse(aluno.valido());
    }

    @Test
    public void naoDeveInvalidarSequencialInvalido() {
        aluno.setEstado(SequencialEstadoInvalido.getInstance());
        assertFalse(aluno.invalido());
    }

}