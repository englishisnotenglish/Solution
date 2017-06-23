package 查找;

import java.util.ArrayList;
import java.util.List;

public class Combine {
	
	public List<List<Integer>> combine(int n, int k) {
		// write your code here
		List<List<Integer>>  lis = new  ArrayList<List<Integer>>();
		if(n<0 || k<0)
            return lis;
		int len = k;
		for (int i = 1; i <= n; i++) {
			ArrayList<ArrayList<Integer>> li = new ArrayList<ArrayList<Integer>>();
			for (int j = 0; j <= n - i; j++) {
				li.add(new ArrayList<Integer>());
				if(n == k) {
					li.get(0).add(j + 1);
					if(li.get(0).size() == k)
						if(!lis.contains(li.get(0))) {
							lis.add(li.get(0));
							return lis;
						}
				}else {
					li.get(j).add(i);
					if(li.get(j).size() == k)
						if(!lis.contains(li.get(j)))
							lis.add(li.get(j));
				}
				
			}
			while(len > 1) {
				for (int j = i + 1, m = 0; j <= n; j++, m++) {
					if(!li.get(m).contains(j)) {
						li.get(m).add(j);
						if(li.get(m).size() == k)
							lis.add(li.get(m));
					}
				}
				len--;
			}
			len = k;
		}
		return lis;
    }
	
	
	public static void main(String[] args) {
		Combine c = new Combine();
		System.out.println(c.combine(4, 4));
	}
}
