class TransactionException extends Exception {
    public TransactionException(String msg) {
        super(msg);
    }
}

class TransactionService {

    void processTransaction(String txnId) throws TransactionException {
        try {
            if (txnId == null) {
                throw new NullPointerException();
            }
        } catch (Exception e) {
            throw new TransactionException(
                    "Transaction failed for ID: " + txnId
            );
        }
    }

    public static void main(String[] args) {
        try {
            new TransactionService().processTransaction(null);
        } catch (TransactionException e) {
            System.out.println(e.getMessage());
        }
    }
}
