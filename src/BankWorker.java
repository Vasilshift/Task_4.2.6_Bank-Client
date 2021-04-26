public interface BankWorker {
    //void checkClientForCredit();

    default boolean checkClientForCredit(BankClient bankClient) {
        return checkClientForCredit(bankClient);
    }
}


