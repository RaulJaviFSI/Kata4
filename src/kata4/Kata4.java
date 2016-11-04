package kata4;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Kata4 {

    public static void main(String[] args) throws IOException {
        String fileName = "emailsfilev1.txt";
        ArrayList<String> maillist = MailListReader.read(fileName);
        Histogram<String> histogram = MailHistogramBuilder.build(maillist);
        HistogramDisplay histoDisplay = new HistogramDisplay(histogram); 
        histoDisplay.execute();
    }
    
}
