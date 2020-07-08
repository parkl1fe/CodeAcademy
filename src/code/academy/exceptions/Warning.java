package code.academy.exceptions;

public class Warning extends ChassisLoweringException {

    public Warning(String reason) {
        super(reason);
    }

    @Override
    public String getReason() {
        return " SEVERITY: WARNING " + super.getReason();
    }
}
