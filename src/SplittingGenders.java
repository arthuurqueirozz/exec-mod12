import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SplittingGenders {
    public static void main(String[] args) {
        splitGenders();
    }

    private static void splitGenders() {
        Scanner sc = new Scanner(System.in);

        System.out.println("DIGITE NOME-SEXO, CASO MAIS DE UM NOME SEPARE POR VÍGURLAS: ");
        String allNames = sc.nextLine();

        String[] nameSex = allNames.split(",");
        //printList(nameSex);
        printGenders(nameSex);

        sc.close();
    }

    private static void printGenders (String [] names) {
        List<String> masc = new ArrayList<>();
        List<String> fem = new ArrayList<>();

        for (String i : names) {
            if (i.endsWith("-M") || i.endsWith("-m")) {
                masc.add(i);
            } else if (i.endsWith("-F") || i.endsWith("-f")) {
                fem.add(i);
            } else System.out.println("FORMATO INVÁLIDO");
        }

        System.out.println("GENÊRO MASCULINO: ");
        for (String l : masc) {
            System.out.println(l);
        }

        System.out.println("GENÊRO FEMININO: ");
        for (String l : fem) {
            System.out.println(l);
        }
    }

    private static void printList (String [] list) {
        for (String i : list) {
            System.out.println(i);
        }
    }
}