package 二分查找;

//当然这道题不是，这样的目的，有缘在写。
public class Sqrt {
	public int sqrt(int x) {
        // write your code here
		return (int)(Math.sqrt(x));
    }

	public static void main(String[] args) {
		Sqrt s = new Sqrt();
		System.out.println(s.sqrt(6));
	}
}
