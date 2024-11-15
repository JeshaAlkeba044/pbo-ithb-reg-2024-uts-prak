public class Band extends Artist {
    private int numberOfMembers;

    public Band(String name, String genre, double performanceFee, int numberOfMembers) {
        super(name, genre, performanceFee);
        this.numberOfMembers = numberOfMembers;
    }

    public int getNumberOfMembers() {
        return numberOfMembers;
    }


    public void setNumberOfMembers(int numberOfMembers) {
        this.numberOfMembers = numberOfMembers;
    }
    
    @Override
    public double calculatePayment() {
        return performanceFee;
    }
}
