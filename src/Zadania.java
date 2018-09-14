import java.util.Scanner;

public class Zadania {
    public static void main(String[] args)
    {int a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe:");
        a=scanner.nextInt();
        System.out.println("Podaj druga liczbe:");
        b=scanner.nextInt();
        System.out.println("Podaj trzecia liczbe:");
        c=scanner.nextInt();

        if (a+b>c&&b+c>a&&c+a>b)
        System.out.println("z tych dlugosci mozna zbudowac trojkat");

        else
        System.out.println("nie da sie z tych danych zbudowac trojkat");

    }
    }



