package kafeterian;


public class CoffeeType {
    private String type;
    private boolean extraMilk;
    private boolean extraSugar;

    CoffeeType() {}
    
    public CoffeeType(String type) {
        this.type = type;
    }

    public void setExtraMilk(boolean extraMilk) {
        this.extraMilk = extraMilk;
    }

    public boolean getExtraMilk() {
        return extraMilk;
    }

    public void setExtraSugar(boolean extraSugar) {
        this.extraSugar = extraSugar;
    }

    public boolean getExtraSugar() {
        return extraSugar;
    }

    public String getType() {
        return type;
    }
}
