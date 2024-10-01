public class Dog {
    private String name;
    private int age;
    private int multiplier;

    public Dog(String n, int a, int m) {
        name = n;
        age = a;
        multiplier = m;
    }
    public Dog(String n, int a) {
        name = n;
        age = a;
        multiplier = 7;
    }
    public Dog(String n) {
        age = 1;
        name = n;
        multiplier = 7;
    }
    public Dog() {
        age = 1;
        name = "dog";
        multiplier = 7;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public int getPeopleAge(int multiplier) {
        return age * multiplier;
    }
    public void increaseAgeByOne() {
        age ++;
    }
    /*public int increaseAgeByOne() {
        return age ++;
    }*/
}