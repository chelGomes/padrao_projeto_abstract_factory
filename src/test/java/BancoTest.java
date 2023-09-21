import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BancoTest {
    @Test
    void deveEmitirCartaoContaCorrente() {
        FabricaAbstrataBanco fabricaBanco = new FabricaContaCorrente();
        Banco banco = new Banco(fabricaBanco);
        assertEquals("Cartao Conta Corrente", banco.emitirCartao());
    }

    @Test
    void deveEmitirCartaoContaPoupanca() {
        FabricaAbstrataBanco fabricaBanco = new FabricaContaPoupanca();
        Banco banco = new Banco(fabricaBanco);
        assertEquals("Cartao Conta Poupanca", banco.emitirCartao());
    }

    @Test
    void deveExpedirContaCorrente() {
        FabricaAbstrataBanco fabricaBanco = new FabricaContaCorrente();
        Banco banco = new Banco(fabricaBanco);
        assertEquals("Conta Corrente", banco.expedirConta());
    }

    @Test
    void deveExpedirContaPoupanca() {
        FabricaAbstrataBanco fabricaBanco = new FabricaContaPoupanca();
        Banco banco = new Banco(fabricaBanco);
        assertEquals("Conta Poupanca", banco.expedirConta());
    }
}
