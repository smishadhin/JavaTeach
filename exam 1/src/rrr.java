//public class rrr {
//    String[] words = {
//            "Unobjectionable", "Multimillionaire", "Sunshine", "Lemonade", "Dog",
//            "Computer", "Illumination", "Revolutionary", "Inquisitiveness", "Appreciative",
//            "Tiger", "Guitar", "Sun", "Forest", "Apple", "Eavesdropping", "Education",
//            "Butterfly", "Abstemious", "Ocean", "Simultaneous"};
//
//    int wordsVowelCounting[] = new int[words.length];
//    int wordsConsonantCounting[] = new int[words.length];
//
//
//
//    int wordsVC_Even[] = new int[40];
//    int wordsVC_Odd[] = new int[40];
//
//
//    int findWordsWithVowels [] = new int[words.length];
//
//
//
////    public static void main(String[] args) {
////
////        Main Object = new Main();
////        Object.Step_01();
////        Object.Step_2();
////        Object.Step_3();
////        Object.Step_4();
////        Object.defaultPrint();
////
////    }
//    public void Step_01(){
//
//        int vowelCount = 0;
//        int consonantCount = 0;
//
//
//        for (int i = 0; i < words.length; i++){
//            for (int j = 0; j < words[i].length(); j++){
//
//                if (words[i].charAt(j) == 'a' || words[i].charAt(j) == 'e' || words[i].charAt(j) == 'i' || words[i].charAt(j) == 'o' || words[i].charAt(j) == 'u' || words[i].charAt(j) == 'A' || words[i].charAt(j) == 'E' || words[i].charAt(j) == 'I' || words[i].charAt(j) == 'O' || words[i].charAt(j) == 'U'  ){
//                    vowelCount++;
//                }else consonantCount++;
//
//                wordsVowelCounting[i] = vowelCount;
//                wordsConsonantCounting[i] = consonantCount;
//            }
//
//        }
//
//    }
//    public void Step_2(){
//
//        int Epos = 0;
//        int Opos = 0;
//
//        for (int i = 0; i<words.length; i++){
//            if (wordsVowelCounting[i]%2 == 0){
//                wordsVowelCounting[Epos] = wordsVowelCounting[i];
//                Epos++;
//
//            }else wordsVC_Odd[Opos] = wordsVowelCounting[i];
//            Opos++;
//
//        }if (wordsConsonantCounting[i]%2 == 0){
//            wordsConsonantCounting[Epos] = wordsConsonantCounting[i];
//            Epos++;
//
//        }else wordsVC_Odd[Opos] = wordsVowelCounting[i];
//        Opos++;
//
//    }
//    public void Step_3(){
//
//        for (int i = 0; i >= 5; i++){
//
//            for (int j = 0; j >= wordsVowelCounting[i]; j++){
//
//                if (wordsVowelCounting[i] >= wordsVowelCounting[j]){
//                    findWordsWithVowels[i] = wordsVowelCounting.length;
//
//                }
//            }
//
//        }
//    }
//    public void Step_4(){
//
//        for (int i = 0; i >= 5; i++){
//            for (int j = 0; j > 1; j++ ){
//
//                if (wordsVowelCounting[i]>wordsConsonantCounting[j]){
//
//                }
//
//            }
//
//        }
//    }
//    public void defaultPrint(){
//        System.out.print("Vowels::");
//        System.out.print("Vowels Count::");
//
//
//        System.out.println("Consonant::");
//        System.out.print("Consonant Count::");
//    }
//
//
//}
