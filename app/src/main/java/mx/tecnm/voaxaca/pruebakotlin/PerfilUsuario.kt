package mx.tecnm.voaxaca.pruebakotlin

import org.json.JSONObject
import java.util.*

/**
 * 1.Mostrar publicaciones de usuario - UI/UX - Nuevo tipo (Videos, Gifs, LIVE)
 * 2.Reportar - Restricciones o cumplimiento - Abogados derecho mercantil
 * 3.Bloquear - Restricciones o cumplimiento - Abogados derecho mercantil
 * 4.Enviar mensaje - Nuevo tipo (Video, Audio, Contactos) - Encargado de Tecnologías
 * 5.Ver conversación - UI/UX - Nuevo tipo
 * 6.Mostrar lista de amigos - UI/UX
 * 7.Enviar solicitud - No debe cambiar...
 * 8.Quitar amigo - No debe cambiar...
 * 9.Desbloquear un amigo - Restricciones o cumplimiento - Abogados derecho mercantil
 */


/** M O D E L S */

class PerfilUsuario {

 val nombre= "Stephanie Anaid Martínez López"

}

class Message{
    fun crearMensaje(jasonObject: JSONObject){

    }
}

class PublicacionUsuario{
    fun crearPublicacion(jsonObject: JSONObject){

    }
}

class Filtro{
    fun crearFiltro(){

    }
}


// Creación de las vistas, donde están los botones y listas

//Creación de clase para mostrar lista de amigos, está en una clase distinta porque
// su vista o diseño será diferente

/** V I S T A S */

class AmigosView{
    fun mostrarListaDeAmigosDelUsuario(usuario: PerfilUsuario){
        //Lógica para mostrar lista de amigos
    }
}

class PublicacionesUsuariosView{
    fun mostrarPublicacionesDelUsuario(usuario: PerfilUsuario){

    }
}

class ConversacionesView{
    fun mostrarConversacionConUsuario(usuario: PerfilUsuario){

    }
}



/** U T I L E R Í A S  o   G E S T O R */

class SendderMultimedia{
    fun enviarVideo(){

    }
    fun enviarFoto(){

    }
}

class AplicadorFiltrosMultimedia{
    fun aplicarFiltro(filtro: Filtro){
        //Lógica para aplicar un filtro, pasando como parámetro un clase filtro
    }
}

class SendderMessage{
    fun enviarMensajeAusuario(usuario: PerfilUsuario){

    }
}

class GestorAmigos{
    fun enviarSolicitudAmistad(usuario: PerfilUsuario){

    }
    fun quitarDeAmigo(usuario: PerfilUsuario){

    }
}

class GestorRestriccionesPerfil{
    fun reportar(usuario:PerfilUsuario){
        //Lógica para reportar al usuario
    }
    fun bloquear(usuario:PerfilUsuario){
        //Lógica para bloquear al usuario
    }
    fun desbloquear(usuario:PerfilUsuario){
        //Lógica para desbloquear al usuario
    }
}





//La clase enviar mensaje está sujeto al nuevo tipo de dato que se estará enviando que puede ser
//un audio, un video, etc. o en general a alguna nueva función que se quiera implementar

class Mensaje{

    //En esta función se ocupará JSON porque
    //es un formato basado en texto estándar para representar datos
    // estructurados en la sintaxis de objetos de JavaScript
    //Cualquier mensaje mandado por internet debe integrar un formato JSON

    fun crearMensaje(jasonObject: JSONObject){

    }
    fun crearMensajeAusuario(usuario: PerfilUsuario){

    }

    //Sin embargo, esta forma de estructurar es incorrecta en base al primer principio de S.O.L.I.D
}

//Haciendo un análisis mejor, la clase debe dividirse en 2 para cumplir con SOLID
//Como se realiza en la clase Message, dada anteriormente



