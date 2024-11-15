public class RegularTicket extends Tiket {
    public RegularTicket() {
        super(150000, "Regular", "R02");
    }

    @Override
    public double calculatePayment() {
        return tiketPrice;
    }
}
