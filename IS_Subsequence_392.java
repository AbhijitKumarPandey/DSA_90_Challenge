public class IS_Subsequence_392 {
    public boolean IS_Subsequence(String s, String t){
        int i=0;
        int j =0;

        while(i<s.length()&&j<s.length()){
            if(s.charAt(i)==s.charAt(j)){
                i++;
            }
            j++;
        }
        return i==s.length();
    }

     public static void main(String[] args) {
         IS_Subsequence_392 obj = new IS_Subsequence_392();

        String s = "abc";
        String t = "ahbgdc";
  System.out.println(obj.IS_Subsequence(s, t));
    }
}
    

