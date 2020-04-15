package reportUtil;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.CREATE;

public class TempReportManager {


    public void createFile(String filePath){
        Path file = Paths.get(filePath);
        try {

            if(Files.deleteIfExists(file)){
                // Create the empty file with default permissions, etc.
                Files.createFile(file);
            } else {
                Files.createFile(file);
            }
        } catch (FileAlreadyExistsException x) {
            System.err.format("file named %s" +
                    " already exists%n", file);
        } catch (IOException x) {
            System.err.format("createFile error: %s%n", x);
        }
    }

    public void writeReportInTempFile(String filePath, ArrayList<Report> reportElement){

        Path path = Paths.get(filePath);

        for (Report item : reportElement) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(item.getTestScenario());
            stringBuffer.append(";");
            stringBuffer.append(item.getOptionPrice());
            stringBuffer.append(";");
            stringBuffer.append(item.getTotalPrice());
            stringBuffer.append(";");
            stringBuffer.append("\n");
            write(path, stringBuffer);
        }


    }

    private void write(Path p, StringBuffer stringBuffer) {
        byte data[] = stringBuffer.toString().getBytes();

        try (OutputStream out = new BufferedOutputStream(
                Files.newOutputStream(p, CREATE, APPEND))) {
            out.write(data, 0, data.length);
        } catch (IOException x) {
            System.err.println(x);
        }
    }

    public static void main(String[] args) {

        ArrayList<Report> reportArrayList = new ArrayList<Report>();
        Report report1 = new Report("quotation", "2000 €" , "2789€");
        Report report2 = new Report("quotation", "1700 €" , "1789€");
        reportArrayList.add(report1);
        reportArrayList.add(report2);
        reportArrayList.add(report2);

        TempReportManager tempReportManager = new TempReportManager();
        tempReportManager.createFile("temp.txt");
        tempReportManager.writeReportInTempFile("temp.txt", reportArrayList);
    }
}

