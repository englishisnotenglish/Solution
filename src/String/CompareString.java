package String;

public class CompareString {
	public boolean compareStrings(String A, String B) {
        // write your code here

		if(B.length() == 0)
			return true;
		if(A.length() == 0)
			return false;
		
        int[] count = new int[256];

        for (int i = 0; i < A.length(); i++) {
            count[(int) A.charAt(i)]++;
        }

        for (int i = 0; i < B.length(); i++) {
            count[(int) A.charAt(i)]--;
            if(count[(int) B.charAt(i)] < 0)
                return false;
        }

        return true;
    }
	
	public static void main(String[] args) {
		CompareString an = new CompareString();
		System.out.println(an.compareStrings("ABCD", "AC"));
	}

}
