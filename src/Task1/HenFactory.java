package Task1;

public class HenFactory {

    public RussianHen getHen(String country, int countOfEggs){

       return new RussianHen(countOfEggs, country);
    }

}
