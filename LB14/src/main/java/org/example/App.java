package org.example;
import java.io.*;
import java.util.Random;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("1 - Информация о любимом магазине");
        System.out.println("2 - 10 чисел: кратные 4, не кратные 8");
        System.out.println("3 - Случайные числа: кратные 9 и не кратные 2");
        System.out.println("4 - 15 значений скорости интернета");
        System.out.println("5 - 10 чисел: количество больших 60");
        System.out.println("0 - Выход");
        System.out.print("Выберите задание: ");

        Scanner scanner =new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                String fileName = "shop.txt";

                try (FileWriter writer = new FileWriter(fileName)) {
                    writer.write("Мой любимый магазин: Евроопт\n");
                    writer.write("Адрес: г. Минск, ул. Центральная, 15\n");
                    writer.write("Режим работы: 08:00 - 23:00\n");
                    writer.write("Тип: продуктовый гипермаркет\n");
                    writer.write("Особенности: широкий ассортимент, скидки по карте\n");
                    System.out.println("Файл \"" + fileName + "\" успешно создан.");
                } catch (IOException e) {
                    System.err.println("Ошибка при записи файла: " + e.getMessage());
                    return;
                }

                File file = new File(fileName);
                System.out.println("\nДанные о файле");
                System.out.println("Имя файла: " + file.getName());
                System.out.println("Путь: " + file.getAbsolutePath());
                System.out.println("Размер: " + file.length() + " байт");
                System.out.println("Файл существует: " + file.exists());
                System.out.println("Можно читать: " + file.canRead());
                System.out.println("Можно записывать: " + file.canWrite());
                System.out.println("Это директория: " + file.isDirectory());

                System.out.println("\nСодержимое файла");
                try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        System.out.println(line);
                    }
                } catch (IOException e) {
                    System.err.println("Ошибка при чтении файла: " + e.getMessage());
                }
                break;
            case 2:
                String fileName1 = "f.txt";

                try (PrintWriter writer = new PrintWriter(new FileWriter(fileName1))) {
                    System.out.println("Введите 10 целых чисел:");
                    for (int i = 0; i < 10; i++) {
                        System.out.print("Число " + (i + 1) + ": ");
                        int num = scanner.nextInt();
                        writer.println(num);
                    }
                    System.out.println("Числа записаны в файл \"" + fileName1 + "\".");
                } catch (IOException e) {
                    System.err.println("Ошибка при записи в файл: " + e.getMessage());
                    return;
                }

                System.out.println("\nЧисла из файла");
                int count = 0;
                try (BufferedReader reader = new BufferedReader(new FileReader(fileName1))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        int num = Integer.parseInt(line.trim());
                        System.out.print(num + " ");
                        if (num % 4 == 0 && num % 8 != 0) {
                            count++;
                        }
                    }
                } catch (IOException e) {
                    System.err.println("Ошибка при чтении файла: " + e.getMessage());
                    return;
                }
                System.out.println("\nКоличество чисел, кратных 4 и не кратных 8: " + count);
                break;
            case 3:
                Random random = new Random();
                String fileF = "f.txt";
                String fileG = "g.txt";
                String fileH = "h.txt";
                int n = 20;

                try (PrintWriter writer = new PrintWriter(new FileWriter(fileF))) {
                    System.out.println("Сгенерированные числа (файл f):");
                    for (int i = 0; i < n; i++) {
                        int num = random.nextInt(201) - 100;
                        writer.println(num);
                        System.out.print(num + " ");
                    }
                    System.out.println();
                } catch (IOException e) {
                    System.err.println("Ошибка: " + e.getMessage());
                    return;
                }

                try (BufferedReader reader = new BufferedReader(new FileReader(fileF));
                     PrintWriter writerG = new PrintWriter(new FileWriter(fileG));
                     PrintWriter writerH = new PrintWriter(new FileWriter(fileH))) {

                    StringBuilder gNums = new StringBuilder();
                    StringBuilder hNums = new StringBuilder();
                    String line;

                    while ((line = reader.readLine()) != null) {
                        int num = Integer.parseInt(line.trim());
                        if (num % 9 == 0 && num % 2 != 0) {
                            writerG.println(num);
                            gNums.append(num).append(" ");
                        } else {
                            writerH.println(num);
                            hNums.append(num).append(" ");
                        }
                    }

                    System.out.println("Кратные 9 и не кратные 2 (файл g): " +
                            (gNums.length() > 0 ? gNums : "(нет)"));
                    System.out.println("Остальные (файл h): " +
                            (hNums.length() > 0 ? hNums : "(нет)"));
                } catch (IOException e) {
                    System.err.println("Ошибка: " + e.getMessage());
                }
                break;
            case 4:
                String fileName2 = "internet_speed.txt";

                try (PrintWriter writer = new PrintWriter(new FileWriter(fileName2))) {
                    System.out.println("Введите 15 значений скорости интернета (Мбит/с):");
                    for (int i = 0; i < 15; i++) {
                        System.out.print("Значение " + (i + 1) + ": ");
                        double speed = scanner.nextDouble();
                        writer.println(speed);
                    }
                    System.out.println("Данные записаны в файл \"" + fileName2 + "\".");
                } catch (IOException e) {
                    System.err.println("Ошибка: " + e.getMessage());
                    return;
                }

                double sum = 0;
                int count1 = 0;
                System.out.println("\n--- Значения скорости интернета ---");
                try (BufferedReader reader = new BufferedReader(new FileReader(fileName2))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        double speed = Double.parseDouble(line.trim());
                        System.out.printf("%.2f Мбит/с%n", speed);
                        sum += speed;
                        count1++;
                    }
                } catch (IOException e) {
                    System.err.println("Ошибка: " + e.getMessage());
                    return;
                }

                if (count1 > 0) {
                    System.out.printf("Средняя скорость интернета: %.2f Мбит/с%n", sum / count1);
                }
                break;
            case 5:
                String fileName3 = "f.txt";
                Random random1 = new Random();
                try (PrintWriter writer = new PrintWriter(new FileWriter(fileName3))) {
                    System.out.println("Сгенерированные числа:");
                    for (int i = 0; i < 10; i++) {
                        int num = random1.nextInt(201) - 100;
                        writer.println(num);
                        System.out.print(num + " ");
                    }
                    System.out.println();
                } catch (IOException e) {
                    System.err.println("Ошибка: " + e.getMessage());
                    return;
                }

                int count2 = 0;
                System.out.println("Числа из файла");
                try (BufferedReader reader = new BufferedReader(new FileReader(fileName3))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        int num = Integer.parseInt(line.trim());
                        System.out.print(num + " ");
                        if (num > 60) {
                            count2++;
                        }
                    }
                } catch (IOException e) {
                    System.err.println("Ошибка: " + e.getMessage());
                    return;
                }
                System.out.println("\nКоличество чисел, больших 60: " + count2);
                break;
            case 0:
                System.out.println("Выход из программы.");
                return;
            default:
                System.out.println("Неверный выбор. Попробуйте снова.");
        }
    }
}
