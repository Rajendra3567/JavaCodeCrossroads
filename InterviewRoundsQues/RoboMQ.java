//import java.util.*;
//import java.util.concurrent.atomic.AtomicInteger;
//
//public class LoadBalancerImpl implements LoadBalancer {
//    private final List<Server> servers;
//    private final Mode mode;
//    private Random random;
//    private final AtomicInteger index;
//
//    public LoadBalancerImpl(Mode mode) {
//        this.servers = servers;
//        this.mode = mode;
//        this.random = random;
//        this.index = new AtomicInteger(0);
//    }
//
//    @Override
//    public boolean addServer(String serverName) {
//        return servers.add(new Server(serverName));
//    }
//
//    @Override
//    public boolean removeServer(String serverName) {
//        return servers.remove(new Server(serverName));
//    }
//
//    @Override
//    public Server getNextServer() {
//        if(servers.isEmpty()) {
//            throw new IllegalStateException("No Server available");
//        }
//        if(mode == Mode.ROUND_ROBIN) {
//            int currentIndex = Math.abs(index.getAndIncrement() % servers.size());
//            return servers.get(currentIndex);
//        } else {
//            int randomIndex = random.nextInt(servers.size());
//            return servers.get(randomIndex);
//        }
//    }
//}