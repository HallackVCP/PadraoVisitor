package org.example;

public interface Visitor {

    String exibirReservaQuartoSimples(ReservaQuartoSimples reservaQuartoSimples);
    String exibirReservaSuite(ReservaSuite reservaSuite);
    String exibirReservaCobertura(ReservaCobertura reservaCobertura);

}
