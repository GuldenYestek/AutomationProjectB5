package io.loop.test.MENTOR;
/*
Your application allows to add only 19 words in a message. you have to return true if the message matches with limitations and false if the amount of words exceeds 19
 */
public class Task3 {

    public static boolean checkAmountOfWordsInTheMessage(String message){

        String[] splitMessage = message.split(" ");
        int amountOfWords = splitMessage.length;


        return amountOfWords <= 19;

    }

    public static void main(String[] args) {
        String message1 = "The curious cat silently crept";
        System.out.println(checkAmountOfWordsInTheMessage(message1));
    }
}


/*
The curious cat silently crept across the moonlit garden, chasing a quick shadow while the wind whispered secrets through the tall, swaying blades of grass
 */