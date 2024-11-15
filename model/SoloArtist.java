public class SoloArtist extends Artist{
    string assistentName;

    public SoloArtist(String name, String genre, double performanceFee, string assistentName) {
        super(name, genre, performanceFee);
        this.assistentName = assistentName;
    }

    public string getAssistentName() {
        return assistentName;
    }

    public void setAssistentName(string assistentName) {
        this.assistentName = assistentName;
    }

    @Override
    public double calculatePayment() {
        return performanceFee;
    }
}
