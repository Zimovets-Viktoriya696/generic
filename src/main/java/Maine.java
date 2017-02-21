import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vika on 11.02.2017.
 */
public class Maine<T> {
    public static void main(String[] args) {


        Banana banana = new Banana();

        List<IEat> list = new ArrayList<IEat>();


    }

    public static List<?> All(List<?> list) {
        Monkey monkey = new Monkey();
        Human human = new Human();
        Capuchin capuchin = new Capuchin();
        Dragon dragon = new Dragon();
        Salamander salamander = new Salamander();
        Gecko gecko = new Gecko();
        Square square = new Square();
        Dolphin dolphin = new Dolphin();
        Pangolin pangolin = new Pangolin();

        List<Object> allAnimals = new ArrayList<Object>();

        allAnimals.add(dragon);
        allAnimals.add(monkey);
        allAnimals.add(human);
        allAnimals.add(capuchin);
        allAnimals.add(dragon);
        allAnimals.add(salamander);
        allAnimals.add(gecko);
        allAnimals.add(square);
        allAnimals.add(dolphin);
        allAnimals.add(pangolin);


        List<Primats> listOfPrimats = new ArrayList<Primats>();
        List<Otters> listOfOtters = new ArrayList<Otters>();
        List<Lizards> lizardss = new ArrayList<Lizards>();



        allAnimals.add(dragon);
        allAnimals.add(monkey);
        allAnimals.add(human);
        allAnimals.add(capuchin);
        allAnimals.add(dragon);
        allAnimals.add(salamander);
        allAnimals.add(gecko);
        allAnimals.add(square);
        allAnimals.add(dolphin);
        allAnimals.add(pangolin);

        return allAnimals;
    }


    public static List<IEat> eatBanan(List<?> list) {
        List<Dragons> list1 = new ArrayList<Dragons>();

        List<IEat> eatList = new ArrayList<IEat>();

        for (int i = 0; i < list.size(); i++) {

            try {
                final boolean b = list1.add((Dragons) list.get(i));

            } catch (Exception e) {
                System.out.println("SDVJDJ");
            }
        }
        return eatList;
    }

    private static void  sum(List<?> list) {


    }
}

