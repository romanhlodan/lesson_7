package ua.com.hrv;

public class Main {

    public static void main(String[] args) {

        CY_27 cy_27 = new CY_27();
        System.out.println("Запуск двигунів: " + cy_27.engineStart());
        System.out.println("Рух в гору: " + cy_27.getAircraft_control().up());
        System.out.println("Рух в ліво: " + cy_27.getAircraft_control().left());
        System.out.println("Рух вниз: " + cy_27.getAircraft_control().down());
        System.out.println("Рух в право: " + cy_27.getAircraft_control().right());
        System.out.println("Режим Стелс: " + cy_27.stels());
        System.out.println("Ядерний удар: " + cy_27.nuclear());
        System.out.println("Турборежим: " + cy_27.turbo());
        cy_27.planeLanding();

    }
}
