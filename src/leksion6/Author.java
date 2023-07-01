package leksion6;

public class Author {
    public String surname;
    public String nationality;
    public Author(){}

    public Author(String surname) {
        this.surname = surname;
    }

    public Author(String surname, String nationality) {
        this.surname = surname;
        this.nationality = nationality;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getSurname() {
        return surname;
    }

    public String getNationality() {
        return nationality;
    }
}
