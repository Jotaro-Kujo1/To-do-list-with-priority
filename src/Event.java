public class Event {
    private String pr;
    private String work;
    private int nums;
    private int raiting;


    public Event(String pr, String work,int nums, int raiting){
        this.pr = pr;
        this.work = work;
        this.nums = nums;
        this.raiting = raiting;

    }
    public String toString() {
        return "Name='" + pr + '\'' +
                ", task='" + work + '\'' +
                ", nums='" + nums + '\'' +
                ", raiting=" + raiting;
    }

}
