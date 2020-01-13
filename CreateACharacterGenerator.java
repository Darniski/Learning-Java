public class CreateACharacterGenerator {
    public static void main(String[] args) {
        String[] firstNames = { "Dark", "Bright", "Swift", "Altimer", "Donald", "Toasty", "Death", "Tom", "Pierce",
                "Hillary", "Saint", "Angry", "Tony", "A'null", " Dicky", "Nacho"

        };
        // Shout out to my Buddy Patrick for some of the Names listed Here and in the
        // First Name Array
        String[] lastNames = { "Knight", "Demon", "Strike", "Blade", "Rump", "McGoats", "Harbinger", "Celldik",
                "Broman", "Tutman", "Dickless", "Member", "McGeyser", "Hurst", "Luckster", "Sweetie"

        };
        // creates an number based on the length of the array
        int nameFirstLength = firstNames.length;
        int nameLastLength = lastNames.length;
        // randomly selects a number from the array and multiples it
        int names1 = (int) (Math.random() * nameFirstLength);
        int names2 = (int) (Math.random() * nameLastLength);
        // Generates a random character name
        String characterName = firstNames[names1] + " " + lastNames[names2];

        System.out.println("Your Character name is " + characterName);

    }
}