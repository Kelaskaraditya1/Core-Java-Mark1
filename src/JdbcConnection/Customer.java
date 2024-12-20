package JdbcConnection;
public class Customer {
    public int id,age;
    public String name,nationality,contact;
    public Customer(int id,String name,int age,String contact,String nationality)
    {
        this.id=id;
        this.name=name;
        this.age=age;
        this.contact=contact;
        this.nationality=nationality;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public Customer(String name, int age, String contact, String nationality){
        this.name=name;
        this.age=age;
        this.contact=contact;
        this.nationality=nationality;
    }
    public Customer()
    {

    }

    @Override
    public String toString() {
        return "Id:"+this.getId()+" Name:"+this.getName()+" Age:"+this.getAge()+" Contact:"+this.getContact()+" Nationality:"+this.getNationality();
    }
}
