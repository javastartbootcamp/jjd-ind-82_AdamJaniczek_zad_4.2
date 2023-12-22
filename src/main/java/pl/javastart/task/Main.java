package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Person adam = new Person("Adam", "Nowak");
        Person tomek = new Person("Tomek", "Malinowski");
        Task shoping = new Task("Zakupy", "kupić pieczywo", -10, adam);
        Task cleaning = new Task("Sprzątanie", "Umyć auto w piątek", -1, tomek);
        Task buyTickets = new Task("Zakupy", "Kupić bilety na koncert", 0, adam);
        System.out.println(shoping.lowPriority());
        System.out.println(cleaning.lowPriority());
        System.out.println(buyTickets.highPriority());
    }
}
