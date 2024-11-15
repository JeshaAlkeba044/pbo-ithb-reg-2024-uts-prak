public class Main {
    public static void main(String[] args) {
        Stage festival = new Stage();

        SoloArtist soloArtist = {
            new SoloArtist("The Rockers", "Rock", 2000000, "Billy"),
            new SoloArtist("Tulus", "Jazz and Blues", 50000000, "Riri"),
            new SoloArtist("Katy Perry", "Classical", 50000000, "Tamra Natisin"),
            new SoloArtist("Ariana Grande", "Pop", 150000000, "Doug Middlebrook");
        }

        Band band = {
            new Band("The Rockers", "Rock", 20000000, 4),
            new Band("MAliq & D'essentials", "Jazz and Blues", 180000000, 6),
            new Band("Radiohead", "Classical", 90000000, 6),
            new Band("Blackpink", "POP", 180000000, 4);

        }

        festival.addArtist(soloArtist);
        festival.addArtist(band);

        Vendor vendor = {
            new Vendor("", "", 1500000);
        }
        festival.addVendor();

        festival.sellTiket(new RegularTiket());
        festival.sellTiket(new VIPTiket());
        festival.sellTiket(new InvitationTiket());

        System.out.println("Total Revenue: Rp " + festival.generateRevenueReport());
    }
}
