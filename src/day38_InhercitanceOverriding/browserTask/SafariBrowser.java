package day38_InhercitanceOverriding.browserTask;

public class SafariBrowser extends Browser{

    @Override
    public void openBrowser() {
        System.out.println("Opening safari browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing safari browser");
    }
}
