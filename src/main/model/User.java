package main.model;

public class User{
    String userId;
    String userName;
    String userPassword;
    String userEmail;
    String userPhone;
    String userAddress;
    String userRole;
    String userStatus;
    String userCreatedDate;
    String userUpdatedDate;
    String userDeletedDate;

    public User(String userId, String userName, String userPassword, String userEmail, String userPhone, String userAddress, String userRole, String userStatus, String userCreatedDate, String userUpdatedDate, String userDeletedDate) {
        this.userId = userId;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userEmail = userEmail;
        this.userPhone = userPhone;
        this.userAddress = userAddress;
        this.userRole = userRole;
        this.userStatus = userStatus;
        this.userCreatedDate = userCreatedDate;
        this.userUpdatedDate = userUpdatedDate;
        this.userDeletedDate = userDeletedDate;
    }

    public User(String userId2, String name, String email, String password, String phone, String address,
            UserRole guest) {
        //TODO Auto-generated constructor stub
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    public String getUserCreatedDate() {
        return userCreatedDate;
    }

    public void setUserCreatedDate(String userCreatedDate) {
        this.userCreatedDate = userCreatedDate;
    }

    public String getUserUpdatedDate() {
        return userUpdatedDate;
    }

    public void setUserUpdatedDate(String userUpdatedDate) {
        this.userUpdatedDate = userUpdatedDate;
    }

    public String getUserDeletedDate() {
        return userDeletedDate;
    }

    public void setUserDeletedDate(String userDeletedDate) {
        this.userDeletedDate = userDeletedDate;
    }
    

    
}