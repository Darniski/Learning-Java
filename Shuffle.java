class Shuffle {
    public static void main(String[] args) {
        int x = 3;
        while (x > 0) { // this is the first of the magnets
            if (x > 2) {
                System.out.print("a");
            } // this is the second magnet
            x = x - 1;
            System.out.print("-"); // third magnet right here
            if (x == 2) {
                System.out.print("b c");
            } // forth magnet
            if (x == 1) {
                System.out.print("d");
                x = x - 1;
            } // fifth and final magnet

        }
    }
} // This is in reference to page 20 Code magnets
