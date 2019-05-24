package br.edu.ifsul.vendas.setup;

import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifsul.vendas.model.Cliente;
import br.edu.ifsul.vendas.model.ItemPedido;
import br.edu.ifsul.vendas.model.Produto;
import br.edu.ifsul.vendas.model.User;

public class AppSetup {

    public static List<Produto> produtos = new ArrayList<>();
    public static Cliente cliente = null;
    public static List<ItemPedido> carrinho = new ArrayList<>();
    public static User user = null;

    public static DatabaseReference myRef = null;

    public static DatabaseReference getInstance(){
        if(myRef == null){
            FirebaseDatabase database = FirebaseDatabase.getInstance();
            myRef = database.getReference("vendas");

            return myRef;
        }

        return myRef;
    }
}
