package stringLesson;

public class ReversString {
    //dog --> god
    // get the last letter (length -1) add is as first letter of the new word

    public static void main(String[] args) {
        ReversString reversString = new ReversString();
        reversString.reverceString("dog");
    }
        public void reverceString(String textToReverse) {
            if (textToReverse == null ||textToReverse.isEmpty() || textToReverse.isBlank()){
                System.out.println("the String is null or empty");
        }
            else {
                System.out.println(String.format("The input string is %s", textToReverse));
                String result = "";
                int lastLetter = textToReverse.length()-1;
                for (int i = lastLetter; i >= 0; i--){
                    result = result + textToReverse.charAt(i);
                }
                System.out.println(result);
            }
    }
}
