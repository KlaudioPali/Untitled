package Class4;

public class E2NestedIf {
    public static void main(String[] args) {

        boolean winter = true;
        String jacketColor = "black";

        if (winter == true) {
            System.out.println("It's very cold");
            if (jacketColor.equals("blue")) {
                System.out.println("Let's go with red nike shoes");
            }
        } else {
            System.out.println("No need to wear jackets");
        }

    }
}
