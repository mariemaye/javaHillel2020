public class DogGuide extends Dog {
    private boolean trained;

    public DogGuide(String name){
        super(name);


    }
public String DogGuideVoice() {
    if (isTrained() == true) {
        System.out.println("Are you a well trained dog?");
        String str = "Yes, I can help take you home";
        setVoiceHoushold("WOOF");
        getVoiceHoushold();
        VoiceHousehold();
        return str;

    } else {
        setVoiceHoushold("WOOF");
        getVoiceHoushold();
        VoiceHousehold();
        System.out.println("Are you a well trained dog?");
        String str2 = "Sorry, I am not trained :(";
        return str2;
    }

}
    public boolean isTrained() {
        return trained;
    }

    public void setTrained(boolean trained) {
        this.trained = trained;
    }
}
