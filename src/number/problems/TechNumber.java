package number.problems;

import number.problems.ScannerHelper;

public class TechNumber {
    public static void main(String[] args) {
        int [] inputNumbers = ScannerHelper.getInputInts();
        for(int input:inputNumbers){
            toFindTechNumber(input);
        }
    }

    public static void toFindTechNumber(int input) {
        int count=0;
        while(input>0){
            count ++;
            input/=10;
        }

    }
}


