import java.util.ArrayList;
import java.util.List;

public class Stage {
    private String stageName;
    private int capacity;
    private String stageLocation;
    private List<Artist> artistList = new ArrayList<>();
    private List<Vendor> vendorList = new ArrayList<>();
    private List<Tiket> tiketSales = new ArrayList<>();

    public Stage(String stageName, int capacity, String stageLocation) {
        this.stageName = stageName;
        this.capacity = capacity;
        this.stageLocation = stageLocation;
    }

    public void addArtist(Artist artist) {
        artistList.add(artist);
    }

    public void addVendor(Vendor vendor) {
        vendorList.add(vendor);
    }

    public void sellTicket(Tiket tiket) {
        ticketSales.add(tiket);
    }

    public double generateRevenueReport() {
        double totalRevenue = 0;
        totalRevenue += tiket.calculatePayment();
        return totalRevenue;
    }
}