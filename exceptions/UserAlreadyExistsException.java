class UserAlreadyExistsException extends Exception {
    public UserAlreadyExistsException(String msg) {
        super(msg);
    }
}

class UserNotFoundException extends Exception {
    public UserNotFoundException(String msg) {
        super(msg);
    }
}

class UserService {

    void registerUser(String username) throws UserAlreadyExistsException {
        if (username.equals("admin")) {
            throw new UserAlreadyExistsException("User already exists!");
        }
        System.out.println("User registered successfully");
    }

    void checkUserExistence(String username) throws UserNotFoundException {
        if (!username.equals("admin")) {
            throw new UserNotFoundException("User not found!");
        }
        System.out.println("User exists");
    }

    public static void main(String[] args) {
        UserService service = new UserService();

        try {
            service.checkUserExistence("guest");
            service.registerUser("admin");
        } catch (UserAlreadyExistsException | UserNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
