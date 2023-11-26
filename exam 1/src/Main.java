
public class Main {
// e a o i
    String[] words = {
            "Unobjectionable", "Multimillionaire", "Sunshine", "Lemonade", "Dog",
            "Computer", "Illumination", "Revolutionary", "Inquisitiveness", "Appreciative",
            "Tiger", "Guitar", "Sun", "Forest", "Apple", "Eavesdropping", "Education",
            "Butterfly", "Abstemious", "Ocean", "Simultaneous"
    };

    int wordsVowelCounting[] = new int[words.length]; //output of first step
    int wordsConsonanatCounting[] = new int[words.length];//output of first step
    String allVowelWords[] = new String[words.length];
    int allVowelWordCount = 0;
    int wordsVC_Even[] = new int[40];
    int wordsVC_Odd[] = new int[40];

    public static void main(String[] args) {
      Main obj = new Main();
       obj.Step_1();
        obj.Step_2();
        obj.Step_3();
        obj.defaultPrint();
    }

    public void Step_2() {
        int Epos = 0; // initilize a variable for the storing position number of the even number storing array
        int Opos =0;// initilize a variable for the storing position number of the odd number storing array
        for (int i = 0; i < words.length; i++) { // coz all array length is same, thats why we can use any array length for loop end number
            if (wordsVowelCounting[i] % 2 == 0) {// check if the selected number is even which is wordsVowelCounting[i]
                wordsVC_Even[Epos] = wordsVowelCounting[i]; // storing even number inside array
                Epos++;// incrementing pos
            } else {
                wordsVC_Odd[Opos] = wordsVowelCounting[i];
                Opos++;// incrementing pos
            }

            if (wordsConsonanatCounting[i] % 2 == 0) {// check if the selected number is odd which is wordsVowelCounting[i]
                wordsVC_Even[Epos] = wordsConsonanatCounting[i];// storing even number inside array
                Epos++;// incrementing pos
            } else {
                wordsVC_Odd[Opos] = wordsConsonanatCounting[i];
                Opos++;// incrementing pos
            }
        }
    }

    /// step 1 implementation
    public void Step_1() {

        int vowelCount = 0; //declaring  and initializig var for total number of vowel for each indivisual word
        int consonCount = 0;//declaring  and initializig var for total number of consonant counting for each indivisual word

        for (int i = 0; i < words.length; i++) { // loop for tacking an indivisual word from the array WORDS[]
                // words[i] means words[0] means Unobjectionable
            // words[i] means words[1] means Multimillionaire
            for (int j = 0; j < words[i].length(); j++) { // loop for tacking an indivisual Charecter from the selected word from parent array which is WORDS[i]
                if (words[i].charAt(j) == 'a' || words[i].charAt(j) == 'e' ||
                        words[i].charAt(j) == 'i' || words[i].charAt(j) == 'o' ||
                        words[i].charAt(j) == 'u' || words[i].charAt(j) == 'A' ||
                        words[i].charAt(j) == 'E' || words[i].charAt(j) == 'I' ||
                        words[i].charAt(j) == 'O' || words[i].charAt(j) == 'U') {// checking vowel

                    vowelCount++; // vowel counting for the selected word

                } else {
                    consonCount++;// consonant counting for the selected word
                }
            }

            wordsVowelCounting[i] = vowelCount; // storing value
            wordsConsonanatCounting[i] = consonCount; // storing value
            vowelCount = 0; // resetting value
            consonCount = 0;// resetting value
        }
    }


    public void Step_3(){

        boolean isA = false;
        boolean isE = false;
        boolean isI = false;
        boolean isO = false;
        boolean isU = false;
        //boolean isVowel = false;
        int pos = 0;

        for (int i = 0; i < wordsVowelCounting.length; i++){

            if (wordsVowelCounting[i]>=5) {
                String vowelWord =  words[i];
//Unobjectionable
                for (int k = 0; k < vowelWord.length(); k++){

                    if (vowelWord.charAt(k) == 'a' ||vowelWord.charAt(k) == 'A'){
                        isA = true;
                    }else if (vowelWord.charAt(k) == 'e' ||vowelWord.charAt(k) == 'E'){
                        isE = true;
                    }else if (vowelWord.charAt(k) == 'i' ||vowelWord.charAt(k) == 'I'){
                        isI = true;
                    }else if (vowelWord.charAt(k) == 'o' ||vowelWord.charAt(k) == 'O'){
                        isO = true;
                    }else if (vowelWord.charAt(k) == 'u' ||vowelWord.charAt(k) == 'U'){
                        isU = true;
                    }
                }

                if (isA && isE && isI && isO && isU){
//                    isVowel = true;
//                    System.out.print(isVowel + " , ");
                   // System.out.println(isVowel+ " :: " + words[i]  );
                     isO = isE = isA = isI = isU = false;
                    allVowelWords[pos] =vowelWord;
                    pos++;
                    allVowelWordCount = pos;
                }else {
                   isO = isE = isA = isI = isU = false;
                    //System.out.println(isVowel+ " :: " + words[i]  );
                }
            }
        }
    }

    ///////// test code,,,,  to check if my calculations are correct!!!
    public void defaultPrint() {
        int vowelTotal = 0;
        int consoTotal = 0;
        System.out.println(" vowels:: ");
        for (int i = 0; i < wordsVowelCounting.length; i++) {

            System.out.print(" , " + wordsVowelCounting[i]);
            vowelTotal = vowelTotal + wordsVowelCounting[i];

        }
        System.out.println(" \n Total addition of vowel:: " + vowelTotal);
        System.out.println("\n conso:: ");
        for (int i = 0; i < wordsConsonanatCounting.length; i++) {

            System.out.print(" , " + wordsConsonanatCounting[i]);
            consoTotal = consoTotal + wordsConsonanatCounting[i];
        }

        System.out.println("\n addition numbers of vowel:: " + consoTotal);

        /////////////////////////////////////////
        vowelTotal = 0;
         consoTotal = 0;
        System.out.println("Even::: ");
        for (int i = 0; i < wordsVC_Even.length; i++) {

            System.out.print(" , " + wordsVC_Even[i]);
            vowelTotal = vowelTotal + wordsVC_Even[i];
        }
        System.out.println(" \n addition numbers of even:: " + vowelTotal);
        System.out.println("\n Odd:: ");
        for (int i = 0; i < wordsVC_Odd.length; i++) {

            System.out.print(" , " + wordsVC_Odd[i]);
            consoTotal = consoTotal + wordsVC_Odd[i];
        }

        System.out.println("\n addition numbers of Odd:: " + consoTotal);

        /////////////////////////////////////////////

        for (int i = 0; i<allVowelWords.length; i++){
            if (allVowelWords[i]!=null)
            System.out.println(allVowelWords[i]);
        }
        System.out.println(allVowelWordCount + " words have all the vowels");
    }

}