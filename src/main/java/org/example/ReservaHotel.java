package org.example;

public interface ReservaHotel {
    String aceitar(Visitor visitor);

    double getPrecoTotal();
}
