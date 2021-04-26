abstract class BankEmployee implements BankWorker{
    BankEmployee bankEmployee;
    public BankEmployee(BankEmployee bankEmployee) {
        this.bankEmployee = bankEmployee;
    }
//
//    public void checkClientForCredit (boolean bankClient) throws BadCreditHistoryException, ProblemWithLawException{
//        bankClient = true;
//    }

}
