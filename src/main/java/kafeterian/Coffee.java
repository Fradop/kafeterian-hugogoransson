package kafeterian;

class Coffee {
    private String type;
    private boolean hasExtraMilk;
    private boolean hasExtraSugar;
  
    public Coffee(String type, boolean hasExtraMilk, boolean hasExtraSugar) {
        this.type = type;
        this.hasExtraMilk = hasExtraMilk;
        this.hasExtraSugar = hasExtraSugar;
    }

    // public Coffee coffeeChoice(String item, boolean milk, boolean sugar) {
    //     Coffee newObject = new Coffee(item, milk, sugar);
    //     System.out.println(newObject.type +""+ newObject.hasExtraMilk+ "" + newObject.hasExtraSugar);
    //     return newObject;
        
    // }



    public static Coffee coffeeChoice(String item, boolean milk, boolean sugar) {
        Coffee newObject = new Coffee(item, milk, sugar);
        return newObject;
    }





  
    public String getType() {
        return type;
    }
  
    public boolean getExtraMilk() {
        return hasExtraMilk;
    }
  
    public boolean getExtraSugar() {
        return hasExtraSugar;
    }
  
    public void setType(String type) {
        this.type = type;
    }
  
    public void setExtraMilk(boolean hasExtraMilk) {
        this.hasExtraMilk = hasExtraMilk;
    }
  
    public void setExtraSugar(boolean hasExtraSugar) {
        this.hasExtraSugar = hasExtraSugar;
    }
}

