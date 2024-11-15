public class UndanganTiket extends Tiket {
    public UndanganTiket() {
        super(10000, "Undangan", "U03");
    }

    @Override
    public double calculatePayment() {
        return tiketPrice;
    }
}
