//
//import java.util.Scanner;
//
//public class Assessment {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        // Select mode
//        System.out.println("Select mode: 1 for ROUND_ROBIN, 2 for RANDOM");
//        int modeInput = scanner.nextInt();
//        scanner.nextLine(); // consume newline
//        Mode mode = (modeInput == 2) ? Mode.RANDOM : Mode.ROUND_ROBIN;
//        System.out.println("Selected mode: " + mode);
//
//        Mode selectedMode = Mode.ROUND_ROBIN;
//        // Initialize LoadBalancer and RequestDispatcher here -->
//        LoadBalancer loadBalancer = new LoadBalancerImpl(selectedMode);
//        RequestDispatcher requestDispatcher = new RequestDispatcherImpl(loadBalancer);
//
//        //Sample Testing code.
//        // Add servers
//        loadBalancer.addServer("server1");
//        loadBalancer.addServer("server2");
//
//        // --------Simulate requests--------
//        dispatcher.dispatch(new Request(1));
//        dispatcher.dispatch(new Request(2));
//        dispatcher.dispatch(new Request(3));
//
//        // Remove a server
//        loadBalancer.removeServer("server1");
//        System.out.println("Removed server: server1");
//
//        // Handle another request
//        dispatcher.dispatch(new Request(4));
//
//        scanner.close();
//    }
//}