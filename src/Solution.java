public class Solution {
	// ����ַ����е���ظ��Ӵ�  
    public static String maxRepat(String input) {  
        // �������  
        if (input == null || input.length() == 0) {  
            return null;  
        }  
        // �ظ��Ӵ��������  
        int max = 0;  
        // ��ظ��Ӵ�����ʼλ��  
        int first = 0;  
        int k = 0;  
        for (int i = 1; i < input.length(); i++) {  
            for (int j = 0; j < input.length() - i; j++) {  
                if (input.charAt(j) == input.charAt(i + j)) {  
                    k++;  
                } else {  
                    k = 0;  
                }  
                if (k > max) {  
                    max = k;  
                    first = j - k + 1;  
                }  
            }  
        }  
        if (max > 0) {  
            System.out.println(max);  
            return input.substring(first, first + max);  
        }  
        return null;  
    }  
  
    public static void main(String[] args) {  
        String str1 = "duiifjfohellowdhelloko29949jfvjfefldlld";  
        String result = Solution.maxRepat(str1);  
        System.out.println(result);  
    }  
}
