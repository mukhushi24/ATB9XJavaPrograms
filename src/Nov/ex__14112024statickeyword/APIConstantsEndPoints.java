package Nov.ex__14112024statickeyword;

public enum APIConstantsEndPoints {

    BASE_URL("https://app.vwo.com"),
    LOGIN_PAGE("https://app.vwo.com/login"),
    DASHBOARD_PAGE("https://app.vwo.com/dasHboard"),
    CHATBOT_PAGE("https://app.vwo.com/chat");




    private String name;

    APIConstantsEndPoints(String name)
    {
        this.name =  name;
    }



    String getValue() {
        return name;
    }



}