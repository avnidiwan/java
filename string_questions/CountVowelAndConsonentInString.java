public class CountVowelAndConsonentInString {
    public static void main(String[] args) {
        int countvow=0, countcon=0;
        String str="Hey everyone my name is avni diwan";
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                countvow++;
            }
            else if((str.charAt(i)>=(char)97 && str.charAt(i)<=(char)123) && (str.charAt(i) != 'a' || str.charAt(i) != 'e' || str.charAt(i) == 'i' || str.charAt(i) != 'o' || str.charAt(i) != 'u')){
                countcon++;
            }
        }
        System.out.println("count of vowel: "+countvow);
        System.out.println("count of consonent: "+countcon);
    }
}
