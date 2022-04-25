public class classroom {
    int ClassID;
    String ClassName;
    public classroom (){
        ClassID = 21;
        ClassName = " T2109A ";

    }
    public classroom (int id , String name){
        ClassID = id;
        ClassName = name;
    }
    public String toString () {
        return "ClassID" + ":" + ClassID + ":" + "ClassName" + ":" + ClassName;
    }
}