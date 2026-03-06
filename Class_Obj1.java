class Pen {
    String color;
    float height;
    String name;

    public void writing(){
        System.out.println("Writing");
    }

    static void main(String[] args) {
        Pen pen = new Pen();
        pen.color = "Black";
        pen.height = 10.5f;
        pen.name = "Cello";
        Pen pen1 = new Pen();
        pen1.name = "Renolds";
        pen1.color = "Green";
        pen1.height = 11f;

        System.out.println(pen.color);
        System.out.println(pen.name);
        System.out.println(pen.height);
        System.out.println(pen1.color);
        System.out.println(pen1.name);
        System.out.println(pen1.height);
    }
}
