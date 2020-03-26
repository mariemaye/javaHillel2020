public class Switch {
    public static void main(String[] args) {
        System.out.println(Switch(Search.GOOGLE));
    }
    public static String Switch(Search search){
        var result = switch (search){
            case YAHOO -> "Yahoo";
            case YANDEX -> "Yandex";
            case GOOGLE -> "Google";
            case RAMBLER -> "Rambler";
            default -> "null";

        };
var country = "";
switch (search){
    case RAMBLER, YAHOO -> {
        country = "Russia";
    }
    case GOOGLE, YANDEX ->{
        country = "usa";
    }
}
return String.valueOf(result.charAt(0)).toUpperCase() + result.substring(1) + String.format(" is %s",country);
    }
}
enum Search{
    GOOGLE,YAHOO, RAMBLER, YANDEX
}
