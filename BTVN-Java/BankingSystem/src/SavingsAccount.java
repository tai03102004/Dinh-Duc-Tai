public class SavingsAccount extends Account {
    public SavingsAccount(long accountNumber, double balance) {
        super(accountNumber, balance);
    }

    /**
     * void .
     *
     * @param amount is Amount
     */
    public void withdraw(double amount) {
        try {
            super.doWithdrawing(amount);
            if (amount <= 1000 && balance - amount >= 1000) {
                balance -= amount;
                this.transactionList.add(new Transaction(
                        Transaction.TYPE_WITHDRAW_SAVINGS,
                        amount, balance + amount, balance));
            }
        } catch (BankException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * void .
     *
     * @param amount is Amount
     */
    public void deposit(double amount) {
        try {
            super.doDepositing(amount);
            this.transactionList.add(new Transaction(
                    Transaction.TYPE_DEPOSIT_SAVINGS,
                    amount, balance - amount, balance));
        } catch (BankException e) {
            System.out.println(e.getMessage());
        }
    }
}
