package Problema3_Store;

@SuppressWarnings("unused")
public enum Customer {
    GOLD_MEMBERSHIP,
    SILVER_MEMBERSHIP,
    NO_MEMBERSHIP;

    private int customerId;
    private String customerName;

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}