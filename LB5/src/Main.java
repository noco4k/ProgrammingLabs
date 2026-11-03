//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner in = new Scanner(System.in);
    while (true) {

        System.out.println("1. Класс телефон");
        System.out.println("2. Класс Парк");
        System.out.println("3. Класс Закан с enum");
        System.out.println("0. Выход из программы");
        System.out.print("Выберите пункт меню: ");

        String a = in.nextLine();

        switch (a) {
            case "1":
                SmartPhone smartPhone = new SmartPhone("Sony", 8, 20);
                System.out.println(smartPhone.isGoodBattery());
                break;

            case "2":
                Park[] parkArr = new Park[]{new Park("Лошицкий парк", 3000.3, 111),
                        new Park("Парк горикова", 2314, 123),
                        new Park("test1", 2321, 345),
                        new Park("test2", 223, 41),
                        new Park("test3", 324, 42),
                        new Park("test4", 2133, 421)};
                double maxArea = 0;
                int indexOfArea = -1;

                for (int i = 0; i < parkArr.length; i++) {
                    if (parkArr[i].getArea() > maxArea) {
                        maxArea = parkArr[i].getArea();
                        indexOfArea = i;
                    }
                }
                System.out.println("Парк с самой большой площадью" + parkArr[indexOfArea].name);
                break;
            case "3":
                Order[] orderArr = new Order[]{new Order(1, OrderStatus.PENDING),
                        new Order(2, OrderStatus.SHIPPED),
                        new Order(3, OrderStatus.DELIVERED),
                        new Order(4, OrderStatus.SHIPPED),
                        new Order(5, OrderStatus.SHIPPED)};
                for (int i = 0; i < orderArr.length; i++) {
                    if (orderArr[i].getStatus() == OrderStatus.SHIPPED) {
                        System.out.println(orderArr[i]);
                    }
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

public class SmartPhone {
    private String brand;
    private double screenSize;
    private int batteryLife;

    public SmartPhone(String brand, double screenSize, int batteryLife) {
        this.brand = brand;
        this.screenSize = screenSize;
        this.batteryLife = batteryLife;
    }

    public boolean isGoodBattery() {
        return this.batteryLife > 10;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getScreenSize() {
        return this.screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getBatteryLife() {
        return this.batteryLife;
    }

    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }
}

public class Park {
    private String name;
    private double area;
    private int trees;

    public Park(String name, double area, int trees) {
        this.name = name;
        this.area = area;
        this.trees = trees;
    }

    public String getName() {
        return this.name;
    }

    public double getArea() {
        return this.area;
    }

    public int getTrees() {
        return this.trees;
    }
}

public enum OrderStatus {
    PENDING,
    SHIPPED,
    DELIVERED,
    RETURNED
}

public class Order {
    private int id;
    private OrderStatus status;

    Order(int id, OrderStatus status) {
        this.id = id;
        this.status = status;
    }

    public int getId() {
        return this.id;
    }

    public OrderStatus getStatus() {
        return this.status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Заказ: {" + this.id + ", " + this.status + "}";
    }
}