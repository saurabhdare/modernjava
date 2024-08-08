public class Virtual {
    public static void main(String[] args) throws Exception {

        var runnable = (Runnable) () -> {
            Thread t = Thread.currentThread();
            System.out.println("Hello Thread! " +
            (t.isVirtual() ? "virtual " : "platform ") + "ID: " + t.threadId());
        };

        var thread1 = new Thread(runnable);
        thread1.start();
        
        var thread2 = Thread.startVirtualThread(runnable);

        thread1.join();
        thread2.join();
    }
}
