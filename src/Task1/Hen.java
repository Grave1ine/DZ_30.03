package Task1;

public class Hen {

    protected int countOfEggs;
    protected String description = "Я курица";
    protected String country;

    Hen (int countOfEggs){
        this.countOfEggs = countOfEggs;
    }
    public int getCountOfEggsPerMonth() {
       return countOfEggs;
    }
    public String getDescription() {
        return description;
    }
}
