Problem - 2:

Create a Java program that checks if two given words or phrases are anagrams of each other. An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once. For example, the words listen and silent are anagrams of each other.

Your program should prompt the user to enter two words or phrases. It should then check if they are anagrams and display an appropriate message indicating whether they are or are not anagrams of each other. The program must handle case insensitivity and ignore spaces and punctuation, so phrases like “A gentleman!” and “Elegant man” should be recognized as anagrams.

The program should keep running and asking the user for new pairs of words or phrases until the user enters "Done"to exit. When the user types "Done", the program should terminate gracefully.

Hint: replaceAll( ) method from String class might be helpful to clean the word/phrase with spaces and punctuations 

Sample Run:

Enter a word-1 or phrase-1 to check for anagrams (or 'done' to quit): Listen

Enter a word-2 or phrase-2 to check for anagrams (or 'done' to quit): Silent

The phrases "Listen" and "Silent" are anagrams.

Enter a word-1 or phrase-1 to check for anagrams (or 'done' to quit): A gentleman! 

Enter a word-2 or phrase-2 to check for anagrams (or 'done' to quit): Elegant man

The phrases "A gentleman" and "Elegant man" are anagrams.

Enter a word-1 or phrase-1 to check for anagrams (or 'done' to quit):  Done
