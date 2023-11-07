import org.example.ReservaCobertura;
import org.example.ReservaQuartoSimples;
import org.example.ReservaSuite;
import org.example.ReservaVisitor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReservaVisitorTest {
    @Test
    void deveExibirReservaQuartoSimples() {
        ReservaQuartoSimples reservaQuartoSimples = new ReservaQuartoSimples("Hotel 1", "120", 100);
        ReservaVisitor reservaVisitor = new ReservaVisitor();
        assertEquals("Hotel{nomeHotel='Hotel 1', quarto='120', preco=100.0}", reservaVisitor.exibir(reservaQuartoSimples));
    }

    @Test
    void deveExibirReservaSuite() {
        ReservaSuite reservaSuite = new ReservaSuite("Hotel 1", "120", 100, 25, 80);

        ReservaVisitor reservaVisitor = new ReservaVisitor();
        assertEquals("Hotel{nomeHotel='Hotel 1', quarto='120', preco=100.0, precoWifiPremium=25.0, precoPensaoCompleta=80.0, precoTotal=205.0}", reservaVisitor.exibir(reservaSuite));
    }

    @Test
    void deveExibirReservaCobertura() {
        ReservaCobertura reservaCobertura = new ReservaCobertura("Hotel 1", "120", 100, 25, 80, 25, 70);

        ReservaVisitor reservaVisitor = new ReservaVisitor();
        assertEquals("Hotel{nomeHotel='Hotel 1', quarto='120', preco=100.0, precoWifiPremium=25.0, precoPensaoCompleta=80.0, precoEstacionamentoPremium=25.0, precoVistaPanoramica=70.0, precoTotal=300.0}",
                reservaVisitor.exibir(reservaCobertura));
    }
}
