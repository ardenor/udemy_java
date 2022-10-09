package sec7;

public class Printer {
    private int tonerLevel = 10;
    private int pagesPrinted;
    private boolean isDuplex;

    public Printer(int tonerLevel, int pagesPrinted, boolean isDuplex) {
        if(tonerLevel >-1 && tonerLevel <=100){
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.pagesPrinted = pagesPrinted;
        this.isDuplex = isDuplex;
    }

    public void addToner(int fillAmount){
        if(getTonerLevel() >= 0 && getTonerLevel() < 100){
            tonerLevel = tonerLevel + fillAmount;
        } else if (tonerLevel == 100){
            System.out.println("Toner is full");
        }
    }

    public int getTonerLevel(){
        return tonerLevel;
    }

    public void print(int printingCount){
        pagesPrinted += printingCount;
    }

    public int getPagesPrinted(){
        return pagesPrinted;
    }
}
