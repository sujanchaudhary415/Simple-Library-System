public class Member {
    protected String name;
    protected int id;

    Member(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String toString() {
       return "👤 name: " + name + " Id: " + id;
    }
}

class Student extends Member{
        private String grade;

        Student(String name,int id,String grade)
        {
            super(name,id);
            this.grade=grade;

        }


    @Override
    public String toString() {
      return "Name: "+name+" Id: " +id+ "Grade: "+grade;
    }

    }


