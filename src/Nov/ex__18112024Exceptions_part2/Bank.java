package Nov.ex__18112024Exceptions_part2;

public class Bank {
    private String currency;
    private Integer amount;

    public  Bank(Integer amount,String currency){//constructor should not have returntype or void
        this.amount=amount;
        this.currency=currency;
    }

    public String getCurrency(){
       return currency;
    }
    public Integer getAmount(){
       return amount;
    }
    public void setAmount(Integer amount){
        this.amount=amount;
    }
    public void setCurrency(String currency){
        this.currency=currency;
    }
    public Integer add(Bank bankName) throws Exception {
        if (!bankName.currency.equalsIgnoreCase("INR")) {
          //  try {
                throw new Exception("Currency Mismatch, Can't Proceed!");
          //  } catch (Exception e) {
           //     throw new RuntimeException(e);
          //  }
        }
        return bankName.amount + this.amount;
    }
    @Override
    public String toString() {
        return "Bank{" + "currency='" + currency + '\'' + ", amount=" + amount + '}';
    }

}
