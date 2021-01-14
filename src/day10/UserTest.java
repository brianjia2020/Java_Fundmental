package day10;

/**
 * 1. default values
 * 2. default values assigned
 * 3. constructor
 * 4. getter and setter
 *
 *
 */
public class UserTest {
    public static void main(String[] args) {
        User user = new User("brian",2);
        user.age = 3;
        System.out.println(user.age);
    }
}

class User{
    //default name is empty string
    String name;
    int age=1;

    public User(){
    }

    public User(String name,int age){
        this.name = name;
        this.age = age;
    }
}
