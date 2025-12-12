package dayTwo;

public class Dog {

    String name;
    String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public void bark() {
        System.out.println(name + "가 짖습니다.");
    }

    public void wag() {
        System.out.println(name + "꼬리를 흔듭니다.");
    }

}
