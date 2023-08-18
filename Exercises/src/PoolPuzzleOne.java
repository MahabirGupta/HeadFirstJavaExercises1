public class PoolPuzzleOne {

    public static void main(String[] args) {
        int x = 0;
        while (x < 4) {

            System.out.print("a");
//            x = x - 1;

            if (x < 1) {
                System.out.print(" ");
//                System.out.print("noise");
//                System.out.print("annoys");
            }
            System.out.print("n");
//            x = x + 2;

            if (x > 1) {
//                System.out.print("a");
//                System.out.print(" ");
//                System.out.print("noise");
                System.out.print(" oyster");
                x = x + 2;

            }
            if (x == 1) {
//                System.out.print("annoys");
//                System.out.print("a");
//                System.out.print(" ");
//                System.out.print("noise");
//                x = x -2 ;
//                System.out.print("an");
//                System.out.print("oyster");
//                x = x + 2;
                System.out.print("noys");

            }
            if (x < 1) {
//                System.out.print("an");
//                System.out.print("oyster");

                System.out.print("oise");
            }
            System.out.println("");
            x = x + 1;
        }
    }
}
