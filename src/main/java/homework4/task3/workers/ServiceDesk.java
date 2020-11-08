package homework4.task3.workers;

public class ServiceDesk {
    private static int ticketNumber = 0;

    public static void createTicket(String description) {
        System.out.printf("Заявка %d была создана: %s%n", ++ticketNumber, description);
        if (description.matches("^.*((справка)|(отчет)|(бюджет)).*$")) {
            Accountant.takeTicket(ticketNumber);
            return;
        } else if (description.matches("^.*((доставка)|(курьер)).*$")) {
            Logistician.takeTicket(ticketNumber);
            return;
        } else if (description.matches("^.*((компьютер)|(сервер)|(принтер)).*$")) {
            SysAdmin.takeTicket(ticketNumber);
            return;
        } else if (description.contains("уборк")) {
            Cleaner.takeTicket(ticketNumber);
            return;
        } else {
            takeTicket();
        }
    }

    private static void takeTicket() {
        System.out.println("Специалист по выполнению заявки № " + ticketNumber + " не найден");
    }

}
