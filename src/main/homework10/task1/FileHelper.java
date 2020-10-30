package main.homework10.task1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileHelper {
    public static Map<String, String> readFile(File file) throws IOException {
        List<String> input = Files.readAllLines(Paths.get(file.getAbsolutePath()));
        Map<String, String> content = new HashMap<>();
        for (String line : input) {
            String key = line.split("=")[0];
            if (line.contains("=") && line.split("=").length == 1) {
                content.put(key, "[]");
                continue;
            }
            return content;

        }
        private static String parse(String value){
            String defaultValue="\""+value+"\"";
            if(value.equals("null")) return null;
            if(value.equals("")) return "[]";
            if(value.contains(".")){
                try{
                    return  String.valueOf(Double.parseDouble(value));
                }
                catch (NumberFormatException notFloatException){
                    return defaultValue;
                }
            }

            try{
                return String.valueOf(Long.parseLong(value));
            }catch (NumberFormatException ignore){}
        }

        public static void saveFile (File file, List <>()){

        }
    }
}