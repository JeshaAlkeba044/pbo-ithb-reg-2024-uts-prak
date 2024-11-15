public abstract class Tiket {
    TiketType tiketType;
    double tiketPrice;
    String tiketNumber;

    public Tiket(TiketType tiketType, double tiketPrice, String tiketNumber) {
        this.tiketType = tiketType;
        this.tiketPrice = tiketPrice;
        this.tietNumber = tiketNumber;
    }

    public abstract double calculatePayment();
}

