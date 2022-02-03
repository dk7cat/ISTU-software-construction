public class Task124 {
    public static void main(String[] args) {
        MailService mailService = new MailService();
        Man mike = new Man("Mike");
        Man jake = new Man("Jake");
        Man julia = new Man("Julia");

        mailService.addMember(mike, Paper.Magazine);
        mailService.addMember(jake, Paper.News);
        mailService.addMember(julia, Paper.Magazine);
        mailService.addMember(julia, Paper.News);

        mailService.addPaper(Paper.Magazine, "Forbes");
        mailService.addPaper(Paper.News, "Everyday news");

    }
}
