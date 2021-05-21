package prueba.autos.persistence;

public class AutosPersistenceExeption extends Exception{

    public AutosPersistenceExeption(String message) {
        super(message);
    }

    public AutosPersistenceExeption(String message, Throwable cause) {
        super(message, cause);
    }
    
}