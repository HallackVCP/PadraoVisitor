package org.example;

public class ReservaSuite implements ReservaHotel{

    private String nomeHotel;

    private String quarto;

    private double preco;

    private double precoWifiPremium;

    private double precoPensaoCompleta;


    public ReservaSuite(String nomeHotel, String quarto, double preco, double precoWifiPremium, double precoPensaoCompleta) {
        this.nomeHotel = nomeHotel;
        this.quarto = quarto;
        this.preco = preco;
        this.precoWifiPremium = precoWifiPremium;
        this.precoPensaoCompleta = precoPensaoCompleta;
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

    public double getPrecoWifiPremium() {
        return precoWifiPremium;
    }

    public void setPrecoWifiPremium(double precoWifiPremium) {
        this.precoWifiPremium = precoWifiPremium;
    }

    public double getPrecoPensaoCompleta() {
        return precoPensaoCompleta;
    }

    public void setPrecoPensaoCompleta(double precoPensaoCompleta) {
        this.precoPensaoCompleta = precoPensaoCompleta;
    }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.exibirReservaSuite(this);
    }

    @Override
    public double getPrecoTotal() {
        return this.getPreco()+ this.getPrecoPensaoCompleta() + this.getPrecoWifiPremium();
    }
}
