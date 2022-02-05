public class Task124 {
    public static void main(String[] args) {
//      Создание почты и людей
        MailService mailService = new MailService();
        Man mike = new Man("Mike");
        Man jake = new Man("Jake");
        Man julia = new Man("Julia");
//      Подписка людей на издания
        mailService.addMember(mike, Paper.Magazine);
        mailService.addMember(jake, Paper.News);
        mailService.addMember(julia, Paper.Magazine);
        mailService.addMember(julia, Paper.News);
//      Добавление журнала и газеты
        mailService.addPaper(Paper.Magazine, "Forbes");
        mailService.addPaper(Paper.News, "Everyday news");

    }
}
