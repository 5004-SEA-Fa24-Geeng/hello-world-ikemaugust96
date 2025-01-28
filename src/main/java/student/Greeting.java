package student;

public class Greeting {
    private int localityID;
    private String localityName;
    private String asciiGreeting;
    private String unicodeGreeting;
    private String formatStr;

    // Constructor for default greetings
    public Greeting(int localityID, String localityName) {
        this(localityID, localityName, "Hello", "Hello", "%s, %s!");
    }

    // Constructor for single greeting
    public Greeting(int localityID, String localityName, String greeting) {
        this(localityID, localityName, greeting, greeting, "%s, %s!");
    }

    // Constructor for full initialization
    public Greeting(int localityID, String localityName, String asciiGreeting, String unicodeGreeting, String formatStr) {
        this.localityID = localityID;
        this.localityName = localityName;
        this.asciiGreeting = asciiGreeting;
        this.unicodeGreeting = unicodeGreeting;
        this.formatStr = formatStr;
    }

    // Getters
    public int getLocalityID() {
        return localityID;
    }

    public String getLocalityName() {
        return localityName;
    }

    public String getAsciiGreeting() {
        return asciiGreeting;
    }

    public String getUnicodeGreeting() {
        return unicodeGreeting;
    }

    public String getFormatStr() {
        return formatStr;
    }

     // Overloaded getFormatStr to handle asciiOnly flag
     public String getFormatStr(boolean asciiOnly) {
        if (asciiOnly) {
            // ASCII greeting followed by the name placeholder
            return asciiGreeting + ", %s!";
        } else {
            // Name placeholder followed by the Unicode greeting
            return "%s, " + unicodeGreeting + "!";
        }
    }
    
    


    @Override
    public String toString() {
        return String.format("{localityID:%d, localityName:\"%s\", asciiGreeting:\"%s\", unicodeGreeting:\"%s\"}",
                localityID, localityName, asciiGreeting, unicodeGreeting);
    }
}
