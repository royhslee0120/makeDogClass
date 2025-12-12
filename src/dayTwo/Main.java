package dayTwo;

public class Main {

    public static void main(String[] args) {

        Dog dog1 = new Dog("멍멍이", "말티즈");
        Dog dog2 = new Dog("초코", "진돗개");
        Dog dog3 = new Dog("뭉치", "푸들");

        System.out.println(dog1.getName() + " / " + dog1.getBreed());
        System.out.println(dog2.getName() + " / " + dog2.getBreed());
        System.out.println(dog3.getName() + " / " + dog3.getBreed());

        dog1.bark();
        dog2.bark();
        dog3.bark();

        dog1.wag();
        dog2.wag();
        dog3.wag();
    }
}
