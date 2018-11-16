/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.com.telusko;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author alex
 */

@Path("aliens")
public class AlienResource {    
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    //@Produces(MediaType.APPLICATION_XML)
    public Alien getAlien(){
        
        Alien al = new Alien();
        al.setName("alex");
        al.setPoints(29);
        
        return al;
    }
    
}
