package dayTwo;

public class Main {

    public static void main(String[] args) {

        Dog dog1 = new Dog("멍멍이", "말티즈");
        Dog dog2 = new Dog("초코", "진돗개");
        Dog dog3 = new Dog("뭉치", "푸들");

        Cat cat1 = new Cat("피치", "샴");
        Cat cat2 = new Cat("야옹이", "먼치킨");
        Cat cat3 = new Cat("베르샤유", "페르시안");

        System.out.println(dog1.getName() + " / " + dog1.getBreed());
        System.out.println(dog2.getName() + " / " + dog2.getBreed());
        System.out.println(dog3.getName() + " / " + dog3.getBreed());

        System.out.println(cat1.getName() + " / " + cat1.getBreed());
        System.out.println(cat2.getName() + " / " + cat2.getBreed());
        System.out.println(cat3.getName() + " / " + cat3.getBreed());

        dog1.bark();
        dog2.bark();
        dog3.bark();

        dog1.wag();
        dog2.wag();
        dog3.wag();

        cat1.cry();
        cat2.cry();
        cat3.cry();

        cat1.scratch();
        cat2.scratch();
        cat3.scratch();

    }
}
