package WildCoding;

public class frequencyOfCharacters {
    public static void main(String[] args) {

        System.out.println(frequencyOfCharacters("AAABBCDD"));
    }


        //    (String) Frequency of Characters
        //    String -- Frequency of Characters
        //    Write a return method that can find the frequency of characters
        //    Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2



        public static String frequencyOfCharacters(String word) {
            String result = "";


            for (int i = 0; i < word.length(); i++) {
                int count = 0;
                for (int j = 0; j < word.length(); j++) {
                    if (word.charAt(i) == word.charAt(j)) {
                        count++;

                    }
                }
                if ((!result.contains(word.charAt(i) + ""))) {
                    result = result + word.charAt(i) + "" + count;
                }
            }return result;


        }



    }

