module conta.sistema {
    requires javax.inject;
    requires spring.tx;

    // expondo porta de entrada (driver)
    exports conta.sistema.casouso.imp;

    // expondo sistema negocio
    exports conta.sistema.dominio.servico;

    // expondo adaptadores de saídas (driven)
    exports conta.adaptador;

    // expondo testes de unidade
    exports teste.unidade.dominio.modelo;

    // abre reflexão spring
    opens conta.sistema.casouso.porta;
    opens conta.sistema.casouso.imp;
    opens conta.sistema.dominio.servico;
    opens conta.adaptador;



}