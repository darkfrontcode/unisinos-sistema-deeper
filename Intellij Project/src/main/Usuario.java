package main;

/**
 * Classe Usuario
 */
public class Usuario
{
    /*
     * Crie a classe: Usuario com os seguintes atributos:
     * E-mail = tipo de dados número texto;
     * Senha = tipo de dados texto;
     * Nome = tipo de dados texto;
     * Número do Celular = tipo de dados número inteiro; 
     * Quantidade de Interesses = tipo de dados número inteiro.
     */
    private String email;
    private String senha;
    private String nome;
    private int numCelular;
    private int qtdeInteresses;
    
    /*
     * Crie um Construtor que receba como parâmetro os valores dos atributos:
     * i. E-mail, Senha, Nome e Número do Celular.
     */
    public Usuario(String em, String se, String no, int nu)
    {
        email = em;
        senha = se;
        nome = no;
        numCelular = nu;
    }

    
    //Metodos de acesso (GET) para os atributos: E-mail, Senha, Nome e Número de celular
    public String getEmail()
    {
        return email; 
    }

    public String getSenha()
    {
        return senha; 
    }

    public String getNome() { return nome; }

    public int getNumCelular()
    {
        return numCelular;
    }
        
    
    //Metodos de configuração (SET) para os atributos: Senha
    
    public void setSenha(String se)
    {
        senha = se; 
    }

    
    //Método adicionaNovoInteresse que deverá somar +1 interesse no atributo: 
    //Quantidade de Interesses, toda vez que o método for executado.
    public void adicionaNovoInteresse()
    {
        qtdeInteresses++; 
    }
    
    
    //Metodo exibeDados para apresentar todos os dados do Usuario
    public void exibeDados()
    {
        System.out.println("Dados do Usuario:");
        System.out.println("E-mail:" + email);
        System.out.println("Nome:" + nome);
        System.out.println("Numero Celular:" + numCelular);
        System.out.println("Qtde. Interesses:" + qtdeInteresses);
    }

}
