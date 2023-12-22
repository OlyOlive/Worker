public class Main {
    public static void main(String[] args) {
        /*    OnTaskDoneListener listener = System.out::println;
              Worker worker = new Worker(listener);
              worker.start();       */

        OnTaskErrorListener listener = System.out::println;
        Worker worker = new Worker(listener);
        worker.start1();
    }

    @FunctionalInterface
    public interface OnTaskDoneListener {
        void onDone (String result);
    }

    @FunctionalInterface
    public interface OnTaskErrorListener {
        void onError (String result);
    }
}