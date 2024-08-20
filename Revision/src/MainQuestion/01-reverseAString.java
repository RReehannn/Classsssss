package MainQuestion;

class reverseAString {
    public static void main(String[] args) {


        String name = "viratKohli";

        int Length = name.length();

        String reverse = "";

        for (int i = Length - 1; i >= 0; i--) {
            reverse += name.charAt(i);
        }
        System.out.println(reverse);
        ReverseString();

    }



    public static void ReverseString() {

        String name = "viratKohli";
        char[] characters = name.toCharArray();
        int length = characters.length;

        for (int i = 0; i < length / 2; i++) {
            char temp = characters[i];
            characters[i] = characters[length - 1 - i];
            characters[length - 1 - i] = temp;
        }
        String reverse = new String(characters);
        System.out.println(reverse);

    }

}


