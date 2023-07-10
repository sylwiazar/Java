public final class Palindrome {
    public static void main(String[] args) {

        //Palindrome checker

        String s = "Palindrome";
        
        for(int i = 0; i < s.length()/2; i++) {
            if(s.toLowerCase().charAt(i)!=s.toLowerCase().charAt(s.length()-1-i)){
                System.out.println("Given word is not a palindrome");
                break;
            }
            if(i==s.length()/2-1){
                System.out.println("Given word is a palindrome");
            }
        }

    }
}
