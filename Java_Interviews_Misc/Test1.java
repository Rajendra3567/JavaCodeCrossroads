//import java.util.LinkedHashMap;
//import java.util.Map;
//import java.util.stream.Collectors;
//
//public class Test1 {
//    public class Main {
//        public static void main(String[] args) {
//
//            Map<String, MemberShip> members = new LinkedHashMap<>();
//
//            members.put("Adam", new MemberShip("Mem-1", 231, "paid"));
//            members.put("Edidas", new MemberShip("Mem-12", 700, "paid"));
//            members.put("John", new MemberShip("Mem-143 - Custom", 261, "unpaid"));
//
//
//        /*Use Streams
//        Need a logic for members to be sorted by price in Desc*/
//
//
//            // Sort by price descending
//            Map<String, MemberShip> sortedByPriceDesc =  applySort(members);
//
//            // Print result
//            sortedByPriceDesc.forEach((name, membership) ->
//                    System.out.println(name + " -> " + membership.title + ", " + membership.price + ", " + membership.type)
//            );
//
//
//        }
//
//        private static Map<String, MemberShip>  applySort(Map<String, MemberShip> members){
//            members.entrySet()
//                    .stream()
//                    .sorted((s1,s2) -> s2.getValue().price.compareTo(s2.getValue().price))
//                    .collect(
//                            LinkedHashMap::new,
//
//                    )
//            return members ;
//        }
//
//        static class MemberShip{
//            String title;
//            Integer price;
//            String type;
//
//            public MemberShip(String title, Integer price, String type){
//                this.price = price;
//                this.type = type;
//                this.title = title;
//            }
//        }
//    }
//}
