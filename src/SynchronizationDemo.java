class OurTransaction{
    double balance =600;
    public double getBalance(){
        return balance;
    }

    public void withdraw(double amt){
        balance=balance-amt;
    }
}

class SynchronizationMethods implements Runnable{
    OurTransaction obj=new OurTransaction();
    public static void main(String[] args) {
        SynchronizationMethods acc=new SynchronizationMethods();
        Thread t1=new Thread(acc);
        Thread t2=new Thread(acc);

        t1.setName("Ananya");
        t2.setName("Isha");

        t1.start();
        t2.start();

    }

    public void run(){
        for(int i=0; i<3; i++){
            withdrawAmt(200);

            if(obj.getBalance()<200)
                System.out.println("Not enough founds");
        }
    }
    private synchronized void withdrawAmt(double amt){
        if(obj.getBalance()<-amt){
            System.out.println(Thread.currentThread().getName()+"is going to withdraw");
            try
            {
                Thread.sleep(1000);
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
            obj.withdraw(amt);
            System.out.println(Thread.currentThread().getName()+"Completes the withdraw");
        }
        else
            System.out.println("not enough found for"+Thread.currentThread().getName());
    }
}
