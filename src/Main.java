import java.util.*;


public class Main {

    public static void main(String[] args) {
        List<String> listGoods = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int num = 0;
        while (num < 5) {

            System.out.println("   Выберите операцию:");
            System.out.println("------------------------");
            System.out.println("1. Добавить в список покупок");
            System.out.println("2. Показать список покупок");
            System.out.println("3. Удалить из списка");
            System.out.println("4. Поиск по ключевым словам");
            System.out.println("5. Завершить");
            num = scanner.nextInt();

            switch (num) {

                case 1:
                    scanner = new Scanner(System.in);
                    System.out.println("Какой товар желаете добавить в список покупок?");
                    String newGoods = scanner.nextLine();
                    listGoods.add(newGoods);
                    System.out.println(listGoods);
                    System.out.println("Итого в списке покупок: " + listGoods.size());
                    System.out.println();
                    break;
                case 2:
                    boolean list = listGoods.isEmpty();
                    if (list == true) {
                        System.out.println("Ваш список пуст");
                        System.out.println();
                    } else {
                        System.out.println("Список покупок:");
                        for (int i = 0; i < listGoods.size(); i++) {
                            System.out.println((i + 1) + ". " + listGoods.get(i));
                        }
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Список покупок:");
                    for (int i = 0; i < listGoods.size(); i++) {
                        System.out.println((i + 1) + ". " + listGoods.get(i));
                    }
                    System.out.println();
                    System.out.println("Какую позицию хотите удалить? Введите номер или название");
                    scanner = new Scanner(System.in);
                    String removeGoods = scanner.nextLine();
                    try {
                        int numGoods = Integer.parseInt(removeGoods) - 1;
                        listGoods.remove(numGoods);
                    } catch (NumberFormatException e) {
                        listGoods.remove(removeGoods);
                    }
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Введите текст для поиска");
                    scanner = new Scanner(System.in);
                    String query = scanner.nextLine();
                    String queryLower = query.toLowerCase();
                    for (int i = 0; i < listGoods.size(); i++) {
                        String item = listGoods.get(i);
                        String itemLower = item.toLowerCase();
                        if (itemLower.contains(queryLower)) {
                            System.out.println((listGoods.indexOf(item) + 1) + ". " + item);
                        }
                    }
                    System.out.println();
                    break;

            }
        }
    }
}
