package factory.structure;

public class FactoryObjeto {

    public static IObjeto make (String objectType){
        IObjeto objeto;
        switch (objectType.toLowerCase()){
            case "clasea":
                objeto = new ClaseA();
                break;
            case "claseb":
                objeto = new ClaseB();
                break;
            case "clasec":
                objeto = new ClaseC();
                break;
            default:
                objeto = new ClaseD();
                break;

        }
        return objeto;

    }

}
