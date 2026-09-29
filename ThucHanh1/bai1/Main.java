package ThucHanh1.bai1;

import java.util.*;

class MyFunction {
    public int f1(String st) {
        int dem = 0;
        for (int i = 0; i < st.length(); i++) {
            char c = st.charAt(i);
            if (!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)) {
                dem++;
            }
        }
        return dem;
    }

    public void f2(String st) {
        Map<String, Integer> map = new LinkedHashMap<>();
        String[] words = st.trim().toLowerCase().split("\\s+");
        for (String w : words) {
            if (w.isEmpty()) {
                continue;
            }
            map.put(w, map.getOrDefault(w, 0) + 1);
        }
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> x, Map.Entry<String, Integer> y) {
                return y.getValue() - x.getValue();
            }
        });
        for (Map.Entry<String, Integer> e : list) {
            System.out.println(e.getKey() + ":" + e.getValue());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        MyFunction mf = new MyFunction();
        System.out.println(mf.f1(s1));
        mf.f2(s2);
    }
}