package teste.casouso;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
/**
 * Configuration: Responsavel por configurar os serviços do spring
 * @ComponentScan: Configura as diretivas de varredura.
 *
 * conta.sistema: Pacote do Hexágono
 * conta.adaptador: Pacote dos Adaptadores Mock
 *
 * Build 1: Adaptador Testes -> Sistema <- Adptadores Mocks
 *          O Objetivo é testar o hexágono.
 *
 * **/
@Configuration
@ComponentScan({
        "conta.sistema",
        "conta.adaptador",
    })
public class Build1 {
}
