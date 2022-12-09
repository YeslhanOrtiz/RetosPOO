package principal;
import Salud.empleado;

public class inicio {
    public static void main(String[] args) {
        double imc;
        empleado em = new empleado();

        em.pedirDatos();
        em.mostrarPersona();
        em.mayorEdad();
        em.InformacionEmpleado();
        em.calcularHonorarios();
        em.mostrarEmpleado();


        imc = em.calcularImc();


        if (imc < 20) 
        {
            System.out.println("PesoBajo");
        }
        else if (imc >= 20 && imc < 25)
        {
            System.out.println("PesoIdeal");
        }
        else if (imc >= 25)
        {
            System.out.println("SobrePeso");
        }
    }
}
