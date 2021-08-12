package mx.tecnm.voaxaca.pruebakotlin

class Empleado {
    // Atributos
    val name = "Stephanie Anaid Martínez López"
    val age = 29

    //FUNCIONES

    /** Puede cambiarla Recursos humanos*/
    fun reportarHorasPara(empleado: Empleado){
        // logica para consultar info checador, cuantas horas falto.
    }


    /** Puede cambiarlo el de finanzas*/
    fun calcularPagoPara(empleado: Empleado){

        // Logica que calcula el pago HT * SB
    }

    /** Puede cambiarlo el encargado de Tecnologías */
    fun guardar (empleado: Empleado){
        // logica para guardar en base de datos.
    }

}

class GuardadorDatosEmpleado {

    /** Puede cambiarlo el encargado de Tecnologías */
    fun guardar (empleado: Empleado){
        // logica para guardar en base de datos.
    }
}

class ReportadorHorasTrabajo {

    /** Puede cambiarla Recursos humanos*/
    fun reportarHorasPara(empleado: Empleado){
        // logica para consultar info checador, cuantas horas falto.
    }
}

/** Una función que puede cambiar el de finanzas*/
class CalculadoraPagos {

    fun calcularPagoPara(empleado: Empleado){

        // Logica que calcula el pago HT * SB
    }
}