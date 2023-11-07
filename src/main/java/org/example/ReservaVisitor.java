package org.example;

public class ReservaVisitor implements Visitor{


    public String exibir(ReservaHotel reservaHotel){
        return reservaHotel.aceitar(this);
    }

    @Override
    public String exibirReservaQuartoSimples(ReservaQuartoSimples reservaQuartoSimples) {
        return "Hotel{" +
                "nomeHotel='" + reservaQuartoSimples.getNomeHotel() + '\'' +
                ", quarto='" + reservaQuartoSimples.getQuarto() + '\'' +
                ", preco=" + reservaQuartoSimples.getPreco() +
                '}';
    }

    @Override
    public String exibirReservaSuite(ReservaSuite reservaSuite) {
        return "Hotel{" +
                "nomeHotel='" + reservaSuite.getNomeHotel() + '\'' +
                ", quarto='" + reservaSuite.getQuarto() + '\'' +
                ", preco=" + reservaSuite.getPreco() +
                ", precoWifiPremium=" + reservaSuite.getPrecoWifiPremium() +
                ", precoPensaoCompleta=" + reservaSuite.getPrecoPensaoCompleta() +
                ", precoTotal=" + reservaSuite.getPrecoTotal() +
                '}';
    }

    @Override
    public String exibirReservaCobertura(ReservaCobertura reservaCobertura) {
        return "Hotel{" +
                "nomeHotel='" + reservaCobertura.getNomeHotel() + '\'' +
                ", quarto='" + reservaCobertura.getQuarto() + '\'' +
                ", preco=" + reservaCobertura.getPreco() +
                ", precoWifiPremium=" + reservaCobertura.getPrecoWifiPremium() +
                ", precoPensaoCompleta=" + reservaCobertura.getPrecoPensaoCompleta() +
                ", precoEstacionamentoPremium=" + reservaCobertura.getPrecoEstacionamentoPremium() +
                ", precoVistaPanoramica=" + reservaCobertura.getPrecoVistaPanoramica() +
                ", precoTotal=" + reservaCobertura.getPrecoTotal() +
                '}';
    }
}
