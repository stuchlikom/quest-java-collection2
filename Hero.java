public class Hero implements Comparable<Hero>{

    // attributes
    private String Name;
    private int age;

    // constructors
    public Hero(String Name, int age) {
        this.Name = Name;
        this.age = age;
    }

    // getters
    public String getName() {
        return Name;
    }
    public int getAge() {
        return age;
    }

    // setters
    public void setName(String Name) {
        this.Name = Name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Hero o) {
        return this.Name.compareTo(o.getName()); // FOR STRING
        // return this.getAge() - o.getAge();    // FOR INTEGER
    }


}