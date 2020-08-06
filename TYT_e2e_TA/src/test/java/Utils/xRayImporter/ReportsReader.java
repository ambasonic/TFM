package Utils.xRayImporter;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReportsReader {

    public String sourceFilePath = "target\\site\\serenity";

    public List<String> loadReportsFiles(String fileExtension){
        File file = new File(this.sourceFilePath);
        List<String> result = new ArrayList<String>();

        try(Stream<Path> walk = Files.walk(file.toPath(), 1)){
            result = walk.map(x -> x.toString())
                .filter(f -> f.endsWith("."+fileExtension)).collect(Collectors.toList());
        }catch (IOException e){
            e.printStackTrace();
        }
        return result;
    }

    public void sortJUnitXMLreports(String sourceFilePath, String fileExtension){

        List<String> strings = loadReportsFiles(fileExtension);
        List<String> mainWebTestsList = new ArrayList<>();
        List<String> sequenceTestsList = new ArrayList<>();

        for (String st: strings){
            String target = st.replace("C:\\Users\\frtchambo\\Desktop\\TA-git-Pojekt\\Eventim-WEB-Testautomation-Serenity\\" +
                "build\\test-results\\test\\TEST-com.eventim.tests.",""); //TODO maybe remove
            if(target.startsWith("mainWebTests")){
                mainWebTestsList.add(target);
            }
            if(target.startsWith("sequence")){
                sequenceTestsList.add(target);
            }
        }

//        print

        System.out.println("----    mainWebTests  ------");
        mainWebTestsList.forEach(System.out::println);

        System.out.println();
        System.out.println("----    sequence  ------");
        sequenceTestsList.forEach(System.out::println);

    }

    public List<String> JsonReportsList(){

        return null;
    }

    public static void main(String[] args) {

         ReportsReader testReportImporter = new ReportsReader();
        List<String> json = testReportImporter.loadReportsFiles("json");

        json.forEach(System.out::println);
        List<String> xml = testReportImporter.loadReportsFiles("xml");

        xml.forEach(System.out::println);
    }


}
