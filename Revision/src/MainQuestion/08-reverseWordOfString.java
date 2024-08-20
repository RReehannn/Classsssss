package MainQuestion;// WAP to reverse words in a String. (I love india -> I evol aidni)

class ReverseWordOfString {
    public static void main(String[] args) {
        String str = "I love india";

        String ans = "";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                sb.append(ch);
            } else {
                // Reverse the current word and add it to the answer
                sb.reverse();
                ans += sb.toString();
                ans += " ";
                // Reset the StringBuilder for the next word
                sb = new StringBuilder();
            }
        }

        // Reverse and append the last word
        sb.reverse();
        ans += sb.toString();
        System.out.println(ans);
    }
}

/*

The for loop iterates through each character in the input string.
If the character is not a space, it is appended to sb.
If the character is a space, the current word is reversed using sb.reverse(),
added to ans, and sb is reset for the next word.
*
*
*



Initialization:

str is "I love India".
ans is an empty string "".
StringBuilder sb is initialized.
Loop through the String:

Iteration 1:

i = 0, ch = 'I'.
'I' is not a space, so sb.append('I') results in sb = "I".
Iteration 2:

i = 1, ch = ' '.
A space is encountered, so:
sb.reverse() results in sb = "I".
ans += sb.toString() results in ans = "I".
ans += " " results in ans = "I ".
sb is reset, sb = new StringBuilder().
Iteration 3:

i = 2, ch = 'l'.
'l' is not a space, so sb.append('l') results in sb = "l".
Iteration 4:

i = 3, ch = 'o'.
'o' is not a space, so sb.append('o') results in sb = "lo".
Iteration 5:

i = 4, ch = 'v'.
'v' is not a space, so sb.append('v') results in sb = "lov".
Iteration 6:

i = 5, ch = 'e'.
'e' is not a space, so sb.append('e') results in sb = "love".
Iteration 7:

i = 6, ch = ' '.
A space is encountered, so:
sb.reverse() results in sb = "evol".
ans += sb.toString() results in ans = "I evol".
ans += " " results in ans = "I evol ".
sb is reset, sb = new StringBuilder().
Iteration 8:

i = 7, ch = 'I'.
'I' is not a space, so sb.append('I') results in sb = "I".
Iteration 9:

i = 8, ch = 'n'.
'n' is not a space, so sb.append('n') results in sb = "In".
Iteration 10:

i = 9, ch = 'd'.
'd' is not a space, so sb.append('d') results in sb = "Ind".
Iteration 11:

i = 10, ch = 'i'.
'i' is not a space, so sb.append('i') results in sb = "Indi".
Iteration 12:

i = 11, ch = 'a'.
'a' is not a space, so sb.append('a') results in sb = "India".
Final Word:

The loop ends, and the last word "India" needs to be reversed:
sb.reverse() results in sb = "aidnI".
ans += sb.toString() results in ans = "I evol aidnI".
Output:

System.out.println(ans); prints "I evol aidnI".
Summary
* */

