import java.util.Date;
import java.util.List;

abstract class User {
    protected int userId;
    protected String name;
    protected String email;
    protected String password;
    protected String role;

    public User(int userId, String name, String email, String password, String role) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public abstract boolean login(String email, String password);
    public abstract boolean register(String name, String email, String password);
}

class Student extends User {
    private String studentId;
    private List<String> courses;

    public Student(int userId, String name, String email, String password, String role, String studentId, List<String> courses) {
        super(userId, name, email, password, role);
        this.studentId = studentId;
        this.courses = courses;
    }

    public void borrowComponent(int componentId) {
        // Implement borrowing logic here
    }

    public List<String> viewHistory() {
        // Return borrowing history
        return null;
    }

    public List<String> viewPendingRequests() {
        // Return pending requests
        return null;
    }

    @Override
    public boolean login(String email, String password) {
        // Implement login logic
        return false;
    }

    @Override
    public boolean register(String name, String email, String password) {
        // Implement registration logic
        return false;
    }
}

class Lecturer extends User {
    // Implementation similar to Student class with specific methods like approveRequest
}

class Technician extends User {
    // Implementation similar to Student class with specific methods like notifyCollectionDate
    ArrayList<BorrowedRecord> component;
}

class Admin extends User {
    // Implementation similar to Student class with specific methods like manageItems
}

class Component {
    private int componentId;
    private String name;
    private int quantityAvailable;
    private String majorAssociated;

    public Component(int componentId, String name, int quantityAvailable, String majorAssociated) {
        this.componentId = componentId;
        this.name = name;
        this.quantityAvailable = quantityAvailable;
        this.majorAssociated = majorAssociated;
    }

    public void addComponent(String name, int quantity, String major) {
        // Logic to add a new component
    }

    public void updateComponent(int componentId) {
        // Logic to update an existing component
    }

    public void removeComponent(int componentId) {
        // Logic to remove a component
    }
}


// Other class definitions remain unchanged.

class RequestClass {
    private int requestId;
    private int componentId;
    private int userId; // Renamed from studentId to userId for broader applicability
    private String status;
    private Date requestDate;
    private Date approveDate;
    private Date returnDate;

    public RequestClass(int requestId, int componentId, int userId, String status, Date requestDate, Date approveDate, Date returnDate) {
        this.requestId = requestId;
        this.componentId = componentId;
        this.userId = userId;
        this.status = status;
        this.requestDate = requestDate;
        this.approveDate = approveDate;
        this.returnDate = returnDate;
    }

    // Getters and Setters for each field
    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    public int getComponentId() {
        return componentId;
    }

    public void setComponentId(int componentId) {
        this.componentId = componentId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getApproveDate() {
        return approveDate;
    }

    public void setApproveDate(Date approveDate) {
        this.approveDate = approveDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    // Additional methods to manage request lifecycle
    public void createRequest() {
        // Logic to create a new request
    }

    public void updateStatus(String newStatus) {
        // Logic to update the status of the request
    }
}


// Existing User, Student, Lecturer, Technician, Admin, Component, and BorrowingRequest classes remain unchanged.

class SystemManager {
    public void addComponent(Component component) {
        // Logic to add a new component to the system
    }

    public void updateComponent(int componentId, Component updatedComponent) {
        // Logic to update an existing component in the system
    }

    public void removeComponent(int componentId) {
        // Logic to remove a component from the system
    }

    public void addUser(User user) {
        // Logic to add a new user to the system
    }

    public void updateUser(int userId, User updatedUser) {
        // Logic to update an existing user in the system
    }

    public void removeUser(int userId) {
        // Logic to remove a user from the system
    }

    public void addBorrowingRequest(BorrowingRequest request) {
        // Logic to add a new borrowing request
    }

    public void updateBorrowingRequest(int requestId, BorrowingRequest updatedRequest) {
        // Logic to update an existing borrowing request
    }

    public void removeBorrowingRequest(int requestId) {
        // Logic to remove a borrowing request from the system
    }

    public bool verifyUser(Account account) {
        // Logic to remove a borrowing request from the system
    }

    public void transferRequest(Request request) {
        // Logic to remove a borrowing request from the system
    }
}



class BorrowedRecord {
    private int recordId; // Unique ID for the record
    private HashMap<Student, Component> recordHistory;
    // private Student student; // Reference to the Student who borrowed the item
    // private Component component; // Reference to the Component that was borrowed
    private Date borrowDate; // When the item was borrowed
    private Date returnDate; // When the item is expected to be returned

    public BorrowedRecord(int recordId, Student student, Component component, Date borrowDate, Date returnDate) {
        this.recordId = recordId;
        this.student = student;
        this.component = component;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
    }

    // Getters
    public int getRecordId() {
        return recordId;
    }

    public Student getStudent() {
        return student;
    }

    public Component getComponent() {
        return component;
    }

    public Date getBorrowDate() {
        return borrowDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    // Setters
    public void setRecordId(int recordId) {
        this.recordId = recordId;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setComponent(Component component) {
        this.component = component;
    }

    public void setBorrowDate(Date borrowDate) {
        this.borrowDate = borrowDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }
}
