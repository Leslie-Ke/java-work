public class Text9_4 {
    public static void main(String[] args) {
        Bank bank =new Bank();
        bank.setMoney(200);
        Thread accountant,cashier;
        accountant = new Thread(bank);
        cashier = new Thread(bank);
        accountant.setName("会计");
        cashier.setName("出纳");
        accountant.start();
        cashier.start();
    }
}
class Bank implements Runnable {
    int money = 200;

    public void setMoney(int n) {

        money = n;
    }

    public void run() {
        if (Thread.currentThread().getName().equals("会计"))
            saveOrTake(300);

        else if (Thread.currentThread().getName().equals("出纳"))
            saveOrTake(150);

    }

    public synchronized void saveOrTake(int amount) {
        if (Thread.currentThread().getName().equals("会计")) {
            for (int i = 1; i <= 3; i++) {
                money = money + amount / 3;
                System.out.println((Thread.currentThread().getName() + "存入" + amount / 3 + "账上有" + money + "万，休息一会在存"));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            }
        } else if (Thread.currentThread().getName().equals("出纳")) {
            for (int i = 1; i <= 3; i++) {
                money = money - amount / 3;
                System.out.println(Thread.currentThread().getName() + "取出" + amount / 3 + "账上有" + money + "万,休息一会在取");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            }
        }
    }
}


