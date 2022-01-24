public class Event {
    private String pr;
    private String work;
    private int raiting;

    public Event(String pr, String work, int raiting){
        this.pr = pr;
        this.work = work;
        this.raiting = raiting;
    }
    public String toString() {
        return "Name='" + pr + '\'' +
                ", task='" + work + '\'' +
                ", raiting=" + raiting;
    }

}
