public class Countdown extends  Questions {
    public static void test_timer(){
        new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        try {
                            Thread.sleep(3000);
                            Questions questions = new Questions();
                            questions.question();

                        } catch (InterruptedException e) {

                        }
                    }
                }
        ).start();
    }
}
