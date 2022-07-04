public class Emp {
    String name;
    int age;

    Emp() {

        System.out.println("default mall");
        this.name = "UMAN";
        this.age = 12;
    }

    public static void main(String[] args) {
        Emp obj = new Emp();
        System.out.println(obj.name + " " + obj.age);
    }
}
