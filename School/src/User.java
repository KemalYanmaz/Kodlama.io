public class User {
    private String name;
    private String surname;
    private int age;
    private int id;
    public User(int id,String name,String surname,int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getSurname(){
        return surname;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getID(){
        return id;
    }

    public void setID(int id){
        this.id = id;
    }
}
