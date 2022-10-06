package factory.example;

public class FactoryBrowser {

    public static IBrowser make(String browserType){
        IBrowser browser;
        switch (browserType.toLowerCase()){
            case "chrome":
                browser= new Chrome();
                break;
            case "firefox":
                browser= new Firefox();
                break;
            default:
                browser = new Edge();
                break;
        }
        return browser;
    }

}
