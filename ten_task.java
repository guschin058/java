import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class Planet {
    private double distanceToSun; // расстояние до Солнца в млн км
    private double mass;          // масса в кг (10^24)
    private double diameter;      // диаметр в км

    public Planet(double distanceToSun, double mass, double diameter) {
        this.distanceToSun = distanceToSun;
        this.mass = mass;
        this.diameter = diameter;
    }

    // Геттеры
    public double getDistanceToSun() {
        return distanceToSun;
    }

    public double getMass() {
        return mass;
    }

    public double getDiameter() {
        return diameter;
    }

    // Сеттеры
    public void setDistanceToSun(double distanceToSun) {
        this.distanceToSun = distanceToSun;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return String.format("Расстояние до Солнца: %.2f млн км\nМасса: %.2f * 10^24 кг\nДиаметр: %.2f км",
                distanceToSun, mass, diameter);
    }
}

public class ten_task {
    public static void main(String[] args) {
        // Создаем карту для хранения планет
        Map<String, Planet> planets = new HashMap<>();

        // Добавляем планеты в систему
        planets.put("Меркурий", new Planet(57.9, 0.33, 4879));
        planets.put("Венера", new Planet(108.2, 4.87, 12104));
        planets.put("Земля", new Planet(149.6, 5.97, 12742));
        planets.put("Марс", new Planet(227.9, 0.642, 6779));
        planets.put("Юпитер", new Planet(778.3, 1898, 139822));
        planets.put("Сатурн", new Planet(1427, 568, 116464));
        planets.put("Уран", new Planet(2871, 86.8, 50724));
        planets.put("Нептун", new Planet(4498, 102, 49244));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Доступные планеты: " + String.join(", ", planets.keySet()));

        while (true) {
            System.out.print("\nВведите название планеты (или 'exit' для выхода): ");
            String planetName = scanner.nextLine();

            if (planetName.equalsIgnoreCase("exit")) {
                break;
            }

            Planet planet = planets.get(planetName);
            if (planet != null) {
                System.out.println("\nИнформация о планете " + planetName + ":");
                System.out.println(planet);
            } else {
                System.out.println("Планета '" + planetName + "' не найдена в солнечной системе!");
            }
        }

        System.out.println("Программа завершена.");
        scanner.close();
    }
}