package projeto.cli.exceptions;

public class InvalidArgumentsException extends RuntimeException{

    public InvalidArgumentsException() {
        super("Quantidade de argumentos passados invalido",null,false,false);
    }
    
}
