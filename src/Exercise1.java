public class Exercise1 {

    public static void main(String[] args) {
        String[] songs = {
            "Bohemian Rhapsody",
            "Hotel California",
            "Shape of You",
            "Blinding Lights",
            "Someone Like You",
            "Rolling in the Deep",
            "Viva La Vida",
            "Take Me Home, Country Roads",
            "Bad Guy",
            "Lose Yourself"
        };

        String[] artists = {
            "Queen",
            "Eagles",
            "Ed Sheeran",
            "The Weeknd",
            "Adele",
            "Adele",
            "Coldplay",
            "John Denver",
            "Billie Eilish",
            "Eminem"
        };

        System.out.println("My 10 favourite songs");
        System.out.println("---------------------");
        for (int i = 0; i < songs.length; i++) {
            System.out.println((i + 1) + ". " + songs[i] + " - " + artists[i]);
        }
    }
}
