import java.util.Comparator;

public class SortNotebooks implements Comparator<NoteBook> {

    @Override
    public int compare(NoteBook o1, NoteBook o2) {
        int flag = o1.getPrice() - o2.getPrice();
        if(flag == 0) flag = o2.getRam() - o1.getRam();
        if(flag == 0) flag = o1.getRating() - o2.getRating();
        return flag;
    }
}
