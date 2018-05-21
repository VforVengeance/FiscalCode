public class User {
    private String name;
    private String surname;
    private int bornYear;

    public User (String name, String surname, int bornYear) {
        this.name = name;
        this.surname = surname;
        this.bornYear = bornYear;
    }

    @Override
    public String toString() {
        return name+" "+surname+" "+bornYear;

    }

    public String getName() {
        return name.substring(0, 3);
    }

    public String getSurname() {
        return surname.substring(0, 3);
    }

    public int getbDay(){
        bornYear = bornYear%100;
        return bornYear;
    }
}
