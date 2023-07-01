package ushtrime_OOP;
public class Person {
    String name;
    String surname;
    String gender;
    int age;
    String pesel;
    void setName(String name){
        this.name=name;
    }
    void setSurname(String surname){
        this.surname=surname;
    }
    void setGender(String gender){
        this.gender=gender;
    }
    void setAge(int age){
        this.age=age;
    }
    void setPesel(String pesel){
        this.pesel=pesel;
    }
    public boolean hasReachedRetirementAge(int age, String gender){
        boolean retirement=false;
        if (gender.equals("Female")){
            int year_of_birth=2023-age;
            int dif=2023-year_of_birth;
            if(dif>=60){
                retirement= true;
            }
        }
        if (gender.equals("Male")){
            int year_of_birth=2023-age;
            int dif=2023-year_of_birth;
            if(dif>=65){
                retirement= true;
            }
        }
        return retirement;
    }
    public int returnDiff(int year){
        int years=0;
        year=this.age;
        gender=this.gender;
        boolean x=hasReachedRetirementAge(year,gender);
        if(x==false){
            int year_of_birth=2023-age;
            int dif=2023-year_of_birth;
            if(gender=="Male"){
                years=65-dif;
            }
            if(gender=="Female"){
                years=60-dif;
            }
        }
        return years;
    }

}
