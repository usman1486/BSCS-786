public class Test {
    String person;
    int roomno;
    int floorno;

    public Test(String per, int room, int floor) {
        this.person = per;
        this.roomno = room;
        this.floorno = floor;
    }

    void disp() {
        System.out.println("name is-->" + person + "roomno->" + roomno + "floorno-->" + floorno);
    }

    public static void main(String[] args) {
        Test obj = new Test("USMAN", 122, 02);
        obj.disp();
        House ob = new House("Lahore", 90);
        ob.disp1();
    }

}
