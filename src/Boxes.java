public class Boxes {

    private static final int MIN_SIZE = 1;
    private static final int MAX_SIZE = 10;

    private int size;

    public Boxes(int size) {
        setSize(size);
    }

    public void setSize(int size) {
        if (size < MIN_SIZE || size > MAX_SIZE) {
            throw new IllegalArgumentException(
                "Box size must be between " + MIN_SIZE + " and " + MAX_SIZE + ", got " + size);
        }
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public String toString() {
        return size + " x " + size;
    }

    public void draw() {
        drawBox('-');
    }

    public void drawWithUnicodeLine() {
        drawBox('\u2500');
    }

    private void drawBox(char horizontal) {
        StringBuilder line = new StringBuilder();
        for (int i = 0; i < size; i++) {
            line.append(horizontal);
        }
        System.out.println(line);

        StringBuilder side = new StringBuilder();
        side.append('|');
        for (int i = 0; i < size - 2; i++) {
            side.append(' ');
        }
        side.append('|');

        for (int row = 0; row < size - 2; row++) {
            System.out.println(side);
        }

        if (size > 1) {
            System.out.println(line);
        }
    }
}
