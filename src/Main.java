import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList(Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4));
        ArrayList<Integer> listShow = new ArrayList<>();

        for(int x : list) {
            if (x > 0 && x % 2 == 0){
                listShow.add(x);
            }
        }
        Collections.sort(listShow);
        for(int x : listShow) {
            System.out.println(x);
        }
    }
}
