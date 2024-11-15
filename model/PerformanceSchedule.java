public class PerformanceSchedule {
    Date starTime;
    Date endTime;

    public PerformanceSchedule(Date starTime, Date endTime) {
        this.starTime = starTime;
        this.endTime = endTime;
    }
    
    public Date getStarTime() {
        return starTime;
    }
    public void setStarTime(Date starTime) {
        this.starTime = starTime;
    }

    public Date getEndTime() {
        return endTime;
    }
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}
