public class Task {
    private String pr;
    private String work;
    private int nums;
    private int raiting;


    public Task(String pr, String work, int nums, int raiting){
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

    public String getPr() {
        return pr;
    }

    public String getWork() {
        return work;
    }

    public int getNums() {
        return nums;
    }

    public int getRaiting() {
        return raiting;
    }
}
