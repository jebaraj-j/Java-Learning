class Class_Obj {
    String color;
    float height;
    String name;

    public void writing(){
        System.out.println("Writing");
    }

    static void main(String[] args) {
        Class_Obj pen = new Class_Obj();
        pen.color = "Black";
        pen.height = 10.5f;
        pen.name = "Cello";
        Class_Obj pen1 = new Class_Obj();
        pen1.name = "Renolds";
        pen1.color = "Green";
        pen1.height = 11f;
        Class_Obj pen2 = new Class_Obj();
        System.out.println(pen.color);
        System.out.println(pen.name);
        System.out.println(pen.height);
        System.out.println(pen1.color);
        System.out.println(pen1.name);
        System.out.println(pen1.height);
        System.out.println(pen2.color);
        System.out.println(pen2.name);
        System.out.println(pen2.height);
    }
}
