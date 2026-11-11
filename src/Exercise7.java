public class Exercise7 {

    public static void main(String[] args) {
        Boxes small = new Boxes(5);
        System.out.println("Box size: " + small);
        small.draw();
        System.out.println();

        Boxes large = new Boxes(8);
        System.out.println("Box size: " + large);
        large.draw();
        System.out.println();

        System.out.println("The same box drawn with the Unicode line character:");
        large.setSize(6);
        System.out.println("Box size: " + large);
        large.drawWithUnicodeLine();
    }
}
