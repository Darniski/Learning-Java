public class MixedMessages2 {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        while (x < 5) {
            y = y + x;
            System.out.print(x + "" + y + " ");
            x = x + 1;
        }

    }
}

// output = 00 11 23 36 410