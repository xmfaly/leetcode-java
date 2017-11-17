import java.util.*;

public class EmployeeImportance {

    class Employee {
        // It's the unique id of each node;
        // unique id of this employee
        public int id;
        // the importance value of this employee
        public int importance;
        // the id of direct subordinates
        public List<Integer> subordinates;
    }

//    class Solution {
//        public int getImportance(List<Employee> employees, int id) {
//
//            int importance = 0;
//            for (Employee e : employees) {
//                if (e.id == id) {
//                    importance+= e.importance;
//                    for(Integer sub: e.subordinates){
//                        importance += getImportance(employees,sub);
//                    }
//                    break;
//                }
//            }
//            return importance;
//        }
//
//    }

    class Solution {
        public int getImportance(List<Employee> employees, int id) {
            Map<Integer, Employee> map = new HashMap<>();
            for (Employee e : employees) {
                map.put(e.id, e);
            }
            Queue<Integer> queue = new LinkedList<>();
            queue.offer(id);
            int value = 0;
            while (!queue.isEmpty()) {
                int uid = queue.poll();
                Employee e = map.get(uid);
                value += e.importance;
                for (Integer i : e.subordinates) {
                    queue.offer(i);
                }

            }

            return value;
        }

    }
}
