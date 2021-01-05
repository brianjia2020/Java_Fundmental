package day10;

/**
 * 1. OOP encapsulation and uncover
 *      when we have an Object, we can assign values to attributes by calling Object.attribute
 *      however, in reality, we always need to add more limiting conditions when assigning attribute values
 *      we have to use the private to limit access right and use setter and getter method to give
 *      specific rights.
 * 2. OOP encapsulation
 *      private all attributes
 *      (public) getter to get attribute value
 *      (public) setter to set attribute value
 */
public class AnimalTest {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.name = "dog";
        animal.age=1;
        animal.setLegs(12);
        System.out.println(animal);
        System.out.println(animal.getLegs());
    }
}

class Animal {
    String name;
    int age;
    private int legs;//number of legs

    public void eat(){
        System.out.println("Animal is eating");
    }

    public int getLegs(){
        return legs;
    }

    public void setLegs(int l){
        if(l >=0&&l%2==0) {
            legs = l;
        } else {
            legs = 0;
            // throw new Exception() to alert
        }
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", legs=" + legs +
                '}';
    }
}
