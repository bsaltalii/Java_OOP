public class Tax {
    private int filingStatus;
    private final int SINGLE_FILER=0;
    private final int MARRIED_JOINTLY_OR_QUALIFYING_WIDOW=1;
    private final int MARRIED_SEPARATELY=2;
    private final int HEAD_OF_HOUSEHOLD=3;
    private int taxableIncome;
    int[][] brackets = {
            {0, 27050, 65550, 136750, 297350},
            {0, 45200, 109250, 166500, 297350},
            {0, 22600, 54625, 83250, 148675},
            {0, 36250, 93650, 151650, 297350}
    };
    double[] rates = {0.15, 0.275, 0.305, 0.355, 0.391};
    public Tax(){}
    public Tax(int filingStatus,int[][] brackets,double[] rates,int taxableIncome){
        this.filingStatus=filingStatus;
        this.brackets=brackets;
        this.rates=rates;
        this.taxableIncome=taxableIncome;
    }
    public void getTax(){

    }

}
