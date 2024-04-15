import java.math.BigDecimal;

public class Account {


  private Transaction[] transactions;

  // balance

  public Account(Transaction[] transactions) {
    this.transactions = transactions;
  }

  public void add(Transaction transaction) {
    Transaction[] copyArr = this.transactions;
    this.transactions = new Transaction[this.transactions.length + 1];
    int idx = 0;
    for (Transaction i : copyArr) {
      transactions[idx++] = i;
    }
    this.transactions[idx] = transaction;
  }

  public double balance() {
    double balance = 0.0d;

    for (Transaction i : transactions) {
      balance += BigDecimal.valueOf(i.getSign().getSignValue())
          .multiply(BigDecimal.valueOf(i.getAmount())).doubleValue();
    }
    return balance;
  }

  public void credit(Currency currency, double amount) {
    Transaction newTransaction = new Transaction(Sign.CREDIT, currency, amount);
    Transaction[] copyArr = this.transactions;
    this.transactions = new Transaction[this.transactions.length + 1];
    int idx = 0;
    for (Transaction i : copyArr) {
      this.transactions[idx++] = i;
    }
    this.transactions[idx] = newTransaction;
  }

  // boolean
  public boolean debit(Currency currency, double amount) {
    double balance = 0.0d;

    for (Transaction i : transactions) {
      balance += BigDecimal.valueOf(i.getSign().getSignValue())
          .multiply(BigDecimal.valueOf(i.getAmount())).doubleValue();
    }

    if (balance - amount > 0) {
      Transaction newTransaction =
          new Transaction(Sign.DEBIT, currency, amount);
      Transaction[] copyArr = this.transactions;
      this.transactions = new Transaction[this.transactions.length + 1];
      int idx = 0;
      for (Transaction i : copyArr) {
        this.transactions[idx++] = i;
      }
      this.transactions[idx] = newTransaction;
      return true;
    }
    System.out.println("Debit is rejected, due to not enough balance!");
    return false;
  }

  public static void main(String[] args) {
    Transaction t1 = new Transaction(Sign.CREDIT, Currency.HKD, 200);
    Transaction t2 = new Transaction(Sign.CREDIT, Currency.HKD, 1000);
    Transaction t3 = new Transaction(Sign.DEBIT, Currency.HKD, 50);
    Transaction t4 = new Transaction(Sign.DEBIT, Currency.HKD, 500);


    Account a1 = new Account(new Transaction[] {t1, t2, t3});
    // System.out.println(a1.balance());
    a1.add(t4);
    System.out.println(a1.balance());

    a1.credit(Currency.HKD, 1000);
    System.out.println(a1.balance());
    a1.debit(Currency.HKD, 500);
    System.out.println(a1.balance());
    a1.debit(Currency.HKD, 2000);
    System.out.println(a1.balance());
  }
}
