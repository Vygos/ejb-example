package controller;

import services.UsuarioService;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/user")
@Produces(MediaType.APPLICATION_JSON)
public class UsuarioController {

    @EJB
    private UsuarioService usuarioService;


    @GET
    public Response fetchUser(){
        return Response.ok(usuarioService.fetchPessoa()).build();
    }


    public class Pessoa {
        private String nome;

        public Pessoa(String nome) {
            this.nome = nome;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }
    }

}
