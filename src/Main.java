public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        // Попробовал использовать метод concat.
        // String fullName = lastName.concat(" " + firstName).concat(" " + middleName);
        System.out.println("Ф.И.О. сотрудника - " + fullName);

        System.out.println();
        System.out.println("Задание 2");
        System.out.println("Данные Ф.И.О. сотрудника для заполнения отчета - "
                + fullName.toUpperCase());

        System.out.println();
        System.out.println("Задание 3");
        String fullNameCopy = "Иванов Семён Семёныч";
        fullNameCopy = fullNameCopy.replace('ё', 'е');
        System.out.println("Данные Ф.И.О сотрудника - " + fullNameCopy);
    }
}