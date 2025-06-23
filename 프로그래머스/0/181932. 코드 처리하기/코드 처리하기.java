class Solution {
    public String solution(String code) {
        String answer = "";
        boolean mode = false;
        
        String[] codeArr = code.split("");
        
        for (int i = 0;  i < codeArr.length; i++) {
            if (!mode){
                if(!codeArr[i].equals("1") && i % 2 == 0) {
                    answer += codeArr[i];
                }
                else if (codeArr[i].equals("1")) {
                    mode = !mode;
                }
            }
            else {
                if(!codeArr[i].equals("1") && i % 2 == 1) {
                    answer += codeArr[i];
                }
                else if (codeArr[i].equals("1")) {
                    mode = !mode;
                }
                
            }
        }
        
        if (answer.trim().equals("")) { answer = "EMPTY"; }
        
        return answer;
    }
}