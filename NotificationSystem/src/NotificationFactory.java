public class NotificationFactory {

    public Notification createNotification(String type){
        switch (type.toUpperCase()){
            case "EMAIL":
                return new EmailNotification();

            case "SMS":
                return new SmsNotification();

            case "WHATSAPP":
                return new WhatsappNotification();

            default:
                throw new IllegalArgumentException("Invalid notification type");
        }
    }

}
