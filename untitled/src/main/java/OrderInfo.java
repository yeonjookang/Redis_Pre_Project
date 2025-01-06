public class OrderInfo {
    String productName;
    Integer amount;
    Long timeStamp = System.currentTimeMillis();

    public OrderInfo(String productName, int amount) {
        this.productName = productName;
        this.amount = amount;
    }
}
