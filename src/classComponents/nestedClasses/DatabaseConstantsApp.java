package classComponents.nestedClasses;

public class DatabaseConstantsApp {
    static void main(String[] args) {
        System.out.println("Mysql Dev Credentials");
        System.out.println(Constants.Mysql.Dev.username);
        System.out.println(Constants.Mysql.Dev.password);

        System.out.println("Mysql QA Credientials");
        System.out.println(Constants.Mysql.QA.username);
        System.out.println(Constants.Mysql.QA.password);

        System.out.println("Mysql Prod Credientials");
        System.out.println(Constants.Mysql.Prod.username);
        System.out.println(Constants.Mysql.Prod.password);
    }
}
