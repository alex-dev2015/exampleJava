package exemplos;

public class ThreadExample {
    public static void main(String[] args) {
        GeneratePDF initGenerate = new GeneratePDF();
        LoadingBar  loadingBar   = new LoadingBar(initGenerate);

        initGenerate.start();
        loadingBar.start();

        Thread thread = new Thread(new LoadingBarOne());
        Thread thread2 = new Thread(new LoadingBarTwo()) ;

        thread.start();
        thread2.start();

        System.out.println("Nome da Thread: " + thread.getName());
        System.out.println("Nome da Thread: " + thread2.getName());
    }
}

class GeneratePDF extends Thread{
    @Override
    public void run() {

        try {
            System.out.println("Ínicio da geração do Relatório!");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Relatório gerado!");
    }
}

class LoadingBar extends Thread{
    private Thread initGenerate;

    public LoadingBar(Thread initGenerate) {
        this.initGenerate = initGenerate;
    }

    @Override
    public void run() {

        while (true){
            try {
                Thread.sleep(500);
                if (!initGenerate.isAlive()){
                    break;
                }
                System.out.println("Loading...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}

class LoadingBarOne implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(3000);
            System.out.println("Executei barra de carregamento1: ");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class LoadingBarTwo implements Runnable{
    @Override
    public void run() {

        try {
            Thread.sleep(5000);
            System.out.println("Executei barra de carregamento2: ");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

