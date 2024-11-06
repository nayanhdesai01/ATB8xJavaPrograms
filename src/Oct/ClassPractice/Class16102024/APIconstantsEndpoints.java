package Oct.ClassPractice.Class16102024;

public enum APIconstantsEndpoints {
    BASE_URL("https://app.vwo.com/"),
    LOGIN_URL("https://app.vwo.com/login"),
    DASHBOARD_URL("https://app.vwo.com/dashboard"),
    CHATBOT_URL("https://app.vwo.com/chat");


    private String name;

    APIconstantsEndpoints(String name){
        this.name=name;
    }

    String getValue(){
        return name;
    }
}

