package io.loop.test.MENTOR;



public class Test {
    /*


     In Java, method overloading allows multiple methods with the same name but different parameter lists. This is useful in web application testing, where the same action can apply to different inputs. For example, a search feature may accept a single keyword, an array of keywords, or a keyword with a result limit. Each overloaded method processes the input accordingly, making the code flexible, reusable, and easier to maintain across various scenarios.

     */


    public int searchOfWords(String text, String userSearch) {

        int count = 0;
        String[] splitText = text.toLowerCase().split(" ");


        for (String each : splitText) {


            if (each.contains(userSearch.toLowerCase())) {

                count++;
            }
        }


        return count;
    }

    // userInput = "Can", "Make", "single"

    public void searchOfWords(String text, String... userSearch) {

        String[] splitText = text.toLowerCase().split(" ");

        for (String keyword : userSearch) {
            int count = 0;


            for (String word : splitText) {

                if (word.contains(keyword)) {

                    count++;


                }


            }

            System.out.println(keyword + " " + count);

        }


    }

    public static void main(String[] args) {


        String text = "In Java, method overloading allows multiple methods with the same name but different parameter lists. This is useful in web application testing, where the same action can apply to different inputs. For example, a search feature may accept a single keyword, an array of keywords, or a keyword with a result limit. Each overloaded method processes the input accordingly, making the code flexible, reusable, and easier to maintain across various scenarios";

        String userSearch = "A";

        String[] arrUserSearchWords = {"ma", "re"};

        Test test = new Test();


        System.out.println(test.searchOfWords(text, userSearch));

        System.out.println();

        test.searchOfWords(text, arrUserSearchWords);

        System.out.println();

        test.searchOfWords(text, "use", "acc", "in");

    }
}







