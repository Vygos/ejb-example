package services;

import model.Usuario;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class UsuarioService {

    public Usuario fetchPessoa(){
        return new Usuario("User 01");
    }
}
