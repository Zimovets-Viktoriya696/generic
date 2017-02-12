/**
 * Created by Vika on 11.02.2017.
 */

class Dragons{}
class Otters{}
class Lizards{}
class Primats{}

class Dragon extends Dragons implements IEat{
    @Override
    public void eat(Object object) {
        if (object instanceof Banana) {
            System.out.println("Write");
        } else {
            System.out.println("I don't eat this");
        }
    }
}
class Salamander extends Dragons{}
class Gecko extends Lizards implements IEat{
    @Override
    public void eat(Object object) {
        if (object instanceof Banana) {
            System.out.println("Write");
        } else {
            System.out.println("I don't eat this");
        }
    }
}
class Square extends Lizards implements IEat{

    @Override
    public void eat(Object object) {
        if (object instanceof Banana) {
            System.out.println("Write");
        } else {
            System.out.println("I don't eat this");
        }
    }
}

class Dolphin extends Otters{}
class Pangolin extends Otters{}

public class Monkey extends Primats implements IEat {
    @Override
    public void eat(Object o) {
        if (o instanceof Banana) {
            System.out.println("Write");
        } else {
            System.out.println("I don't eat this");
        }
    }
}

class Human extends Primats implements IEat{
    @Override
    public void eat(Object o) {
        if (o instanceof Banana){
            System.out.println("Write");
        }
        else {
            System.out.println("I don't eat this");
        }
    }
}

class Capuchin extends Primats implements IEat{
    @Override
    public void eat(Object object) {
        if (object instanceof Banana){
            System.out.println("Write");
        }
        else {
            System.out.println("I don't eat this");
        }
    }
}

class Banana{}

interface IEat{
    void eat(Object object);

}