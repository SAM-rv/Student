package Students;

public class Student {
    private int id;
    private String name;
    private int mark;
    private int age;

    public Student(int id, String name, int age, int mark) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    public int getId(){return id;}
    public int getAge(){return age;}
    public String getName(){return name;}
    public int getMark(){return mark;}

    void setMark(int mark){ this.mark=mark;}
}


