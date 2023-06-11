package com.StringsPractice;
    
public class reversedStringManual {
    public static void main(String[] args) {

        /* We start a sentence or a string that says "Hello World!" and store it in a variable inputString
         *  then we create emptyboc called 'reversedString' to store the reversed string.
         */
    String inputString = "Hello World!";
    StringBuilder reversedString = new StringBuilder();

    /* We now begin a special loop that goes from last letter of the string to first letter
     *  the loop continues as long as 'i' is greater than or equal to 0 
     */
    for(int i = inputString.length()-1; i >= 0; i--) {
        reversedString.append(inputString.charAt(i));  //We take charAt(i) by taking letter at index i of the string
        // then we put our letter in the reversedString by using function called append();    
        }
    System.out.println(reversedString.toString()); // finally we show reversedString by printing the contents of reversedString
    }

}


