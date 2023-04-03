package Task1;

public class FinlandHen extends Hen{

    FinlandHen(int countOfEggs, String country){
        super(countOfEggs);
        this.country = country;
    }

    @Override
    public String getDescription() {
        description += ", моя страна: " + country + "\nнесу: " + countOfEggs + " яиц в месяц";
        return description;
    }

}
