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
@Path("media")
public class MediaResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Media getMedia(){
        
        Media media = new Media("http", "peli");
        System.out.println("exit media " + media);
        return media;        
    }
    
}
