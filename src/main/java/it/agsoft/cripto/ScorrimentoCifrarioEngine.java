package it.agsoft.cripto;

public class ScorrimentoCifrarioEngine implements CifrarioEngine {

    public static final int ALPHABET_LENGTH = 26;

    private final int key;

    public ScorrimentoCifrarioEngine(int key) {
        this.key = key;
    }

    @Override
    public Character cifra(Character c) {
        char base = (char) (c - 'a');
        return (char) ((base + ALPHABET_LENGTH + key) % ALPHABET_LENGTH + 'a');
    }

}
