package dayTwo;

public class Cat {

    private String name;
    private String breed;

    public Cat(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public void cry() {
        System.out.println(name + "가 웁니다.");
    }

    public void scratch() {
        System.out.println(name + "가 긁습니다.");
    }

}
