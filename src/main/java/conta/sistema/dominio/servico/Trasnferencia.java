package conta.sistema.dominio.servico;

import conta.sistema.dominio.modelo.Conta;

import javax.inject.Named;
import java.math.BigDecimal;

import static conta.sistema.dominio.modelo.Erro.obrigatorio;
import static java.util.Objects.isNull;

@Named
public class Trasnferencia {
    public void processar(BigDecimal valor, Conta debito, Conta credito) {
        if (isNull(valor)) {
            obrigatorio("Valor da transferência");
        }
        if (isNull(debito)) {
            obrigatorio("Conta débito");
        }
        if (isNull(credito)) {
            obrigatorio("Conta crédito");
        }
        debito.debitar(valor);
        credito.creditar(valor);
    }

}