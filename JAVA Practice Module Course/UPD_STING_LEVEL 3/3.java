/*3.
Winston is working  at Adobe working on the layout engine for InDesign. Your task is to implement a "full justification" algorithm for a text editor.  

Question: Given an array of strings words and a maxWidth, format the text such that each line has exactly maxWidth characters 

and is fully justified (both left and right). For the last line, it should be left-justified.*/

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        int i = 0;
        int n = words.length;

        while (i < n) {
            int j = i;
            int lineLength = 0;
            // 1. Determine how many words fit on the current line
            // (j - i) accounts for at least one space between words
            while (j < n && lineLength + words[j].length() + (j - i) <= maxWidth) {
                lineLength += words[j].length();
                j++;
            }

            StringBuilder line = new StringBuilder();
            int numWords = j - i;
            int numSpaces = maxWidth - lineLength;

            // 2. Handle last line or single-word line (left-justified)
            if (numWords == 1 || j == n) {
                for (int k = i; k < j; k++) {
                    line.append(words[k]);
                    if (k < j - 1) {
                        line.append(" ");
                    }
                }
                // Add remaining spaces to the end
                int remainingSpaces = maxWidth - line.length();
                line.append(" ".repeat(remainingSpaces));
            } 
            // 3. Handle fully justified line
            else {
                int numGaps = numWords - 1;
                int baseSpaces = numSpaces / numGaps;
                int extraSpaces = numSpaces % numGaps;

                for (int k = i; k < j; k++) {
                    line.append(words[k]);
                    if (k < j - 1) {
                        // Add base spaces + one extra space if available
                        int spacesToAdd = baseSpaces + (extraSpaces > 0 ? 1 : 0);
                        line.append(" ".repeat(spacesToAdd));
                        extraSpaces--;
                    }
                }
            }
            result.add(line.toString());
            i = j; // Move to the start of the next line
        }
        return result;
    }
}
