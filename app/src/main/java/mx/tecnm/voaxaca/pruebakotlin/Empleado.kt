package mx.tecnm.voaxaca.pruebakotlin

class Empleado {
    // Atributos
    val name = "Stephanie Anaid Martínez López"
    val age = 29

}


class GuardadorDatosEmpleado {

    fun guardar (empleado: Empleado){
        // logica para guardar en base de datos.
    }
}

class ReportadorHorasTrabajo {

    fun reportarHorasPara(empleado: Empleado){
        // logica para consultar info checador, cuantas horas falto.
    }
}

class CalculadoraPagos {

    fun calcularPagoPara(empleado: Empleado){

        // Logica que calcula el pago HT * SB
    }
}