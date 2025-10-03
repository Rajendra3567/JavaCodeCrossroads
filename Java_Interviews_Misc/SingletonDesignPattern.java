public class SingletonDesignPattern {
//    browse static instance of the class
    private volatile static SingletonDesignPattern singletonDesignPattern; // default - null
//    private constructor
    private SingletonDesignPattern() {}
//    public static getInstance method to provide the access to the instance/object
    public synchronized static SingletonDesignPattern getInstance() {
        if(singletonDesignPattern == null) {
            synchronized (SingletonDesignPattern.class) {
                if (singletonDesignPattern == null) {
                    singletonDesignPattern = new SingletonDesignPattern();
                }
            }
        }
        return singletonDesignPattern;
    }
//    Individual public method of the class
    public void displayMsg() {
        System.out.println("singleton info");
    }




}
