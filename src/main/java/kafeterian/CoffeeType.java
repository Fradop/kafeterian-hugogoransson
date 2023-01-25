package kafeterian;

import java.io.Serializable;

public class CoffeeType implements Serializable {
    private String type;
    private boolean extraMilk;
    private boolean extraSugar;

    CoffeeType(String type, boolean extraMilk, boolean extraSugar) {
        this.type = type;
        this.extraMilk = extraMilk;
        this.extraSugar = extraSugar;
    }

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
