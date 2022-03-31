package ro.fasttrackit.curs22.homework.curs22homework.model;

public class Result {
    private int totalCorrect;
    private int totalWrong;

    public Result(){
        super();
    }

    public Result(int totalCorrect, int totalWrong) {
        super();
        this.totalCorrect = totalCorrect;
        this.totalWrong = totalWrong;
    }

    public int getTotalCorrect() {
        return totalCorrect;
    }

    public void setTotalCorrect(int totalCorrect) {
        this.totalCorrect = totalCorrect;
    }

    public int getTotalWrong() {
        return totalWrong;
    }

    public void setTotalWrong(int totalWrong) {
        this.totalWrong = totalWrong;
    }
}
