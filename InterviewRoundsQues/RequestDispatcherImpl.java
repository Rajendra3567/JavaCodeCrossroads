//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//
//public class RequestDispatcherImpl implements RequestDispatcher{
//
//    private final LoadBalancer loadBalancer;
//    private final ExecutorService executorService;
//    public RequestDispatcherImpl(LoadBalancer loadBalancer) {
//        this.loadBalancer = loadBalancer;
//        this.executorService = Executors.newCachedThreadPool();
//    }
//
//
//    @Override
//    public void dispatch(Request request) {
//        Server server = loadBalancer.getNextServer();
//        executorService.submit(() ->
//                server.handle(request));
//    }
//
//    @Override
//    public void shutdown() {
//        executorService.shutdown();
//    }
//}
