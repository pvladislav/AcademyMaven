package Lesson7;

public class Method {
    public static void main(String[] args) {
        client(2012022001111L, 4);
        Method client = new Method();
        client.badClient("Livia");
    }

    static void client (long idnp, int balanceHistoryStatus) {
        if (balanceHistoryStatus > 0) {
            System.out.println("Client idnp = " + idnp);
            System.out.println("Congrats, you can buy a device");
        } else {
            System.out.println("Lashara");
        }
    }


    void badClient (String youName) {
        if (youName.equals("Vlad")) {
            System.out.println("Krasavceg");
        } else {
            System.out.println("ooooo loshara " + youName);
        }
    }
}
