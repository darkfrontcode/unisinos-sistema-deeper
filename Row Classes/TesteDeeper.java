package main;


import java.util.Scanner;

public class TesteDeeper {

    private static int[] validOptions = {0,1,2,3};
    public ListaAmigo friendList;

    public TesteDeeper()
    {
        friendList = new ListaAmigo(3);
        app();
    }

    public void app()
    {

        int selectedOption;
        boolean isValidOption = false;
        Scanner scan = new Scanner(System.in);

        do
        {
            menu();
            selectedOption = scan.nextInt();
            isValidOption = checkOptionValidity(selectedOption);

            if(isValidOption)
            {
                switch(selectedOption)
                {
                    case 1: friendList.visualizaAmigos(); break;
                    case 2: chooseFriendType(); break;
                    case 3: findFriendByPhone() ; break;
                    default: break;
                }
            }
            else
            {
                System.out.println("Opção inválida. Porfavor escolha uma das opções abaixo.");
            }

        }
        while(selectedOption!=0);

        System.out.println("== Até mais ==");

    }

    private void menu()
    {
        System.out.println("===============");

        System.out.println("i.   1 - Visualizar Dados dos Amigos");
        System.out.println("ii.  2 – Adicionar amigo");
        System.out.println("iii. 3 – Pesquisar amigos por Celular");
        System.out.println("iv.  0 – Encerrar.");

        System.out.println("===============");
    }

    private boolean checkOptionValidity(int option)
    {
        for(int i=0;i<validOptions.length;i++)
        {
            if(validOptions[i] == option) return true;
        }

        return false;
    }

    private void chooseFriendType()
    {

        Usuario friend;
        boolean outLander = false;

        System.out.println("== Seu amigo é estrangeiro? ==");
        outLander = Teclado.leBoolean("Sim: true | Não: false");

        if(outLander)
        {
            friend = new UsuarioEstrangeiro(
                Teclado.leString("Informe o e-mail: "),
                Teclado.leString("Informe a senha: "),
                Teclado.leString("Informe o nome: "),
                Teclado.leInt("Informe o numero do celular: "),
                Teclado.leString("Informe a língua nativa: "),
                Teclado.leChar("Informe o idioma preferencial: ")
            );
        }
        else
        {
            friend = new Usuario(
                Teclado.leString("Informe o e-mail: "),
                Teclado.leString("Informe a senha: "),
                Teclado.leString("Informe o nome: "),
                Teclado.leInt("Informe o numero do celular: ")
            );
        }

        friendList.adicionaAmigo(friend);
    }

    private void findFriendByPhone()
    {
        if(friendList.isEmpty)
        {
            System.out.println("Você ainda não adicionou nenhum amigo.");
        }
        else
        {

            int number = Teclado.leInt("Digite um número de telefone:");
            Usuario[] result = friendList.pesquisaAmigoPorCelular(number);

            if(result.length == 0)
            {
                System.out.println("Nenhum amigo encontrado.");
            }
            else
            {
                for(int i=0;i < result.length;i++)
                {
                    System.out.println("===================");
                    result[i].exibeDados();
                    System.out.println("===================");
                }
            }
        }

    }

}
