public class Main {

    public static void main(String[] args) {

        User u = new User("Giuseppe", "Marchese", 1997);
        System.out.println(u.toString());
        System.out.println("Formattted Name: "+u.getFormattedName());
    }
}
