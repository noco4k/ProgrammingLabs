//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner in = new Scanner(System.in);
    while (true) {
        System.out.println("1. Преобразовать число в строку");
        System.out.println("2. Удалить все гласные буквы из строки");
        System.out.println("3. Отчет по сотрудникам");
        System.out.println("4. Регулярные выражения - спецсимвол не буква/не пробел");
        System.out.println("0. Выход из программы");
        System.out.print("Выберите пункт меню: ");

        String a = in.nextLine();

        switch (a) {
            case "1":
                int number = in.nextInt();
                String strValue = String.valueOf(number);

                System.out.println("Результат преобразования: \"" + strValue + "\"");
                System.out.println("Тип данных результата: " + strValue.getClass().getSimpleName());
                System.out.println("Длина полученной строки: " + strValue.length());
                break;

            case "2":
                String input = in.nextLine();

                // Удаление гласных (как русских, так и английских, в обоих регистрах)
                String result = input.replaceAll("(?i)[аеёиоуыэюяaeiou]", "");

                System.out.println("Исходная строка : " + input);
                System.out.println("Без гласных букв: " + result);
                break;

            case "3":
                Employee[] employees = new Employee[]{
                        new Employee("Иванов", 1250.50),
                        new Employee("Петров", 890.00),
                        new Employee("Сидорова", 2300.75),
                        new Employee("Александров", 1500.00)
                };

                Report.generateReport(employees);
                break;

            case "4":
                String text = "a!a a@a a#a a$a a%a a^a";
                System.out.println("Исходная строка: " + text);


                Pattern pattern = Pattern.compile("a[^\\p{L}\\s]a");
                Matcher matcher = pattern.matcher(text);

                System.out.println("Найденные подстроки по шаблону:");
                int count = 0;
                while (matcher.find()) {
                    count++;
                    System.out.println(count + ". " + matcher.group());
                }
                break;

            case "0":
                System.out.println("Завершение работы программы.");
                return;

            default:
                System.out.println("Ошибка выбора");
                break;
        }
    }
}
class Employee {
    private String fullname;
    private double salary;

    public Employee(String fullname, double salary) {
        this.fullname = fullname;
        this.salary = salary;
    }

    public String getFullname() {
        return fullname;
    }

    public double getSalary() {
        return salary;
    }
}

class Report {
    public static void generateReport(Employee[] employees) {
        System.out.printf("%-15s | %10s%n\n", "Фамилия", "Зарплата");
        for (Employee emp : employees) {
            System.out.printf("%-15s |%10.2f%n", emp.getFullname(), emp.getSalary());
        }
    }
}