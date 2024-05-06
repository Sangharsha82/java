class SynchronizationBlock1 {
    public void display(String name) {
        synchronized (this){
            for(int i =0 ; i<3 ; i++){
                System.out.println("Hello"+name);
            }
        }
    }
}

class SynchronizationBlock2 extends Thread {
    SynchronizationBlock1 block1;
    String name;

    SynchronizationBlock2(SynchronizationBlock1 block1, String name) {
        this.block1 = block1;
        this.name = name;

    }

    @Override
    public void run() {
        block1.display(name);
    }
}
    public class SynchronizationBlock {
        public static void main(String[] args) {
            SynchronizationBlock1 block1 = new SynchronizationBlock1();
            SynchronizationBlock2 t1 = new SynchronizationBlock2(block1, "ananya");
            SynchronizationBlock2 t2 = new SynchronizationBlock2(block1, "Abhiraj");
            t1.start();
            t2.start();

        }
    }
