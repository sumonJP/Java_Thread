package examquestion;

public class ThreadExample {

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(" I'm from Cumilla " + Thread.currentThread().getName());

                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("Canada is my favorite country " + Thread.currentThread().getName());

                }
            }
        });

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("Beautiful Bangladesh " + Thread.currentThread().getName());

                }
            }
        });

//        Rename a thread

        t2.setName("This this thread 1 according to index");
//        another way to create thread

        t3.setName("what is thread?");
        t3.getName();
        
        t1.start();
        t2.start();
        t3.start();
    }

}
