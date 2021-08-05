public class Instructor extends User{
    String department;
    public Instructor(int id,String name, String surname, int age,String department) {
        super(id, name, surname, age);
        this.department = department;
    }

    public String getDepartment(){
        return department;
    }

    public void setDepartment(String department){
        this.department = department;
    }
}
