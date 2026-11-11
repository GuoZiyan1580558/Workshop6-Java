public class Exercise2 {

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

        // Bubble sort: compare neighbouring songs and swap them (with their artists)
        for (int pass = 0; pass < songs.length - 1; pass++) {
            boolean swapped = false;
            for (int i = 0; i < songs.length - 1 - pass; i++) {
                if (songs[i].compareToIgnoreCase(songs[i + 1]) > 0) {
                    String tempSong = songs[i];
                    songs[i] = songs[i + 1];
                    songs[i + 1] = tempSong;

                    String tempArtist = artists[i];
                    artists[i] = artists[i + 1];
                    artists[i + 1] = tempArtist;

                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }

        System.out.println("My 10 favourite songs (alphabetical order)");
        System.out.println("-------------------------------------------");
        for (int i = 0; i < songs.length; i++) {
            System.out.println((i + 1) + ". " + songs[i] + " - " + artists[i]);
        }
    }
}
