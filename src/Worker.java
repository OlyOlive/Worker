public class Worker {
    private Main.OnTaskDoneListener callback;
    private Main.OnTaskErrorListener errorCallback;

    public Worker (Main.OnTaskDoneListener callback) {
        this.callback = callback;
    }

    public Worker (Main.OnTaskErrorListener errorCallback) {
        this.errorCallback = errorCallback;
    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            callback.onDone("Task " + i + " is done");
        }
    }

    public void start1() {
        for (int i = 0; i < 100; i++) {
            if (i == 33) {
                errorCallback.onError("Task " + i + " is not done! ERROR!");
            } else {
                errorCallback.onError("Task " + i + " is done");
            }
        }
    }
}