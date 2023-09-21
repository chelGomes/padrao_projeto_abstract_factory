import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BancoTest {
    @Test
    void deveEmitirCartaoContaCorrente() {
        FabricaAbstrataBanco fabrica = new FabricaContaCorrente();
        Banco banco = new Banco(fabrica);
        assertEquals("Cartao conta corrente", banco.emitirCartao());
    }

    @Test
    void deveEmitirCartaoContaPoupanca() {
        FabricaAbstrataBanco fabrica = new FabricaContaPoupanca();
        Banco banco = new Banco(fabrica);
        assertEquals("Cartao conta poupanca", banco.emitirCartao());
    }

    @Test
    void deveExpedirContaCorrente() {
        FabricaAbstrataBanco fabrica = new FabricaContaCorrente();
        Banco banco = new Banco(fabrica);
        assertEquals("Conta Corrente", banco.expedirConta());
    }

    @Test
    void deveExpedirContaPoupanca() {
        FabricaAbstrataBanco fabrica = new FabricaContaPoupanca();
        Banco banco = new Banco(fabrica);
        assertEquals("Conta Poupanca", banco.expedirConta());
    }
}
