package lizka;

public class Greeting {

    private final int errorCode;
    private final String dataMessage;

    Greeting(int errorCode, String dataMessage) {
        this.errorCode = errorCode;
        this.dataMessage = dataMessage;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public String getDataMessage() {
        return dataMessage;
    }
}

