class Connection {
    void open() {
        System.out.println("Connection opened");
    }

    void close() {
        System.out.println("Connection closed");
    }

    void execute() {
        throw new RuntimeException("Execution failed");
    }
}

class ResourceCleanupExample {

    public static void main(String[] args) {
        Connection conn = new Connection();

        try {
            conn.open();
            conn.execute();
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            conn.close();
        }
    }
}
