class Solution {
    public String reverseWords(String s) {
        // trim spaces
        s= s.trim();
        // Split one by one more space 
        String [] words = s.split("\\s+");
        // reverse array
        int i=0; 
       int  j = words.length-1;

        while(i<j){
            String temp = words[i];
            words[i] = words[j];
            words[j] = temp;
            i++;
            j--;
        }

        // joinig with single spaces

        return String.join(" ", words);
        
    }
}