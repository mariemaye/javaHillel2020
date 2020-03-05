public class Houshold extends Animals {
    private String name;
private boolean voccinated;
String voiceHousehold;

public Houshold(String name){
    super(1,4,45,"grey");
    this.name = name;


}

public String GoOut(){
    if (isVoccinated()== true){
        String str = "Yes! We can go out";
        return str;
    }
    else {
        String str2 = "No;( Stay at home";
        return str2;
    }

}

    public String VoiceHousehold(){
        String str = "I am a household animal, and my name is " + getName()+ " and I say " +getVoiceHoushold();
        return str;
    }

    public String getVoiceHoushold() {
        return voiceHousehold;
    }

    public void setVoiceHoushold(String voiceHoushold) {
        this.voiceHousehold = voiceHoushold;
    }

    public String getName() {
        return name;
    }

    public boolean isVoccinated() {
        return voccinated;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVoccinated(boolean voccinated) {
        this.voccinated = voccinated;
    }
}
