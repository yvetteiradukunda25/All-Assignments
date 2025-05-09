import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

 class URLFetcherThread implements Runnable{
    String URLName;
    public URLFetcherThread(String URLName){
        this.URLName = URLName;
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        try{
            URL url = new URL(URLName);
            BufferedReader file = new BufferedReader(new java.io.InputStreamReader(url.openStream()));
            String line;
            while((line = file.readLine()) != null) {
                System.out.println("Thread " + "[ " + threadName + " ]: Line from URL: " + line);

            }
        }catch (MalformedURLException e){
            throw new RuntimeException(e);
        }catch (IOException e){
            throw new RuntimeException();
        }

    }
}
 class FetcherProcessorMain {
    public static void main(String[] args) throws InterruptedException {
        URLFetcherThread thread1 = new URLFetcherThread("https://www.shecancodeschool.org/courses");
        URLFetcherThread thread2 = new URLFetcherThread("https://www.shecancodeschool.org/courses/category/sofware-development");

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        System.out.println("Main thread continues processing...");
        t1.setName("FetcherThread-1");
        t1.start();
        System.out.println(t1.getName());

        try {

            t1.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e.getMessage());
        }
        t2.start();

        t2.setName("FetcherThread-2");

        System.out.println(t2.getName());


        try {

            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e.getMessage());
        }

    }
}
