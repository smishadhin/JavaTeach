import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] words = {
                "Unobjectionable", "Multimillionaire", "Sunshine", "Lemonade", "Dog",
                "Computer", "Illumination", "Revolutionary", "Inquisitiveness", "Appreciative",
                "Tiger", "Guitar", "Sun", "Forest", "Apple", "Eavesdropping", "Education",
                "Butterfly", "Abstemious", "Ocean", "Simultaneous"
        };

        int[] vowelCounts = countVowels(words);
        int[] consonantCounts = countConsonants(words);

        int[] evenVowelCounts = separateEvenOddNumbers(vowelCounts)[0];
        int[] oddVowelCounts = separateEvenOddNumbers(vowelCounts)[1];
        int[] evenConsonantCounts = separateEvenOddNumbers(consonantCounts)[0];
        int[] oddConsonantCounts = separateEvenOddNumbers(consonantCounts)[1];

        ArrayList<String> wordsWithFiveVowels = getWordsWithNVowels(words, 5);
        ArrayList<String> wordsWithAllVowels = getWordsWithAllVowels(wordsWithFiveVowels);

        ArrayList<String> vowelsGreaterThanConsonants = getWordsByVowelConsonantCount(wordsWithFiveVowels, vowelCounts, consonantCounts, ">");
        ArrayList<String> vowelsLessThanConsonants = getWordsByVowelConsonantCount(wordsWithFiveVowels, vowelCounts, consonantCounts, "<");
        ArrayList<String> vowelsEqualToConsonants = getWordsByVowelConsonantCount(wordsWithFiveVowels, vowelCounts, consonantCounts, "=");

        // Print the results
        printVowelConsonantCounts(words, vowelCounts, consonantCounts);
        printEvenOddNumbers(evenVowelCounts, oddVowelCounts, evenConsonantCounts, oddConsonantCounts);
        printWordsWithNVowels(wordsWithFiveVowels);
        printWordsWithAllVowels(wordsWithAllVowels);
        printWordsByVowelConsonantCount(vowelsGreaterThanConsonants, "vowels >", consonantCounts);
        printWordsByVowelConsonantCount(vowelsLessThanConsonants, "vowels <", consonantCounts);
        printWordsByVowelConsonantCount(vowelsEqualToConsonants, "vowels =", consonantCounts);
    }

    // Step 1: Find the total counting of vowels and consonants for each word and store them in different arrays.
    public static int[] countVowels(String[] words) {
        int[] vowelCounts = new int[words.length];

        for (int i = 0; i < words.length; i++) {
            String word = words[i].toLowerCase();
            int vowels = 0;
            for (int j = 0; j < word.length(); j++) {
                char ch = word.charAt(j);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                }
            }
            vowelCounts[i] = vowels;
        }
        return vowelCounts;
    }

    public static int[] countConsonants(String[] words) {
        int[] consonantCounts = new int[words.length];

        for (int i = 0; i < words.length; i++) {
            String word = words[i].toLowerCase();
            int consonants = 0;
            for (int j = 0; j < word.length(); j++) {
                char ch = word.charAt(j);
                if (ch >= 'a' && ch <= 'z' && ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                    consonants++;
                }
            }
            consonantCounts[i] = consonants;
        }
        return consonantCounts;
    }

    // Step 2: Separate even and odd counts of vowels and consonants
    public static int[][] separateEvenOddNumbers(int[] numbers) {
        int[] evenNumbers = new int[numbers.length];
        int[] oddNumbers = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenNumbers[i] = numbers[i];
            } else {
                oddNumbers[i] = numbers[i];
            }
        }

        return new int[][]{evenNumbers, oddNumbers};
    }

    // Step 3: Filter words with >= 5 vowels and find words with all vowels
    public static ArrayList<String> getWordsWithNVowels(String[] words, int n) {
        ArrayList<String> wordsWithNVowels = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (countVowels(new String[]{words[i]})[0] >= n) {
                wordsWithNVowels.add(words[i]);
            }
        }
        return wordsWithNVowels;
    }

    public static boolean hasAllVowels(String word) {
        return word.contains("a") && word.contains("e") && word.contains("i") && word.contains("o") && word.contains("u");
    }

    public static ArrayList<String> getWordsWithAllVowels(ArrayList<String> words) {
        ArrayList<String> wordsWithAllVowels = new ArrayList<>();
        for (String word : words) {
            if (hasAllVowels(word.toLowerCase())) {
                wordsWithAllVowels.add(word);
            }
        }
        return wordsWithAllVowels;
    }

    // Step 4: Separate words based on count of vowels and consonants
    public static ArrayList<String> getWordsByVowelConsonantCount(ArrayList<String> words, int[] vowelCounts, int[] consonantCounts, String operator) {
        ArrayList<String> filteredWords = new ArrayList<>();
        for (String word : words) {
            int index = Arrays.asList(words).indexOf(word);
            int vowels = vowelCounts[index];
            int consonants = consonantCounts[index];

            switch (operator) {
                case ">":
                    if (vowels > consonants) {
                        filteredWords.add(word);
                    }
                    break;
                case "<":
                    if (vowels < consonants) {
                        filteredWords.add(word);
                    }
                    break;
                case "=":
                    if (vowels == consonants) {
                        filteredWords.add(word);
                    }
                    break;
            }
        }
        return filteredWords;
    }

    // Printing methods
    public static void printVowelConsonantCounts(String[] words, int[] vowelCounts, int[] consonantCounts) {
        System.out.println("Step 1: Total counting of vowels and consonants for each word");
        System.out.println("Word\t\tVowels\tConsonants");
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i] + "\t" + vowelCounts[i] + "\t" + consonantCounts[i]);
        }
        System.out.println();
    }

    public static void printEvenOddNumbers(int[] evenVowelCounts, int[] oddVowelCounts, int[] evenConsonantCounts, int[] oddConsonantCounts) {
        System.out.println("Step 2: Even and Odd counts of vowels and consonants");
        System.out.println("Even Vowel Counts:\t" + Arrays.toString(evenVowelCounts));
        System.out.println("Odd Vowel Counts:\t" + Arrays.toString(oddVowelCounts));
        System.out.println("Even Consonant Counts:\t" + Arrays.toString(evenConsonantCounts));
        System.out.println("Odd Consonant Counts:\t" + Arrays.toString(oddConsonantCounts));
        System.out.println();
    }

    public static void printWordsWithNVowels(ArrayList<String> wordsWithNVowels) {
        System.out.println("Step 3: Words with >= 5 vowels");
        for (String word : wordsWithNVowels) {
            System.out.println(word);
        }
        System.out.println("Total number of words with >= 5 vowels: " + wordsWithNVowels.size());
        System.out.println();
    }

    public static void printWordsWithAllVowels(ArrayList<String> wordsWithAllVowels) {
        System.out.println("Words containing all vowels:");
        for (String word : wordsWithAllVowels) {
            System.out.println(word);
        }
        System.out.println();
    }

    public static void printWordsByVowelConsonantCount(ArrayList<String> filteredWords, String category, int[] consonantCounts) {
        System.out.println("Words with " + category + " consonants:");
        for (String word : filteredWords) {
            System.out.println(word);
        }
        System.out.println("Total number of words with " + category + " consonants: " + filteredWords.size());
        System.out.println();
    }
}
