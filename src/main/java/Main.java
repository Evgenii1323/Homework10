public class Main {
    public static void main(String[] args) {
        int i = 1;                      // 1
        // Сначала происходит загрузка класса Main с помощью ClassLoader в память Metaspace. Затем создается фрейм метода
        // main в стеке, затем в этом фрейме создается переменная i со значением 1
        Object o = new Object();        // 2
        // В куче создается новый объект, а в стеке новая переменная
        Integer ii = 2;                 // 3
        // В куче создается новый объект, а в стеке новая переменная
        printAll(o, i, ii);             // 4
        // Создается новый фрейм в стеке
        System.out.println("finished"); // 7
        // Создается новый фрейм с новый ссылкой
    }

    private static void printAll(Object o, int i, Integer ii) {
        Integer uselessVar = 700;                   // 5
        // Сначала создается ссылка на переменные, затем в куче создается новый объект, а в стеке новая переменная
        System.out.println(o.toString() + i + ii);  // 6
        // Создается новый фрейм с новый ссылкой
    }
}