package code.academy.exceptions;

public class FatalError extends ChassisLoweringException {

    public FatalError(String reason) {
        super(reason);
    }

    @Override
    public String getReason() {
        return " SEVERITY: FATAL " + super.getReason();
    }
}
