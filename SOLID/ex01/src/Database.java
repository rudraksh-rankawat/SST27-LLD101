public class Database implements IDatabase{
    @Override
    public void store() {
        System.out.println("Order stored (pretend DB).");
    }
}