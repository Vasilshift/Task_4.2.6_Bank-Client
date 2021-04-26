public class Promgram {
    public static void main(String[] args) {
        //BankWorker worker = new BankWorker();
        //BankClient client = new BankClient();

    }
    public boolean getCreditForClient(BankWorker bankWorker, BankClient bankClient) throws BadCreditHistoryException, ProblemWithLawException{
        try {
            return bankWorker.checkClientForCredit(bankClient);

        } catch (BadCreditHistoryException e) {
            System.out.println("Проблемы с банковской историей");
            return false;
        } catch (ProblemWithLawException e1) {
            return false;
        }

    }






//    public boolean getCreditForClient(BankWorker bankWorker, BankClient bankClient) throws BadCreditHistoryException, ProblemWithLawException {
//        bankWorker.checkClientForCredit(bankClient);
//
//        return bankWorker.checkClientForCredit(bankClient);
//    }
}