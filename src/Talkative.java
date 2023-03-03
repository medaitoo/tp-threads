public class Talkative implements Runnable{
    public static int num;
    public Talkative(int num) {
        Talkative.num = num;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            Thread thread = new Thread(new Talkative(i));
            thread.setName("thread"+i);
            thread.start();
        }

    }

    @Override
    public void run() {
        for (int i = 1; i <= 100 ; i++) {
            System.out.println(Thread.currentThread().getName()+" - i: "+i+" ["+ num +"]");
        }
    }
}