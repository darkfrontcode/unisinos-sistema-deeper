package main;

import java.util.ArrayList;
import java.util.Arrays;

public class ListaAmigo
{
    public Usuario[] listaDeAmigos;
    public int quantidadeDeAmigos;
    public boolean isEmpty = true;

    public ListaAmigo(int size)
    {
        this.quantidadeDeAmigos = size;
        listaDeAmigos = new Usuario[size];
    }

    public void adicionaAmigo(Usuario usr)
    {
        int count = 0;
        int searchPhone;

        if(isEmpty)
        {
            listaDeAmigos[0] = usr;
        }
        else
        {
            for(int i=0;i<listaDeAmigos.length;i++)
            {
                if(listaDeAmigos[i]==null)
                {
                    int currentPhone = usr.getNumCelular();

                    for(int x=0;x < i; x++)
                    {
                        searchPhone = listaDeAmigos[x].getNumCelular();

                        if(currentPhone == searchPhone)
                        {
                            System.out.println("Duplicated cell phone numbers are not allowed");
                            return;
                        }
                    }

                    listaDeAmigos[i] = usr;
                    break;
                }
                else
                {
                    count++;
                }
            }
        }


        if(count == listaDeAmigos.length)
        {
            System.out.println("Sorry, your friend list is full ={");
        }
        else
        {
            isEmpty = false;
            System.out.println("Friend saved with success!");
        }
    }

    public void visualizaAmigos()
    {
        if(isEmpty)
        {
            System.out.println("Você ainda não adicionou nenhum amigo.");
        }
        else
        {
            for(int i=0; i < listaDeAmigos.length; i++)
            {
                if(listaDeAmigos[i] != null)
                {
                    System.out.println("===================");
                    listaDeAmigos[i].exibeDados();
                    System.out.println("===================");
                }
            }
        }
    }

    public Usuario[] pesquisaAmigoPorCelular(int numCelular)
    {

        if(isEmpty)
        {
            System.out.println("Você ainda não adicionou nenhum amigo.");
            return listaDeAmigos;
        }
        else
        {
            ArrayList<Usuario> friendList = new ArrayList<Usuario>();

            for(int i=0; i < listaDeAmigos.length; i++)
            {
                if(listaDeAmigos[i]!=null)
                {
                    int currentPhone = listaDeAmigos[i].getNumCelular();
                    if(numCelular == currentPhone)
                    {
                        friendList.add(listaDeAmigos[i]);
                    }
                }
            }

            Usuario[] friends = friendList.toArray(new Usuario[friendList.size()]);
            return friends;
        }

    }
}
