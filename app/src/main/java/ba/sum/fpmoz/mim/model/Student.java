package ba.sum.fpmoz.mim.model;

public class Student {
    public String uid;
    public String name;
    public String surname;
    public String email;
    public String password;

    public Student() {
    }

    public Student(String uid, String name, String surname, String email,String password) {
        this.uid = uid;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}