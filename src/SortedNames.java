import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortedNames {

    public static void main (String[] args) {
        sortingNames();
    }

    public static void sortingNames () {
        Scanner sc = new Scanner(System.in);

        String allNames;

        System.out.println("ENTRE COM NOMES SEPARADOS POR VÍRGULAS: ");
        allNames = sc.nextLine();
        List<String> names = new ArrayList<>(List.of(allNames.split(",")));

        Collections.sort(names);
         printNames(names);

         sc.close();
    }

    private static void printNames (List<String> names) {
        for (String i : names) {
            System.out.println(i);
        }
    }
}
