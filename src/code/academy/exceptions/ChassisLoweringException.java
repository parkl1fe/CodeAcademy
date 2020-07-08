package code.academy.exceptions;

public class ChassisLoweringException extends Exception {
    private String reason;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ChassisLoweringException(String reason) {
        this.reason = reason;
    }
}
