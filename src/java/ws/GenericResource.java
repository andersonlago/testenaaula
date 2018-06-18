/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author anderson
 */
@Path("webaula")
public class GenericResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of GenericResource
     */
    public GenericResource() {
    }

    /**
     * Retrieves representation of an instance of ws.GenericResource
     * @return an instance of java.lang.String
     */
    @Path("/pessoa/{nome}/{idade}/{cpf}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Pessoa getXml(@PathParam("nome") String nome, 
            @PathParam("idade") int idade, 
            @PathParam("cpf") String cpf) {
  
        Pessoa p  = new Pessoa();
        p.setNome(nome);
        p.setCpf(cpf);
        p.setIdade(idade);
        
        ArrayList<Pessoa> l = new ArrayList<>();
        
        Pessoa p2  = new Pessoa();
        p2.setCpf("1231234");
        p2.setNome("anderson2");
        p2.setIdade(100);
        l.add(p);
        l.add(p2);
        
        return p;
        
    }

    /**
     * PUT method for updating or creating an instance of GenericResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public String putXml(Pessoa p) {
        return p.getNome() + "1234";
    }
}
