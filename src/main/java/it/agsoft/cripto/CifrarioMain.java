package it.agsoft.cripto;

import java.util.stream.IntStream;

public class CifrarioMain {

    public static void main(String[] args) {
        final var testoInChiaro = args[0];
        final var chiave = Integer.parseInt(args[1]);
        var cifrarioEngine = new ScorrimentoCifrarioEngine(chiave);
        final var cifrata = IntStream.range(0, testoInChiaro.length())
                                     .boxed()
                                     .map(testoInChiaro::charAt)
                                     .map(cifrarioEngine::cifra)
                                     .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);
        System.out.println("cifrata = " + cifrata);
    }


}
