
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Test {
    String name;
        public static void main(String[] args) {
            Scanner cat = new Scanner(System.in);
            JOptionPane pane = new JOptionPane();
            Dog dog = new Dog();
            dog.eat();
            dog.setName("Van");
            dog.eat();
            System.out.println(dog.execute(11, 5));

//
//            String name = dog.getName();
            System.out.println(dog);

            Minus minus = new Minus();
            Addition add = new Addition();

            Strategy strat = new Strategy();


            for(int x = 0; x <= 10; x++) {
                System.out.print(x + " -> ");
            }
            boolean isADog = true;
//            if (isADog && )

            List<Dog> dogList = new ArrayList<>();
            Dog dog1 = new Dog("Test Dog1", 4);
            Dog dog2 = new Dog("Test Dog2", 4);
            Dog dog3 = new Dog("Test Dog3", 4);
            Dog dog4 = new Dog("Test Dog4", 4);
            Dog dog5 = new Dog("Test Dog5", 3);

            dogList.add(dog1);
            dogList.add(dog2);
            dogList.add(dog3);
            dogList.add(dog4);
            dogList.add(dog5);

            System.out.println("\n" + dogList);

//            dogList.get(1).eat();

            System.out.println(dogList.get(0).getDogg());
//            System.out.println(dogList.get(4).getSpeed());
//            System.out.println(dog.getLegs());

        }
    public void eat() {
        System.out.println(this.name + " is eating");
    }
    }