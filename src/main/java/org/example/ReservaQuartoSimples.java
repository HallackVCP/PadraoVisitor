package org.example;

public class ReservaQuartoSimples implements ReservaHotel{

    private String nomeHotel;

    private String quarto;

    private double preco;


    public ReservaQuartoSimples(String nomeHotel, String quarto, double preco) {
        this.nomeHotel = nomeHotel;
        this.quarto = quarto;
        this.preco = preco;
    }

    public String getNomeHotel() {
        return nomeHotel;
    }

    public void setNomeHotel(String nomeHotel) {
        this.nomeHotel = nomeHotel;
    }

    public String getQuarto() {
        return quarto;
    }

    public void setQuarto(String quarto) {
        this.quarto = quarto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.exibirReservaQuartoSimples(this);
    }

    @Override
    public double getPrecoTotal() {
        return this.getPreco();
    }
}
