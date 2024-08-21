package com.tecmave.service;

import org.springframework.web.multipart.MultipartFile;

/**
 *
 * clase33333333
 */
public interface FirebaseStorageService {

    public String cargaImagen(MultipartFile archivoLocalCliente,
            String carpeta,
            Long id);
//el buketname es el id del proyecto : <id del proyecto>+.appsport.com
    final String BuketName="Tecmave.appspot.com";
    //esta es la ruta base de este proyecto en el storage
    final String rutaSuperiorStorage="Tecmave";
    //ubicacion del archivo de comunicacion Json
    final String rutaJsonFile="firebase";
    
    final String archivoJsonFile="Tecmave-firebase-adminsdk-5j63z-5a03a07476.json";
}
