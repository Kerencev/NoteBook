import java.util.Arrays;

public class ArrNotebooks {

    private static NoteBook[] note;
    private static final String[] manufacturers = {"Lenuvo", "Asos", "MacNote", "Eser", "Xamiou"};

    static void createNotebooks(int length) {
        note = new NoteBook[length];
        for (int i = 0; i < length; i ++) {
            note[i] = new NoteBook();
            note[i].setPrice((int) (Math.random() * 31 + 10) * 50);
            note[i].setRam((int) (Math.random() * 6 + 1) * 4);
            int n = (int)Math.floor(Math.random() * manufacturers.length);
            note[i].setManufacturer(manufacturers[n]);
            note[i].setRating(manufacturers, note[i].getManufacturer());
        }
    }

    public static void main(String[] args) {

        createNotebooks(10_000);

        long startTime = System.currentTimeMillis();

        Arrays.sort(note, new SortNotebooks());

        long endTime = System.currentTimeMillis();

        for (NoteBook n : note) {
            System.out.println(n);
        }

        System.out.println(endTime - startTime);
    }
}
