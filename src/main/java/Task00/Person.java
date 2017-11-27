package Task00;

public class Person {
    private String name;
    private String surname;
    private String email;

    Person(String name_, String surname_, String email_){
        this.name = name_;
        this.surname = surname_;
        this.email = email_;
    }


    public String toString(){
        return this.name+" "+this.surname+" "+this.email+'\n';
    }

    public String getName(){
        return this.name;
    }

    public String getSurname(){
        return this.surname;
    }

    public String getEmail(){
        return email;
    }
}
