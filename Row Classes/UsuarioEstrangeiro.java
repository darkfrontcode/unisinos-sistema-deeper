package main;

public class UsuarioEstrangeiro extends Usuario{

    private String linguaNativa;
    private char idiomaPreferencial; // I – Inglês, E – Espanhol, F – Francês ou O – Outro

    public UsuarioEstrangeiro(String em, String se, String no, int nu, String ln, char ip)
    {
        super(em, se, no, nu);

        setlinguaNativa(ln);
        setIdiomaPreferencial(ip);
    }

    public String getlinguaNativa()
    {
        return linguaNativa;
    }

    public void setlinguaNativa(String language)
    {
        linguaNativa = language;
    }

    public char idiomaPreferencial()
    {
        return idiomaPreferencial;
    }

    public void setIdiomaPreferencial(char language)
    {
        idiomaPreferencial = language;
    }

    public void exibeDados()
    {
        super.exibeDados();
        System.out.println("Língua Nativa: " + linguaNativa);
        System.out.println("Idioma Preferencial: " + idiomaPreferencial);
    }
}
