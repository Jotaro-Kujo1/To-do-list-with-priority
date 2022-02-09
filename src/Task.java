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

    /*
    public String toString() {
        return "Name='" + pr + '\'' +
                ", task='" + work + '\'' +
                ", nums='" + nums + '\'' +
                ", raiting=" + raiting;
    }
     */

    public String toString(){
        return pr + " " + work + " " + nums + " ";
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

    public void setPr(String pr){
        this.pr = pr;
    }
    public void setWork(String work){
        this.work = work;
    }
    public void setNums(int nums){
        this.nums = nums;
    }
    public void setRaiting(int raiting){
        this.raiting = raiting;
    }
}
