class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> result = new ArrayList<>();

        for(int i=1; i<=9; i++){
            int sequence_digit = i;
            int next = i+1;
            while(sequence_digit <= high && next<10){
                sequence_digit = sequence_digit*10 + next;
                next++;
                if(sequence_digit >= low && sequence_digit <= high)
                    result.add(sequence_digit);
            }
            ++next;
        }
        result.sort(null);
        return result;
    }
}
