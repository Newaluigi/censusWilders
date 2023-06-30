public class Classroom {
    public static void main(String[] args) {
        Wilder wilder1 = new Wilder("Valentin", true);
        Wilder wilder2 = new Wilder("Emeric", false);
        Wilder wilder3 = new Wilder("Tristan", true);
        Wilder wilder4 = new Wilder("Alexandre", false);
        Wilder wilder5 = new Wilder("Emma", true);

        System.out.println(wilder1.whoAmI());
        System.out.println(wilder2.whoAmI());
        System.out.println(wilder3.whoAmI());
        System.out.println(wilder4.whoAmI());
        System.out.println(wilder5.whoAmI());
    }
}