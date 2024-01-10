class Solution {
    public String removeDigit(String number, char digit) {
        String s = "";
        String temp = "";
        for(int i=0; i<number.length(); i++){
            if(number.charAt(i) == digit){
                temp = number.substring(0, i)+number.substring(i+1, number.length());
                if(temp.compareTo(s) > 0) {
                    //Swap s, temp without using third variable
                    s = s+temp;
                    temp = s.substring(0, s.length()-temp.length());
                    s = s.substring(temp.length());
                }
         }
        }
    return s;
    }
}
