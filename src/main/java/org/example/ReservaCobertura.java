package org.example;

public class ReservaCobertura implements ReservaHotel{


    private String nomeHotel;

    private String quarto;

    private double preco;

    private double precoWifiPremium;

    private double precoPensaoCompleta;

    private double precoEstacionamentoPremium;

    private double precoVistaPanoramica;

    public ReservaCobertura(String nomeHotel, String quarto, double preco, double precoWifiPremium, double precoPensaoCompleta, double precoEstacionamentoPremium, double precoVistaPanoramica) {
        this.nomeHotel = nomeHotel;
        this.quarto = quarto;
        this.preco = preco;
        this.precoWifiPremium = precoWifiPremium;
        this.precoPensaoCompleta = precoPensaoCompleta;
        this.precoEstacionamentoPremium = precoEstacionamentoPremium;
        this.precoVistaPanoramica = precoVistaPanoramica;
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

    public double getPrecoEstacionamentoPremium() {
        return precoEstacionamentoPremium;
    }

    public void setPrecoEstacionamentoPremium(double precoEstacionamentoPremium) {
        this.precoEstacionamentoPremium = precoEstacionamentoPremium;
    }

    public double getPrecoVistaPanoramica() {
        return precoVistaPanoramica;
    }

    public void setPrecoVistaPanoramica(double precoVistaPanoramica) {
        this.precoVistaPanoramica = precoVistaPanoramica;
    }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.exibirReservaCobertura(this);
    }

    @Override
    public double getPrecoTotal() {
        return this.getPreco()+this.getPrecoEstacionamentoPremium()+this.getPrecoWifiPremium()+
                this.getPrecoPensaoCompleta()+this.getPrecoVistaPanoramica();
    }
}
