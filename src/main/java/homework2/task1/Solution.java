package homework2.task1;

public class Solution {


    public static void main(String[] args) {
        String[] massive = {"Пятница", "это", "лучший", "день", "недели"};
        Solution instance = new Solution();
        instance.printFor(massive);
        instance.printEach(massive);
        instance.printWhile(massive);
    }

    void printFor(String[] massive) {
        String longString = "";
        for (int i = 0; i < massive.length; i++) {
            longString += massive[i] + " ";
        }
        String longplusString = longString.trim() + ".";
        System.out.println(longplusString);
    }

    void printEach(String[] massive) {
        String longString = "";
        for (String current : massive) {
            longString += current + " ";
        }
        String longplusString = longString.trim() + ".";
        System.out.println(longplusString);
    }

    void printWhile(String[] massive) {
        int counter = 0;
        String longString = "";
        while (counter < massive.length) {
            longString += massive[counter++] + " ";
        }
        String longplusString = longString.trim() + ".";
        System.out.println(longplusString);
    }

}


