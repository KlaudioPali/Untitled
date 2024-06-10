public class E2NestedIf {
    public static void main(String[] args) {

        boolean winter = false;
        String jacketColor = "blue";

        if (winter == true) {
            System.out.println("It's Very cold");
            if (jacketColor.equals("Red")) {
                System.out.println("Let's go with Red Nike Shoes");
            } else {
                System.out.println("Let's go with the blue ones");
            }
        }
    }
}
