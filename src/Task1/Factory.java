package Task1;

public class Factory {
    public static void main(String[] args) {


        Hen bel = new BelarusianHen(35, "Белорусия");
        Hen mold = new MoldovanHen(40, "Молдавия");
        Hen Fin = new FinlandHen(38, "Финляндия");
        Hen Russ = new RussianHen(400, "Империя");

        print(bel);
        print(mold);
        print(Fin);
        print(Russ);

        HenFactory Newhen = new HenFactory();
        Hen ecuador = (Newhen.getHen("Эквадор", 20));
        Hen england = (Newhen.getHen("Англия", 38));

        print(ecuador);
        print(england);

    }

    public static void print(Hen object){
        System.out.println("\n");
        System.out.println(object.getDescription());
    }
}


//      1 задача:
//      Куриная фабрика
//      Написать Фабрику(Factory) по производству кур(Hen)
//    + 1. Создать класс Hen
//    + 1.1. Добавить в класс метод int getCountOfEggsPerMonth()
//    + 1.2. Добавить в класс метод String getDescription(), который возвращает строку "Я курица."
//    + 2. Создать класс RussianHen, который наследуется от Hen
//    + 3. Создать класс FinlandHen, который наследуется от Hen
//    + 4. Создать класс MoldovanHen, который наследуется от Hen
//    + 5. Создать класс BelarusianHen, который наследуется от Hen
//    + 6. В каждом из четырех последних классов написать свою реализацию метода getCountOfEggsPerMonth.
//      Методы должны возвращать количество яиц в месяц от данного типа куриц.
//    + 7. В каждом из четырех последних классов написать свою реализацию метода getDescription.
//      Методы должны возвращать строку вида:
//      <getDescription() родительского класса>  + <" Моя страна - SSSSS. Я несу N яиц в месяц.">
//      где SSSSS - название страны
//      где N - количество яиц в месяц
//      8. В классе HenFactory реализовать меетод getHen, который возвращает соответствующую стране породу кур
//      (вы передаете страну в виде строки и на основе нее получаете созданный объект курицы :)