public class Wild extends Animals {
private boolean predator;
private String voice;

public Wild(){
    super(2,45,300,"green");
}

public String Predator(){
    if (isPredator() == true){
        String str1= "I am very dangerous, stay away!";
        return str1;
    }
    else {
        String str2 = "I am friendly, you don't need to be scary";
        return str2;
    }
}

public String Voice(){
    String str = "I am Wild animal, and I " + getVoice();
    return str;
}

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public boolean isPredator() {
        return predator;
    }

    public void setPredator(boolean predator) {
        this.predator = predator;
    }
}
