public abstract class Artist {
    string name;
    Genre genre;
    double performance;

    public Artist(string name, Genre genre, double performance) {
        this.name = name;
        this.genre = genre;
        this.performance = performance;
    }

    public abstract double calculatePayment();

}
