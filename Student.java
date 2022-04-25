public class Student {
    int RollNo;
    String name;
    classroom myClass;

    public Student(int RollNo, String name) {
        this.name = name;
        this.RollNo = RollNo;
    }

    public Student(int RollNo, String name, classroom myClass){
        this.RollNo = RollNo;
        this.name = name;
        myClass = new classroom();

    }

    }
