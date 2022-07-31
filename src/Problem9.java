package src;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.CSVWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;
import src.problem9.FileProcessor;

public class Problem9 implements Runnable {
  private FileProcessor writer;
  private int startIndex, endIndex;

  public Problem9(FileProcessor writer, int startIndex, int endIndex) {
    this.writer = writer;
    this.startIndex = startIndex;
    this.endIndex = endIndex;
  }

  @Override
  public void run() {
    try {
      /* Writes the process data asynchronously  */
      this.writer.writeFile(this.startIndex, this.endIndex);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  public static void main(String[] args) {
    try {
      FileReader fileReader = new FileReader("data.csv");
      FileWriter fileWriter = new FileWriter("new.csv");
      /* Reads all the file except the first line */
      CSVReader csvReader =
          new CSVReaderBuilder(fileReader).withSkipLines(1).build();

      CSVWriter csvWriter = new CSVWriter(fileWriter);
      /* Reading all the contents of the file  */
      List<String[]> allData = csvReader.readAll();
      csvReader.close();

      String[] data = {"Id", "Name", "Subjcet", "Status"};
      csvWriter.writeNext(data);
      csvWriter.close();

      FileProcessor fileProcessor = new FileProcessor(allData);

      int lengthOfList = allData.size();
      int batchSize = 5;

      int start = 0;
      int end = batchSize;

      while (end < lengthOfList) {
        /* Perform some on the batch dataset */
        Thread t = new Thread(new Problem9(fileProcessor, start, end - 1));
        t.start();
        start = end;
        end += batchSize;
        t.join();
      }

      if (start < lengthOfList) {
        Thread t =
            new Thread(new Problem9(fileProcessor, start, lengthOfList - 1));
        t.start();
        /* Perform operations on remaining data */
      }

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
