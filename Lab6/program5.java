class MessageSender {
    public synchronized void sendMessage(String msg) {
        System.out.println("Sending: " + msg);
        try { Thread.sleep(100); } catch (InterruptedException e) {}
        System.out.println("Sent: " + msg);
    }
}

class MessageThread extends Thread {
    MessageSender sender;
    String message;

    MessageThread(MessageSender sender, String message) {
        this.sender = sender;
        this.message = message;
    }

    public void run() {
        sender.sendMessage(message);
    }
}

public class Main {
    public static void main(String[] args) {
        MessageSender sender = new MessageSender();
        new MessageThread(sender, "Hello").start();
        new MessageThread(sender, "World").start();
    }
}
