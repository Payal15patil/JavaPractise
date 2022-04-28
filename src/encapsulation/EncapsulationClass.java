package encapsulation;

public class EncapsulationClass {
    public static void main(String[] args) {
        EncapsulationClass encapsulationClass = new EncapsulationClass();
        GetAndSet getAndSet = new GetAndSet();
        getAndSet.setName("payal",352);
        getAndSet.setName("yogesh",356);
        System.out.println(getAndSet.getName());
        System.out.println(getAndSet.getMyId());
    }
}
