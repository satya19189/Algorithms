import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Members {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new String[] {"id123","id234","id7","id321"}, new String[] {"Hey @id123, id321 review this PR please! @id123 what do you think about"
				,"Hey @id7 nice approach! Great job! @id800 what do you think","@id123, id321 thx!"
		})));
	}
	
	public static String[] solution(String[] members, String[] messages) {
		int[] output = new int[members.length];
		HashMap<String, Integer> map = new HashMap<>();
		for(int j =0;j<members.length;j++) {
			for(int i =0;i<messages.length;i++) {
				String[] dummy = messages[i].split(" ");
				for(String s :dummy) {
					if(s.contains("id")) {
						String id = s.substring(s.indexOf("id"));
						if(id.equals(members[j])) {
							output[j]++;
							if(map.containsKey(id)) {
								map.put(id, map.get(id)+1);
							}else {
								map.put(id, 1);
							}
							break;
						}
					}
				}
			}
		}
		for(String s : members) {
			if(!map.containsKey(s))
				map.put(s, 0);
		}
		List<Map.Entry<String, Integer> > list =
	               new LinkedList<Map.Entry<String, Integer> >(map.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2)
            {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });
        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
        int i =0;
        String[] opt = new String[output.length];
        for (Map.Entry<String, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
            opt[i]=aa.getKey()+"="+aa.getValue();
            i++;
        }
		return opt;
	}

}
