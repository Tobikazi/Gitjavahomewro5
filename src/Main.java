import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean flag = true;

    Scanner scanner = new Scanner(System.in);

        ArrayList<String> purchases = new ArrayList<>();

    while (true) {
        System.out.println("Выберите операцию:");
        System.out.println("1. Добавить в список");
        System.out.println("2. Показать список");
        System.out.println("3. Удалить из списка");
        String operation = scanner.next();

        switch (operation) {

            case ("1") : {
                System.out.println();
                System.out.println("1. Молоко");
                System.out.println("2. Хлеб");
                System.out.println("3. Сыр");
                System.out.println();
                System.out.println("Какую покупку хотите добавить? Введите название.");
                purchases.add(scanner.next());
                break;
            }

            case ("2") : {
                showPurchases(purchases);
                break;
            }

            case ("3") : {
                showPurchases(purchases);
                System.out.println("Какую хотите удалить? Введите номер или название");
                String deleteValue = scanner.next();
                if(isNumber(deleteValue)) {
                    int index = Integer.parseInt(deleteValue);
                    purchases.remove(--index);
                }
                purchases.remove(deleteValue);
                break;
            }

            default: {
                flag = false;
            }
        }
    }
}
    private  static boolean isNumber(String value) {
        try {
            Integer.parseInt(value);
        } catch (NumberFormatException ex) {
            return false;

        }
        return true;
    }

    private static void showPurchases(ArrayList<String> purchases) {
        int count = 1;
        System.out.println("Список покупок");
        for ( String purchase : purchases)
            System.out.println((count++) + ". " + purchase);
    }
}
