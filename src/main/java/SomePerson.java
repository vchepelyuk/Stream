@SomeAnnotation(name = "Viktor", dateOfCreation = 2022)
public class SomePerson {
    private int id;
    private String name;

    public SomePerson() {
        this.id = -1;
        this.name = "No name";
    }

    public SomePerson(int id, String name) {
        this.id = id;
        this.name = name;
    }

    private void privateMethod() {
        System.out.println("private");
    }

    public void sayHello() {
        System.out.println("Person with id " + id + " and name " + name + " say hello");
    }

    @Override
    public String toString() {
        return "SomePerson{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
