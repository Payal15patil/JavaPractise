package Interface;

public abstract class Barclays implements Bank{
    @Override
    public abstract void withdrawal();

    @Override
    public void transaction() {
        System.out.println("Transaction is done today");
    }

    @Override
    public void balance() {
        System.out.println("I can check my balance");
    }

    @Override
    public void ATM() {
        System.out.println("ATM is not in use");
    }

    @Override
    public abstract void loan();

    public static void main(String[] args) {
        Barclays barclays = new Barclays() {
            @Override
            public void withdrawal() {

            }

            @Override
            public void loan() {

            }
        };
        barclays.transaction();
        barclays.balance();
        barclays.ATM();
    }
}
