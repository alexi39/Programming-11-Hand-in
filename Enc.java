public class Enc {
    public static void main(String[] args){

    //Word that will be encrypted - can be any word here.
        String word = "Cheese";

    //Variable for last letter of word to use in substring.
    int base = (word.length() - 1);
    //Taking last letter of word into variable. Do not need a second variable as it will take full word length by default.
    String last = (word.substring(base));

    //Word without last letter
    String mid = (word.substring(0, base));

    //Encrypted word with 'ay' added to the end.
    String wordEnc = (last + mid + "ay");
        System.out.println(wordEnc);


    //Removing 'ay' at the end of the word.
    int baseI = (wordEnc.length() - 2);

    //Main middle, in this case 'chees'.
    String midI = (wordEnc.substring(1, baseI));

    //Moving the front letter back to the end of the word.
    String lastI = (wordEnc.substring(0, 1));

    //Original word.
    String wordAgain = (midI + lastI);
        System.out.println(wordAgain);


    }
}
