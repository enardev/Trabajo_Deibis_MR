package taller.oop.logica;

public class Empleado {
    private String nombre;
    private String apellido;
    private double salario;

    public Empleado(String nombre, String apellido, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = (salario>=0)?salario:0;
    }
    
    public void aumentar(double porcentaje) {
        this.salario = ((100 + porcentaje) * this.salario/100) ;
    }
    
    public Object[] toArray(int contador) {
        return new Object[] {
            contador, 
            (this.nombre + " " +this.apellido),
            this.getSalarioAnual()
        };
        
    }
    
    public double getSalarioAnual() {
        return (12 * this.salario);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    
}
