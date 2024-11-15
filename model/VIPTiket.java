public class VIPTiket extends Tiket {
    public VIPTiket() {
        super(350000, "VIP", "V01");
    }

    @Override
    public double calculatePayment() {
        return tiketPrice;
    }
}
