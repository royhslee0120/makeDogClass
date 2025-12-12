package dayTwo;

public class Dog {

    private String name;
    private String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public void bark() {
        System.out.println(name + "가 짖습니다.");
    }

    public void wag() {
        System.out.println(name + "가 꼬리를 흔듭니다.");
    }

}
