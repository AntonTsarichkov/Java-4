public class Airline {

    private String destination;
    private int flightNumber;
    private String planeType;
    private String departureTime;
    private String[] daysOfWeek;

    // Конструктор з параметрами
    public Airline(String destination, int flightNumber, String planeType, String departureTime, String[] daysOfWeek) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.planeType = planeType;
        this.departureTime = departureTime;
        this.daysOfWeek = daysOfWeek;
    }

    // Сетери та геттери для типу
    public void setТип(String planeType) {
        this.planeType = planeType;
    }

    public String getТип() {
        return planeType;
    }

    // Додаткові методи

    // Створення масиву об'єктів Airline
    public static Airline[] createAirlineArray(int size) {
        Airline[] airlines = new Airline[size];
        for (int i = 0; i < size; i++) {
            airlines[i] = new Airline("Київ", i + 1, "Boeing 737", "10:00", new String[]{"Пн", "Ср", "Пт"});
        }
        return airlines;
    }

    // Виведення списку рейсів
    public static void printAirlineList(Airline[] airlines) {
        System.out.println("Список рейсів:");
        for (Airline airline : airlines) {
            System.out.println("Пункт призначення: " + airline.destination);
            System.out.println("Номер рейсу: " + airline.flightNumber);
            System.out.println("Тип літака: " + airline.planeType);
            System.out.println("Час вильоту: " + airline.departureTime);
            System.out.println("Дні тижня: " + String.join(", ", airline.daysOfWeek));
            System.out.println();
        }
    }
}
