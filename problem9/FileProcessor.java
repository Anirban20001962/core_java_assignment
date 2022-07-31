package problem9;
import com.opencsv.CSVWriter;
import java.io.FileWriter;
import java.util.List;

public class FileProcessor {
  /*Stores the referenece all the data of the csv file*/
  private List<String[]> allData;

  public FileProcessor(List<String[]> allData) { this.allData = allData; }

  /* This method writes data to new.csv file in a synchronized mannner  */
  public synchronized void writeFile(int startIndex, int endIndex)
      throws Exception {
    FileWriter fileWriter = new FileWriter("new.csv", true);
    CSVWriter csvWriter = new CSVWriter(fileWriter);

    for (int i = startIndex; i <= endIndex; i++) {
      String[] data = this.allData.get(i).clone();
      int mark = Integer.parseInt(data[3]);
      if (mark >= 75)
        data[3] = "Distinction";
      else if (mark >= 40)
        data[3] = "Passed";
      else
        data[3] = "Failed";
      csvWriter.writeNext(data);
    }
    csvWriter.close();
  }
}
